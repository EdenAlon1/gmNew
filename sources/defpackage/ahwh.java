package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwh extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ahwi d;
    final /* synthetic */ xez e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwh(ahwi ahwiVar, xez xezVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = ahwiVar;
        this.e = xezVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ahwh ahwhVar = new ahwh(this.d, this.e, (ffgu) obj4);
        ahwhVar.a = (dmmp) obj;
        ahwhVar.b = (dmmk) obj2;
        ahwhVar.c = (dmof) obj3;
        return ahwhVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        dmmk dmmkVar = (dmmk) this.b;
        List list = dmmkVar.a;
        ffji ffjiVar = dmmkVar.b;
        ffji ffjiVar2 = dmmkVar.c;
        dmmp dmmpVar = (dmmp) obj2;
        dmms dmmsVar = new dmms(dmmpVar, new dmmk(list, ffjiVar, ffjiVar2), (dmof) this.c, new dmmr(this.d.a.a()));
        dmov dmovVar = new dmov(ffel.a, null, new ffji() { // from class: ahwg
            @Override // defpackage.ffji
            public final Object invoke(Object obj3) {
                return ffcu.a;
            }
        });
        boolean a = this.e.a();
        ahwi ahwiVar = this.d;
        return new dmpj(dmmsVar, dmovVar, null, null, 0.0f, false, new dmpi(a, false, ahwiVar.b.a(), ahwiVar.c.a(), 78), 56);
    }
}
