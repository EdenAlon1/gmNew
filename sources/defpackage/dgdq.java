package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgdq {
    static dhre a(Executor executor, dhre dhreVar, final Duration duration) {
        return dhreVar.l() ? dhreVar : dhrt.e(dhreVar, duration.toMillis(), TimeUnit.MILLISECONDS).e(executor, new dhqh() { // from class: dgdp
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar2) {
                Exception h = dhreVar2.h();
                return h instanceof TimeoutException ? dhrt.b(dgcq.a(h, 15, "Task timed out after ".concat(String.valueOf(String.valueOf(Duration.this))))) : dhreVar2;
            }
        });
    }
}
