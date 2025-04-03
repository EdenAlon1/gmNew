package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baql extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ cpbd b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baql(ffgu ffguVar, bara baraVar, cpbd cpbdVar, String str) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = cpbdVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baql) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cpbd cpbdVar = this.b;
        cpbdVar.getClass();
        aoku aokuVar = (aoku) fflm.b(this.a.k.D(cpbdVar, this.c));
        if (aokuVar != null) {
            return aokuVar;
        }
        bara.a.r("Received an MMS without sender address; using unknown sender.");
        return ((aolr) this.a.C.b()).f();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baql baqlVar = new baql(ffguVar, this.a, this.b, this.c);
        baqlVar.d = obj;
        return baqlVar;
    }
}
