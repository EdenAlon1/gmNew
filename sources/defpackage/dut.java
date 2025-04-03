package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dut extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ dmb c;
    final /* synthetic */ dnk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dut(fflb fflbVar, dmb dmbVar, dnk dnkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fflbVar;
        this.c = dmbVar;
        this.d = dnkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dut) c((dnh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dnh dnhVar = (dnh) this.e;
            cxv c = cxw.c(dme.a, this.b.a, duw.a);
            dmb dmbVar = this.c;
            dnk dnkVar = this.d;
            dus dusVar = new dus(this.b, dnhVar);
            this.a = 1;
            if (dap.j(c, dmbVar, dnkVar, false, dusVar, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dut dutVar = new dut(this.b, this.c, this.d, ffguVar);
        dutVar.e = obj;
        return dutVar;
    }
}
