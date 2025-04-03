package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wt extends ktb {
    final RecyclerView a;
    public final ws b;

    public wt(RecyclerView recyclerView) {
        this.a = recyclerView;
        ktb j = j();
        if (j == null || !(j instanceof ws)) {
            this.b = new ws(this);
        } else {
            this.b = (ws) j;
        }
    }

    @Override // defpackage.ktb
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        vx vxVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (vxVar = ((RecyclerView) view).o) == null) {
            return;
        }
        vxVar.Z(accessibilityEvent);
    }

    @Override // defpackage.ktb
    public void c(View view, kxu kxuVar) {
        vx vxVar;
        super.c(view, kxuVar);
        if (k() || (vxVar = this.a.o) == null) {
            return;
        }
        RecyclerView recyclerView = vxVar.u;
        vxVar.cf(recyclerView.e, recyclerView.O, kxuVar);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        vx vxVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k() || (vxVar = this.a.o) == null) {
            return false;
        }
        return vxVar.ci(i, bundle);
    }

    public ktb j() {
        return this.b;
    }

    final boolean k() {
        return this.a.aD();
    }
}
