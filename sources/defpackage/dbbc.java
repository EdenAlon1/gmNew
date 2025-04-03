package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbc extends ffhv implements ffji {
    final /* synthetic */ dbbj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbc(dbbj dbbjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = dbbjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new dbbb(new dbdf(this.a.b.a));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbbc(this.a, (ffgu) obj).b(ffcu.a);
    }
}
