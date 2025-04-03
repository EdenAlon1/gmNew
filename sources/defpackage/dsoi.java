package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsoi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsol b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsoi(dsol dsolVar, boolean z, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsolVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsoi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsol dsolVar = this.b;
            dsoh dsohVar = new dsoh(dsolVar, this.c, this.d, null);
            this.a = 1;
            if (dsolVar.d.d("KeyboardDataPersistenceProtoDataStore#saveHeightToDataStore", dsohVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsoi(this.b, this.c, this.d, ffguVar);
    }
}
