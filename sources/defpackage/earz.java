package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class earz {
    public static final String a(Object obj) {
        if (obj instanceof Iterable) {
            return b((Iterable) obj);
        }
        if (obj instanceof Object[]) {
            return b(ffdo.F((Object[]) obj));
        }
        String valueOf = String.valueOf(obj);
        return (obj == null || valueOf.length() == 0 || fdnx.a.get().a()) ? valueOf : String.valueOf(valueOf.hashCode());
    }

    public static final String b(Iterable iterable) {
        iterable.getClass();
        return ffdx.aA(iterable, null, "[", "]", new ffji() { // from class: eary
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return earz.a(obj);
            }
        }, 25);
    }
}
