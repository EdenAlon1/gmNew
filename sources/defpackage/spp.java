package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spp extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    final /* synthetic */ List b;
    final /* synthetic */ ffkx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spp(ffgu ffguVar, spw spwVar, List list, ffkx ffkxVar) {
        super(2, ffguVar);
        this.a = spwVar;
        this.b = list;
        this.c = ffkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        snw snwVar = this.a.d;
        sny snyVar = (sny) ffdx.Q(this.b);
        if (snw.c(snyVar != null ? new Long(snyVar.a) : null)) {
            this.c.a = true;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spp sppVar = new spp(ffguVar, this.a, this.b, this.c);
        sppVar.d = obj;
        return sppVar;
    }
}
