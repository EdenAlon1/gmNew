package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ennz implements ennx {
    public final boolean equals(Object obj) {
        if (obj instanceof ennx) {
            ennx ennxVar = (ennx) obj;
            if (a() == ennxVar.a() && emxb.a(b(), ennxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object b = b();
        return (b == null ? 0 : b.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(b());
        int a = a();
        return a == 1 ? valueOf : a.g(a, valueOf, " x ");
    }
}
