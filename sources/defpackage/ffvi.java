package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvi {
    public static final ThreadLocal a = new ThreadLocal();

    public static final ffti a() {
        ThreadLocal threadLocal = a;
        ffti fftiVar = (ffti) threadLocal.get();
        if (fftiVar != null) {
            return fftiVar;
        }
        ffqx ffqxVar = new ffqx(Thread.currentThread());
        threadLocal.set(ffqxVar);
        return ffqxVar;
    }
}
