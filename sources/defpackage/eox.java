package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eox extends ffkk implements ffix {
    final /* synthetic */ int a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eox(int i, ffix ffixVar) {
        super(0);
        this.a = i;
        this.b = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new emi(this.a, 0.0f, this.b);
    }
}
