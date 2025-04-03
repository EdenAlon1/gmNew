package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dp extends adg {
    final /* synthetic */ AtomicReference a;

    public dp(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.adg
    public final void a(Object obj, kli kliVar) {
        adg adgVar = (adg) this.a.get();
        if (adgVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        adgVar.a(obj, kliVar);
    }

    @Override // defpackage.adg
    public final void b() {
        adg adgVar = (adg) this.a.getAndSet(null);
        if (adgVar != null) {
            adgVar.b();
        }
    }
}
