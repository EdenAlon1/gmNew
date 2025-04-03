package defpackage;

import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class umf extends ffkh implements ffji {
    public static final umf a = new umf();

    public umf() {
        super(1, ult.class, "toVideoGalleryMedia", "toVideoGalleryMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/media/local/LocalMedia;", 1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        doxr a2;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        if (!messagePartCoreData.bq()) {
            throw new IllegalStateException("Check failed.");
        }
        String V = messagePartCoreData.V();
        drka b = V != null ? drjz.b(V) : null;
        if (!(b instanceof drnd)) {
            throw new IllegalStateException(a.i(b, "MessagePartCoreData with invalid format: ", " cannot be converted to Compose media"));
        }
        drnd drndVar = (drnd) b;
        String valueOf = String.valueOf(messagePartCoreData.v());
        int c = messagePartCoreData.c();
        int b2 = messagePartCoreData.b();
        long p = messagePartCoreData.p();
        Instant ofEpochMilli = Instant.ofEpochMilli(messagePartCoreData.m());
        ofEpochMilli.getClass();
        eohh N = messagePartCoreData.N();
        if (N != null && N.ordinal() == 38) {
            a2 = VideoTrimmerSource.a;
        } else {
            eohh N2 = messagePartCoreData.N();
            N2.getClass();
            a2 = uey.a(N2);
        }
        doxr doxrVar = a2;
        Duration ofMillis = Duration.ofMillis(messagePartCoreData.k());
        ofMillis.getClass();
        return new drnl(drndVar, valueOf, null, null, c, b2, p, ofEpochMilli, doxrVar, ofMillis, 12);
    }
}
