package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjw extends ffkk implements ffix {
    final /* synthetic */ fjx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjw(fjx fjxVar) {
        super(0);
        this.a = fjxVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        jzn a = this.a.a();
        int i = fjt.a;
        return Float.valueOf(a.em(400.0f));
    }
}
