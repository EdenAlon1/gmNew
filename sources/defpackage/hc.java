package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hc {
    public static final hj a(ViewGroup viewGroup, fc fcVar) {
        fcVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof hj) {
            return (hj) tag;
        }
        dh dhVar = new dh(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dhVar);
        return dhVar;
    }
}
