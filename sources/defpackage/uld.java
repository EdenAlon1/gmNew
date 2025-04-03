package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class uld extends ffkh implements ffji {
    public static final uld a = new uld();

    public uld() {
        super(1, ult.class, "toImageGalleryMedia", "toImageGalleryMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/media/local/LocalMedia;", 1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        if (!messagePartCoreData.bq()) {
            throw new IllegalStateException("Check failed.");
        }
        String V = messagePartCoreData.V();
        drka b = V != null ? drjz.b(V) : null;
        if (!(b instanceof drld)) {
            throw new IllegalArgumentException(a.i(b, "MessagePartCoreData with invalid format: ", " cannot be converted to Compose media"));
        }
        drld drldVar = (drld) b;
        String valueOf = String.valueOf(messagePartCoreData.v());
        int c = messagePartCoreData.c();
        int b2 = messagePartCoreData.b();
        long p = messagePartCoreData.p();
        Instant ofEpochMilli = Instant.ofEpochMilli(messagePartCoreData.m());
        ofEpochMilli.getClass();
        eohh N = messagePartCoreData.N();
        N.getClass();
        return new drni(drldVar, valueOf, null, null, c, b2, p, ofEpochMilli, uey.a(N), 12);
    }
}
