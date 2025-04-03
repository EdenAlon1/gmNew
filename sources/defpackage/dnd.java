package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnd implements drd {
    final /* synthetic */ dne a;

    public dnd(dne dneVar) {
        this.a = dneVar;
    }

    @Override // defpackage.drd
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        float floatValue = ((Number) this.a.a.invoke(Float.valueOf(f))).floatValue();
        this.a.e.b(Boolean.valueOf(floatValue > 0.0f));
        this.a.f.b(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
