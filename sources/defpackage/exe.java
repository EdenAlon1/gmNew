package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exe extends ffkk implements ffix {
    final /* synthetic */ exk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exe(exk exkVar) {
        super(0);
        this.a = exkVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        exk exkVar = this.a;
        return Boolean.valueOf(exkVar.b() < exkVar.a());
    }
}
