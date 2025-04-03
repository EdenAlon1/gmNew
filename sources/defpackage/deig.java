package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deig extends ceut {
    public static final entd a = entd.c("BugleWearable");
    static final cfva b = cfvl.e(cfvl.b, "sync_data_to_wearable_app_backoff_duration_ms", 500);
    public final Context c;
    public final dhzj d;
    public final ffbr e;
    public final ffbr f;
    public final errl g;
    public final ffbr h;
    public final errl i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private ecri s;

    public deig(Context context, dhzj dhzjVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar, errl errlVar2, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.c = context;
        this.d = dhzjVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.m = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
        this.p = ffbrVar6;
        this.g = errlVar;
        this.h = ffbrVar7;
        this.i = errlVar2;
        this.j = ffbrVar8;
        this.q = ffbrVar9;
        this.r = ffbrVar10;
        this.k = ffbrVar11;
        this.l = ffbrVar12;
    }

    public static ecgi k(dfqu dfquVar) {
        return new ecgk(cvhi.a(dfquVar));
    }

    public static ecgi l(dfqu dfquVar) {
        return new ecgk(cvhj.a(dfquVar.a()));
    }

    public static void m(Throwable th, String str) {
        ensz enszVar = (ensz) ((ensz) a.j()).g(th);
        enszVar.Y(csux.O, "SyncDataToWearableAppHandler");
        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "logWarning", 655, "SyncDataToWearableAppHandler.java")).q(str);
    }

    private final boolean o() {
        return ((cvhr) this.p.b()).b();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        ((ceti) l).d = Duration.ofMillis(((Integer) b.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SyncDataToWearableAppHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final /* synthetic */ boolean h(eyhs eyhsVar) {
        boolean z;
        ekzz f = eleg.f("SyncDataToWearableAppHandler#preflight");
        try {
            if (o()) {
                z = true;
            } else {
                ensk o = a.o();
                o.Y(csux.O, "SyncDataToWearableAppHandler");
                ((ensz) o.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "preflight", 178, "SyncDataToWearableAppHandler.java")).q("Skipping sync to wear devices.");
                ((akzt) this.q.b()).e("Bugle.Wear.SyncRunOnPhone", 4);
                z = false;
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ceut
    public final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        PutDataRequest c;
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.O, "SyncDataToWearableAppHandler");
        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 221, "SyncDataToWearableAppHandler.java")).q("Start syncing data to wearable devices");
        this.s = ((ecrj) this.r.b()).d();
        if (!o()) {
            ensz enszVar2 = (ensz) entdVar.g();
            enszVar2.Y(csux.O, "SyncDataToWearableAppHandler");
            ((ensz) enszVar2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 230, "SyncDataToWearableAppHandler.java")).q("Skip wear sync as the watch is not connected");
            n(7, ecrh.CANCEL);
            return elfo.e(ceyt.k());
        }
        Context context = this.c;
        ekzz f = eleg.f("SyncDataToWearableAppHandler#isWearableAppInstalled");
        try {
            boolean z = context.getSharedPreferences("watch_protocol_version_file", 0).getInt("watch_protocol_version_key", 0) > 0;
            if (!z) {
                ensz enszVar3 = (ensz) entdVar.h();
                enszVar3.Y(csux.O, "SyncDataToWearableAppHandler");
                ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "isWearableAppInstalled", 628, "SyncDataToWearableAppHandler.java")).q("WATCH_VERSION_KEY is not saved to SharedPreferences.");
            }
            f.close();
            if (!z) {
                CheckWearableAppVersionAction.h();
            }
            ekzz f2 = eleg.f("SyncDataToWearableAppHandler#sendPhoneDataToWearable");
            try {
                boolean G = ((ctvb) this.o.b()).G();
                boolean k = ((ctud) this.m.b()).k();
                int i = k ? (G ? 1 : 0) | 2 : G ? 1 : 0;
                diaa b2 = diaa.b("/bugle/phone_config/");
                dhzq dhzqVar = b2.a;
                dhzqVar.i("1", (byte) i);
                dhzqVar.l("2", 8);
                dhzqVar.l("3", ((cpbs) this.n.b()).a(-1).g());
                try {
                    ekzz f3 = eleg.f("SyncDataToWearableAppHandler#sendPhoneDataToWearable#putDataItem");
                    try {
                        dhzj dhzjVar = this.d;
                        if (((avcf) this.l.b()).a()) {
                            c = b2.c();
                            c.e();
                        } else {
                            c = b2.c();
                        }
                        dhzjVar.e(c).p(this.g, new dhqv() { // from class: deic
                            @Override // defpackage.dhqv
                            public final void d(Exception exc) {
                                entd entdVar2 = deig.a;
                                if (exc instanceof dfqu) {
                                    ensz enszVar4 = (ensz) ((ensz) deig.a.j()).g(exc);
                                    enszVar4.Y(csux.O, "SyncDataToWearableAppHandler");
                                    dfqu dfquVar = (dfqu) exc;
                                    ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 353, "SyncDataToWearableAppHandler.java")).D("Failed to sync phone config to data client with ApiException[status=%s, connectionResult=%s]", deig.l(dfquVar), deig.k(dfquVar));
                                }
                            }
                        });
                        f3.close();
                        if (!G) {
                            ensz enszVar4 = (ensz) entdVar.h();
                            enszVar4.Y(csux.O, "SyncDataToWearableAppHandler");
                            ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 369, "SyncDataToWearableAppHandler.java")).q("Android Messages is not the default SMS app; skipping wearable sync.");
                        } else {
                            if (k) {
                                f2.close();
                                ekzz f4 = eleg.f("SyncDataToWearableAppHandler#getPreviouslySyncedConversations");
                                try {
                                    elfl h = elfl.g(duin.a(this.d.b())).h(new emwl() { // from class: deib
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            dhzo dhzoVar = (dhzo) obj;
                                            entd entdVar2 = deig.a;
                                            ekzz f5 = eleg.f("SyncDataToWearableAppHandler#extractConversationDataMaps");
                                            try {
                                                cmh cmhVar = new cmh();
                                                if (dhzoVar != null) {
                                                    try {
                                                        if (dhzoVar.b.d()) {
                                                            dfuw dfuwVar = new dfuw(dhzoVar);
                                                            while (dfuwVar.hasNext()) {
                                                                dhzm dhzmVar = (dhzm) dfuwVar.next();
                                                                String path = dhzmVar.a().getPath();
                                                                if (path != null && path.startsWith("/bugle/conversations/")) {
                                                                    ConversationIdType b3 = bdgq.b(dhzmVar.a().getLastPathSegment());
                                                                    if (b3.b()) {
                                                                        ensz enszVar5 = (ensz) deig.a.j();
                                                                        enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                                                        ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "extractConversationDataMaps", 417, "SyncDataToWearableAppHandler.java")).q("getPreviousConversations: skipping null conversationId");
                                                                    } else {
                                                                        ekzz f6 = eleg.f("SyncDataToWearableAppHandler#extractConversationDataMaps#fromDataItem");
                                                                        try {
                                                                            cmhVar.put(b3, dhzr.a(dhzmVar).a);
                                                                            f6.close();
                                                                        } finally {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        dhzoVar.b();
                                                    }
                                                }
                                                if (dhzoVar != null) {
                                                }
                                                f5.close();
                                                return cmhVar;
                                            } catch (Throwable th) {
                                                try {
                                                    f5.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        }
                                    }, this.g);
                                    f4.b(h);
                                    f4.close();
                                    return h.h(new emwl() { // from class: deid
                                        /* JADX WARN: Finally extract failed */
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            ekzz ekzzVar;
                                            ekzz ekzzVar2;
                                            Throwable th;
                                            Throwable th2;
                                            ekzz f5;
                                            Throwable th3;
                                            Map map;
                                            cvgx cvgxVar;
                                            ekzz f6;
                                            PutDataRequest c2;
                                            ekzz ekzzVar3;
                                            boolean z2;
                                            cvgy cvgyVar;
                                            Context context2;
                                            final deig deigVar = deig.this;
                                            Map map2 = (Map) obj;
                                            ekzz f7 = eleg.f("SyncDataToWearableAppHandler#diffPreviouslySyncedAndRecentConversations");
                                            try {
                                                final ArrayList arrayList = new ArrayList();
                                                ekzz f8 = eleg.f("SyncDataToWearableAppHandler#broadcastMostRecentListOfConversations");
                                                try {
                                                    try {
                                                        elfl e = ((defs) deigVar.h.b()).c(arrayList).i(new eroh() { // from class: dehu
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj2) {
                                                                deig deigVar2;
                                                                boolean z3;
                                                                byte[] j;
                                                                List list = arrayList;
                                                                cvio cvioVar = (cvio) obj2;
                                                                PutDataRequest a2 = PutDataRequest.a("/bugle/rpc/proto/v1/conversations_list/");
                                                                ekzz f9 = eleg.f("SyncDataToWearableAppHandler#addAttachmentToPutDataRequest");
                                                                try {
                                                                    Iterator it = list.iterator();
                                                                    while (true) {
                                                                        boolean hasNext = it.hasNext();
                                                                        deigVar2 = deig.this;
                                                                        if (!hasNext) {
                                                                            break;
                                                                        }
                                                                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                                                                        cviq cviqVar = (cviq) deigVar2.j.b();
                                                                        messagePartCoreData.getClass();
                                                                        Asset asset = null;
                                                                        if (messagePartCoreData.bo()) {
                                                                            boolean z4 = true;
                                                                            if (messagePartCoreData.c() != -1 && messagePartCoreData.c() <= 0) {
                                                                                z3 = false;
                                                                                if (messagePartCoreData.b() != -1 && messagePartCoreData.b() <= 0) {
                                                                                    z4 = false;
                                                                                }
                                                                                if (z3 || !z4) {
                                                                                    ensz enszVar5 = (ensz) cviq.a.j();
                                                                                    enszVar5.Y(csux.O, "WearableMessageAttachmentAssetBuilder");
                                                                                    enszVar5.Y(csux.o, messagePartCoreData.A().toString());
                                                                                    enszVar5.Y(csux.a, messagePartCoreData.B().b());
                                                                                    enszVar5.Y(cviu.b, Integer.valueOf(messagePartCoreData.c()));
                                                                                    enszVar5.Y(cviu.a, Integer.valueOf(messagePartCoreData.b()));
                                                                                    enszVar5.q("Image has invalid dimension.");
                                                                                } else {
                                                                                    cbbk cbbkVar = (cbbk) ((cbbu) cviqVar.c.b()).b(new cazs(messagePartCoreData).d((Context) cviqVar.b.b(), 0));
                                                                                    if (cbbkVar != null) {
                                                                                        try {
                                                                                            try {
                                                                                                j = cbbkVar.j();
                                                                                            } catch (cbbj e2) {
                                                                                                ensz enszVar6 = (ensz) ((ensz) cviq.a.j()).g(e2);
                                                                                                enszVar6.Y(csux.O, "WearableMessageAttachmentAssetBuilder");
                                                                                                enszVar6.q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                            }
                                                                                            if (j != null) {
                                                                                                asset = new Asset(j, null, null, null);
                                                                                            } else {
                                                                                                ensz enszVar7 = (ensz) cviq.a.j();
                                                                                                enszVar7.Y(csux.O, "WearableMessageAttachmentAssetBuilder");
                                                                                                enszVar7.q("Null bytes from image.");
                                                                                            }
                                                                                        } finally {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            z3 = true;
                                                                            if (messagePartCoreData.b() != -1) {
                                                                                z4 = false;
                                                                            }
                                                                            if (z3) {
                                                                            }
                                                                            ensz enszVar52 = (ensz) cviq.a.j();
                                                                            enszVar52.Y(csux.O, "WearableMessageAttachmentAssetBuilder");
                                                                            enszVar52.Y(csux.o, messagePartCoreData.A().toString());
                                                                            enszVar52.Y(csux.a, messagePartCoreData.B().b());
                                                                            enszVar52.Y(cviu.b, Integer.valueOf(messagePartCoreData.c()));
                                                                            enszVar52.Y(cviu.a, Integer.valueOf(messagePartCoreData.b()));
                                                                            enszVar52.q("Image has invalid dimension.");
                                                                        }
                                                                        if (asset != null) {
                                                                            int i2 = cvha.a;
                                                                            messagePartCoreData.getClass();
                                                                            String a3 = messagePartCoreData.A().a();
                                                                            a3.getClass();
                                                                            String aa = messagePartCoreData.aa();
                                                                            aa.getClass();
                                                                            a2.d(a3 + "-" + aa, asset);
                                                                        }
                                                                    }
                                                                    f9.close();
                                                                    a2.c = cvioVar.toByteArray();
                                                                    f9 = eleg.f("SyncDataToWearableAppHandler#broadcastMostRecentListOfConversations#putDataItem");
                                                                    try {
                                                                        dhzj dhzjVar2 = deigVar2.d;
                                                                        if (((avcf) deigVar2.l.b()).a()) {
                                                                            a2.e();
                                                                        }
                                                                        ListenableFuture a4 = duin.a(dhzjVar2.e(a2));
                                                                        f9.b(a4);
                                                                        f9.close();
                                                                        return a4;
                                                                    } finally {
                                                                        try {
                                                                            f9.close();
                                                                        } catch (Throwable th4) {
                                                                            th.addSuppressed(th4);
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    throw th5;
                                                                }
                                                            }
                                                        }, deigVar.g).h(new emwl() { // from class: dehx
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj2) {
                                                                ensz enszVar5 = (ensz) deig.a.h();
                                                                enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                                                ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 565, "SyncDataToWearableAppHandler.java")).q("Successfully synced conversation list to data client");
                                                                return null;
                                                            }
                                                        }, deigVar.i).e(dfqu.class, new emwl() { // from class: dehy
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj2) {
                                                                dfqu dfquVar = (dfqu) obj2;
                                                                ensz enszVar5 = (ensz) ((ensz) deig.a.j()).g(dfquVar);
                                                                enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                                                ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 576, "SyncDataToWearableAppHandler.java")).D("Failed to sync conversation list to data client with ApiException[status=%s, connectionResult=%s]", deig.l(dfquVar), deig.k(dfquVar));
                                                                return null;
                                                            }
                                                        }, deigVar.i).e(Throwable.class, new emwl() { // from class: dehz
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj2) {
                                                                ensz enszVar5 = (ensz) ((ensz) deig.a.j()).g((Throwable) obj2);
                                                                enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                                                ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 592, "SyncDataToWearableAppHandler.java")).q("Failed to sync conversation list to data client.");
                                                                return null;
                                                            }
                                                        }, deigVar.i);
                                                        f8.b(e);
                                                        e.k(axnw.b(), deigVar.i);
                                                        f8.close();
                                                        ekzz f9 = eleg.f("SyncDataToWearableAppHandler#queryConversationsAndBroadcastV2");
                                                        try {
                                                            try {
                                                                bfkr n = bfks.n();
                                                                ((becl) n).b = true;
                                                                ((becl) n).h = 20;
                                                                bfkf bfkfVar = (bfkf) n.a().l().o();
                                                                try {
                                                                    bcrs bcrsVar = (bcrs) deigVar.f.b();
                                                                    while (bfkfVar.moveToNext()) {
                                                                        bcrsVar.T(bfkfVar);
                                                                        if (!bcrsVar.W() && !bcrsVar.q().booleanValue()) {
                                                                            if (((asvn) deigVar.k.b()).a()) {
                                                                                try {
                                                                                    if (bcrsVar.r().booleanValue()) {
                                                                                        continue;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th2 = th4;
                                                                                    ekzzVar = f7;
                                                                                    ekzzVar2 = f9;
                                                                                    try {
                                                                                        bfkfVar.close();
                                                                                        throw th2;
                                                                                    } catch (Throwable th5) {
                                                                                        th2.addSuppressed(th5);
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                            }
                                                                            final ConversationIdType Q = bcrsVar.Q();
                                                                            diaa b3 = diaa.b(a.C(Q, "/bugle/conversations/"));
                                                                            dhzq dhzqVar2 = (dhzq) map2.remove(Q);
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            cvgy cvgyVar2 = (cvgy) deigVar.e.b();
                                                                            dhzq dhzqVar3 = b3.a;
                                                                            Context context3 = deigVar.c;
                                                                            ekzz f10 = eleg.f("WearableConversationBuilder#buildV2");
                                                                            try {
                                                                                bcrs bcrsVar2 = (bcrs) cvgyVar2.b.b();
                                                                                bcrsVar2.T(bfkfVar);
                                                                                cvgz cvgzVar = cvgyVar2.c;
                                                                                cvgx cvgxVar2 = new cvgx(dhzqVar3);
                                                                                ConversationIdType Q2 = bcrsVar2.Q();
                                                                                cvgxVar2.d(Q2);
                                                                                boolean X = bcrsVar2.X();
                                                                                if (dhzqVar2 == null) {
                                                                                    map = map2;
                                                                                    cvgxVar = null;
                                                                                } else {
                                                                                    map = map2;
                                                                                    cvgz cvgzVar2 = cvgyVar2.c;
                                                                                    cvgxVar = new cvgx(dhzqVar2);
                                                                                }
                                                                                cvgxVar2.a.k("6", cvgyVar2.b(cvgxVar2, cvgxVar, arrayList2, 0, context3));
                                                                                ekzzVar = f7;
                                                                                try {
                                                                                    ekzzVar2 = f9;
                                                                                    try {
                                                                                        cvgxVar2.a.m("13", bcrsVar2.N());
                                                                                        cvgxVar2.a.h("3", bcrsVar2.I());
                                                                                        cvgxVar2.a.h("43", bcrsVar2.Y());
                                                                                        cvgxVar2.a.h("5", X);
                                                                                        cvgxVar2.a.n("7", bcrsVar2.t());
                                                                                        cvgxVar2.a.n("10", bcrsVar2.z());
                                                                                        bejf bejfVar = bcrsVar2.d;
                                                                                        bejfVar.az(12, "draft_preview_content_type");
                                                                                        String str = bejfVar.m;
                                                                                        if (str != null) {
                                                                                            cvgxVar2.a.n("21", str);
                                                                                        }
                                                                                        bejf bejfVar2 = bcrsVar2.d;
                                                                                        bejfVar2.az(9, "draft_snippet_text");
                                                                                        String str2 = bejfVar2.j;
                                                                                        if (str2 != null) {
                                                                                            cvgxVar2.a.n("20", str2);
                                                                                        }
                                                                                        cvgxVar2.a.h("19", bcrsVar2.E());
                                                                                        cvgxVar2.a.n("22", bcrsVar2.v());
                                                                                        if (bcrsVar2.p().isPresent()) {
                                                                                            aoku aokuVar = (aoku) bcrsVar2.p().get();
                                                                                            cfva cfvaVar = aoqm.a;
                                                                                            if (((Boolean) new aopw().get()).booleanValue()) {
                                                                                                cvgxVar2.a.n("41", aokuVar.o());
                                                                                            }
                                                                                            String p = aokuVar.p(((Boolean) new aoov().get()).booleanValue());
                                                                                            if (p != null) {
                                                                                                cvgxVar2.a.n("24", p);
                                                                                            }
                                                                                        }
                                                                                        bejf bejfVar3 = bcrsVar2.d;
                                                                                        bejfVar3.az(54, "raw_status");
                                                                                        cvgxVar2.a.l("33", bejfVar3.ac);
                                                                                        cvgxVar2.a.l("11", bcrsVar2.b());
                                                                                        cvgxVar2.a.h("34", bcym.b(bcrsVar2.b()));
                                                                                        cvgxVar2.a.h("35", bcrsVar2.H());
                                                                                        bejf bejfVar4 = bcrsVar2.d;
                                                                                        bejfVar4.az(55, "sms_error_code");
                                                                                        cvgxVar2.a.l("37", bejfVar4.ad);
                                                                                        bejf bejfVar5 = bcrsVar2.d;
                                                                                        bejfVar5.az(56, "sms_error_desc_map_name");
                                                                                        cvgxVar2.a.n("38", bejfVar5.ae);
                                                                                        bejf bejfVar6 = bcrsVar2.d;
                                                                                        bejfVar6.az(50, "message_protocol");
                                                                                        cvgxVar2.a.l("36", bejfVar6.Y);
                                                                                        efbd.b();
                                                                                        List<ParticipantsTable.BindData> f11 = ((bdfp) cvgyVar2.f.b()).f(Q2);
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        for (ParticipantsTable.BindData bindData : f11) {
                                                                                            cvgn cvgnVar = new cvgn();
                                                                                            String W = bindData.W();
                                                                                            if (W != null) {
                                                                                                cfva cfvaVar2 = aoqm.a;
                                                                                                if (((Boolean) new aopw().get()).booleanValue()) {
                                                                                                    W = ((aolr) cvgyVar2.e.b()).t(bindData).o();
                                                                                                }
                                                                                                cvgnVar.a = W;
                                                                                            }
                                                                                            cvgnVar.b = bindData.R();
                                                                                            cvgnVar.a(bdqo.a(bindData));
                                                                                            if (cvgnVar.c.isPresent()) {
                                                                                                cvgnVar.a(new ParticipantColor((ParticipantColor) cvgnVar.c.get()));
                                                                                            }
                                                                                            String str3 = cvgnVar.a;
                                                                                            if (str3 == null) {
                                                                                                throw new IllegalStateException("Missing required properties: phoneNumber");
                                                                                            }
                                                                                            arrayList3.add(new cvhf(str3, cvgnVar.b, cvgnVar.c).a());
                                                                                        }
                                                                                        cvgxVar2.a.k("31", arrayList3);
                                                                                        try {
                                                                                            f10.close();
                                                                                            if (!arrayList2.isEmpty()) {
                                                                                                cvgy cvgyVar3 = (cvgy) deigVar.e.b();
                                                                                                Context context4 = deigVar.c;
                                                                                                ekzz f12 = eleg.f("WearableConversationBuilder#loadNewDataParts");
                                                                                                try {
                                                                                                    Iterator it = arrayList2.iterator();
                                                                                                    while (it.hasNext()) {
                                                                                                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                                                                                                        if (messagePartCoreData.bo()) {
                                                                                                            ekzzVar3 = f12;
                                                                                                            Iterator it2 = it;
                                                                                                            if (messagePartCoreData.c() != -1 && messagePartCoreData.c() <= 0) {
                                                                                                                z2 = false;
                                                                                                                boolean z3 = messagePartCoreData.b() != -1 || messagePartCoreData.b() > 0;
                                                                                                                if (z2 || !z3) {
                                                                                                                    cvgyVar = cvgyVar3;
                                                                                                                    context2 = context4;
                                                                                                                    ensz enszVar5 = (ensz) cvgy.a.j();
                                                                                                                    enszVar5.Y(csux.O, "WearableConversationBuilder");
                                                                                                                    enszVar5.Y(csux.o, messagePartCoreData.A().toString());
                                                                                                                    enszVar5.Y(csux.a, messagePartCoreData.B().b());
                                                                                                                    enszVar5.Y(cviu.b, Integer.valueOf(messagePartCoreData.c()));
                                                                                                                    enszVar5.Y(cviu.a, Integer.valueOf(messagePartCoreData.b()));
                                                                                                                    ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 265, "WearableConversationBuilder.java")).q("Not syncing image with invalid dimensions.");
                                                                                                                } else {
                                                                                                                    cbbk cbbkVar = (cbbk) ((cbbu) cvgyVar3.d.b()).b(new cazs(messagePartCoreData).d(context4, 0));
                                                                                                                    if (cbbkVar != null) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                byte[] j = cbbkVar.j();
                                                                                                                                if (j != null) {
                                                                                                                                    cvgyVar = cvgyVar3;
                                                                                                                                    try {
                                                                                                                                        context2 = context4;
                                                                                                                                        try {
                                                                                                                                            cvgxVar2.c(messagePartCoreData.aa(), new Asset(j, null, null, null));
                                                                                                                                        } catch (cbbj e2) {
                                                                                                                                            e = e2;
                                                                                                                                            ensz enszVar6 = (ensz) ((ensz) cvgy.a.j()).g(e);
                                                                                                                                            enszVar6.Y(csux.O, "WearableConversationBuilder");
                                                                                                                                            ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 294, "WearableConversationBuilder.java")).q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                                                                            cbbkVar.q();
                                                                                                                                            f12 = ekzzVar3;
                                                                                                                                            it = it2;
                                                                                                                                            cvgyVar3 = cvgyVar;
                                                                                                                                            context4 = context2;
                                                                                                                                        }
                                                                                                                                    } catch (cbbj e3) {
                                                                                                                                        e = e3;
                                                                                                                                        context2 = context4;
                                                                                                                                        ensz enszVar62 = (ensz) ((ensz) cvgy.a.j()).g(e);
                                                                                                                                        enszVar62.Y(csux.O, "WearableConversationBuilder");
                                                                                                                                        ((ensz) enszVar62.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 294, "WearableConversationBuilder.java")).q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                                                                        cbbkVar.q();
                                                                                                                                        f12 = ekzzVar3;
                                                                                                                                        it = it2;
                                                                                                                                        cvgyVar3 = cvgyVar;
                                                                                                                                        context4 = context2;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    cvgyVar = cvgyVar3;
                                                                                                                                    context2 = context4;
                                                                                                                                    ensz enszVar7 = (ensz) cvgy.a.j();
                                                                                                                                    enszVar7.Y(csux.O, "WearableConversationBuilder");
                                                                                                                                    ((ensz) enszVar7.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 287, "WearableConversationBuilder.java")).q("Null bytes from image.");
                                                                                                                                }
                                                                                                                            } catch (cbbj e4) {
                                                                                                                                e = e4;
                                                                                                                                cvgyVar = cvgyVar3;
                                                                                                                            }
                                                                                                                            cbbkVar.q();
                                                                                                                        } catch (Throwable th6) {
                                                                                                                            cbbkVar.q();
                                                                                                                            throw th6;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        f12 = ekzzVar3;
                                                                                                                        it = it2;
                                                                                                                    }
                                                                                                                }
                                                                                                                f12 = ekzzVar3;
                                                                                                                it = it2;
                                                                                                                cvgyVar3 = cvgyVar;
                                                                                                                context4 = context2;
                                                                                                            }
                                                                                                            z2 = true;
                                                                                                            if (messagePartCoreData.b() != -1) {
                                                                                                            }
                                                                                                            if (z2) {
                                                                                                            }
                                                                                                            cvgyVar = cvgyVar3;
                                                                                                            context2 = context4;
                                                                                                            ensz enszVar52 = (ensz) cvgy.a.j();
                                                                                                            enszVar52.Y(csux.O, "WearableConversationBuilder");
                                                                                                            enszVar52.Y(csux.o, messagePartCoreData.A().toString());
                                                                                                            enszVar52.Y(csux.a, messagePartCoreData.B().b());
                                                                                                            enszVar52.Y(cviu.b, Integer.valueOf(messagePartCoreData.c()));
                                                                                                            enszVar52.Y(cviu.a, Integer.valueOf(messagePartCoreData.b()));
                                                                                                            ((ensz) enszVar52.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 265, "WearableConversationBuilder.java")).q("Not syncing image with invalid dimensions.");
                                                                                                            f12 = ekzzVar3;
                                                                                                            it = it2;
                                                                                                            cvgyVar3 = cvgyVar;
                                                                                                            context4 = context2;
                                                                                                        } else if (messagePartCoreData.ba()) {
                                                                                                            if (messagePartCoreData.t() == null) {
                                                                                                                ensz enszVar8 = (ensz) cvgy.a.j();
                                                                                                                ekzzVar3 = f12;
                                                                                                                try {
                                                                                                                    enszVar8.Y(csux.O, "WearableConversationBuilder");
                                                                                                                    enszVar8.Y(csux.o, messagePartCoreData.A().toString());
                                                                                                                    enszVar8.Y(csux.a, messagePartCoreData.B().b());
                                                                                                                    ((ensz) enszVar8.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadAudio", 309, "WearableConversationBuilder.java")).q("Not syncing audio with empty uri.");
                                                                                                                } catch (Throwable th7) {
                                                                                                                    th = th7;
                                                                                                                    Throwable th8 = th;
                                                                                                                    try {
                                                                                                                        ekzzVar3.close();
                                                                                                                        throw th8;
                                                                                                                    } catch (Throwable th9) {
                                                                                                                        th8.addSuppressed(th9);
                                                                                                                        throw th8;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                ekzzVar3 = f12;
                                                                                                                String aa = messagePartCoreData.aa();
                                                                                                                Uri t = messagePartCoreData.t();
                                                                                                                t.getClass();
                                                                                                                cvgxVar2.c(aa, new Asset(null, null, null, t));
                                                                                                            }
                                                                                                            f12 = ekzzVar3;
                                                                                                        }
                                                                                                    }
                                                                                                    f12.close();
                                                                                                } catch (Throwable th10) {
                                                                                                    th = th10;
                                                                                                    ekzzVar3 = f12;
                                                                                                }
                                                                                            }
                                                                                            f5 = eleg.f("SyncDataToWearableAppHandler#executeDataClientRequest");
                                                                                            try {
                                                                                                if (((Boolean) cvhp.b.e()).booleanValue()) {
                                                                                                    f6 = eleg.f("SyncDataToWearableAppHandler#executeDataClientRequest#deleteDataItems");
                                                                                                    try {
                                                                                                        deigVar.d.a(diaa.b("/bugle/rpc/conversation_deleted/" + Q.a()).a());
                                                                                                        f6.close();
                                                                                                    } finally {
                                                                                                    }
                                                                                                }
                                                                                                f6 = eleg.f("SyncDataToWearableAppHandler#executeDataClientRequest#putDataItem");
                                                                                                try {
                                                                                                    dhzj dhzjVar2 = deigVar.d;
                                                                                                    if (((avcf) deigVar.l.b()).a()) {
                                                                                                        c2 = b3.c();
                                                                                                        c2.e();
                                                                                                    } else {
                                                                                                        c2 = b3.c();
                                                                                                    }
                                                                                                    dhzjVar2.e(c2).p(deigVar.g, new dhqv() { // from class: deia
                                                                                                        @Override // defpackage.dhqv
                                                                                                        public final void d(Exception exc) {
                                                                                                            entd entdVar2 = deig.a;
                                                                                                            if (exc instanceof dfqu) {
                                                                                                                ConversationIdType conversationIdType = ConversationIdType.this;
                                                                                                                ensz enszVar9 = (ensz) ((ensz) deig.a.j()).g(exc);
                                                                                                                enszVar9.Y(csux.O, "SyncDataToWearableAppHandler");
                                                                                                                enszVar9.Y(csux.p, conversationIdType);
                                                                                                                dfqu dfquVar = (dfqu) exc;
                                                                                                                ((ensz) enszVar9.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "executeDataClientRequest", 521, "SyncDataToWearableAppHandler.java")).D("Failed to sync conversation to data client with ApiException[status=%s, connectionResult=%s]", deig.l(dfquVar), deig.k(dfquVar));
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    f6.close();
                                                                                                    f5.close();
                                                                                                    f7 = ekzzVar;
                                                                                                    f9 = ekzzVar2;
                                                                                                    map2 = map;
                                                                                                } finally {
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (Throwable th11) {
                                                                                            th = th11;
                                                                                            th2 = th;
                                                                                            bfkfVar.close();
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (Throwable th12) {
                                                                                        th = th12;
                                                                                        th3 = th;
                                                                                        try {
                                                                                            f10.close();
                                                                                            throw th3;
                                                                                        } catch (Throwable th13) {
                                                                                            th3.addSuppressed(th13);
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    ekzzVar2 = f9;
                                                                                    th3 = th;
                                                                                    f10.close();
                                                                                    throw th3;
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                                ekzzVar = f7;
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map3 = map2;
                                                                    ekzzVar = f7;
                                                                    ekzz ekzzVar4 = f9;
                                                                    bfkfVar.close();
                                                                    ekzzVar4.close();
                                                                    f5 = eleg.f("SyncDataToWearableAppHandler#cleanupOlderConversations");
                                                                    try {
                                                                        for (ConversationIdType conversationIdType : map3.keySet()) {
                                                                            deigVar.d.a(new Uri.Builder().scheme("wear").path("/bugle/conversations/" + String.valueOf(conversationIdType)).build());
                                                                        }
                                                                        f5.close();
                                                                        ekzzVar.close();
                                                                        return null;
                                                                    } finally {
                                                                        try {
                                                                            f5.close();
                                                                            throw th;
                                                                        } catch (Throwable th16) {
                                                                            th.addSuppressed(th16);
                                                                        }
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    ekzzVar = f7;
                                                                    ekzzVar2 = f9;
                                                                }
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                th = th;
                                                                try {
                                                                    ekzzVar2.close();
                                                                    throw th;
                                                                } catch (Throwable th19) {
                                                                    th.addSuppressed(th19);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th20) {
                                                            th = th20;
                                                            ekzzVar = f7;
                                                            ekzzVar2 = f9;
                                                            th = th;
                                                            ekzzVar2.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th21) {
                                                        ekzzVar = f7;
                                                        try {
                                                            f8.close();
                                                            throw th21;
                                                        } catch (Throwable th22) {
                                                            th21.addSuppressed(th22);
                                                            throw th21;
                                                        }
                                                    }
                                                } catch (Throwable th23) {
                                                    th = th23;
                                                    Throwable th24 = th;
                                                    try {
                                                        ekzzVar.close();
                                                        throw th24;
                                                    } catch (Throwable th25) {
                                                        th24.addSuppressed(th25);
                                                        throw th24;
                                                    }
                                                }
                                            } catch (Throwable th26) {
                                                th = th26;
                                                ekzzVar = f7;
                                            }
                                        }
                                    }, this.g).h(new emwl() { // from class: deie
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            ensz enszVar5 = (ensz) deig.a.h();
                                            enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                            ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 258, "SyncDataToWearableAppHandler.java")).q("Sync data to wearable devices completed successfully");
                                            deig.this.n(2, ecrh.SUCCESS);
                                            return ceyt.i();
                                        }
                                    }, erpp.a).e(IllegalStateException.class, new emwl() { // from class: deif
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            deig.m((IllegalStateException) obj, "Retrying sync: Inner-Task failed when processing previous conversations.");
                                            deig.this.n(3, ecrh.ERROR);
                                            return ceyt.m();
                                        }
                                    }, erpp.a).e(dfqu.class, new emwl() { // from class: dehv
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            dfqu dfquVar = (dfqu) obj;
                                            ensz enszVar5 = (ensz) ((ensz) deig.a.j()).g(dfquVar);
                                            enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                                            ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 282, "SyncDataToWearableAppHandler.java")).D("Not retrying sync: Failed to sync conversations to wearable with ApiException[status=%s, connectionResult=%s]", deig.l(dfquVar), deig.k(dfquVar));
                                            deig.this.n(4, ecrh.ERROR);
                                            return ceyt.k();
                                        }
                                    }, erpp.a).e(Throwable.class, new emwl() { // from class: dehw
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            deig.m((Throwable) obj, "Not retrying sync: Failed to sync conversations to wearable.");
                                            deig.this.n(4, ecrh.ERROR);
                                            return ceyt.k();
                                        }
                                    }, erpp.a);
                                } finally {
                                    try {
                                        f4.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            }
                            ensz enszVar5 = (ensz) entdVar.h();
                            enszVar5.Y(csux.O, "SyncDataToWearableAppHandler");
                            ((ensz) enszVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 376, "SyncDataToWearableAppHandler.java")).q("Does not have minimum required permissions; skipping wearable sync.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (IllegalArgumentException e) {
                    m(e, "Failed to sync phone config to data client.");
                }
                f2.close();
                n(6, ecrh.CANCEL);
                return elfo.e(ceyt.k());
            } catch (Throwable th3) {
                try {
                    f2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                f.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public final void n(int i, ecrh ecrhVar) {
        ekzz f = eleg.f("SyncDataToWearableAppHandler#logWearSyncMetrics");
        try {
            ((akzt) this.q.b()).e("Bugle.Wear.SyncRunOnPhone", i - 1);
            ecrj ecrjVar = (ecrj) this.r.b();
            ecri ecriVar = this.s;
            ecriVar.getClass();
            ecrjVar.f(ecriVar, deij.a, null, ecrhVar);
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
}
