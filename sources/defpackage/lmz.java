package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmz {
    public static final lkr a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            lkr lkrVar = tag instanceof lkr ? (lkr) tag : null;
            if (lkrVar != null) {
                return lkrVar;
            }
            Object a = kyp.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, lkr lkrVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, lkrVar);
    }
}
