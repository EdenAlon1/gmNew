package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acrw {
    public static final entd a = entd.c("BugleSatelliteBg");
    public final fazb b;
    public final errl c;
    public final errl d;
    public final akzt e;
    public final aclb f;
    public final albq g;
    public final fazb h;
    public final acua i;
    public final String j;
    public final AtomicReference k = new AtomicReference(Optional.empty());
    public final AtomicReference l = new AtomicReference(Optional.empty());
    public final acrm m;
    private final actk n;
    private final ffbr o;

    public acrw(actk actkVar, fazb fazbVar, errl errlVar, errl errlVar2, akzt akztVar, aclb aclbVar, albq albqVar, fazb fazbVar2, ffbr ffbrVar, acua acuaVar, String str) {
        this.n = actkVar;
        this.b = fazbVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = akztVar;
        this.f = aclbVar;
        this.g = albqVar;
        this.h = fazbVar2;
        this.o = ffbrVar;
        this.i = acuaVar;
        this.j = str;
        this.m = new acrm(errlVar, acuaVar);
    }

    public final actj a() {
        actj a2 = this.n.a();
        a2.d = false;
        a2.e();
        return a2;
    }

    public final elfl b() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "destroy", 252, "JsBridgeDittoControllerV2.java")).q("Destroying JsBridgeDittoController");
        ((Optional) this.k.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: acqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                acrw acrwVar = acrw.this;
                ((acuq) acrwVar.b.b()).b(acrwVar.i, (acyu) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.l.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: acqi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((acpg) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final acrm acrmVar = this.m;
        final acrp acrpVar = acrp.DESTROYED;
        return acrmVar.b(null).h(new emwl() { // from class: acrc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acrm acrmVar2 = acrm.this;
                AtomicInteger atomicInteger = acrmVar2.c;
                acrp acrpVar2 = acrpVar;
                ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionUnchecked", 353, "JsBridgeDittoControllerV2.java")).J("ConnectionStateMachine for %s did an unchecked move from %s to %s", acrmVar2.b.name(), acrp.a(atomicInteger.getAndSet(acrpVar2.ordinal())), acrpVar2);
                return null;
            }
        }, acrmVar.a);
    }

    public final elfl c() {
        final acrp a2 = this.m.a();
        switch (a2.ordinal()) {
            case 0:
            case 3:
            case 4:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 216, "JsBridgeDittoControllerV2.java")).w("Ignoring unnecessary pause(). Current state: %d. Host Type: %s", a2.ordinal(), this.i);
                return elfo.e(false);
            case 1:
                final acrm acrmVar = this.m;
                final acrp acrpVar = acrp.NOT_STARTED;
                return acrmVar.b(a2).h(new emwl() { // from class: acrd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        acrm acrmVar2 = acrm.this;
                        AtomicInteger atomicInteger = acrmVar2.c;
                        acrp acrpVar2 = acrpVar;
                        if (atomicInteger.compareAndSet(a2.ordinal(), acrpVar2.ordinal())) {
                            ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transition", 333, "JsBridgeDittoControllerV2.java")).D("ConnectionStateMachine for %s successfully moved to %s", acrmVar2.b.name(), acrpVar2);
                            return true;
                        }
                        ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transition", 338, "JsBridgeDittoControllerV2.java")).D("ConnectionStateMachine for %s preempted before moving to %s", acrmVar2.b.name(), acrpVar2);
                        return false;
                    }
                }, acrmVar.a);
            case 2:
                return this.m.c(a2, new acrs(this));
            case 5:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 226, "JsBridgeDittoControllerV2.java")).t("Channel is being unpaused. Cancelling operation. Host Type: %s", this.i);
                return this.m.b(a2).h(new emwl() { // from class: acqj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = acrw.a;
                        return true;
                    }
                }, this.c).f(CancellationException.class, new eroh() { // from class: acqk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ensz enszVar = (ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 234, "JsBridgeDittoControllerV2.java");
                        acrw acrwVar = acrw.this;
                        enszVar.t("Unpause operation completed. Triggering pause. Host Type: %s", acrwVar.i);
                        return acrwVar.m.c(acrp.PAUSED, new acrs(acrwVar));
                    }
                }, this.c);
            case 6:
                return elfo.d(new IllegalStateException(String.format("Cannot pause channel, service has been destroyed. Host Type: %s", this.i)));
            default:
                throw new IllegalStateException("Unreachable code after pause() switch");
        }
    }

    public final elfl d() {
        acrp a2 = this.m.a();
        switch (a2.ordinal()) {
            case 0:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 154, "JsBridgeDittoControllerV2.java")).t("Channel is not open. Starting a new one. Host Type: %s", this.i);
                final acpg acpgVar = (acpg) this.o.b();
                return this.m.c(a2, new acra(this, acpgVar)).h(new emwl() { // from class: acqe
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        acrw.this.l.set(Optional.of(acpgVar));
                        return bool;
                    }
                }, this.c);
            case 1:
            case 2:
            case 5:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 188, "JsBridgeDittoControllerV2.java")).w("Ignoring unnecessary startOrResume(). Current state: %d. Host Type: %s", a2.ordinal(), this.i);
                return elfo.e(false);
            case 3:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 166, "JsBridgeDittoControllerV2.java")).t("Channel is open but paused. Unpausing. Host Type: %s", this.i);
                return this.m.c(a2, new acrv(this));
            case 4:
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 170, "JsBridgeDittoControllerV2.java")).t("Channel is being paused. Cancelling operation. Host Type: %s", this.i);
                return this.m.b(a2).h(new emwl() { // from class: acqf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = acrw.a;
                        return true;
                    }
                }, this.c).f(CancellationException.class, new eroh() { // from class: acqg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ensz enszVar = (ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 178, "JsBridgeDittoControllerV2.java");
                        acrw acrwVar = acrw.this;
                        enszVar.t("Pause operation completed. Triggering Unpause. Host Type: %s", acrwVar.i);
                        return acrwVar.m.c(acrp.PAUSED, new acrv(acrwVar));
                    }
                }, this.c);
            case 6:
                return elfo.d(new IllegalStateException(String.format("Cannot start channel, service has been destroyed. Host Type: %s", this.i)));
            default:
                throw new IllegalStateException("Unreachable code after startOrResume() switch");
        }
    }
}
