package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class aqde {
    public static aqcm a(aqdf aqdfVar, Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        resources.getClass();
        bindData.getClass();
        engwVar.getClass();
        aougVar.getClass();
        apugVar.getClass();
        amfxVar.getClass();
        aqcl b = aqdfVar.b(resources, bindData, engwVar, aougVar, apugVar, amfxVar);
        String U = bindData.U();
        if (TextUtils.isEmpty(U)) {
            return b;
        }
        String str = b.a;
        return new aqcl(str == null ? null : resources.getString(R.string.message_status_error, str, U), b.h, b.b, b.c, b.d, false, false, false, 224);
    }
}
