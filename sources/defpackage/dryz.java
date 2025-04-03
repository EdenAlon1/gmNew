package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryz implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ drzi a;

    public dryz(drzi drziVar) {
        this.a = drziVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.getClass();
        view2.getClass();
        if (ffkj.e(view, this.a.h.k)) {
            r1.j(this.a.c());
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        view.getClass();
        view2.getClass();
    }
}
