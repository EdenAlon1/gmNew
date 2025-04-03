package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class crba {
    public static String a(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.Y() != null) {
            return messagePartCoreData.Y();
        }
        Uri t = messagePartCoreData.t();
        Uri v = messagePartCoreData.v();
        String V = messagePartCoreData.V();
        if (v != null && !csuu.B(v)) {
            t = v;
        }
        if (t == null) {
            return null;
        }
        return ditn.g(t, emxe.b(V));
    }
}
