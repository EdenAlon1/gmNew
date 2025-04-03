package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frd extends ffkk implements ffix {
    final /* synthetic */ frc a;
    final /* synthetic */ ffky b;
    final /* synthetic */ ffky c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frd(frc frcVar, ffky ffkyVar, ffky ffkyVar2) {
        super(0);
        this.a = frcVar;
        this.b = ffkyVar;
        this.c = ffkyVar2;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        frc frcVar = this.a;
        if (frcVar.f()) {
            frcVar.b.b(false);
            frcVar.d(0.0f);
            frcVar.g(0.0f);
        }
        this.a.e.i(this.b.a);
        frc frcVar2 = this.a;
        float f = this.c.a;
        if (frcVar2.f.c() != f) {
            frcVar2.f.i(f);
            if (frcVar2.f()) {
                frcVar2.g(f);
            }
        }
        return ffcu.a;
    }
}
