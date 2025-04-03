package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqu extends ffkh implements ffji {
    public fqu(Object obj) {
        super(1, obj, frc.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float c;
        float floatValue = ((Number) obj).floatValue();
        frc frcVar = (frc) this.g;
        if (!frcVar.f()) {
            float c2 = ffmk.c(frcVar.b() + floatValue, 0.0f);
            float b = c2 - frcVar.b();
            frcVar.d(c2);
            if (frcVar.a() <= frcVar.c()) {
                c = frcVar.a();
            } else {
                float abs = Math.abs(frcVar.a() / frcVar.c()) - 1.0f;
                r2 = abs >= 0.0f ? abs : 0.0f;
                if (r2 > 2.0f) {
                    r2 = 2.0f;
                }
                c = frcVar.c() + (frcVar.c() * (r2 - (((float) Math.pow(r2, 2.0d)) / 4.0f)));
            }
            frcVar.e(c);
            r2 = b;
        }
        return Float.valueOf(r2);
    }
}
