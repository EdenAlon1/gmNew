package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwx {
    public static final boolean a(MessageCoreData messageCoreData) {
        if (messageCoreData.ab().size() != 1 || !((MessagePartCoreData) messageCoreData.ab().get(0)).bA()) {
            return false;
        }
        String ae = ((MessagePartCoreData) messageCoreData.ab().get(0)).ae();
        return ae == null || ae.length() == 0;
    }
}
