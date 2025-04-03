package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbib extends ffhv implements ffjm {
    final /* synthetic */ dbip a;
    final /* synthetic */ eixn b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbib(dbip dbipVar, eixn eixnVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dbipVar;
        this.b = eixnVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbib) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eixn eixnVar = this.b;
        String str = eixnVar.b().g;
        str.getClass();
        this.a.b.e = str;
        this.c.b("Successfully set the account to " + eixnVar.b().g + ".");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbib(this.a, this.b, this.c, ffguVar);
    }
}
