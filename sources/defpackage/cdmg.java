package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmg implements cdlx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl");
    public final Context b;
    public final cbgf c;
    public final cdkg d;
    public final cfyt e;
    private final errl f;
    private final errl g;
    private final axkm h;

    public cdmg(Context context, cbgf cbgfVar, errl errlVar, errl errlVar2, cdkg cdkgVar, cfyt cfytVar, axkm axkmVar) {
        this.b = context;
        this.c = cbgfVar;
        this.f = errlVar;
        this.g = errlVar2;
        this.d = cdkgVar;
        this.e = cfytVar;
        this.h = axkmVar;
    }

    public static Uri c(final MessageIdType messageIdType, final String str) {
        return (Uri) MessagesTable.j(messageIdType, new Function() { // from class: cdme
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Uri B = ((MessagesTable.BindData) obj).B();
                if (B == null) {
                    String str2 = str;
                    ensk j = cdmg.a.j();
                    j.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "getMessageUri", 240, "CmsMediaDownloadStarterImpl.java")).t("Message is not persisted in Telephony before downloading its media part. Check the restore chaining flow. partId = %s", str2);
                }
                return B;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: cdmf
            @Override // java.util.function.Supplier
            public final Object get() {
                ensk j = cdmg.a.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "getMessageUri", 248, "CmsMediaDownloadStarterImpl.java")).t("Can't find message data for partId when downloading Cms media. messageId = %s", MessageIdType.this.b());
                return null;
            }
        });
    }

    @Override // defpackage.cdlx
    public final void a(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final String str) {
        elfo.f(new Runnable() { // from class: cdly
            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                ConversationIdType conversationIdType2 = conversationIdType;
                cdmg cdmgVar = cdmg.this;
                MessageIdType messageIdType2 = messageIdType;
                if (messageIdType2.c()) {
                    return;
                }
                String str2 = str;
                efbd.b();
                ensk h = cdmg.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "setMediaStatusToDownloading", 112, "CmsMediaDownloadStarterImpl.java")).t("Updating CmsAttachmentProcessingStatus to CMS_MEDIA_DOWNLOADING for partId = %s", str2);
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("setMediaStatusToDownloading");
                bwdiVar.f(byyu.CMS_MEDIA_DOWNLOADING);
                bwdiVar.c(str2);
                try {
                    String[] strArr2 = btro.a;
                    btrl btrlVar = new btrl(btro.a);
                    btrlVar.z("getAccountId");
                    btrlVar.x(1);
                    btrd btrdVar = (btrd) btrlVar.b().o();
                    try {
                        if (btrdVar.moveToFirst()) {
                            num = Integer.valueOf(btrdVar.c());
                            btrdVar.close();
                        } else {
                            btrdVar.close();
                            num = null;
                        }
                        num.getClass();
                        int intValue = num.intValue();
                        Uri c = cdmg.c(messageIdType2, str2);
                        if (c != null && !c.equals(Uri.EMPTY)) {
                            String uri = c.toString();
                            int length = uri.length();
                            int i = 0;
                            while (i < length) {
                                int codePointAt = uri.codePointAt(i);
                                if (!Character.isWhitespace(codePointAt)) {
                                    poh pohVar = new poh();
                                    pohVar.c(4);
                                    cdpd.a(cdmgVar.b, pohVar.a(), str2, c, intValue);
                                    return;
                                }
                                i += Character.charCount(codePointAt);
                            }
                        }
                        cdmgVar.d(cdmgVar.d.a(str2, intValue), str2, messageIdType2);
                    } finally {
                    }
                } catch (RuntimeException unused) {
                    byyu byyuVar = ((Boolean) ((cfup) csfu.n.get()).e()).booleanValue() ? byyu.CMS_MEDIA_DOWNLOAD_FAILED : byyu.CMS_MEDIA_DOWNLOAD_NOT_STARTED;
                    ensk h2 = cdmg.a.h();
                    h2.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "setMediaStatusForFailure", 125, "CmsMediaDownloadStarterImpl.java")).D("Setting CmsAttachmentProcessingStatus to %s for partId = %s", byyuVar.name(), str2);
                    bwdi bwdiVar2 = new bwdi();
                    bwdiVar2.ap("setMediaStatusForFailure");
                    bwdiVar2.f(byyuVar);
                    bwdiVar2.c(str2);
                } finally {
                    cdmgVar.c.l(conversationIdType2, messageIdType2, "parts");
                }
            }
        }, this.f).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cdlx
    public final void b(MessageIdType messageIdType, String str, final String str2, final int i, boolean z) {
        if (z) {
            d(this.d.e(str2, i), str2, messageIdType);
            return;
        }
        final Uri c = c(messageIdType, str2);
        if (c == null) {
            throw new ccpm(String.format("Bugle non-tombstone message with no Telephony uri. message id = %s, message cmsId = %s", messageIdType, str), csgx.NO_RETRY);
        }
        this.h.k().h(new emwl() { // from class: cdlz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                axezVar.getClass();
                efbd.b();
                poh pohVar = new poh();
                pohVar.c(true != axezVar.d ? 4 : 3);
                poj a2 = pohVar.a();
                int i2 = i;
                cdpd.a(cdmg.this.b, a2, str2, c, i2);
                return ffcu.a;
            }
        }, this.g).k(axou.a(new csvw(new Consumer() { // from class: cdma
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensk h = cdmg.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "enqueueMediaDownloadWorkToTelephonyForNonUserInitiated", 210, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Successfully enqueued CmsTelephonyMediaRestoreWorker");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cdmb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ensk j = cdmg.a.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "enqueueMediaDownloadWorkToTelephonyForNonUserInitiated", 214, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Failed to enqueue CmsTelephonyMediaRestoreWorker");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.f);
    }

    public final void d(elfl elflVar, final String str, final MessageIdType messageIdType) {
        elflVar.h(new emwl() { // from class: cdmc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk h = cdmg.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "handleEnqueueDownloadFutureResult", 171, "CmsMediaDownloadStarterImpl.java")).q("CmsMediaDownloadStarterImpl: Successfully enqueued restore of media.");
                return ffcu.a;
            }
        }, this.g).e(Exception.class, new emwl() { // from class: cdmd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                ensk j = cdmg.a.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaDownloadStarterImpl", "handleEnqueueDownloadFutureResult", 179, "CmsMediaDownloadStarterImpl.java")).D("CmsMediaDownloadStarterImpl: Failed to enqueue restore of media. partId: %s, messageId: %s", str, messageIdType);
                cdmg.this.e.b(exc);
                return ffcu.a;
            }
        }, this.g).k(axnw.b(), erpp.a);
    }
}
