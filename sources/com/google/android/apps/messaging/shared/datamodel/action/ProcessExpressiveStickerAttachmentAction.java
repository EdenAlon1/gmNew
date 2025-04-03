package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.bamy;
import defpackage.bamz;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessExpressiveStickerAttachmentAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final ffbr c;
    private final cqoh d;
    private final MessagePartCoreData e;
    private static final cskc a = cskc.g("Bugle", "ProcessExpressiveStickerAttachmentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bamy();

    /* compiled from: PG */
    public interface a {
        bamz hZ();
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, ffbr ffbrVar, cqoh cqohVar, Parcel parcel) {
        super(parcel, eogt.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = ffbrVar;
        this.d = cqohVar;
        this.e = (MessagePartCoreData) this.t.h("part_key");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessExpressiveStickerAttachmentAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008b  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessExpressiveStickerAttachmentAction.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessExpressiveStickerAttachmentAction(Context context, ffbr ffbrVar, cqoh cqohVar, MessagePartCoreData messagePartCoreData) {
        super(eogt.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION);
        this.b = context;
        this.c = ffbrVar;
        this.d = cqohVar;
        this.e = messagePartCoreData;
        this.t.t("part_key", messagePartCoreData);
    }
}
