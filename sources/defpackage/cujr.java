package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cujr extends ffhv implements ffji {
    int a;
    final /* synthetic */ cuke b;
    final /* synthetic */ ffss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujr(cuke cukeVar, ffss ffssVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cukeVar;
        this.c = ffssVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuke cukeVar = this.b;
        ffss ffssVar = this.c;
        this.a = 1;
        Object b = cukeVar.b(ffssVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cujr(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
