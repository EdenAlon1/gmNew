package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dah extends ffkk implements ffji {
    final /* synthetic */ ffjm a;
    final /* synthetic */ dbv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dah(ffjm ffjmVar, dbv dbvVar) {
        super(1);
        this.a = ffjmVar;
        this.b = dbvVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        this.a.a(cxsVar.a(), ((dbw) this.b).b.invoke(cxsVar.c));
        return ffcu.a;
    }
}
