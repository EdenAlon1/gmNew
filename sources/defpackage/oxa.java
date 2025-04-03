package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxa {
    public static final owz a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            owz owzVar = tag instanceof owz ? (owz) tag : null;
            if (owzVar != null) {
                return owzVar;
            }
            Object a = kyp.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, owz owzVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, owzVar);
    }
}
