package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfu implements esfl {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private final esfl b;

    public esfu(esfl esflVar) {
        this.b = esflVar;
    }

    @Override // defpackage.esfk
    public final int a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.esfk
    public final String b(esfh esfhVar, esfi esfiVar) {
        return this.b.b(esfhVar, esfiVar);
    }

    @Override // defpackage.esfk
    public final String c(esfh esfhVar, String str) {
        return this.b.c(esfhVar, str);
    }

    @Override // defpackage.esfk
    public final String d(esfh esfhVar) {
        return this.b.d(esfhVar);
    }

    @Override // defpackage.esfk
    public final String e(int i) {
        return this.b.e(i);
    }

    @Override // defpackage.esfk
    public final String f(esfh esfhVar) {
        return this.b.f(esfhVar);
    }

    @Override // defpackage.esfk
    public final boolean g(esfh esfhVar) {
        return this.b.g(esfhVar);
    }

    @Override // defpackage.esfk
    public final boolean h(String str, String str2) {
        return this.b.h(str, str2);
    }

    @Override // defpackage.esfk
    public final boolean i(esfh esfhVar) {
        return this.b.i(esfhVar);
    }

    @Override // defpackage.esfk
    public final boolean j(esfh esfhVar) {
        return this.b.j(esfhVar);
    }

    @Override // defpackage.esfk
    public final int k(esfh esfhVar, esfh esfhVar2) {
        return this.b.k(esfhVar, esfhVar2);
    }

    @Override // defpackage.esfk
    public final int l(String str, String str2) {
        return this.b.l(str, str2);
    }

    @Override // defpackage.esfk
    public final int m(esfh esfhVar) {
        return this.b.m(esfhVar);
    }

    @Override // defpackage.esfl
    public final esfh n(CharSequence charSequence, String str) {
        esfr esfrVar = new esfr(charSequence, str);
        esfs esfsVar = (esfs) this.a.get(esfrVar);
        if (esfsVar != null) {
            esfg esfgVar = esfsVar.b;
            if (esfgVar == null) {
                return esfsVar.a;
            }
            throw new esfo(esfgVar.a());
        }
        try {
            esfh n = this.b.n(charSequence, str);
            this.a.put(esfrVar, new esfs(n));
            return n;
        } catch (esfg e) {
            this.a.put(esfrVar, new esfs(e));
            throw e;
        }
    }

    @Override // defpackage.esfl
    public final String o(esfh esfhVar, esfi esfiVar) {
        return this.b.o(esfhVar, esfiVar);
    }

    @Override // defpackage.esfl
    public final void p() {
        this.a.clear();
    }
}
