package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ cxj c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hkx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxm(Object obj, cxj cxjVar, hkx hkxVar, hkx hkxVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = obj;
        this.c = cxjVar;
        this.d = hkxVar;
        this.e = hkxVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cxm cxmVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            cxmVar = this;
        } else {
            if (ffkj.e(this.b, this.c.c())) {
                return ffcu.a;
            }
            cxj cxjVar = this.c;
            Object obj2 = this.b;
            hkx hkxVar = this.d;
            int i2 = cxo.a;
            cxt cxtVar = (cxt) hkxVar.a();
            this.a = 1;
            cxmVar = this;
            if (cxj.j(cxjVar, obj2, cxtVar, null, cxmVar, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        hkx hkxVar2 = cxmVar.e;
        int i3 = cxo.a;
        ffji ffjiVar = (ffji) hkxVar2.a();
        if (ffjiVar != null) {
            ffjiVar.invoke(cxmVar.c.d());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxm(this.b, this.c, this.d, this.e, ffguVar);
    }
}
