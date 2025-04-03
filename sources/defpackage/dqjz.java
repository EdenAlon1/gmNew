package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqjz implements dqki {
    public static final enru a = enru.c("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService");
    public final ffbr b;
    public final ffsk c;
    public final dqkk d;
    public final dqii e;
    public final String f;
    public final fgcl g;
    public final ffbz h;
    public final fgcl i;

    public dqjz(ffbr ffbrVar, ffsk ffskVar, dqkk dqkkVar, dqii dqiiVar) {
        this.b = ffbrVar;
        this.c = ffskVar;
        this.d = dqkkVar;
        this.e = dqiiVar;
        String str = dqiiVar.a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        this.f = upperCase;
        this.g = fgcu.e(1, 0, 2, 2);
        this.h = ffca.a(new ffix() { // from class: dqjk
            @Override // defpackage.ffix
            public final Object invoke() {
                return fgcu.e(0, 0, 0, 7);
            }
        });
        this.i = fgcu.e(0, 0, 0, 7);
    }

    @Override // defpackage.dqki
    public final Object a(dqij dqijVar, ffgu ffguVar) {
        Object d = this.d.d("SQLiteUsageService#addUsage", new dqjo(this, dqijVar, null), ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    @Override // defpackage.dqki
    public final Object b(Object obj, ffgu ffguVar) {
        Object a2 = ffra.a(this.c.hT(), new dqjp(this, obj, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.dqki
    public final Object c(int i, ffgu ffguVar) {
        return this.d.d("SQLiteUsageService#listEntities", new dqju(this, i, null), ffguVar);
    }

    public final fgcl d() {
        return (fgcl) this.h.a();
    }

    @Override // defpackage.dqki
    public final /* synthetic */ Object e(ffgu ffguVar) {
        return dqkf.a(this, 1000, ffguVar);
    }

    @Override // defpackage.dqki
    public final /* synthetic */ Object f(ffgu ffguVar) {
        return dqkf.b(this, 1000, ffguVar);
    }

    @Override // defpackage.dqki
    public final Object g(String str, ffgu ffguVar) {
        return this.d.d("SQLiteUsageService#listSearches", new dqjy(str, this, null), ffguVar);
    }

    @Override // defpackage.dqki
    public final Object h() {
        return this.g;
    }
}
