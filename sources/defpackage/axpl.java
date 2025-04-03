package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpl {
    private final axpe a;
    private final ffrf b;

    public axpl(axpe axpeVar) {
        this(axpeVar, null);
    }

    public final void a(ffji ffjiVar) {
        axpe axpeVar = this.a;
        if (axpeVar != null) {
            axpeVar.b.d(ffjiVar);
            return;
        }
        ffrf ffrfVar = this.b;
        ffrfVar.getClass();
        ffrfVar.d(ffjiVar);
    }

    public final void b(Object obj) {
        axpe axpeVar = this.a;
        if (axpeVar == null) {
            ffrf ffrfVar = this.b;
            ffrfVar.getClass();
            ffrfVar.w(obj);
        } else if (!axpeVar.b.i()) {
            enrr enrrVar = (enrr) axpe.a.f();
            enrrVar.aa(ensy.SMALL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/concurrent/SafeCancellableContinuation", "safeResume", 58, "SafeCancellableContinuation.kt")).t("Skipped resuming continuation because continuation is not active; isCancelled %b", Boolean.valueOf(axpeVar.b.j()));
        } else {
            try {
                axpeVar.b.w(obj);
            } catch (IllegalStateException e) {
                enrr enrrVar2 = (enrr) axpe.a.j();
                enrrVar2.aa(ensy.SMALL);
                ((enrr) enrrVar2.g(e).h("com/google/android/apps/messaging/shared/concurrent/SafeCancellableContinuation", "safeResume", 52, "SafeCancellableContinuation.kt")).q("Failed to resume continuation");
            }
        }
    }

    private axpl(axpe axpeVar, ffrf ffrfVar) {
        this.a = axpeVar;
        this.b = ffrfVar;
        if (axpeVar != null || ffrfVar == null) {
            if (axpeVar == null || ffrfVar != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public axpl(ffrf ffrfVar) {
        this(null, ffrfVar);
    }
}
