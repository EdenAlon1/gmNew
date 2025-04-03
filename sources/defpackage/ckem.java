package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckem implements ckds {
    private static final enru l = enru.c("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final cxao H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ecrj M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbr Q;
    private final ffbr R;
    private final atlx S;
    private final asne T;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final ffbr m;
    private final ffbr n;
    private final Context o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final csjk v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;

    public ckem(ffbr ffbrVar, Context context, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, csjk csjkVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, cxao cxaoVar, ffbr ffbrVar27, ffbr ffbrVar28, ecrj ecrjVar, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, atlx atlxVar, asne asneVar) {
        this.o = context;
        this.L = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
        this.r = ffbrVar6;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.u = ffbrVar9;
        this.v = csjkVar;
        this.w = ffbrVar10;
        this.x = ffbrVar11;
        this.y = ffbrVar12;
        this.z = ffbrVar13;
        this.A = ffbrVar14;
        this.B = ffbrVar15;
        this.C = ffbrVar16;
        this.D = ffbrVar17;
        this.E = ffbrVar18;
        this.b = ffbrVar19;
        this.c = ffbrVar20;
        this.F = ffbrVar21;
        this.G = ffbrVar22;
        this.d = ffbrVar23;
        this.e = ffbrVar24;
        this.f = ffbrVar25;
        this.K = ffbrVar26;
        this.H = cxaoVar;
        this.I = ffbrVar27;
        this.J = ffbrVar28;
        this.M = ecrjVar;
        this.N = ffbrVar29;
        this.g = ffbrVar30;
        this.O = ffbrVar31;
        this.P = ffbrVar32;
        this.h = ffbrVar33;
        this.Q = ffbrVar34;
        this.i = ffbrVar35;
        this.j = ffbrVar36;
        this.k = ffbrVar37;
        this.R = ffbrVar38;
        this.S = atlxVar;
        this.T = asneVar;
    }

    private static int S(int i) {
        if (i != 0) {
            return i != 1 ? -1 : 1;
        }
        return 0;
    }

    private final Uri T(MessageCoreData messageCoreData, int i, long j) {
        if (i != 0) {
            return null;
        }
        Uri o = ((coxk) this.D.b()).o((bdtd) this.c.b(), messageCoreData, j);
        if (messageCoreData.cB() && messageCoreData.cm()) {
            messageCoreData.bC();
            messageCoreData.aS();
            Collection.EL.stream(messageCoreData.ab()).forEach(new Consumer() { // from class: ckdv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((MessagePartCoreData) obj).ay(null);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((bdmq) this.A.b()).P(messageCoreData, messageCoreData.ab());
        }
        return o;
    }

    private final Optional U(int i) {
        String str = (String) this.H.a(i).h().orElse(null);
        if (TextUtils.isEmpty(str)) {
            if (i != -1) {
                Optional i2 = ((ctwb) this.r.b()).h(i).i(false);
                Y(i2, 5);
                return i2;
            }
            if (TextUtils.isEmpty(str)) {
                ensk j = l.j();
                j.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getMsisdnFromSubscriptionSettings", 828, "RcsUtilsImpl.java")).q("No default number, returning empty msisdn");
                return Optional.empty();
            }
        }
        ensk e = l.e();
        e.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getMsisdnFromSubscriptionSettings", 833, "RcsUtilsImpl.java")).r("Using subId %d for msisdn", i);
        Optional of = Optional.of(((ctwb) this.r.b()).h(i).g(str));
        Y(of, 6);
        return of;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [aoku, java.lang.Object] */
    private final Optional V() {
        Optional flatMap = ((djry) this.g.b()).m().flatMap(new Function() { // from class: ckdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((csmk) ckem.this.e.b()).a((djtp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (flatMap.isEmpty() || ((aoku) flatMap.get()).e().isEmpty()) {
            ensk j = l.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessagingIdentityFromSources", 782, "RcsUtilsImpl.java")).q("Failed to get msisdn from Bugle");
            try {
                flatMap = Optional.of(((aolr) this.f.b()).r(((RcsProfileService) this.t.b()).getMsisdn()));
                Y(flatMap, 4);
            } catch (ehxg | NullPointerException e) {
                ensk j2 = l.j();
                j2.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessagingIdentityFromSources", (char) 791, "RcsUtilsImpl.java")).q("Failed to get msisdn from RcsProfileService");
            }
        }
        if (!flatMap.isEmpty() && !((aoku) flatMap.get()).e().isEmpty()) {
            return flatMap;
        }
        Optional U = U(((ckby) this.J.b()).a(ckcf.q));
        return (!U.isPresent() || TextUtils.isEmpty(U.get().j())) ? U(-1) : U;
    }

    private final List W(String str) {
        Uri withAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        akzw b = ((albq) this.m.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor c = cgsx.c(this.o.getContentResolver(), withAppendedPath, axuh.b(), null, null, null);
        azyd.l(c);
        b.c();
        if (c == null) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (c.moveToNext()) {
                aoku x = ((aolr) this.f.b()).x(((couw) this.y.b()).a(c));
                if (!arrayList.contains(x) && !((bdtd) this.c.b()).l(x)) {
                    arrayList.add(x);
                }
            }
            return arrayList;
        } finally {
            c.close();
        }
    }

    private final boolean X() {
        return ((Boolean) ((djry) this.g.b()).m().map(new Function() { // from class: ckdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((djtp) obj).o().mChatRevokeTimer > 0);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoku, java.lang.Object] */
    private final void Y(Optional optional, int i) {
        if (optional.isPresent() && optional.get().e().isPresent()) {
            ((akzt) this.n.b()).e("Bugle.Rcs.PhoneNumber.Invalid.Counts", i);
        }
    }

    @Override // defpackage.ckds
    public final boolean A(ConversationIdType conversationIdType) {
        ckdr Q = Q(conversationIdType);
        if (Q == ckdr.MANUAL) {
            return true;
        }
        ((akzt) this.n.b()).e("Bugle.Fallback.Conversation.Cancelled.Reason", Q.ordinal() != 1 ? 2 : 1);
        return false;
    }

    @Override // defpackage.ckds
    public final boolean B(ckdr ckdrVar) {
        return ckdrVar == ckdr.AUTOMATIC_NOT_ROAMING || ckdrVar == ckdr.AUTOMATIC_ALWAYS;
    }

    @Override // defpackage.ckds
    public final boolean C(Intent intent) {
        try {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent == null) {
                ensk j = l.j();
                j.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", 359, "RcsUtilsImpl.java")).q("Pending intent is null. Broadcast not authorized.");
                return false;
            }
            if (((ckav) this.I.b()).a(pendingIntent.getCreatorUid())) {
                return true;
            }
            ensk j2 = l.j();
            j2.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", 366, "RcsUtilsImpl.java")).q("Package not google signed. Broadcast not authorized.");
            return false;
        } catch (RuntimeException e) {
            ensk j3 = l.j();
            j3.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) ((enrr) j3).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isBroadcastFromAuthorizedSource", (char) 353, "RcsUtilsImpl.java")).q("Unable to retrieve pending intent. Broadcast not authorized.");
            return false;
        }
    }

    @Override // defpackage.ckds
    public final boolean D() {
        return (((csmz) this.v.a()).r() || ((ctwb) this.r.b()).i().B()) ? false : true;
    }

    @Override // defpackage.ckds
    public final boolean E(ConversationIdType conversationIdType) {
        return ((bczy) this.z.b()).ai(conversationIdType) || ((bczy) this.z.b()).ad(conversationIdType);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoku, java.lang.Object] */
    @Override // defpackage.ckds
    public final boolean F(int i) {
        int d = ((ctyx) this.q.b()).d("rcs_sub_id", -2);
        if (d == -2) {
            ensk e = l.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 473, "RcsUtilsImpl.java")).r("subId %d not rcs because no sim has rcs", i);
            return false;
        }
        int a = ((ctwb) this.r.b()).h(i).a();
        if (d == a) {
            ensk e2 = l.e();
            e2.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 478, "RcsUtilsImpl.java")).r("subId %d has rcs because it is the saved rcs subId", i);
            return true;
        }
        String f = ((ctyx) this.q.b()).f("rcs_msisdn", null);
        if (TextUtils.isEmpty(f)) {
            ensk e3 = l.e();
            e3.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 483, "RcsUtilsImpl.java")).u("subId %d not rcs because unknown msisdn for rcs subid %d", i, a);
            return false;
        }
        Optional i2 = ((ctwb) this.r.b()).h(a).i(false);
        if (i2.isEmpty()) {
            ensk e4 = l.e();
            e4.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 494, "RcsUtilsImpl.java")).r("subId %d not rcs because its msisdn is not available", i);
            return false;
        }
        ?? r11 = i2.get();
        cfva cfvaVar = aoqm.a;
        if (emxe.b(r11.p(((Boolean) new aopt().get()).booleanValue())).equals(f)) {
            ensk e5 = l.e();
            e5.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e5).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 511, "RcsUtilsImpl.java")).u("subId %d has rcs because has same msisdn as rcs subid %d", i, a);
            return true;
        }
        ensk e6 = l.e();
        e6.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e6).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isRcsProvisioningSubscription", 503, "RcsUtilsImpl.java")).K("subId %d not rcs because msisdn %s different than rcs subid %d %s", Integer.valueOf(i), cskt.c(i2.get()), Integer.valueOf(a), cskt.b(f));
        return false;
    }

    @Override // defpackage.ckds
    public final boolean G() {
        eqwf d = ((ckge) ((csjk) this.C.b()).a()).d();
        cssy cssyVar = (cssy) ((csrv) this.F.b()).d.b();
        if (((Boolean) dimn.E().c().a()).booleanValue() && ((ctyx) cssyVar.a.b()).q("bugle_allow_rcs_overrides", false) && d != eqwf.DISABLED_TERMS_AND_CONDITIONS_REJECTED) {
            return false;
        }
        int ordinal = d.ordinal();
        if (ordinal != 10 && ordinal != 16 && ordinal != 18) {
            switch (ordinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    ensk e = l.e();
                    e.Y(ente.a, "BugleRcs");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isReadyForProvisioning", 411, "RcsUtilsImpl.java")).t("isReadyForProvisioning: false, rcsAvailability is %s", d);
                    break;
            }
            return false;
        }
        ensk e2 = l.e();
        e2.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "isReadyForProvisioning", 408, "RcsUtilsImpl.java")).t("isReadyForProvisioning: true, rcsAvailability is %s", d);
        return true;
    }

    @Override // defpackage.ckds
    public final synchronized boolean H() {
        return ((ctyx) this.q.b()).q("rcs_welcome_message_dismissed", false);
    }

    @Override // defpackage.ckds
    public final boolean I() {
        return ((clws) this.d.b()).n();
    }

    @Override // defpackage.ckds
    public final boolean J(int i) {
        return ((clws) this.d.b()).o(i);
    }

    @Override // defpackage.ckds
    public final boolean K(MessageCoreData messageCoreData) {
        if (((Boolean) messageCoreData.af().map(new Function() { // from class: ckdw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((clws) ckem.this.d.b()).m((awui) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            return true;
        }
        ensk j = l.j();
        j.Y(ente.a, "BugleRcs");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.f, messageCoreData.E());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "shouldSendReadReport", 865, "RcsUtilsImpl.java")).q("Can't send a read report because the subscription is no longer active.");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.ckds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType L(long r15, defpackage.cpxu r17, com.google.android.ims.rcsservice.group.GroupInfo r18, j$.util.Optional r19, int r20, j$.util.Optional r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckem.L(long, cpxu, com.google.android.ims.rcsservice.group.GroupInfo, j$.util.Optional, int, j$.util.Optional, boolean, int):com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType");
    }

    @Override // defpackage.ckds
    public final void M(Bundle bundle) {
        Intent intent = new Intent(RcsIntents.ACTION_PROVISIONING_EVENT);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", 100);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key", bundle);
        String bundle2 = bundle.toString();
        ensk e = l.e();
        e.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "broadcastProvisioningEvent", 1537, "RcsUtilsImpl.java")).D("Sending ProvisioningEvent %s, %s", djtb.b(100), cskt.b(bundle2));
        intent.putExtra("pending_intent", PendingIntent.getBroadcast(this.o, 0, intent, 201326592));
        dkuy.c(this.o, intent);
        this.o.sendBroadcast(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x015e, code lost:
    
        r0 = defpackage.ckem.l.g();
        r0.Y(defpackage.ente.a, "BugleRcs");
        ((defpackage.enrr) ((defpackage.enrr) r0).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "prepareRcsMessageFallback", 1361, "RcsUtilsImpl.java")).q("Cannot resize message for MMS fallback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0178, code lost:
    
        return false;
     */
    @Override // defpackage.ckds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r20, int r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckem.N(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, int, long):boolean");
    }

    @Override // defpackage.ckds
    public final void O(MessageCoreData messageCoreData, int i, long j) {
        if (i != 0) {
            i = 1;
        }
        emxf.a(true);
        bdmq bdmqVar = (bdmq) this.A.b();
        Uri T = T(messageCoreData, i, j);
        ekzz f = eleg.f("MessageDatabaseOperations#markMessageAsResent");
        try {
            ConversationIdType z = messageCoreData.z();
            MessageIdType B = messageCoreData.B();
            buxr B2 = bdmq.B(B, i, j, T);
            B2.U(1);
            bdmqVar.S(B2.b(), z, B);
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

    @Override // defpackage.ckds
    public final int P() {
        enru enruVar = l;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessageTransportTech", 1555, "RcsUtilsImpl.java")).q("Getting the IM tech from RcsConfigurationProvider");
        Optional m = ((djry) this.g.b()).m();
        if (m.isEmpty()) {
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsMessageTransportTech", 1559, "RcsUtilsImpl.java")).q("Unable to retrieve the RCS Config from RcsConfigurationProvider for getting the IM tech.");
        }
        if (m.isEmpty()) {
            return 1;
        }
        int i = ((djtp) m.get()).o().mMessageTech;
        if (i == 0) {
            return 2;
        }
        return i == 1 ? 3 : 1;
    }

    public final ckdr Q(ConversationIdType conversationIdType) {
        return !E(conversationIdType) ? ckdr.NONE : ckdr.MANUAL;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aoku, java.lang.Object] */
    public final String R(Optional optional) {
        Optional of = Optional.of(((aolr) this.f.b()).h((aoku) optional.get(), (String) ((aoku) optional.get()).c().orElse("")));
        cfva cfvaVar = aoqm.a;
        return emxe.b(((Boolean) new aoqc().get()).booleanValue() ? ((awui) of.get().e().get()).d : of.get().n());
    }

    @Override // defpackage.cijg
    public final void c(String str) {
        enru enruVar = l;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "onRegistrationIdReceived", 1461, "RcsUtilsImpl.java")).t("Tachyon Anonymous Device ID received: %s", str);
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "broadcastTachyonAnonymousDeviceId", 538, "RcsUtilsImpl.java")).t("Send Tachyon Anonymous Device ID to RCS process: %s", str);
        Intent intent = new Intent(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
        dkuy.c(this.o, intent);
        dkqd.c(this.o, intent);
        intent.putExtra(RcsIntents.EXTRA_TACHYON_ANONYMOUS_DEVICE_ID, str);
        this.o.sendBroadcast(intent);
    }

    @Override // defpackage.ckds
    public final int d() {
        int d = ((ctyx) this.q.b()).d(this.o.getString(R.string.rcs_default_sharing_method_key), -1);
        int S = S(d);
        if (d != -1) {
            ensk e = l.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getDefaultSharingMethod", 925, "RcsUtilsImpl.java")).r("obtained sharingMethod from buglePrefs: %d", S);
            return S;
        }
        if (((ckge) ((csjk) this.C.b()).a()).d() == eqwf.AVAILABLE) {
            d = ((RcsProfileService) this.t.b()).getDefaultSharingMethod();
            ensk e2 = l.e();
            e2.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getDefaultSharingMethod", 933, "RcsUtilsImpl.java")).r("obtained sharingMethod from profileService: %d", d);
        }
        return S(d);
    }

    @Override // defpackage.ckds
    public final int e(boolean z) {
        int b = z ? ((cuaf) this.Q.b()).b() : ((cuaf) this.Q.b()).d();
        return b == 0 ? Alert.DURATION_SHOW_INDEFINITELY : b;
    }

    @Override // defpackage.ckds
    public final int f(Optional optional) {
        if (optional.isEmpty()) {
            ensk j = l.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsConversationParticipantLimit", 880, "RcsUtilsImpl.java")).q("#getRcsConversationParticipantLimit: selfChatEndpoint is empty");
        }
        return ((Integer) optional.map(new Function() { // from class: ckdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ckem ckemVar = ckem.this;
                Optional k = ((djry) ckemVar.g.b()).k(((djrk) ckemVar.h.b()).a(((awui) obj).d));
                int d = csmk.d(k);
                if (d == 0) {
                    d = Alert.DURATION_SHOW_INDEFINITELY;
                }
                return Integer.valueOf(d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
    }

    @Override // defpackage.ckds
    public final ln g(MessageCoreData messageCoreData) {
        ln lnVar = new ln();
        Iterator it = messageCoreData.ab().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.bh()) {
                lnVar.a.clear();
                lt ltVar = new lt();
                String ae = messagePartCoreData.ae();
                String V = messagePartCoreData.V();
                if (ae != null) {
                    ltVar.i(ae.getBytes(StandardCharsets.UTF_8));
                }
                if (V != null) {
                    ltVar.h(V.getBytes(StandardCharsets.UTF_8));
                }
                ltVar.k("attachment".getBytes(StandardCharsets.UTF_8));
                ltVar.d(106);
                lnVar.d(ltVar);
            } else {
                if (!messagePartCoreData.aZ()) {
                    lt ltVar2 = new lt();
                    String ar = messageCoreData.ar();
                    ltVar2.i(ar != null ? ar.getBytes() : null);
                    ltVar2.h("text/plain".getBytes());
                    ltVar2.k("body".getBytes());
                    lnVar.d(ltVar2);
                } else if (messagePartCoreData.bt()) {
                    lt ltVar3 = new lt();
                    String az = messageCoreData.az();
                    ltVar3.i(az != null ? az.getBytes() : null);
                    ltVar3.h("text/plain".getBytes());
                    ltVar3.k("body".getBytes());
                    lnVar.d(ltVar3);
                }
            }
        }
        if (this.T.a() && messageCoreData.cX() && messageCoreData.c() == 1 && ((MessagePartCoreData) messageCoreData.ab().get(0)).bo()) {
            String a = cgrt.a(messageCoreData.aa());
            if (!TextUtils.isEmpty(a)) {
                lt ltVar4 = new lt();
                ltVar4.i(a.getBytes());
                ltVar4.h("text/plain".getBytes());
                ltVar4.k("body".getBytes());
                lnVar.d(ltVar4);
            }
        }
        return lnVar;
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        t();
    }

    @Override // defpackage.ckds
    public final aztg h() {
        return ((bdtd) this.c.b()).g(((ckby) this.J.b()).a(ckcf.p));
    }

    @Override // defpackage.ckds
    public final ckdr i() {
        return !X() ? ckdr.NONE : ckdr.MANUAL;
    }

    @Override // defpackage.ckds
    public final ckdr j(bdhg bdhgVar) {
        ConversationIdType conversationIdType = bdgq.a;
        MessageCoreData w = ((bdmq) this.A.b()).w(bdhgVar);
        if (w != null) {
            conversationIdType = w.z();
        }
        return conversationIdType.b() ? !X() ? ckdr.NONE : ckdr.MANUAL : Q(conversationIdType);
    }

    @Override // defpackage.ckds
    @Deprecated
    public final cpbd k(long j, String str, String str2) {
        return l(cpxu.b(j), str, str2);
    }

    @Override // defpackage.ckds
    public final cpbd l(cpxu cpxuVar, String str, String str2) {
        String str3;
        String str4;
        String b;
        String a;
        csix.h();
        if (str != null && ((ckdn) this.N.b()).f(str)) {
            String b2 = emxe.b(((cuwz) this.w.b()).c(str));
            int length = b2.length();
            int i = length - 15;
            int i2 = length - 16;
            int lastIndexOf = b2.lastIndexOf(31, i2);
            int lastIndexOf2 = b2.lastIndexOf(31, lastIndexOf - 1);
            if (lastIndexOf == -1) {
                lastIndexOf = b2.lastIndexOf(45, i2);
                lastIndexOf2 = b2.lastIndexOf(45, lastIndexOf - 1);
            }
            return cpbd.a(cpxuVar, W(str2), URLDecoder.decode(b2.substring(0, lastIndexOf2)), b2.substring(lastIndexOf2 + 1, lastIndexOf), b2.substring(lastIndexOf + 1, i));
        }
        if (str == null || !((ckdn) this.N.b()).e(str)) {
            return ((coxk) this.D.b()).x(cpxuVar, str2);
        }
        List W = W(str2);
        cpay a2 = ((ckdn) this.N.b()).a(str);
        if (a2 != null) {
            b = TextUtils.isEmpty(a2.b) ? ((ckby) this.J.b()).b() : a2.b;
            a = TextUtils.isEmpty(a2.c) ? bcyu.a() : a2.c;
            str4 = a2.a;
        } else {
            String c = ((cuwz) this.w.b()).c(str);
            csix.c(String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", cskt.b(str), cskt.b(c)));
            Iterator it = W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = null;
                    break;
                }
                aoku aokuVar = (aoku) it.next();
                if (aokuVar.u()) {
                    cfva cfvaVar = aoqm.a;
                    str3 = aokuVar.k(((Boolean) new aoqj().get()).booleanValue());
                    break;
                }
            }
            if (str3 != null) {
                str = str3;
            } else if (true != TextUtils.isEmpty(c)) {
                str = c;
            }
            str4 = str;
            b = ((ckby) this.J.b()).b();
            a = bcyu.a();
        }
        cpay cpayVar = new cpay(str4, b, a);
        str4.getClass();
        return cpbd.b(cpxuVar, Collections.singletonList(((aolr) this.f.b()).n(str4)), cpayVar);
    }

    @Override // defpackage.ckds
    public final Optional m(aoku aokuVar) {
        if (aokuVar.D()) {
            ensk g = l.g();
            g.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsCapabilities", 420, "RcsUtilsImpl.java")).q("no capabilities because it is a short code");
            return Optional.empty();
        }
        if (aokuVar.h() == null) {
            ensk j = l.j();
            j.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsCapabilities", 426, "RcsUtilsImpl.java")).q("Remote user id is null.");
            return Optional.empty();
        }
        try {
            return ((avlp) this.u.b()).c(aokuVar);
        } catch (avlo e) {
            ensk j2 = l.j();
            j2.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsCapabilities", (char) 432, "RcsUtilsImpl.java")).q("exception getting cached capabilities");
            return Optional.empty();
        }
    }

    @Override // defpackage.ckds
    public final Optional n() {
        return V().filter(new Predicate() { // from class: ckeb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((aoku) obj).e().isPresent();
            }
        }).map(new Function() { // from class: ckec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aoku aokuVar = (aoku) obj;
                ckem ckemVar = ckem.this;
                return ((aolr) ckemVar.f.b()).h(aokuVar, ckemVar.R(Optional.of(aokuVar)));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.ckds
    public final synchronized Optional o() {
        return Optional.ofNullable(((ctyx) this.q.b()).s());
    }

    @Override // defpackage.ckds
    public final String p(String str, String str2) {
        String f = ((chco) this.K.b()).f();
        String str3 = (str != null ? URLEncoder.encode(str) : "") + "\u001f" + f + "\u001f" + str2 + "@rcs.google.com";
        ensk g = l.g();
        g.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "buildGroupBackupContactNameHelper", 960, "RcsUtilsImpl.java")).t("Created group backup contact name %s", cskt.b(str3));
        return ((cuwz) this.w.b()).d(str3);
    }

    @Override // defpackage.ckds
    public final String q(ConversationIdType conversationIdType) {
        ecri d = this.M.d();
        try {
            String str = "";
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                bseh b = bsom.b(conversationIdType);
                if (b == null) {
                    ensk i = l.i();
                    i.Y(ente.a, "BugleRcs");
                    enrr enrrVar = (enrr) i;
                    enrrVar.Y(csux.p, conversationIdType);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getContributionIdFromConversationIdInternal", 996, "RcsUtilsImpl.java")).q("Conversation was not found");
                } else if (!TextUtils.isEmpty(b.ad())) {
                    str = b.ad();
                }
                return str;
            }
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                ((akzt) this.n.b()).c("Bugle.RcsMigration.ContributionIdFromTelephony");
            }
            cpxu a = ((cbek) this.B.b()).a(conversationIdType);
            String J = ((bczy) this.z.b()).J(conversationIdType);
            MessageCoreData n = ((bdmq) this.A.b()).n(conversationIdType);
            Uri u = n == null ? null : n.u();
            if (u != null) {
                str = l(a, J, u.toString()).e;
            }
            return str;
        } finally {
            this.M.f(d, new ecda("RCS.GetContributionId"), null, ecrh.SUCCESS);
        }
    }

    @Override // defpackage.ckds
    public final String r() {
        return "empty";
    }

    @Override // defpackage.ckds
    @Deprecated
    public final String s() {
        csix.h();
        Optional V = V();
        return (V.isEmpty() || ((aoku) V.get()).e().isEmpty()) ? "" : R(V);
    }

    @Override // defpackage.ckds
    public final void t() {
        Bundle bundle = new Bundle();
        String f = ((ctyx) this.q.b()).f(this.o.getString(R.string.rcs_acs_url_override_key), null);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", ((ctvb) this.x.b()).G());
        bundle.putLong("com.google.android.ims.provisioning.engine.bugle_version", cvdd.a(this.o).b);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_has_required_permission", ((ctud) this.p.b()).k());
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", ((cmgr) this.O.b()).n());
        if (f != null) {
            bundle.putString("com.google.android.ims.provisioning.engine.bugle_overridden_acs_url", f);
        }
        M(bundle);
    }

    @Override // defpackage.ckds
    public final void u() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER);
        dkuy.c(this.o, intent);
        dkqd.c(this.o, intent);
        this.o.sendBroadcast(intent);
    }

    @Override // defpackage.ckds
    public final void v() {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
        dkuy.c(this.o, intent);
        dkqd.c(this.o, intent);
        this.o.sendBroadcast(intent);
    }

    @Override // defpackage.ckds
    public final void w(eyte eyteVar) {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
        dkuy.c(this.o, intent);
        dkqd.c(this.o, intent);
        intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE, eyteVar.toByteArray());
        if (!eyteVar.c.isEmpty()) {
            intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE_ID, eyteVar.c);
        }
        this.o.sendBroadcast(intent);
    }

    @Override // defpackage.ckds
    public final void x(long j) {
        ensk g = l.g();
        g.Y(ente.a, "BugleRcs");
        ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "deleteFileTransfer", 444, "RcsUtilsImpl.java")).s("Deleting file transfer with session id: %s", j);
        csix.h();
        csix.e(j, -1L);
        try {
            ((FileTransferService) this.s.b()).deleteFileTransfer(j);
        } catch (ehxg e) {
            ensk i = l.i();
            i.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "deleteFileTransfer", 453, "RcsUtilsImpl.java")).s("Exception removing file transfer with session id: %s", j);
        }
    }

    @Override // defpackage.ckds
    public final void y() {
        ((ctyx) this.q.b()).j("rcs_sub_id", -2);
        ((ctyx) this.q.b()).n("rcs_msisdn");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [aoku, java.lang.Object] */
    @Override // defpackage.ckds
    public final void z() {
        ctwi h = ((ctwb) this.r.b()).h(((ctwb) this.r.b()).f());
        ((ctyx) this.q.b()).j("rcs_sub_id", h.a());
        Optional i = h.i(false);
        if (i.isPresent()) {
            ((ctyx) this.q.b()).l("rcs_msisdn", i.get().h());
        } else {
            ((ctyx) this.q.b()).n("rcs_msisdn");
        }
    }
}
