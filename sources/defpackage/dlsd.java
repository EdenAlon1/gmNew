package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.SyncWorker;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsd {
    private static final enru a = enru.c("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler");
    private final Context b;
    private final cgtm c;

    public dlsd(Context context, cgtm cgtmVar) {
        this.b = context;
        this.c = cgtmVar;
    }

    private final void d(Duration duration, ppa ppaVar, boolean z) {
        int i;
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler", "scheduleNextSync", 72, "SyncScheduler.java")).A("scheduling sync for %d seconds later, policy = %s", duration.toSeconds(), ppaVar);
        eznd ezndVar = (eznd) ezne.a.createBuilder();
        eznj eznjVar = (eznj) eznk.a.createBuilder();
        eyev a2 = eykj.a(duration);
        eznjVar.copyOnWrite();
        eznk eznkVar = (eznk) eznjVar.instance;
        a2.getClass();
        eznkVar.c = a2;
        eznkVar.b |= 1;
        int ordinal = ppaVar.ordinal();
        if (ordinal == 0) {
            i = 6;
        } else if (ordinal != 1) {
            i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ppaVar))));
                }
                i = 4;
            }
        } else {
            i = 5;
        }
        eznjVar.copyOnWrite();
        eznk eznkVar2 = (eznk) eznjVar.instance;
        eznkVar2.d = i - 2;
        eznkVar2.b |= 2;
        ezndVar.copyOnWrite();
        ezne ezneVar = (ezne) ezndVar.instance;
        eznk eznkVar3 = (eznk) eznjVar.build();
        eznkVar3.getClass();
        ezneVar.c = eznkVar3;
        ezneVar.b = 2;
        this.c.a((ezne) ezndVar.build());
        poh pohVar = new poh();
        pohVar.c(2);
        poj a3 = pohVar.a();
        ppv ppvVar = new ppv(SyncWorker.class);
        ppvVar.i(duration);
        ppvVar.g(a3);
        ppvVar.f(poa.EXPONENTIAL, fdqx.a.get().e(this.b), TimeUnit.SECONDS);
        ppvVar.d("SYNC");
        if (z) {
            ppvVar.d("FORCE_SYNC");
        }
        pqr.a(this.b).g("SYNC", ppaVar, (ppw) ppvVar.b());
    }

    public final void a() {
        d(Duration.ZERO, ppa.REPLACE, true);
    }

    public final void b(ppa ppaVar) {
        d(Duration.ZERO, ppaVar, false);
    }

    public final void c(Map map) {
        Duration ofSeconds;
        Iterator<E> it = ((enhk) map).values().iterator();
        long j = Long.MAX_VALUE;
        while (true) {
            if (!it.hasNext()) {
                ofSeconds = Duration.ofSeconds(Math.min(fdqx.a.get().c(this.b), j));
                break;
            }
            dlro dlroVar = (dlro) it.next();
            ewgw ewgwVar = dlroVar.d;
            if (ewgwVar == null) {
                ewgwVar = ewgw.a;
            }
            if ((ewgwVar.b & 1) == 0) {
                ofSeconds = Duration.ZERO;
                break;
            }
            if (fdqx.c(this.b)) {
                eyja eyjaVar = dlroVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                Duration between = Duration.between(eykj.d(eyjaVar), Instant.now());
                ewgw ewgwVar2 = dlroVar.d;
                if (ewgwVar2 == null) {
                    ewgwVar2 = ewgw.a;
                }
                eyev eyevVar = ewgwVar2.f;
                if (eyevVar == null) {
                    eyevVar = eyev.a;
                }
                j = Math.min(j, Math.max(fdqx.a(this.b), eykj.c(eyevVar).minus(between).toSeconds()));
            } else {
                long a2 = fdqx.a(this.b);
                ewgw ewgwVar3 = dlroVar.d;
                if (ewgwVar3 == null) {
                    ewgwVar3 = ewgw.a;
                }
                eyev eyevVar2 = ewgwVar3.f;
                if (eyevVar2 == null) {
                    eyevVar2 = eyev.a;
                }
                j = Math.min(j, Math.max(a2, eyki.b(eyevVar2) / 1000));
            }
        }
        d(ofSeconds, ppa.APPEND, false);
    }
}
