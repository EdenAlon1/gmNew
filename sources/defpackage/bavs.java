package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bavs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator");
    public final cbke b;
    public final ffbr c;
    public final askf d;
    private final dtuu e;
    private final bcwz f;

    public bavs(cbke cbkeVar, dtuu dtuuVar, bcwz bcwzVar, ffbr ffbrVar, askf askfVar) {
        this.b = cbkeVar;
        this.e = dtuuVar;
        this.f = bcwzVar;
        this.c = ffbrVar;
        this.d = askfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.bavr b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r24, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bavs.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo, int, boolean):bavr");
    }

    public final void a(String str, MessageCoreData messageCoreData, boolean z) {
        int i = 0;
        RichCardContainer parse = new RichCardParser(str, false).parse(true);
        if (parse == null) {
            enrr enrrVar = (enrr) a.j();
            enrrVar.Y(new ensn("json", String.class, false, false), cskt.b(str));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "addRichCardParts", 88, "RichCardMessagePartsCreator.java")).q("Rich Card parser failed to parse the incoming raw data.");
            return;
        }
        if (!TextUtils.isEmpty(parse.getExtractedTitle())) {
            messageCoreData.aL(this.f.i(parse.getExtractedTitle()));
        }
        if (!TextUtils.isEmpty(parse.getExtractedDescription())) {
            messageCoreData.aL(this.f.i(parse.getExtractedDescription()));
        }
        final bavr bavrVar = new bavr();
        if (parse.containsStandaloneCard()) {
            messageCoreData.aL(this.f.h(str, eohh.RICH_CARD));
            bavr b = b(messageCoreData, parse.getStandaloneCard().content.media, 0, z);
            if (b != null) {
                bavrVar.a(b);
            }
        } else if (parse.containsCarousel()) {
            messageCoreData.aL(this.f.h(str, eohh.RICH_CARD_CAROUSEL));
            Iterator<GeneralPurposeRichCard> it = parse.getGeneralPurposeCards().iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                bavr b2 = b(messageCoreData, it.next().content.media, i, z);
                if (b2 != null) {
                    bavrVar.a(b2);
                }
                i = i2;
            }
        }
        if (z) {
            this.e.g(new dtut() { // from class: bavp
                @Override // defpackage.dtut
                public final ekzz a() {
                    return eleg.f("RCMPC::downloadRichCardMediaParts::runAfterCommit");
                }
            }, null, new Runnable() { // from class: bavq
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2;
                    bavq bavqVar = this;
                    bavr bavrVar2 = bavrVar;
                    Iterator it3 = bavrVar2.a.iterator();
                    while (it3.hasNext()) {
                        bavs bavsVar = bavs.this;
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it3.next();
                        if (messagePartCoreData.N() == eohh.RICH_CARD_THUMBNAIL) {
                            Integer num = (Integer) dimn.E().k().a();
                            int intValue = num.intValue();
                            if (bavsVar.d.a() || messagePartCoreData.p() <= intValue) {
                                Uri v = messagePartCoreData.v();
                                v.getClass();
                                enrr enrrVar2 = (enrr) bavs.a.h();
                                it2 = it3;
                                enrrVar2.Y(new ensn("downloadUrl", String.class, false, false), v.toString());
                                enrrVar2.Y(new ensn("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                enrrVar2.Y(new ensn("maxThumbnailSize", Integer.class, false, false), num);
                                enrrVar2.Y(new ensn("conversationId", String.class, false, false), messagePartCoreData.A().a());
                                enrrVar2.Y(new ensn("messageId", String.class, false, false), messagePartCoreData.B().b());
                                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardThumbnail", 323, "RichCardMessagePartsCreator.java")).q("Requesting thumbnail download");
                                cbke cbkeVar = bavsVar.b;
                                if (cbkeVar != null) {
                                    cbkeVar.a(messagePartCoreData, new cblo[0]);
                                }
                            } else {
                                enrr enrrVar3 = (enrr) bavs.a.h();
                                enrrVar3.Y(new ensn("thumbnailSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                enrrVar3.Y(new ensn("maximumAllowedSize", Integer.class, false, false), num);
                                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardThumbnail", 302, "RichCardMessagePartsCreator.java")).q("Rich Card discarded due to oversized media thumbnail.");
                            }
                        } else {
                            it2 = it3;
                            if (messagePartCoreData.N() == eohh.RICH_CARD_MEDIA) {
                                if (!bavsVar.d.a()) {
                                    long p = messagePartCoreData.p();
                                    csuf a2 = ((csug) bavsVar.c.b()).a(p);
                                    csub csubVar = (csub) a2;
                                    long j = csubVar.a;
                                    if (!a2.c()) {
                                        enrr enrrVar4 = (enrr) bavs.a.h();
                                        enrrVar4.Y(new ensn("mediaSize", Long.class, false, false), Long.valueOf(p));
                                        enrrVar4.Y(new ensn("maxAutoDownloadSize", Long.class, false, false), Long.valueOf(j));
                                        enrrVar4.Y(new ensn("reason", String.class, false, false), (String) csubVar.b.orElse("<unspecified>"));
                                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardMedia", 345, "RichCardMessagePartsCreator.java")).q("Can not auto download Rich Card media");
                                    }
                                }
                                Uri v2 = messagePartCoreData.v();
                                v2.getClass();
                                enrr enrrVar5 = (enrr) bavs.a.h();
                                enrrVar5.Y(new ensn("downloadUrl", String.class, false, false), v2.toString());
                                enrrVar5.Y(new ensn("expectedSize", Long.class, false, false), Long.valueOf(messagePartCoreData.p()));
                                enrrVar5.Y(new ensn("conversationId", String.class, false, false), messagePartCoreData.A().a());
                                enrrVar5.Y(new ensn("messageId", String.class, false, false), messagePartCoreData.B().b());
                                ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/action/RichCardMessagePartsCreator", "downloadRichCardMedia", 365, "RichCardMessagePartsCreator.java")).q("Requesting media download");
                                cbke cbkeVar2 = bavsVar.b;
                                if (cbkeVar2 != null) {
                                    cbkeVar2.a(messagePartCoreData, new cblo[0]);
                                }
                            }
                        }
                        bavqVar = this;
                        it3 = it2;
                    }
                    bavrVar2.a.clear();
                }
            });
        }
    }
}
