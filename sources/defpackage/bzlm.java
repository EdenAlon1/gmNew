package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlm implements bzlh {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleDitto");
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final azei g;
    private final ffbr h;
    private AtomicReference i;
    private Instant j;

    public bzlm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, azei azeiVar, ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        azeiVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = azeiVar;
        this.h = ffbrVar5;
        if (ffbrVar2.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (ffbrVar3.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (ffbrVar4.b() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.i = new AtomicReference(bzll.b);
        this.j = Instant.MIN;
    }

    private final void c() {
        synchronized (this) {
            this.i.set(bzll.b);
        }
        this.g.d(new Consumer() { // from class: bzlj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bzln bzlnVar = (bzln) obj;
                int i = bzlm.a;
                bzlnVar.getClass();
                axnw.h(bzlnVar.a.f(26, fcek.a, ""));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ensz) b.e()).q("Throttle State changed to NOT THROTTLED, notifying Ditto to exit Polling Mode");
        Duration between = Duration.between(this.j, Instant.ofEpochMilli(((cqoh) this.h.b()).a()));
        ((akzt) this.c.b()).c("Bugle.Ditto.Throttle.Stop.Counts");
        ((akzt) this.c.b()).g("Bugle.Ditto.Throttle.Duration.Minutes.Count", between.toMinutes());
    }

    private static final boolean d(axuc axucVar) {
        if (!axucVar.c()) {
            synchronized (axucVar) {
                double a2 = axucVar.a();
                if (a2 >= 1.0d) {
                    axucVar.b = Math.max(eobe.a, a2 - 1.0d);
                    axucVar.c = Instant.ofEpochMilli(axucVar.a.a());
                    return false;
                }
                axucVar.d.set(true);
                axucVar.e = Instant.ofEpochMilli(axucVar.a.a());
            }
        }
        return true;
    }

    @Override // defpackage.bzlh
    public final boolean a() {
        boolean z = false;
        if (this.i.get() != bzll.b && (((axuc) this.d.b()).c() || ((axuc) this.e.b()).c() || ((axuc) this.f.b()).c())) {
            z = true;
        }
        if (this.i.get() == bzll.a && !z) {
            c();
        }
        return z;
    }

    @Override // defpackage.bzlh
    public final boolean b() {
        Object b2 = this.d.b();
        b2.getClass();
        bzlo bzloVar = new bzlo(d((axuc) b2), "Minute Interval Throttler is throttling requests");
        Object b3 = this.e.b();
        b3.getClass();
        bzlo bzloVar2 = new bzlo(d((axuc) b3), "Five Minute Interval Throttler is throttling requests");
        Object b4 = this.f.b();
        b4.getClass();
        bzlo bzloVar3 = new bzlo(d((axuc) b4), "Twenty Minute Interval Throttler is throttling requests");
        boolean z = bzloVar.a;
        boolean z2 = true;
        if (!z && !bzloVar2.a && !bzloVar3.a) {
            z2 = false;
        }
        bzlk bzlkVar = z ? bzlk.b : bzloVar2.a ? bzlk.c : bzloVar3.a ? bzlk.d : bzlk.a;
        if (this.i.get() != bzll.b || !z2) {
            if (this.i.get() != bzll.a || z2) {
                return z2;
            }
            c();
            return false;
        }
        synchronized (this) {
            this.i.set(bzll.a);
            this.j = Instant.ofEpochMilli(((cqoh) this.h.b()).a());
        }
        this.g.d(new Consumer() { // from class: bzli
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bzln bzlnVar = (bzln) obj;
                int i = bzlm.a;
                bzlnVar.getClass();
                axnw.h(bzlnVar.a.f(25, fcek.a, ""));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ensz) b.e()).t("Throttle State changed to THROTTLED because [%s], notifying Ditto to enter Polling Mode", bzlkVar);
        ((akzt) this.c.b()).e("Bugle.Ditto.Throttle.Start.Counts", bzlkVar.e);
        return z2;
    }
}
