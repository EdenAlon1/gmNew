package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffci {
    public static final Object a(Throwable th) {
        th.getClass();
        return new ffcg(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof ffcg) {
            throw ((ffcg) obj).a;
        }
    }
}
