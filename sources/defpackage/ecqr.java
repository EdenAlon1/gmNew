package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqr {
    private static volatile emxc a;
    private static volatile emxc b;

    public static emxc a() {
        emxc emxcVar;
        emxc emxcVar2;
        emxc j;
        FileInputStream fileInputStream;
        emxc emxcVar3 = a;
        if (emxcVar3 != null) {
            return emxcVar3;
        }
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        long j2 = 0;
        emxc j3 = sysconf > 0 ? emxc.j(Long.valueOf(sysconf)) : emux.a;
        if (j3.g()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                } catch (IOException unused) {
                    emux emuxVar = emux.a;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    emxcVar = emuxVar;
                }
                try {
                    int read = fileInputStream.read(bArr);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    emxcVar = emxc.j(ByteBuffer.wrap(bArr, 0, read));
                    if (emxcVar.g()) {
                        Object c = emxcVar.c();
                        long longValue = ((Long) j3.c()).longValue();
                        while (true) {
                            ByteBuffer byteBuffer = (ByteBuffer) c;
                            if (byteBuffer.remaining() <= 17) {
                                break;
                            }
                            if (byteBuffer.get() == 40) {
                                int i = 16;
                                while (true) {
                                    if (i < 0) {
                                        break;
                                    }
                                    if (byteBuffer.get(byteBuffer.position() + i) == 41) {
                                        byteBuffer.position(byteBuffer.position() + i + 1);
                                        if (byteBuffer.get() == 32 && b(byteBuffer, 1) && b(byteBuffer, 18)) {
                                            while (true) {
                                                if (!byteBuffer.hasRemaining()) {
                                                    break;
                                                }
                                                byte b2 = byteBuffer.get();
                                                if (b2 != 32) {
                                                    if (b2 < 48 || b2 > 57 || j2 > 922337203685477580L) {
                                                        break;
                                                    }
                                                    j2 = (j2 * 10) + (b2 - 48);
                                                    z = true;
                                                } else if (z) {
                                                    emxcVar2 = emxc.j(Long.valueOf(j2));
                                                }
                                            }
                                            emxcVar2 = emux.a;
                                        }
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        emxcVar2 = emux.a;
                        j = !emxcVar2.g() ? emux.a : emxc.j(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) emxcVar2.c()).longValue()) / longValue));
                    } else {
                        j = emux.a;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            }
        } else {
            j = emux.a;
        }
        a = j;
        return j;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
