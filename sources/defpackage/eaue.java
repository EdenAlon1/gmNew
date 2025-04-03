package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaue extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eauf b;
    final /* synthetic */ exyd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaue(eauf eaufVar, exyd exydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eaufVar;
        this.c = exydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eaue) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eauf eaufVar = this.b;
                eaufVar.d.a(eaufVar.c);
                eauf eaufVar2 = this.b;
                if (!eaufVar2.e && !((Boolean) eaufVar2.f.b()).booleanValue()) {
                    eauf.a.o().q("Application does not use push-flow so we return early.");
                    return new eafo(ffcu.a);
                }
                ((SharedPreferences) this.b.g.a.b()).edit().putInt("last_used_registration_api", 2).apply();
                eauf eaufVar3 = this.b;
                eamd eamdVar = eaufVar3.b;
                exyd exydVar = this.c;
                eagp a = eano.a(eaufVar3.f);
                this.a = 1;
                obj = eamdVar.c(exydVar, a, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            eafl eaflVar = (eafl) obj;
            if (eaflVar.e()) {
                ((ensz) ((ensz) eauf.a.j()).g(eaflVar.d())).q("Failed scheduling registration.");
            }
            return eaflVar;
        } catch (Exception e) {
            ((ensz) ((ensz) eauf.a.i()).g(e)).q("Failed scheduling registration.");
            return new eafi(e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eaue(this.b, this.c, ffguVar);
    }
}
