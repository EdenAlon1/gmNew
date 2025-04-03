package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zb implements oq {
    od a;
    public og b;
    final /* synthetic */ Toolbar c;

    public zb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.oq
    public final int a() {
        return 0;
    }

    @Override // defpackage.oq
    public final void c(Context context, od odVar) {
        og ogVar;
        od odVar2 = this.a;
        if (odVar2 != null && (ogVar = this.b) != null) {
            odVar2.t(ogVar);
        }
        this.a = odVar;
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        return null;
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        throw null;
    }

    @Override // defpackage.oq
    public final void f(boolean z) {
        if (this.b != null) {
            od odVar = this.a;
            if (odVar != null) {
                int size = odVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            i(this.b);
        }
    }

    @Override // defpackage.oq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.oq
    public final boolean h(oy oyVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean i(og ogVar) {
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof nd) {
            ((nd) callback).onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        int size = toolbar3.u.size();
        while (true) {
            size--;
            if (size < 0) {
                toolbar3.u.clear();
                this.b = null;
                this.c.requestLayout();
                ogVar.h(false);
                this.c.z();
                return true;
            }
            toolbar3.addView((View) toolbar3.u.get(size));
        }
    }

    @Override // defpackage.oq
    public final boolean j(og ogVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            zc zcVar = new zc();
            zcVar.a = (toolbar.m & 112) | 8388611;
            zcVar.b = 2;
            toolbar.g.setLayoutParams(zcVar);
            toolbar.g.setOnClickListener(new yz(toolbar));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = ogVar.getActionView();
        this.b = ogVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            zc zcVar2 = new zc();
            Toolbar toolbar5 = this.c;
            zcVar2.a = 8388611 | (toolbar5.m & 112);
            zcVar2.b = 2;
            toolbar5.h.setLayoutParams(zcVar2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((zc) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.u.add(childAt);
            }
        }
        this.c.requestLayout();
        ogVar.h(true);
        KeyEvent.Callback callback = this.c.h;
        if (callback instanceof nd) {
            ((nd) callback).onActionViewExpanded();
        }
        this.c.z();
        return true;
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
    }

    @Override // defpackage.oq
    public final void d(od odVar, boolean z) {
    }
}
