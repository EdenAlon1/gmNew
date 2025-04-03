package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczs implements bdod {
    private static final entd a = entd.c("BugleCustomSticker");

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final void i(MessageCoreData messageCoreData) {
        Object obj;
        String str = null;
        MessageCoreData messageCoreData2 = true != messageCoreData.cX() ? null : messageCoreData;
        if (messageCoreData2 != null) {
            Iterator it = messageCoreData2.ab().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (ffkj.e(((MessagePartCoreData) obj).ad(), "custom_sticker")) {
                        break;
                    }
                }
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
            if (messagePartCoreData != null) {
                str = messagePartCoreData.ac();
            }
        }
        if (str != null) {
            ((ensz) a.h()).t("Adding custom header to custom sticker: ID = %s", str);
            fayv aa = messageCoreData.aa();
            clbi b = aa != null ? clbi.b(aa) : clbi.a();
            b.d(clbg.EMOTIFY_STICKERS_NAMESPACE, "Sticker-Emotify-Id", str);
            messageCoreData.bs(b.c());
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return ctjd.d();
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
