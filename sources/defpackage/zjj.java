package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxy b;
    final /* synthetic */ zjt c;
    final /* synthetic */ alxr d;
    final /* synthetic */ fgdj e;
    final /* synthetic */ ffix f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjj(ffxy ffxyVar, zjt zjtVar, alxr alxrVar, fgdj fgdjVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxyVar;
        this.c = zjtVar;
        this.d = alxrVar;
        this.e = fgdjVar;
        this.f = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zjj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.g;
            ffxy ffxyVar = this.b;
            zjt zjtVar = this.c;
            alxr alxrVar = this.d;
            fgdj fgdjVar = this.e;
            ffix ffixVar = this.f;
            HashMap hashMap = new HashMap(zjtVar.a());
            ffxx a = ffyy.a(aqfu.a(alxrVar.k(zjtVar.a())));
            zjl zjlVar = new zjl(null, hashMap, zjtVar, ffskVar, ffixVar);
            int i2 = fgau.a;
            ffxx a2 = fgck.a(new fgen(zjlVar, a), ffyy.a(aqfu.a(alxrVar.l())), fgdjVar, new zjn(zjtVar, fgdjVar, null));
            this.a = 1;
            if (ffyk.c(ffxyVar, a2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zjj zjjVar = new zjj(this.b, this.c, this.d, this.e, this.f, ffguVar);
        zjjVar.g = obj;
        return zjjVar;
    }
}
