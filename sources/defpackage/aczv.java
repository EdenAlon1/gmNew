package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczv implements bdnt {
    public static final entd a = entd.c("BugleCustomSticker");
    public final dqze b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffsk f;

    public aczv(dqze dqzeVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        dqzeVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.b = dqzeVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffskVar;
    }

    public static final Uri a(MessageCoreData messageCoreData) {
        return ((MessagePartCoreData) messageCoreData.ab().get(0)).t();
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        if (ctjd.d()) {
            String str = (String) fflm.b(clbh.a(messageCoreData.aa(), clbg.EMOTIFY_STICKERS_NAMESPACE, "Sticker-Emotify-Id"));
            if (str != null) {
                ((ensz) a.h()).q("Received a custom sticker.");
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ffdx.T(messageCoreData.ab());
                messagePartCoreData.bO();
                messagePartCoreData.aI(str);
                axol.k(this.f, null, new aczt(this, messageCoreData, str, null), 3);
                return;
            }
            if (((Boolean) ctjd.bv.e()).booleanValue() && le.n(messageCoreData.al())) {
                ((ensz) a.h()).q("Received an image. Creating smart action for Photomoji.");
                axol.k(this.f, null, new aczu(this, messageCoreData, messageCoreData, null), 3);
            }
        }
    }
}
