package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbnd extends ffhv implements ffjm {
    final /* synthetic */ dbne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbnd(dbne dbneVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dbneVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbnd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cetp cetpVar = new cetp();
        cetpVar.b = "sync_data_to_wearable_app_dedupe";
        dbne dbneVar = this.a;
        cetpVar.f = new dbnc(dbneVar);
        ((deii) dbneVar.i.b()).a(cetpVar.a());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbnd(this.a, ffguVar);
    }
}
