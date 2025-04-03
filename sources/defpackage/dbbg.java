package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbg extends ffhv implements ffji {
    final /* synthetic */ dbbj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbg(dbbj dbbjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = dbbjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new dbbf(new dbdi(this.a.b.a));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbbg(this.a, (ffgu) obj).b(ffcu.a);
    }
}
