package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dra extends ffhv implements ffjm {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ cxt c;
    final /* synthetic */ ffky d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dra(float f, cxt cxtVar, ffky ffkyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = f;
        this.c = cxtVar;
        this.d = ffkyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dra) c((drd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drd drdVar = (drd) this.e;
            float f = this.b;
            cxt cxtVar = this.c;
            dqz dqzVar = new dqz(this.d, drdVar);
            this.a = 1;
            if (dap.h(0.0f, f, cxtVar, dqzVar, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dra draVar = new dra(this.b, this.c, this.d, ffguVar);
        draVar.e = obj;
        return draVar;
    }
}
