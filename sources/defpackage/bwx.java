package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwx implements ksz {
    private final bqe a;
    private final bef b;

    public bwx(bqe bqeVar, bef befVar) {
        this.a = bqeVar;
        this.b = befVar;
    }

    @Override // defpackage.ksz
    public final /* bridge */ /* synthetic */ Object a() {
        bqe bqeVar = this.a;
        bws.d(bqeVar);
        bws.b(bqeVar);
        bqh bqhVar = (bqh) this.a;
        int i = bqhVar.g;
        int b = this.b.b();
        if (i == -1) {
            avw.a("AudioSrcAdPrflRslvr", a.h(b, "Resolved AUDIO channel count from AudioProfile: "));
            i = b;
        } else {
            avw.a("AudioSrcAdPrflRslvr", a.x(0, b, "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", ", Resolved Channel Count: ", "]"));
        }
        Range range = bqhVar.f;
        int e = this.b.e();
        int c = bws.c(range, i, e);
        avw.a("AudioSrcAdPrflRslvr", a.x(e, c, "Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", "Hz. [AudioProfile sample rate: ", "Hz]"));
        bvd f = bve.f();
        f.d(5);
        f.c(2);
        f.e(i);
        f.f(c);
        return f.b();
    }
}
