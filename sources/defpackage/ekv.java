package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekv extends ffkk implements ffix {
    final /* synthetic */ elb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekv(elb elbVar) {
        super(0);
        this.a = elbVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Float.valueOf(this.a.b.d() - this.a.b.c());
    }
}
