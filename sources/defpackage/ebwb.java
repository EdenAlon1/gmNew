package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebwb {
    public static void a(dvxi dvxiVar, dvxf dvxfVar, View view) {
        dvxg dvxgVar = (dvxg) view.getTag(R.id.interaction_info_tag);
        if (dvxgVar != null) {
            dvxfVar.b(dvxgVar);
            b(view, null);
        }
        dvxiVar.a(dvxfVar.a(), view);
    }

    public static void b(View view, dvxg dvxgVar) {
        view.setTag(R.id.interaction_info_tag, dvxgVar);
    }
}
