package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbh extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ daw b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ cyq e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbh(dbe dbeVar, daw dawVar, Object obj, Object obj2, cyq cyqVar, int i) {
        super(2);
        this.a = dbeVar;
        this.b = dawVar;
        this.c = obj;
        this.d = obj2;
        this.e = cyqVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dbe dbeVar = this.a;
        daw dawVar = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        dbs.e(dbeVar, dawVar, obj3, obj4, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
