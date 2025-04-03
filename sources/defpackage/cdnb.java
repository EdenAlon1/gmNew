package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnb implements cdmr {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl");
    public final dtuu a;
    private final cdpu c;
    private final errl d;
    private final errl e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final eisx i;
    private final cdoa j;
    private final cdrg k;
    private final ffbr l;
    private final asjd m;

    public cdnb(cdpu cdpuVar, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, eisx eisxVar, cdoa cdoaVar, cdrg cdrgVar, ffbr ffbrVar4, asjd asjdVar, errl errlVar, errl errlVar2) {
        this.c = cdpuVar;
        this.a = dtuuVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = eisxVar;
        this.j = cdoaVar;
        this.k = cdrgVar;
        this.l = ffbrVar4;
        this.m = asjdVar;
        this.d = errlVar;
        this.e = errlVar2;
    }

    @Override // defpackage.cdmr
    public final elfl a(final MessagePartCoreData messagePartCoreData) {
        String R = messagePartCoreData.R();
        if (!TextUtils.isEmpty(R)) {
            ensk h = b.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadCompressedImageForPart", 158, "CmsMediaUploadHandlerImpl.java")).t("Part %s already has a compressed blob id set.", messagePartCoreData.aa());
            return elfo.e(R);
        }
        Uri t = messagePartCoreData.t();
        if (t == null || TextUtils.isEmpty(t.toString())) {
            return elfo.c();
        }
        cdpu.h(2, t);
        if (!this.j.a(messagePartCoreData)) {
            return elfo.c();
        }
        this.c.i();
        String valueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        boolean booleanValue = ((Boolean) ((cfup) csgj.y.get()).e()).booleanValue();
        final String concat = "cms-file-id".concat(valueOf);
        return booleanValue ? this.k.b().i(new eroh() { // from class: cdmu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                if (!booleanValue2) {
                    throw new cshh(78, messagePartCoreData2.aa());
                }
                return cdnb.this.d(messagePartCoreData2, concat);
            }
        }, this.e) : d(messagePartCoreData, concat);
    }

    @Override // defpackage.cdmr
    public final elfl b(final MessagePartCoreData messagePartCoreData) {
        String S = messagePartCoreData.S();
        if (!TextUtils.isEmpty(S)) {
            ensk h = b.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadMediaForPart", 122, "CmsMediaUploadHandlerImpl.java")).t("Part %s already has a full-size blob id set.", messagePartCoreData.aa());
            return elfo.e(S);
        }
        final Uri t = messagePartCoreData.t();
        if (t == null || TextUtils.isEmpty(t.toString())) {
            return elfo.c();
        }
        cdpu.h(1, t);
        if (!cdoa.c(messagePartCoreData)) {
            return elfo.c();
        }
        this.c.i();
        String valueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        boolean booleanValue = ((Boolean) ((cfup) csgj.y.get()).e()).booleanValue();
        final String concat = "cms-file-id".concat(valueOf);
        return booleanValue ? this.k.b().i(new eroh() { // from class: cdmw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                if (!booleanValue2) {
                    throw new cshh(77, messagePartCoreData2.aa());
                }
                String str = concat;
                return cdnb.this.e(t, messagePartCoreData2, str);
            }
        }, this.e) : e(t, messagePartCoreData, concat);
    }

    @Override // defpackage.cdmr
    public final elfl c(ParticipantsTable.BindData bindData) {
        Uri x = bindData.x();
        if (x == null || TextUtils.isEmpty(x.toString())) {
            return elfo.c();
        }
        final String S = bindData.S();
        String V = bindData.V();
        if (!TextUtils.isEmpty(V)) {
            ensk h = b.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadProfilePhotoForParticipant", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "CmsMediaUploadHandlerImpl.java")).t("Participant %s already has a profile photo blob id set.", bindData.S());
            return elfo.e(V);
        }
        cdpu.h(1, x);
        if (!this.j.b(bindData)) {
            return elfo.c();
        }
        this.c.i();
        return elfl.g(this.c.d(x, this.i, "cms-file-id".concat(String.valueOf(String.valueOf(UUID.randomUUID()))), false)).h(new emwl() { // from class: cdmt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cdpt cdptVar = (cdpt) obj;
                final cdnb cdnbVar = cdnb.this;
                final String str = S;
                cdnbVar.a.d("CmsMediaUploadHandlerImpl#uploadProfilePhoto", new Runnable() { // from class: cdmx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekzz f;
                        cdnb cdnbVar2 = cdnb.this;
                        String str2 = str;
                        cdpt cdptVar2 = cdptVar;
                        eyee a = cdptVar2.a();
                        if (a != null) {
                            byte[] I = a.I();
                            f = eleg.f("CmsMediaUploadHandlerImpl#updateParticipantsProfilePhotoEncryptionKey");
                            try {
                                csix.h();
                                bvvr f2 = ParticipantsTable.f();
                                f2.ap("updateParticipantsProfilePhotoEncryptionKey");
                                f2.L(I);
                                cdnbVar2.g(str2, f2);
                                f.close();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        String b2 = cdptVar2.b();
                        f = eleg.f("CmsMediaUploadHandlerImpl#updateParticipantsBlobId");
                        try {
                            csix.h();
                            bvvr f3 = ParticipantsTable.f();
                            f3.ap("updateParticipantsBlobId");
                            f3.K(b2);
                            cdnbVar2.g(str2, f3);
                            f.close();
                        } finally {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                });
                return cdptVar.b();
            }
        }, this.d);
    }

    public final elfl d(final MessagePartCoreData messagePartCoreData, String str) {
        final String aa = messagePartCoreData.aa();
        final ConversationIdType A = messagePartCoreData.A();
        final MessageIdType B = messagePartCoreData.B();
        ensk h = b.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadCompressedImagePart", 280, "CmsMediaUploadHandlerImpl.java")).D("Start uploading compressed image part. partId=%s messageId=%s", aa, B);
        Uri t = messagePartCoreData.t();
        return (t == null || TextUtils.isEmpty(t.toString())) ? elfo.c() : elfl.g(this.c.j(messagePartCoreData.V(), messagePartCoreData.v(), t, messagePartCoreData.c(), messagePartCoreData.b(), this.i, str, false)).h(new emwl() { // from class: cdmy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cdpt cdptVar = (cdpt) obj;
                final cdnb cdnbVar = cdnb.this;
                final ConversationIdType conversationIdType = A;
                final MessageIdType messageIdType = B;
                final String str2 = aa;
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                cdnbVar.a.d("CmsMediaUploadHandlerImpl#uploadCompressedImagePart", new Runnable() { // from class: cdmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        cdpt cdptVar2 = cdptVar;
                        String b2 = cdptVar2.b();
                        ekzz f = eleg.f("CmsMediaUploadHandlerImpl#updateMessagePartCmsCompressedSizeBlobId");
                        cdnb cdnbVar2 = cdnb.this;
                        MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        MessageIdType messageIdType2 = messageIdType;
                        String str3 = str2;
                        try {
                            efbd.b();
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.ap("updateMessagePartCmsCompressedSizeBlobId");
                            bwdiVar.g(b2);
                            cdnbVar2.h(conversationIdType2, messageIdType2, str3, bwdiVar);
                            f.close();
                            eyee a = cdptVar2.a();
                            if (a != null) {
                                byte[] I = a.I();
                                ekzz f2 = eleg.f("CmsMediaUploadHandlerImpl#updateMessagePartCmsCompressedMediaEncryptionKey");
                                try {
                                    efbd.b();
                                    bwdi bwdiVar2 = new bwdi();
                                    bwdiVar2.ap("updateMessagePartCmsCompressedMediaEncryptionKey");
                                    int intValue = PartsTable.e().intValue();
                                    int intValue2 = PartsTable.e().intValue();
                                    if (intValue2 < 42070) {
                                        dtub.w("cms_compressed_media_encryption_key", intValue2);
                                    }
                                    if (intValue >= 42070) {
                                        bwdiVar2.a.put("cms_compressed_media_encryption_key", I);
                                    }
                                    cdnbVar2.f(messagePartCoreData3, bwdiVar2);
                                    f2.close();
                                } catch (Throwable th) {
                                    try {
                                        f2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                f.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                });
                return cdptVar.b();
            }
        }, this.d);
    }

    public final elfl e(Uri uri, final MessagePartCoreData messagePartCoreData, String str) {
        final String aa = messagePartCoreData.aa();
        final ConversationIdType A = messagePartCoreData.A();
        final MessageIdType B = messagePartCoreData.B();
        ensk h = b.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "uploadMediaPart", 247, "CmsMediaUploadHandlerImpl.java")).D("Start uploading media part. partId=%s messageId=%s", aa, B);
        return elfl.g(this.c.d(uri, this.i, str, false)).h(new emwl() { // from class: cdna
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final cdpt cdptVar = (cdpt) obj;
                final cdnb cdnbVar = cdnb.this;
                final ConversationIdType conversationIdType = A;
                final MessageIdType messageIdType = B;
                final String str2 = aa;
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                cdnbVar.a.d("CmsMediaUploadHandlerImpl#uploadMediaPart", new Runnable() { // from class: cdmv
                    @Override // java.lang.Runnable
                    public final void run() {
                        cdpt cdptVar2 = cdptVar;
                        String b2 = cdptVar2.b();
                        ekzz f = eleg.f("CmsMediaUploadHandlerImpl#updateMessagePartCmsFullSizeBlobId");
                        cdnb cdnbVar2 = cdnb.this;
                        MessagePartCoreData messagePartCoreData3 = messagePartCoreData2;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        MessageIdType messageIdType2 = messageIdType;
                        String str3 = str2;
                        try {
                            efbd.b();
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.ap("updateMessagePartCmsFullSizeBlobId");
                            bwdiVar.h(b2);
                            cdnbVar2.h(conversationIdType2, messageIdType2, str3, bwdiVar);
                            f.close();
                            eyee a = cdptVar2.a();
                            if (a != null) {
                                byte[] I = a.I();
                                ekzz f2 = eleg.f("CmsMediaUploadHandlerImpl#updateMessagePartCmsMediaEncryptionKey");
                                try {
                                    efbd.b();
                                    bwdi bwdiVar2 = new bwdi();
                                    bwdiVar2.ap("updateMessagePartCmsMediaEncryptionKey");
                                    bwdiVar2.i(I);
                                    cdnbVar2.f(messagePartCoreData3, bwdiVar2);
                                    f2.close();
                                } catch (Throwable th) {
                                    try {
                                        f2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                f.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                });
                return cdptVar.b();
            }
        }, this.d);
    }

    public final void f(MessagePartCoreData messagePartCoreData, bwdi bwdiVar) {
        h(messagePartCoreData.A(), messagePartCoreData.B(), messagePartCoreData.aa(), bwdiVar);
    }

    final void g(final String str, bvvr bvvrVar) {
        ekzz f = eleg.f("CmsMediaUploadHandlerImpl#updateParticipantRowIfExists");
        try {
            csix.h();
            bvvrVar.am();
            bvvrVar.V(new Function() { // from class: cdms
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    bvvwVar.k(str);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int e = bvvrVar.b().e();
            if (e != 0) {
                if (e != 1) {
                    ensk i = b.i();
                    i.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "updateParticipantRowIfExists", 376, "CmsMediaUploadHandlerImpl.java")).r("Updated more than one row when only one should be updated or tried to update a non-exist participant.\n updateCount = %s", e);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    Iterator<E> it = ((bczy) this.f.b()).F(arrayList).iterator();
                    while (it.hasNext()) {
                        ((cbgf) this.h.b()).n((ConversationIdType) it.next());
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, bwdi bwdiVar) {
        ekzz f = eleg.f("CmsMediaUploadHandlerImpl#updatePartRowIfExists");
        try {
            if (!((bdpt) this.g.b()).g(conversationIdType, messageIdType, str, bwdiVar, !((ersq) ((arkt) this.m).a.b()).a("bugle.prevent_unnecessary_part_update_notification"))) {
                ensk j = b.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadHandlerImpl", "updatePartRowIfExists", 487, "CmsMediaUploadHandlerImpl.java")).J("Cannot update non-existent part. partId=%s messageId=$%s conversationId=%s", str, messageIdType, conversationIdType);
                ((akzt) this.l.b()).c("Bugle.Cms.Media.Upload.UpdatePart.MissingPart.Count");
            }
            f.close();
        } finally {
        }
    }
}
