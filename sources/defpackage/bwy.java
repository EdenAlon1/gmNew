package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwy implements ksz {
    private final bqe a;

    public bwy(bqe bqeVar) {
        this.a = bqeVar;
    }

    @Override // defpackage.ksz
    public final /* bridge */ /* synthetic */ Object a() {
        int c;
        bqe bqeVar = this.a;
        bws.d(bqeVar);
        bws.b(bqeVar);
        int i = ((bqh) this.a).g;
        if (i == -1) {
            avw.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            i = 1;
        } else {
            avw.a("DefAudioResolver", a.h(0, "Using supplied AUDIO channel count: "));
        }
        bqe bqeVar2 = this.a;
        Range range = bqe.b;
        Range range2 = ((bqh) bqeVar2).f;
        if (range.equals(range2)) {
            avw.a("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            c = 44100;
        } else {
            c = bws.c(range2, i, ((Integer) range2.getUpper()).intValue());
            avw.a("DefAudioResolver", a.f(c, "Using AUDIO sample rate resolved from AudioSpec: ", "Hz"));
        }
        bvd f = bve.f();
        f.d(5);
        f.c(2);
        f.e(i);
        f.f(c);
        return f.b();
    }
}
