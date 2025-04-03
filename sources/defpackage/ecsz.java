package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecsz {
    private static final ecsv d = ecsv.a(Alert.DURATION_SHOW_INDEFINITELY);
    public volatile ecte a = ectd.a;
    public volatile boolean b = true;
    public volatile ecsv c = d;

    public ecsz(final Context context, final Executor executor, final ectd ectdVar, final fazb fazbVar, boolean z, emxc emxcVar, ffbr ffbrVar) {
        final ffbr ffbrVar2 = (!z || emxcVar.g()) ? null : ffbrVar;
        b(new Runnable() { // from class: ecsw
            @Override // java.lang.Runnable
            public final void run() {
                final ecsz ecszVar = ecsz.this;
                final fazb fazbVar2 = fazbVar;
                Context context2 = context;
                if (dubc.e(context2)) {
                    ecszVar.a(fazbVar2);
                } else {
                    final Executor executor2 = executor;
                    dubc.b(context2, new Runnable() { // from class: ecsx
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ecsz ecszVar2 = ecsz.this;
                            final fazb fazbVar3 = fazbVar2;
                            ecsz.b(new Runnable() { // from class: ecsy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ecsz.this.a(fazbVar3);
                                }
                            }, executor2);
                        }
                    });
                }
                if (ecszVar.b) {
                    ffbr ffbrVar3 = ffbrVar2;
                    ectd ectdVar2 = ectdVar;
                    if (ffbrVar3 == null) {
                        fgpc createBuilder = fgpf.a.createBuilder();
                        createBuilder.copyOnWrite();
                        fgpf fgpfVar = (fgpf) createBuilder.instance;
                        fgpfVar.d = 2;
                        fgpfVar.b |= 4;
                        ecszVar.a = ectdVar2.a(createBuilder.build());
                        return;
                    }
                    try {
                        ecszVar.a = ectdVar2.a((fgpf) ffbrVar3.b());
                    } catch (Throwable th) {
                        ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", '}', "Sampler.java")).q("Couldn't get sampling strategy");
                        fgpc createBuilder2 = fgpf.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        fgpf fgpfVar2 = (fgpf) createBuilder2.instance;
                        fgpfVar2.b = 2 | fgpfVar2.b;
                        fgpfVar2.c = 1L;
                        createBuilder2.copyOnWrite();
                        fgpf fgpfVar3 = (fgpf) createBuilder2.instance;
                        fgpfVar3.d = 3;
                        fgpfVar3.b |= 4;
                        ecszVar.a = ectdVar2.a(createBuilder2.build());
                    }
                }
            }
        }, executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(fazb fazbVar) {
        try {
            echl echlVar = (echl) fazbVar.b();
            this.b = echlVar.c();
            this.c = ecsv.a(echlVar.a());
        } catch (Throwable th) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'h', "Sampler.java")).q("Couldn't get config");
            this.b = false;
        }
    }
}
