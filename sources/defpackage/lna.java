package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lna {
    public static final lmy a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            lmy lmyVar = tag instanceof lmy ? (lmy) tag : null;
            if (lmyVar != null) {
                return lmyVar;
            }
            Object a = kyp.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, lmy lmyVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, lmyVar);
    }
}
