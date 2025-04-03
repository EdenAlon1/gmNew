package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exd extends ffkk implements ffix {
    final /* synthetic */ exk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exd(exk exkVar) {
        super(0);
        this.a = exkVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.a.b() > 0.0f);
    }
}
