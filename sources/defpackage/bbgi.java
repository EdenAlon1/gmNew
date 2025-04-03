package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbgi implements bbck {
    public static boolean f(MessagePartCoreData messagePartCoreData, boolean z) {
        if (!z) {
            return messagePartCoreData.t() != null;
        }
        if (messagePartCoreData.t() != null) {
            if ((TextUtils.isEmpty(messagePartCoreData.Q()) || messagePartCoreData.bc()) && !messagePartCoreData.aV()) {
                return true;
            }
            if (messagePartCoreData.bo()) {
                return (TextUtils.isEmpty(messagePartCoreData.T()) || messagePartCoreData.bf()) && !messagePartCoreData.aW();
            }
        }
        return false;
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (MessagePartCoreData messagePartCoreData : ((bdou) it.next()).ab()) {
                    if (f(messagePartCoreData, false)) {
                        arrayList.add(messagePartCoreData);
                    }
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((bdou) it2.next()).ab().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it3.next();
                        if (TextUtils.equals(messagePartCoreData2.aa(), null) && f(messagePartCoreData2, false)) {
                            arrayList.add(messagePartCoreData2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public abstract Action a(ArrayList arrayList, String str, boolean z);

    public final Action b(bdou bdouVar) {
        return a(g(engw.r(bdouVar)), null, false);
    }

    public final Action d(bdou bdouVar, String str) {
        return a(g(engw.r(bdouVar)), str, false);
    }

    public final Action e(List list, boolean z) {
        return a(g(list), null, z);
    }
}
