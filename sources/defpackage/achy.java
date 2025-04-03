package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class achy extends ffhv implements ffjm {
    final /* synthetic */ achz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public achy(achz achzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = achzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((achy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!((Boolean) ((cfup) achz.a.get()).e()).booleanValue()) {
            return ffel.a;
        }
        bsuz a = bsve.a();
        a.z("collectPsdData");
        boolean T = a.b().T();
        cfzc cfzcVar = new cfzc();
        cfzcVar.b("HasPairedDittoClients");
        cfzcVar.c(String.valueOf(T));
        return ffdx.b(cfzcVar.a());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new achy(this.a, ffguVar);
    }
}
