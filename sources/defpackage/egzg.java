package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzg extends ktb {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public egzg(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        View F;
        super.c(view, kxuVar);
        kxuVar.r(ScrollView.class.getName());
        if (this.a.h() == 0 || (F = AppBarLayout.BaseBehavior.F(this.b)) == null) {
            return;
        }
        AppBarLayout appBarLayout = this.a;
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((egzm) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (this.c.z() != (-this.a.h())) {
                    kxuVar.i(kxr.d);
                    kxuVar.N(true);
                }
                if (this.c.z() != 0) {
                    if (!F.canScrollVertically(-1)) {
                        kxuVar.i(kxr.e);
                        kxuVar.N(true);
                        return;
                    } else {
                        if ((-this.a.d()) != 0) {
                            kxuVar.i(kxr.e);
                            kxuVar.N(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.m(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        if (this.c.z() != 0) {
            View F = AppBarLayout.BaseBehavior.F(this.b);
            if (!F.canScrollVertically(-1)) {
                this.a.m(true);
                return true;
            }
            int i2 = -this.a.d();
            if (i2 != 0) {
                this.c.c(this.b, this.a, F, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
