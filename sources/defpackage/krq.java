package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krq {
    static final cnq a = new cnq(16);
    public static final ExecutorService b;
    static final Object c;
    static final cpn d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new krx());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new cpn();
    }

    static krp a(String str, Context context, List list, int i) {
        krp krpVar;
        int i2;
        int length;
        Typeface c2;
        ozg.a("getFontSync");
        try {
            Typeface typeface = (Typeface) a.c(str);
            if (typeface != null) {
                krpVar = new krp(typeface);
            } else {
                try {
                    krs a2 = kri.a(context, list);
                    if (a2.a != 0) {
                        i2 = -2;
                    } else {
                        krt[] a3 = a2.a();
                        if (a3 != null && (length = a3.length) != 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i4 = a3[i3].e;
                                if (i4 != 0) {
                                    i2 = i4 < 0 ? -3 : i4;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        krpVar = new krp(i2);
                    } else {
                        if (a2.b.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                            c2 = kpz.c(context, a2.a(), i);
                        } else {
                            List list2 = a2.b;
                            kqh kqhVar = kpz.a;
                            ozg.a("TypefaceCompat.createFromFontInfoWithFallback");
                            try {
                                c2 = kpz.a.f(context, list2, i);
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (c2 != null) {
                            a.d(str, c2);
                            krpVar = new krp(c2);
                        } else {
                            krpVar = new krp(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    krpVar = new krp(-1);
                }
            }
            return krpVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String b(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((krj) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
