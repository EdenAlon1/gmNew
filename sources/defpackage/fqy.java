package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqy extends ffkk implements ffix {
    final /* synthetic */ frc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqy(frc frcVar) {
        super(0);
        this.a = frcVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Float.valueOf(this.a.b() * 0.5f);
    }
}
