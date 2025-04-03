package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ws extends ktb {
    final wt a;
    public final Map b = new WeakHashMap();

    public ws(wt wtVar) {
        this.a = wtVar;
    }

    @Override // defpackage.ktb
    public final kxx a(View view) {
        ktb ktbVar = (ktb) this.b.get(view);
        return ktbVar != null ? ktbVar.a(view) : super.a(view);
    }

    @Override // defpackage.ktb
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            ktbVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        vx vxVar;
        if (this.a.k() || (vxVar = this.a.a.o) == null) {
            super.c(view, kxuVar);
            return;
        }
        vxVar.aW(view, kxuVar);
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            ktbVar.c(view, kxuVar);
        } else {
            super.c(view, kxuVar);
        }
    }

    @Override // defpackage.ktb
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            ktbVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ktb
    public final void e(View view, int i) {
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            ktbVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.ktb
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            ktbVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ktb
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        ktb ktbVar = (ktb) this.b.get(view);
        return ktbVar != null ? ktbVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.ktb
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        ktb ktbVar = (ktb) this.b.get(viewGroup);
        return ktbVar != null ? ktbVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (this.a.k() || this.a.a.o == null) {
            return super.i(view, i, bundle);
        }
        ktb ktbVar = (ktb) this.b.get(view);
        if (ktbVar != null) {
            if (ktbVar.i(view, i, bundle)) {
                return true;
            }
        } else if (super.i(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a.a.o.u;
        wf wfVar = recyclerView.e;
        wo woVar = recyclerView.O;
        return false;
    }
}
