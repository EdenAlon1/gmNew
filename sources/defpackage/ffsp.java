package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsp {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(ffgu ffguVar) {
        Object a;
        if (ffguVar instanceof fggk) {
            return ((fggk) ffguVar).toString();
        }
        try {
            a = ffguVar + "@" + b(ffguVar);
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        if (ffch.c(a) != null) {
            a = ffguVar.getClass().getName() + "@" + b(ffguVar);
        }
        return (String) a;
    }
}
