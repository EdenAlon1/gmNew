package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drn extends ffkk implements ffjm {
    final /* synthetic */ ffky a;
    final /* synthetic */ dsp b;
    final /* synthetic */ dsl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drn(ffky ffkyVar, dsp dspVar, dsl dslVar) {
        super(2);
        this.a = ffkyVar;
        this.b = dspVar;
        this.c = dslVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float f = floatValue - this.a.a;
        dsp dspVar = this.b;
        this.a.a += dspVar.a(dspVar.b(this.c.b(dspVar.f(dspVar.a(f)))));
        return ffcu.a;
    }
}
