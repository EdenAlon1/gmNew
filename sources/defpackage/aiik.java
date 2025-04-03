package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiik implements aiii {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl");
    private final ffsk b;
    private final AtomicInteger c;
    private final fgcm d;

    public aiik(ffsk ffskVar) {
        ffskVar.getClass();
        this.b = ffskVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.c = atomicInteger;
        this.d = fgdm.a(new aiie(atomicInteger.get()));
    }

    private final void h(aiig aiigVar, aiig aiigVar2) {
        try {
            aihv b = aiigVar2.b();
            int a2 = aiigVar2.a();
            enru enruVar = a;
            ((enrr) enruVar.h().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitioning", 204, "NavigationStateMachineImpl.kt")).N("Transition:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s", aiigVar.c(), new ecgk(aiigVar.getClass()), aiigVar2.c(), new ecgk(aiigVar2.getClass()), b, new ecgk(b.getClass()), new ecgg(a2));
            aiigVar2.d(aiigVar);
            try {
                boolean g = this.d.g(aiigVar, aiigVar2);
                aihv b2 = aiigVar2.b();
                ((enrr) enruVar.a(g ? Level.INFO : Level.WARNING).h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitionCompleted", 236, "NavigationStateMachineImpl.kt")).O("Transition completed:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s\n   update: %s", aiigVar.c(), new ecgk(aiigVar.getClass()), aiigVar2.c(), new ecgk(aiigVar2.getClass()), b2, new ecgk(b2.getClass()), new ecgg(aiigVar2.a()), new ecgk(true != g ? "failed" : "succeeded"));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                aiij.a(aiigVar, aiigVar.b(), aiigVar2.c(), aiigVar2.getClass(), aiigVar2.b(), aiigVar2.a(), exc);
                if (!(exc instanceof aiif)) {
                    throw exc;
                }
                if (!(aiigVar2 instanceof aihw)) {
                    throw exc;
                }
                if (aiigVar instanceof aiie) {
                    throw exc;
                }
                ((enrr) a.j().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl", "executeTransition", 185, "NavigationStateMachineImpl.kt")).q("Disregarding duplicate navigation request due to ongoing navigation.");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // defpackage.aiii
    public final fgdj a() {
        return this.d;
    }

    @Override // defpackage.aiii
    public final void b() {
        h((aiig) this.d.c(), new aiie(this.c.incrementAndGet()));
    }

    @Override // defpackage.aiii
    public final void c(int i) {
        aiig aiigVar = (aiig) this.d.c();
        aihv b = aiigVar.b();
        if (b instanceof aihs) {
            h(aiigVar, new aihx(i, (aihs) b));
        } else {
            aiif aiifVar = new aiif(aiigVar, "CompletedState", b, i);
            aiij.a(aiigVar, aiigVar.b(), aiifVar.a, aihx.class, b, i, aiifVar);
            throw aiifVar;
        }
    }

    @Override // defpackage.aiii
    public final void d(int i, Object obj) {
        aiig aiigVar = (aiig) this.d.c();
        aihv b = aiigVar.b();
        if (b instanceof aihu) {
            h(aiigVar, new aihz(obj, i, (aihu) b, this.b));
        } else {
            aiif aiifVar = new aiif(aiigVar, "CompletedWithResultState", b, i);
            aiij.a(aiigVar, aiigVar.b(), aiifVar.a, aihz.class, b, i, aiifVar);
            throw aiifVar;
        }
    }

    @Override // defpackage.aiii
    public final void e(int i) {
        aiig aiidVar;
        aiig aiigVar = (aiig) this.d.c();
        aihv b = aiigVar.b();
        if (aiigVar instanceof aiin) {
            aiidVar = new aiia(i, (aihs) b);
        } else {
            if (!(aiigVar instanceof aiiq)) {
                aiif aiifVar = new aiif(aiigVar, "DispatchedState or DispatchedWithResultState", b, i);
                aiij.a(aiigVar, aiigVar.b(), aiifVar.a, aiia.class, b, i, aiifVar);
                throw aiifVar;
            }
            aiidVar = new aiid(i, (aihu) b);
        }
        h(aiigVar, aiidVar);
    }

    @Override // defpackage.aiii
    public final void f(aihs aihsVar) {
        h((aiig) this.d.c(), new aiin(this.c.incrementAndGet(), aihsVar));
    }

    @Override // defpackage.aiii
    public final void g(aihu aihuVar, ffgu ffguVar) {
        aihuVar.getClass();
        h((aiig) this.d.c(), new aiiq(this.c.incrementAndGet(), aihuVar, ffguVar));
    }
}
