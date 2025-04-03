package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ce implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    public ce(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.a = file;
        this.c = file2;
        this.b = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                f(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                f(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                f(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            f(this.d);
            throw e4;
        }
    }

    private static long b(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return -2L;
        }
        return lastModified;
    }

    private static long c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            long j = (-22) + length;
            if (j < 0) {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
            long j2 = length - 65558;
            if (j2 < 0) {
                j2 = 0;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    long reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt());
                    CRC32 crc32 = new CRC32();
                    randomAccessFile.seek(Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L);
                    long j3 = reverseBytes2 & 4294967295L;
                    byte[] bArr = new byte[16384];
                    int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                    while (read != -1) {
                        crc32.update(bArr, 0, read);
                        j3 -= read;
                        if (j3 == 0) {
                            break;
                        }
                        read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                    }
                    long value = crc32.getValue();
                    randomAccessFile.close();
                    if (value == -1) {
                        return -2L;
                    }
                    return value;
                }
                j--;
            } while (j >= j2);
            throw new ZipException("End Of Central Directory signature not found");
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x027d, code lost:
    
        r11 = r11 + 1;
        r12 = r10.getEntry(defpackage.a.f(r11, "classes", ".dex"));
        r1 = r18;
        r7 = r2;
        r2 = r16;
        r6 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List e() {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.e():java.util.List");
    }

    private static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void g(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            cd cdVar = (cd) it.next();
            edit.putLong(a.h(i, "dex.crc."), cdVar.a);
            edit.putLong(a.h(i, "dex.time."), cdVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public final List a(Context context, boolean z) {
        List list;
        ce ceVar = this;
        Log.i("MultiDex", "MultiDexExtractor.load(" + ceVar.a.getPath() + ", " + z + ", )");
        if (!ceVar.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            File file = ceVar.a;
            long j = ceVar.b;
            SharedPreferences d = d(context);
            long j2 = -1;
            if (d.getLong("timestamp", -1L) == b(file) && d.getLong("crc", -1L) == j) {
                try {
                    Log.i("MultiDex", "loading existing secondary dex files");
                    String concat = String.valueOf(ceVar.a.getName()).concat(".classes");
                    SharedPreferences d2 = d(context);
                    int i = d2.getInt("dex.number", 1);
                    list = new ArrayList(i - 1);
                    int i2 = 2;
                    while (i2 <= i) {
                        cd cdVar = new cd(ceVar.c, concat + i2 + ".zip");
                        if (!cdVar.isFile()) {
                            throw new IOException("Missing extracted secondary dex file '" + cdVar.getPath() + "'");
                        }
                        cdVar.a = c(cdVar);
                        long j3 = d2.getLong(a.g(i2, "", "dex.crc."), j2);
                        long j4 = d2.getLong(a.g(i2, "", "dex.time."), j2);
                        long lastModified = cdVar.lastModified();
                        if (j4 == lastModified) {
                            String str = concat;
                            if (j3 == cdVar.a) {
                                list.add(cdVar);
                                i2++;
                                j2 = -1;
                                ceVar = this;
                                concat = str;
                            }
                        }
                        throw new IOException("Invalid extracted dex: " + cdVar + " (key \"\"), expected modification time: " + j4 + ", modification time: " + lastModified + ", expected crc: " + j3 + ", file crc: " + cdVar.a);
                    }
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    List e2 = e();
                    g(context, b(this.a), this.b, e2);
                    list = e2;
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        List e3 = ceVar.e();
        g(context, b(ceVar.a), ceVar.b, e3);
        list = e3;
        Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
