package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqz implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new qqv());
    private final Callable n = new qqu(this);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public qqz(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void d(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void g(File file, File file2, boolean z) {
        if (z) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void l() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized qqy a(String str) {
        l();
        qqx qqxVar = (qqx) this.g.get(str);
        if (qqxVar != null && qqxVar.e) {
            File[] fileArr = qqxVar.c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (fileArr[0].exists()) {
                }
            }
            this.h++;
            this.f.append((CharSequence) "READ");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            if (i()) {
                this.i.submit(this.n);
            }
            return new qqy(qqxVar.c);
        }
        return null;
    }

    public final synchronized void b(qqw qqwVar, boolean z) {
        qqx qqxVar = qqwVar.a;
        if (qqxVar.f != qqwVar) {
            throw new IllegalStateException();
        }
        if (z && !qqxVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (!qqwVar.b[0]) {
                    qqwVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!qqxVar.d().exists()) {
                    qqwVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File d = qqxVar.d();
            if (!z) {
                d(d);
            } else if (d.exists()) {
                File c = qqxVar.c();
                d.renameTo(c);
                long j = qqxVar.b[0];
                long length = c.length();
                qqxVar.b[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        qqxVar.f = null;
        if (qqxVar.e || z) {
            qqxVar.e = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) qqxVar.a);
            this.f.append((CharSequence) qqxVar.a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            this.g.remove(qqxVar.a);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) qqxVar.a);
            this.f.append('\n');
        }
        n(this.f);
        if (this.e > this.l || i()) {
            this.i.submit(this.n);
        }
    }

    public final void c() {
        close();
        qrc.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qqw qqwVar = ((qqx) arrayList.get(i)).f;
            if (qqwVar != null) {
                qqwVar.a();
            }
        }
        h();
        m(this.f);
        this.f = null;
    }

    public final void e() {
        String a;
        String substring;
        qrb qrbVar = new qrb(new FileInputStream(this.b), qrc.a);
        try {
            String a2 = qrbVar.a();
            String a3 = qrbVar.a();
            String a4 = qrbVar.a();
            String a5 = qrbVar.a();
            String a6 = qrbVar.a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.k).equals(a4) || !Integer.toString(this.d).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    a = qrbVar.a();
                    int indexOf = a.indexOf(32);
                    if (indexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = a.indexOf(32, i2);
                    if (indexOf2 == -1) {
                        substring = a.substring(i2);
                        if (indexOf == 6) {
                            if (a.startsWith("REMOVE")) {
                                this.g.remove(substring);
                                i++;
                            } else {
                                indexOf = 6;
                            }
                        }
                    } else {
                        substring = a.substring(i2, indexOf2);
                    }
                    qqx qqxVar = (qqx) this.g.get(substring);
                    if (qqxVar == null) {
                        qqxVar = new qqx(this, substring);
                        this.g.put(substring, qqxVar);
                    }
                    if (indexOf2 != -1 && indexOf == 5) {
                        if (a.startsWith("CLEAN")) {
                            String[] split = a.substring(indexOf2 + 1).split(" ");
                            qqxVar.e = true;
                            qqxVar.f = null;
                            if (split.length != qqxVar.g.d) {
                                throw qqx.e(split);
                            }
                            for (int i3 = 0; i3 < split.length; i3++) {
                                try {
                                    qqxVar.b[i3] = Long.parseLong(split[i3]);
                                } catch (NumberFormatException unused) {
                                    throw qqx.e(split);
                                }
                            }
                            i++;
                        } else {
                            indexOf = 5;
                        }
                    }
                    if (indexOf2 != -1 || indexOf != 5 || !a.startsWith("DIRTY")) {
                        if (indexOf2 != -1 || indexOf != 4 || !a.startsWith("READ")) {
                            break;
                        }
                    } else {
                        qqxVar.f = new qqw(this, qqxVar);
                    }
                    i++;
                } catch (EOFException unused2) {
                    this.h = i - this.g.size();
                    if (qrbVar.b == -1) {
                        f();
                    } else {
                        this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), qrc.a));
                    }
                    qrc.a(qrbVar);
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
        } catch (Throwable th) {
            qrc.a(qrbVar);
            throw th;
        }
    }

    public final synchronized void f() {
        Writer writer = this.f;
        if (writer != null) {
            m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), qrc.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (qqx qqxVar : this.g.values()) {
                if (qqxVar.f != null) {
                    bufferedWriter.write(a.a(qqxVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + qqxVar.a + qqxVar.a() + "\n");
                }
            }
            m(bufferedWriter);
            if (this.b.exists()) {
                g(this.b, this.j, true);
            }
            g(this.c, this.b, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), qrc.a));
        } catch (Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void h() {
        while (this.e > this.l) {
            k((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean i() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized qqw j(String str) {
        l();
        qqx qqxVar = (qqx) this.g.get(str);
        if (qqxVar == null) {
            qqxVar = new qqx(this, str);
            this.g.put(str, qqxVar);
        } else if (qqxVar.f != null) {
            return null;
        }
        qqw qqwVar = new qqw(this, qqxVar);
        qqxVar.f = qqwVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        n(this.f);
        return qqwVar;
    }

    public final synchronized void k(String str) {
        l();
        qqx qqxVar = (qqx) this.g.get(str);
        if (qqxVar != null && qqxVar.f == null) {
            for (int i = 0; i < this.d; i = 1) {
                File c = qqxVar.c();
                if (c.exists() && !c.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
                }
                long j = this.e;
                long[] jArr = qqxVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            this.g.remove(str);
            if (i()) {
                this.i.submit(this.n);
            }
        }
    }
}
