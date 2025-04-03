package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqv extends ffju implements ffjm {
    public fqv(Object obj) {
        super(2, obj, frc.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        frc frcVar = (frc) this.b;
        float f = 0.0f;
        if (!frcVar.f()) {
            if (frcVar.a() > frcVar.c()) {
                ((ffix) frcVar.a.a()).invoke();
            }
            frcVar.g(0.0f);
            if (frcVar.b() == 0.0f || floatValue < 0.0f) {
                floatValue = 0.0f;
            }
            frcVar.d(0.0f);
            f = floatValue;
        }
        return new Float(f);
    }
}
