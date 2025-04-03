package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drga extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgb b;
    final /* synthetic */ drgf c;
    final /* synthetic */ List d;
    final /* synthetic */ CharSequence e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drga(drgb drgbVar, drgf drgfVar, List list, CharSequence charSequence, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgbVar;
        this.c = drgfVar;
        this.d = list;
        this.e = charSequence;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drga) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        sl slVar = null;
        ffci.b(obj);
        if (i == 0) {
            drgb drgbVar = this.b;
            drgf drgfVar = this.c;
            List list = this.d;
            List list2 = drgfVar.f;
            this.a = 1;
            obj = ffra.a(drgbVar.aY().hT(), new drfo(list2, list, null), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        drgf drgfVar2 = this.c;
        drgfVar2.f = this.d;
        dqie.b((List) obj, drgfVar2.f.size(), this.c);
        this.c.g = this.e.toString();
        drgb drgbVar2 = this.b;
        vx vxVar = drgbVar2.an;
        if (vxVar == null) {
            ffkj.c("searchLayoutManager");
            vxVar = null;
        }
        sl slVar2 = this.b.ak;
        if (slVar2 == null) {
            ffkj.c("searchAdapter");
        } else {
            slVar = slVar2;
        }
        drgbVar2.bg(vxVar, slVar);
        this.b.bJ();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drga(this.b, this.c, this.d, this.e, ffguVar);
    }
}
