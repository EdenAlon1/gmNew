package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amyd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amyi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyd(amyi amyiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amyd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffss ffssVar;
        amfx amfxVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.c;
            amyi amyiVar = this.b;
            ffhe ffheVar = ffhe.a;
            ffss b = ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new amyb(null, amyiVar));
            amyi amyiVar2 = this.b;
            ffhe ffheVar2 = ffhe.a;
            ffss b2 = ffra.b(ffskVar, ekxi.a(ffheVar2), ffsm.a, new amyc(null, amyiVar2));
            this.c = b2;
            this.a = 1;
            Object c = b.c(this);
            if (c != ffhhVar) {
                ffssVar = b2;
                obj = c;
            }
            return ffhhVar;
        }
        if (i != 1) {
            amfxVar = (amfx) this.c;
            ffci.b(obj);
            obj.getClass();
            return new amwz(amfxVar, (avji) obj);
        }
        ffssVar = (ffss) this.c;
        ffci.b(obj);
        obj.getClass();
        amfx amfxVar2 = (amfx) obj;
        this.c = amfxVar2;
        this.a = 2;
        Object c2 = ffssVar.c(this);
        if (c2 != ffhhVar) {
            amfxVar = amfxVar2;
            obj = c2;
            obj.getClass();
            return new amwz(amfxVar, (avji) obj);
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amyd amydVar = new amyd(this.b, ffguVar);
        amydVar.c = obj;
        return amydVar;
    }
}
