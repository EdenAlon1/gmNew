package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfyx {
    private static String a;
    private static int b;
    private static Boolean c;

    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                a = processName;
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String f = a.f(i, "/proc/", "/cmdline");
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(f));
                            try {
                                String readLine = bufferedReader.readLine();
                                dfwv.n(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                dfyt.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    dfyt.a(bufferedReader);
                }
                a = str;
            }
        }
        return a;
    }

    public static boolean b() {
        boolean isIsolated;
        Boolean bool = c;
        if (bool == null) {
            if (dfyw.a()) {
                isIsolated = Process.isIsolated();
                bool = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object a2 = dgya.a(Process.class, "isIsolated", new dgxz[0]);
                    emyw.e(a2);
                    bool = (Boolean) a2;
                } catch (ReflectiveOperationException unused) {
                    bool = false;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
