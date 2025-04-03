package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cgwl {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/AttachmentUploader");

    public ListenableFuture c(fcdu fcduVar, Optional optional, MessagePartCoreData messagePartCoreData) {
        ensk i = a.i();
        i.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "upload", 52, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return elfo.e(messagePartCoreData);
    }

    public ListenableFuture d(fcdu fcduVar, Optional optional, MessagePartCoreData messagePartCoreData) {
        ensk i = a.i();
        i.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/net/AttachmentUploader", "uploadDownSizedImage", 60, "AttachmentUploader.java")).q("AttachmentUploader.upload being called on stub class");
        return elfo.e(messagePartCoreData);
    }
}
