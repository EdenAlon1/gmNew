package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roj {
    private static String a;
    private static boolean b;

    public static synchronized String a() {
        String str;
        synchronized (roj.class) {
            if (!b) {
                b = true;
                try {
                    byte[] bArr = new byte[64];
                    FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
                    boolean z = false;
                    try {
                        int read = fileInputStream.read(bArr);
                        int i = 0;
                        while (true) {
                            if (i >= 64) {
                                i = -1;
                                break;
                            }
                            try {
                                if (bArr[i] == 0) {
                                    break;
                                }
                                i++;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                rok.a(fileInputStream, true ^ z);
                                throw th;
                            }
                        }
                        if (i > 0) {
                            read = i;
                        }
                        String str2 = new String(bArr, 0, read);
                        rok.a(fileInputStream, false);
                        a = str2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused) {
                }
            }
            str = a;
        }
        return str;
    }
}
