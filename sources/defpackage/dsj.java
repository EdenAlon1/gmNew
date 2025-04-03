package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsj implements drd {
    final /* synthetic */ dsp a;
    final /* synthetic */ dsl b;

    public dsj(dsp dspVar, dsl dslVar) {
        this.a = dspVar;
        this.b = dslVar;
    }

    @Override // defpackage.drd
    public final float a(float f) {
        if (Math.abs(f) != 0.0f) {
            dsp dspVar = this.a;
            if ((f > 0.0f && !dspVar.a.h()) || ((f < 0.0f && !dspVar.a.g()) || !((Boolean) dspVar.g.invoke()).booleanValue())) {
                throw new dpr();
            }
        }
        dsp dspVar2 = this.a;
        return dspVar2.a(dspVar2.b(this.b.a(dspVar2.d(dspVar2.f(f)), 2)));
    }
}
