package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfq implements esfk {
    public final evqu a;
    public final evqv b;

    public esfq(evqu evquVar, evqv evqvVar) {
        this.a = evquVar;
        this.b = evqvVar;
    }

    public static evpx n(String str) {
        if (emxe.c(str)) {
            return null;
        }
        evpx b = evpx.b(str);
        return b != null ? b : evpx.ZZ;
    }

    public static int o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 5 : 4;
        }
        return 3;
    }

    @Override // defpackage.esfk
    public final int a(String str) {
        throw null;
    }

    @Override // defpackage.esfk
    public final String b(esfh esfhVar, esfi esfiVar) {
        evrz evrzVar = ((esfp) esfhVar).a;
        int ordinal = esfiVar.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else if (ordinal == 2) {
                i = 3;
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException(String.format("Not a supported phone number format %s", esfiVar));
                }
                i = 4;
            }
        }
        return this.a.x(evrzVar, i);
    }

    @Override // defpackage.esfk
    public final String c(esfh esfhVar, String str) {
        throw null;
    }

    @Override // defpackage.esfk
    public final String d(esfh esfhVar) {
        throw null;
    }

    @Override // defpackage.esfk
    public final String e(int i) {
        throw null;
    }

    @Override // defpackage.esfk
    public final String f(esfh esfhVar) {
        throw null;
    }

    @Override // defpackage.esfk
    public final boolean g(esfh esfhVar) {
        return this.a.q(((esfp) esfhVar).a);
    }

    @Override // defpackage.esfk
    public final boolean h(String str, String str2) {
        throw null;
    }

    @Override // defpackage.esfk
    public final boolean i(esfh esfhVar) {
        throw null;
    }

    @Override // defpackage.esfk
    public final boolean j(esfh esfhVar) {
        evrz evrzVar = ((esfp) esfhVar).a;
        evqu evquVar = this.a;
        evpx d = evquVar.d(evrzVar);
        int i = evrzVar.c;
        evqo g = evquVar.g(i, d);
        if (g != null) {
            return (evqu.g.equals(d) || i == evquVar.a(d)) && evquVar.v(evquVar.k(evrzVar), g) != 12;
        }
        return false;
    }

    @Override // defpackage.esfk
    public final int k(esfh esfhVar, esfh esfhVar2) {
        throw null;
    }

    @Override // defpackage.esfk
    public final int l(String str, String str2) {
        throw null;
    }

    @Override // defpackage.esfk
    public final int m(esfh esfhVar) {
        throw null;
    }
}
