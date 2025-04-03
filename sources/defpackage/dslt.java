package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslt extends fflr {
    final /* synthetic */ dslv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dslt(dslv dslvVar) {
        super(null);
        this.a = dslvVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dslw dslwVar = (dslw) obj2;
        if (this.a.aO.b()) {
            enrr enrrVar = (enrr) dslv.aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 69, "HugoFragment.kt");
            dslv dslvVar = this.a;
            int i = fflc.a;
            enrrVar.t("%s configuration changed, updating flow", new ffkb(dslvVar.getClass()).c());
            ((fgcm) this.a.aO.a()).f(dslwVar == null ? this.a.bz() : dslwVar);
        } else {
            enrr enrrVar2 = (enrr) dslv.aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 74, "HugoFragment.kt");
            dslv dslvVar2 = this.a;
            int i2 = fflc.a;
            enrrVar2.t("%s configuration changed, but flow is not initialized", new ffkb(dslvVar2.getClass()).c());
        }
        if (!this.a.bI() || !this.a.gX()) {
            ((enrr) dslv.aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 82, "HugoFragment.kt")).t("%s configuration changed but screen does not support using updated configuration", new ffkb(this.a.getClass()).c());
        } else {
            ((enrr) dslv.aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$1", "afterChange", 77, "HugoFragment.kt")).t("%s configuration changed, notifying screen", new ffkb(this.a.getClass()).c());
            this.a.gW(dslwVar);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
