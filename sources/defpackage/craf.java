package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class craf extends ceut {
    public static final entd a = entd.c("BugleFileTransfer");
    public static final cfup b = cfvl.e(cfvl.b, "persist_thumbnail_max_retry", 1);
    public static final cfup c = cfvl.e(cfvl.b, "persist_thumbnail_handler_retry_delay", 1000);
    public final cray d;
    private final errl e;
    private final errl f;
    private final crab g;

    public craf(errl errlVar, errl errlVar2, crab crabVar, cray crayVar) {
        this.e = errlVar;
        this.f = errlVar2;
        this.g = crabVar;
        this.d = crayVar;
    }

    public static void k(bdhg bdhgVar, MessageIdType messageIdType, String str) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.e, bdhgVar.b);
        enszVar.Y(csux.a, messageIdType.b());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "logForDebug", BasePaymentResult.ERROR_REQUEST_FAILED, "PersistThumbnailHandler.java")).q(str);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        if (((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
            return cety.l().h();
        }
        cetx l = cety.l();
        l.c(((Integer) b.e()).intValue());
        l.g(((Integer) c.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PersistThumbnailHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return crah.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final crah crahVar = (crah) eyhsVar;
        try {
            final bdhg a2 = bdhg.a(((cqxn) eyfy.parseFrom(cqxn.a, crahVar.b, eyfc.a())).b);
            elfl i = this.g.a(a2).i(new eroh() { // from class: crad
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return elfo.e(ceyt.k());
                    }
                    bdhg bdhgVar = a2;
                    MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                    if (messageCoreData.cy()) {
                        craf.k(bdhgVar, messageCoreData.B(), "Message has already finished downloading. Skipping updating thumbnail.");
                        return elfo.e(ceyt.i());
                    }
                    MessagePartCoreData G = messageCoreData.G();
                    G.getClass();
                    String ab = G.ab();
                    if (ab == null) {
                        craf.k(bdhgVar, messageCoreData.B(), "Could not retrieve content type for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                        return elfo.e(ceyt.k());
                    }
                    if (MimeTypeMap.getSingleton().getExtensionFromMimeType(ab) == null) {
                        craf.k(bdhgVar, messageCoreData.B(), "Could not retrieve file extension for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                        return elfo.e(ceyt.k());
                    }
                    crah crahVar2 = crahVar;
                    craf crafVar = craf.this;
                    Uri parse = Uri.parse(crahVar2.d);
                    String a3 = emxe.a(crahVar2.c);
                    craw crawVar = (craw) crax.a.createBuilder();
                    String str = bdhgVar.b;
                    str.getClass();
                    crawVar.copyOnWrite();
                    ((crax) crawVar.instance).b = str;
                    String b2 = emxe.b(a3);
                    crawVar.copyOnWrite();
                    ((crax) crawVar.instance).d = b2;
                    String uri = parse.toString();
                    crawVar.copyOnWrite();
                    crax craxVar = (crax) crawVar.instance;
                    uri.getClass();
                    craxVar.c = uri;
                    crafVar.d.a((crax) crawVar.build());
                    craf.k(bdhgVar, messageCoreData.B(), "Finished scheduling success handler for persisted thumbnail.");
                    return elfo.e(ceyt.i());
                }
            }, this.f);
            return ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue() ? i : i.f(cquo.class, new eroh() { // from class: crae
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cquo cquoVar = (cquo) obj;
                    ensz enszVar = (ensz) ((ensz) craf.a.j()).g(cquoVar);
                    enszVar.Y(csux.e, bdhg.this.b);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "processPendingWorkItemAsync", 167, "PersistThumbnailHandler.java")).q("Failed to persist thumbnail for incoming file transfer.");
                    return cquoVar.d().booleanValue() ? elfo.e(ceyt.m()) : elfo.e(ceyt.k());
                }
            }, this.e);
        } catch (eygu e) {
            csjb e2 = D.e();
            e2.I("Could not parse opaque data. Cannot update thumbnail for incoming file transfer.");
            e2.s(e);
            return elfo.e(ceyt.k());
        }
    }
}
