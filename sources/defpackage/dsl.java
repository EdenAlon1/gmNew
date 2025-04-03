package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsl {
    final /* synthetic */ dsp a;

    public dsl(dsp dspVar) {
        this.a = dspVar;
    }

    public final long a(long j, int i) {
        dsp dspVar = this.a;
        dspVar.i = i;
        dik dikVar = dspVar.b;
        if (dikVar == null || !dspVar.j()) {
            dsp dspVar2 = this.a;
            return dspVar2.c(dspVar2.j, j, i);
        }
        dsp dspVar3 = this.a;
        return dikVar.a(j, dspVar3.i, dspVar3.l);
    }

    public final long b(long j) {
        dsp dspVar = this.a;
        return dspVar.c(dspVar.j, j, 1);
    }
}
