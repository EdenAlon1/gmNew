package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqk extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ cpbd b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqk(ffgu ffguVar, bara baraVar, cpbd cpbdVar, String str) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = cpbdVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cpbd cpbdVar = this.b;
        cpbdVar.getClass();
        String F = this.a.k.F(cpbdVar, this.c);
        if (F != null) {
            return F;
        }
        bara.a.r("Received an MMS without sender address; using unknown sender.");
        return "ʼUNKNOWN_SENDER!ʼ";
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqk baqkVar = new baqk(ffguVar, this.a, this.b, this.c);
        baqkVar.d = obj;
        return baqkVar;
    }
}
