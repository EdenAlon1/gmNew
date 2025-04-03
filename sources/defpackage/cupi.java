package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cupi extends ffhv implements ffji {
    int a;
    final /* synthetic */ cupj b;
    final /* synthetic */ cupq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cupi(cupj cupjVar, cupq cupqVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cupjVar;
        this.c = cupqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cupj cupjVar = this.b;
        cupq cupqVar = this.c;
        this.a = 1;
        cfup cfupVar = cupj.a;
        Object b = cupjVar.b(cupqVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cupi(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
