package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffky b;
    final /* synthetic */ cxt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duv(ffky ffkyVar, cxt cxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffkyVar;
        this.c = cxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((duv) c((dnh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dnh dnhVar = (dnh) this.d;
            cxv b = cxw.b(this.b.a, 0.0f, 30);
            Float f = new Float(2.0f);
            cxt cxtVar = this.c;
            duu duuVar = new duu(this.b, dnhVar);
            this.a = 1;
            if (dap.j(b, f, cxtVar, false, duuVar, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        duv duvVar = new duv(this.b, this.c, ffguVar);
        duvVar.d = obj;
        return duvVar;
    }
}
