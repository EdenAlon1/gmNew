package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyl implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ dsym a;

    public dsyl(dsym dsymVar) {
        this.a = dsymVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.getClass();
        view2.getClass();
        Object invoke = this.a.d.invoke(view2);
        if (invoke != null) {
            this.a.b.invoke(invoke);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
        dsym dsymVar = this.a;
        if (dsymVar.a.h) {
            dsymVar.a();
        }
        Object invoke = this.a.d.invoke(view2);
        if (invoke != null) {
            this.a.c.invoke(invoke);
        }
    }
}
