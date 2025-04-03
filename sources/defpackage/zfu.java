package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zfu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zfw b;
    final /* synthetic */ fflb c;
    final /* synthetic */ dsjn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfu(zfw zfwVar, fflb fflbVar, dsjn dsjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zfwVar;
        this.c = fflbVar;
        this.d = dsjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xih xihVar = (xih) this.b.d.a();
            xhu xhuVar = new xhu((String) this.c.a, null, null, false, this.b.b.b(), null, null, false, 0, false, 1006);
            xgc xgcVar = new xgc(this.b.f.a());
            this.a = 1;
            obj = xihVar.b(xhuVar, xgcVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.d.f.e();
            this.b.f.b();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zfu(this.b, this.c, this.d, ffguVar);
    }
}
