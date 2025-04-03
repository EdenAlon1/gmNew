package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmlh {
    public static final boolean a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        fayv aa = messageCoreData.aa();
        return aa != null && c(aa).k();
    }

    public static final Instant b(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        fayv aa = messageCoreData.aa();
        if (aa != null) {
            Object orElse = clbh.a(aa, clbg.RCS_EDIT_NAMESPACE, "Edited-At-Timestamp-Ms").orElse("0");
            orElse.getClass();
            Instant ofEpochMilli = Instant.ofEpochMilli(Long.parseLong((String) orElse));
            if (ofEpochMilli.toEpochMilli() > 0) {
                return ofEpochMilli;
            }
        }
        return null;
    }

    public static final bdhg c(fayv fayvVar) {
        return bdhg.a(!ffkj.e("Edit", (String) fflm.b(clbh.a(fayvVar, clbg.GSMA_RCS_NAMESPACE, "Reference-Type"))) ? null : (String) fflm.b(clbh.a(fayvVar, clbg.GSMA_RCS_NAMESPACE, "Reference-ID")));
    }
}
