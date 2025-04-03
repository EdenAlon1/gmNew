package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djg extends ffkk implements ffix {
    final /* synthetic */ dji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djg(dji djiVar) {
        super(0);
        this.a = djiVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        dji djiVar = this.a;
        return Boolean.valueOf(djiVar.c() < djiVar.b());
    }
}
