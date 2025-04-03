package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eett extends pco {
    public WindowInsets a;
    private final ViewPager b;
    private SparseArray c = new SparseArray();
    private eetz d;
    private final eety e;

    public eett(ViewPager viewPager, eety eetyVar) {
        this.b = viewPager;
        this.e = eetyVar;
    }

    @Override // defpackage.pco
    public final Parcelable a() {
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt.isSaveFromParentEnabled()) {
                childAt.saveHierarchyState(this.c);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("viewStates", this.c);
        return bundle;
    }

    @Override // defpackage.pco
    public final Object c(ViewGroup viewGroup, int i) {
        View eesmVar;
        Context context = viewGroup.getContext();
        if (i == 0) {
            eesmVar = new eesm(context, this.e);
            eesmVar.setId(i);
        } else {
            if (i != 1) {
                throw new IllegalStateException(a.h(i, "Unknown page position: "));
            }
            eesmVar = new eeta(context, this.e);
            eesmVar.setId(i);
        }
        eesmVar.restoreHierarchyState(this.c);
        viewGroup.addView(eesmVar);
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            eesmVar.dispatchApplyWindowInsets(windowInsets);
        }
        return eesmVar;
    }

    @Override // defpackage.pco
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        view.saveHierarchyState(this.c);
        viewGroup.removeView(view);
    }

    @Override // defpackage.pco
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        this.c = bundle.getSparseParcelableArray("viewStates");
    }

    @Override // defpackage.pco
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        eetz eetzVar = this.d;
        if (obj == eetzVar) {
            return;
        }
        if (eetzVar != null) {
            eetzVar.c();
        }
        eetz eetzVar2 = (eetz) obj;
        this.d = eetzVar2;
        eetzVar2.b();
    }

    @Override // defpackage.pco
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.pco
    public final int j() {
        return 2;
    }

    @Override // defpackage.pco
    public final CharSequence k(int i) {
        Context context = this.b.getContext();
        if (i == 0) {
            return context.getString(R.string.sticker_gallery_view_pager_browse_label);
        }
        if (i == 1) {
            return context.getString(R.string.sticker_gallery_view_pager_favorite_label);
        }
        throw new IllegalStateException(a.h(i, "Unknown page position: "));
    }
}
