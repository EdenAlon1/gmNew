package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrm {
    public final Executor a;
    public final acua b;
    public final AtomicInteger c = new AtomicInteger(acrp.NOT_STARTED.ordinal());
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();

    public acrm(ExecutorService executorService, acua acuaVar) {
        this.a = new ersb(executorService);
        this.b = acuaVar;
    }

    final acrp a() {
        return acrp.a(this.c.get());
    }

    final elfl b(final acrp acrpVar) {
        return elfo.f(new Runnable() { // from class: acrh
            @Override // java.lang.Runnable
            public final void run() {
                final acrm acrmVar = acrm.this;
                acrp acrpVar2 = acrpVar;
                if (acrpVar2 != null && acrmVar.c.get() != acrpVar2.ordinal()) {
                    throw new CancellationException("Current state did not match");
                }
                acrmVar.d.ifPresent(new Consumer() { // from class: acre
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "cancelInProgressTransition", 466, "JsBridgeDittoControllerV2.java")).q("Explicitly cancelling the lastTransitionAsyncFuture.");
                        ((elfl) obj).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                acrmVar.d = Optional.empty();
                acrmVar.e.ifPresent(new Consumer() { // from class: acrf
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        acrm.this.c.set(((acrp) obj).ordinal());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                acrmVar.e = Optional.empty();
            }
        }, this.a);
    }

    final elfl c(final acrp acrpVar, final acql acqlVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return elfj.c(b(acrpVar)).g(new erot() { // from class: acri
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                acrm acrmVar = acrm.this;
                if (acrmVar.d.isPresent()) {
                    ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 376, "JsBridgeDittoControllerV2.java")).q("Another task interrupted this one. Cancelling.");
                    throw new CancellationException();
                }
                acql acqlVar2 = acqlVar;
                acrp acrpVar2 = acrpVar;
                if (!acrmVar.c.compareAndSet(acrpVar2.ordinal(), acqlVar2.b().ordinal())) {
                    ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 381, "JsBridgeDittoControllerV2.java")).q("Could not transition to ongoing state. Cancelling.");
                    throw new CancellationException();
                }
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 384, "JsBridgeDittoControllerV2.java")).J("ConnectionStateMachine for %s started async operation by moving from %s to %s", acrmVar.b.name(), acrpVar2, acqlVar2.b());
                elfl c = acqlVar2.c();
                erpcVar.a(eldl.j(new acqm(acqlVar2, atomicBoolean2)), erpp.a);
                acrmVar.d = Optional.of(c);
                acrmVar.e = Optional.of(acrpVar2);
                return elfj.c(c).a;
            }
        }, this.a).f(new erow() { // from class: acrj
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                acql acqlVar2 = acqlVar;
                int ordinal = acqlVar2.b().ordinal();
                int ordinal2 = acqlVar2.a().ordinal();
                acrm acrmVar = acrm.this;
                if (!acrmVar.c.compareAndSet(ordinal, ordinal2)) {
                    ((ensz) ((ensz) acrw.a.j()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 400, "JsBridgeDittoControllerV2.java")).t("Cancelling transition to %s because the state could not be changed", acqlVar2.a());
                    throw new CancellationException();
                }
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 405, "JsBridgeDittoControllerV2.java")).J("ConnectionStateMachine for %s completed async operation by moving from %s to %s", acrmVar.b.name(), acqlVar2.b(), acqlVar2.a());
                atomicBoolean2.set(true);
                acrmVar.d = Optional.empty();
                acrmVar.e = Optional.empty();
                return true;
            }
        }, this.a).h().e(CancellationException.class, new emwl() { // from class: acrk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensz enszVar = (ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 419, "JsBridgeDittoControllerV2.java");
                acql acqlVar2 = acqlVar;
                acrm acrmVar = acrm.this;
                enszVar.D("ConnectionStateMachine for %s cancelled async operation that would have moved to %s", acrmVar.b.name(), acqlVar2.a());
                acrmVar.d.ifPresent(new Consumer() { // from class: acrg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((elfl) obj2).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                acrmVar.d = Optional.empty();
                acrmVar.c.compareAndSet(acqlVar2.b().ordinal(), acrpVar.ordinal());
                acrmVar.e = Optional.empty();
                return false;
            }
        }, this.a).e(Exception.class, new emwl() { // from class: acrl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acrm acrmVar = acrm.this;
                acrmVar.d.ifPresent(new Consumer() { // from class: acrb
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((elfl) obj2).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                acrmVar.d = Optional.empty();
                acql acqlVar2 = acqlVar;
                acrmVar.c.compareAndSet(acqlVar2.b().ordinal(), acrpVar.ordinal());
                acrmVar.e = Optional.empty();
                throw new acqn(String.format("Failed during operation to %s for %s", acqlVar2.a(), acrmVar.b.name()), (Exception) obj);
            }
        }, this.a);
    }
}
