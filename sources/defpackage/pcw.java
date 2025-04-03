package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcw extends ktb {
    final /* synthetic */ ViewPager a;

    public pcw(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        pco pcoVar = this.a.b;
        return pcoVar != null && pcoVar.j() > 1;
    }

    @Override // defpackage.ktb
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        pco pcoVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (pcoVar = this.a.b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(pcoVar.j());
        accessibilityEvent.setFromIndex(this.a.c);
        accessibilityEvent.setToIndex(this.a.c);
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.r("androidx.viewpager.widget.ViewPager");
        kxuVar.N(j());
        if (this.a.canScrollHorizontally(1)) {
            kxuVar.h(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            kxuVar.h(8192);
        }
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            if (!this.a.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager = this.a;
            viewPager.k(viewPager.c + 1);
            return true;
        }
        if (i != 8192 || !this.a.canScrollHorizontally(-1)) {
            return false;
        }
        this.a.k(r2.c - 1);
        return true;
    }
}
