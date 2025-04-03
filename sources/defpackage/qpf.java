package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpf implements qnw {
    private final Map a = new LinkedHashMap(16, 0.75f, true);
    private long b = 0;
    private final qpo c;

    public qpf(qpo qpoVar) {
        this.c = qpoVar;
    }

    static int e(InputStream inputStream) {
        return (n(inputStream) << 24) | n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16);
    }

    static long f(InputStream inputStream) {
        return (n(inputStream) & 255) | ((n(inputStream) & 255) << 8) | ((n(inputStream) & 255) << 16) | ((n(inputStream) & 255) << 24) | ((n(inputStream) & 255) << 32) | ((n(inputStream) & 255) << 40) | ((n(inputStream) & 255) << 48) | ((n(inputStream) & 255) << 56);
    }

    static String h(qpe qpeVar) {
        return new String(m(qpeVar, f(qpeVar)), "UTF-8");
    }

    static void j(OutputStream outputStream, int i) {
        outputStream.write(i & PrivateKeyType.INVALID);
        outputStream.write((i >> 8) & PrivateKeyType.INVALID);
        outputStream.write((i >> 16) & PrivateKeyType.INVALID);
        outputStream.write((i >> 24) & PrivateKeyType.INVALID);
    }

    static void k(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        k(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] m(qpe qpeVar, long j) {
        long a = qpeVar.a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(qpeVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException(a.D(a, j, "streamToBytes length=", ", maxLength="));
    }

    private static int n(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void o(String str, qpd qpdVar) {
        if (this.a.containsKey(str)) {
            this.b += qpdVar.a - ((qpd) this.a.get(str)).a;
        } else {
            this.b += qpdVar.a;
        }
        this.a.put(str, qpdVar);
    }

    private final void p(String str) {
        qpd qpdVar = (qpd) this.a.remove(str);
        if (qpdVar != null) {
            this.b -= qpdVar.a;
        }
    }

    private static final String q(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // defpackage.qnw
    public final synchronized qnv a(String str) {
        qpd qpdVar = (qpd) this.a.get(str);
        if (qpdVar == null) {
            return null;
        }
        File g = g(str);
        try {
            qpe qpeVar = new qpe(new BufferedInputStream(new FileInputStream(g)), g.length());
            try {
                qpd a = qpd.a(qpeVar);
                if (!TextUtils.equals(str, a.b)) {
                    qox.a("%s: key=%s, found=%s", g.getAbsolutePath(), str, a.b);
                    p(str);
                    return null;
                }
                byte[] m = m(qpeVar, qpeVar.a());
                qnv qnvVar = new qnv();
                qnvVar.a = m;
                qnvVar.b = qpdVar.c;
                qnvVar.c = qpdVar.d;
                qnvVar.d = qpdVar.e;
                qnvVar.e = qpdVar.f;
                qnvVar.f = qpdVar.g;
                List<qoe> list = qpdVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (qoe qoeVar : list) {
                    treeMap.put(qoeVar.a, qoeVar.b);
                }
                qnvVar.g = treeMap;
                qnvVar.h = DesugarCollections.unmodifiableList(qpdVar.h);
                return qnvVar;
            } finally {
                qpeVar.close();
            }
        } catch (IOException e) {
            qox.a("%s: %s", g.getAbsolutePath(), e.toString());
            i(str);
            return null;
        }
    }

    @Override // defpackage.qnw
    public final synchronized void b() {
        File a = this.c.a();
        if (a.exists()) {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        qpe qpeVar = new qpe(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            qpd a2 = qpd.a(qpeVar);
                            a2.a = length;
                            o(a2.b, a2);
                            qpeVar.close();
                        } catch (Throwable th) {
                            qpeVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!a.mkdirs()) {
            qox.b("Unable to create cache dir %s", a.getAbsolutePath());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.qnw
    public final synchronized void c(java.lang.String r29, defpackage.qnv r30) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpf.c(java.lang.String, qnv):void");
    }

    @Override // defpackage.qnw
    public final synchronized void d(String str) {
        qnv a = a(str);
        if (a != null) {
            a.f = 0L;
            a.e = 0L;
            c(str, a);
        }
    }

    public final File g(String str) {
        return new File(this.c.a(), q(str));
    }

    public final synchronized void i(String str) {
        boolean delete = g(str).delete();
        p(str);
        if (delete) {
            return;
        }
        qox.a("Could not delete cache entry for key=%s, filename=%s", str, q(str));
    }
}
