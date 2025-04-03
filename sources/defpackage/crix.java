package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class crix {
    public static boolean a(MessagePartCoreData messagePartCoreData) {
        String authority;
        if (!messagePartCoreData.br()) {
            return false;
        }
        Uri t = messagePartCoreData.t();
        return t == null || (authority = t.getAuthority()) == null || authority.startsWith("mms");
    }
}
