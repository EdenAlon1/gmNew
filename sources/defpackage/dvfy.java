package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvfy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvfz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvfy(dvfz dvfzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvfzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvfy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (!((Boolean) this.b.b.b()).booleanValue()) {
                    dvfz.a.o().q("GrowthKit is disabled, aborting GnpJobGrowthKitWrapper");
                    entd entdVar = ealc.a;
                    return new ealc(3, new Exception("GrowthKit is disabled by a Phenotype flag."));
                }
                ListenableFuture c = this.b.e.c();
                this.a = 1;
                if (fgfz.c(c, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            ears earsVar = (ears) this.b.c.b();
            dvfz dvfzVar = this.b;
            earsVar.f(dvfzVar.d, dvfzVar.f, "OK");
            return ealc.b;
        } catch (Exception e) {
            ((ensz) ((ensz) dvfz.a.j()).g(e)).t("GNP job with key %s failed.", this.b.f);
            ears earsVar2 = (ears) this.b.c.b();
            dvfz dvfzVar2 = this.b;
            earsVar2.f(dvfzVar2.d, dvfzVar2.f, "ERROR");
            return this.b.g() ? new ealc(2, e) : new ealc(3, e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvfy(this.b, ffguVar);
    }
}
