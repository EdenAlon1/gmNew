package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtc {
    public static cmtb a(List list) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) list.get(i2);
            if (messagePartCoreData.bA() && messagePartCoreData.ae() != null) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < list.size()) {
            MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) list.get(i);
            if (messagePartCoreData2.bA()) {
                String ae = messagePartCoreData2.ae();
                if (ae != null) {
                    return new cmtf(ae);
                }
            } else {
                if (le.j(messagePartCoreData2.V())) {
                    return new cmta();
                }
                if (messagePartCoreData2.bo()) {
                    return new cmte();
                }
                if (messagePartCoreData2.bD()) {
                    return new cmth();
                }
                if (messagePartCoreData2.ba()) {
                    return new cmsx();
                }
                if (messagePartCoreData2.bC()) {
                    return new cmsy();
                }
                if (messagePartCoreData2.bz()) {
                    return new cmsz();
                }
            }
        }
        return new cmtg();
    }
}
