package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avvv implements avvz {
    public static final entd a = entd.c("BugleFileTransfer");
    static final cfup b = cfvl.e(cfvl.b, "ft_http_request_connect_timeout_millis", 15000);
    static final cfup c = cfvl.e(cfvl.b, "ft_http_request_read_timeout_millis", 10000);
    private final errm d;
    private final UrlRequest e;
    private ScheduledFuture f;

    public avvv(final errm errmVar, ffbr ffbrVar, String str, UrlRequest.Callback callback, enhz enhzVar, Optional optional, avve avveVar) {
        this.d = errmVar;
        final UrlRequest.Builder trafficStatsTag = ((CronetEngine) ffbrVar.b()).newUrlRequestBuilder(str, new avvu(this, callback), errmVar).setHttpMethod(avveVar.toString()).setTrafficStatsTag(8194);
        enqu listIterator = enhzVar.u().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            trafficStatsTag.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        optional.ifPresent(new Consumer() { // from class: avvt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = avvv.a;
                UrlRequest.Builder.this.setUploadDataProvider((UploadDataProvider) obj, errmVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.e = trafficStatsTag.build();
    }

    private final void e(int i) {
        this.f = this.d.schedule(new Runnable() { // from class: avvs
            @Override // java.lang.Runnable
            public final void run() {
                ((ensz) ((ensz) avvv.a.i()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest", "startTimer", 99, "MonitoredUrlRequest.java")).q("HTTP transaction timed out. Canceling file transfer.");
                avvv.this.a();
            }
        }, i, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.avvz
    public final void a() {
        this.e.cancel();
    }

    @Override // defpackage.avvz
    public final void b() {
        ensz enszVar = (ensz) a.o().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "MonitoredUrlRequest.java");
        cfup cfupVar = b;
        enszVar.t("HTTP request starting, starting connection timer (%d millis)", cfupVar.e());
        e(((Integer) cfupVar.e()).intValue());
        this.e.start();
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.f;
        scheduledFuture.getClass();
        scheduledFuture.cancel(false);
    }

    public final void d(int i) {
        c();
        e(i);
    }
}
