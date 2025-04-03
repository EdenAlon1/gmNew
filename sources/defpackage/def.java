package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class def extends ffkk implements ffix {
    final /* synthetic */ deg a;
    final /* synthetic */ ifo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public def(deg degVar, ifo ifoVar) {
        super(0);
        this.a = degVar;
        this.b = ifoVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        deg degVar = this.a;
        idh idhVar = degVar.d;
        ifo ifoVar = this.b;
        degVar.e = idhVar.a(ifoVar.b(), ifoVar.q(), ifoVar);
        return ffcu.a;
    }
}
