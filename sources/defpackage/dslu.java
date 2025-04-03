package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dslu extends fflr {
    final /* synthetic */ dslv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dslu(Object obj, dslv dslvVar) {
        super(obj);
        this.a = dslvVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((Boolean) obj).booleanValue();
        dslv dslvVar = this.a;
        dslvVar.bH(dslvVar.bC().a());
        enrr enrrVar = (enrr) dslv.aH.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment$special$$inlined$distinctObservable$2", "afterChange", 137, "HugoFragment.kt");
        int i = fflc.a;
        enrrVar.C("%s loaded in %dms", new ffkb(this.a.getClass()).c(), this.a.bD().toMillis());
        ffix ffixVar = this.a.aP;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        dslv dslvVar2 = this.a;
        View view = dslvVar2.Q;
        if (view != null) {
            view.post(new dsls(dslvVar2));
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
