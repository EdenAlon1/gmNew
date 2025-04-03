package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmp {
    private final Set a;
    private final augs b;

    public cfmp(Set set, augs augsVar) {
        this.a = set;
        this.b = augsVar;
    }

    private final boolean c(String str) {
        enqu listIterator = ((enpx) this.a).listIterator();
        while (listIterator.hasNext()) {
            if (bzzk.a(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(MessageCoreData messageCoreData, Bundle bundle) {
        ffbr ffbrVar = ((augd) this.b).a;
        String string = bundle.getString("chat.extra.wrappingContentType");
        if (((ersq) ffbrVar.b()).a("bugle.enable_set_encryption_fields_in_decorator")) {
            enqu listIterator = ((enpx) this.a).listIterator();
            while (listIterator.hasNext()) {
                if (string != null && bzzk.a(string)) {
                    messageCoreData.by();
                    messageCoreData.bu(cfmh.b);
                }
            }
        } else if (string != null && c(string)) {
            messageCoreData.by();
        }
        String string2 = bundle.getString("chat.extra.customDeliveryReceiptContentType");
        byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
        if (string2 == null || byteArray == null) {
            return;
        }
        buoy buoyVar = ((MessageData) messageCoreData).j;
        buoyVar.o(byteArray);
        buoyVar.p(string2);
    }

    public final boolean b(Bundle bundle) {
        String string = bundle.getString("chat.extra.wrappingContentType");
        if (string == null) {
            return false;
        }
        return c(string);
    }
}
