package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersf {
    private String b = null;
    private Boolean c = null;
    private Integer d = null;
    public ThreadFactory a = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory b(ersf ersfVar) {
        String str = ersfVar.b;
        Boolean bool = ersfVar.c;
        Integer num = ersfVar.d;
        ThreadFactory threadFactory = ersfVar.a;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new erse(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void d(String str) {
        a(str, 0);
        this.b = str;
    }

    public final void e(int i) {
        emxf.g(true, "Thread priority (%s) must be >= %s", i, 1);
        emxf.g(true, "Thread priority (%s) must be <= %s", i, 10);
        this.d = Integer.valueOf(i);
    }
}
