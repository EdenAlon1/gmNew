package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsi extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ dsp b;
    int c;
    dsp d;
    ffla e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsi(dsp dspVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = dspVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0L, this);
    }
}
