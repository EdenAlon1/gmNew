package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Instant;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cano implements cbut {
    public static final cskc a = cskc.g("BugleDatabase", "ProtocolChangeTombstoneManager");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl");
    public final akzt c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final dtuu g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final cpdg p;
    private final ffbr q;
    private final errl r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public cano(akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, dtuu dtuuVar, cpdg cpdgVar, ffbr ffbrVar6, errl errlVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15) {
        this.c = akztVar;
        this.d = ffbrVar;
        this.n = ffbrVar3;
        this.f = ffbrVar4;
        this.e = ffbrVar2;
        this.o = ffbrVar5;
        this.g = dtuuVar;
        this.p = cpdgVar;
        this.q = ffbrVar6;
        this.r = errlVar;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.k = ffbrVar9;
        this.j = ffbrVar10;
        this.s = ffbrVar11;
        this.l = ffbrVar12;
        this.t = ffbrVar13;
        this.u = ffbrVar14;
        this.m = ffbrVar15;
    }

    public static int a(int i) {
        if (i == 40) {
            return 216;
        }
        return i == 30 ? 215 : 214;
    }

    public static int b(boolean z, boolean z2) {
        if (z) {
            return z2 ? 216 : 215;
        }
        return 214;
    }

    public static boolean p(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (v(i) && v(i2)) {
            return true;
        }
        return w(i) && w(i2);
    }

    public static boolean q(MessageCoreData messageCoreData) {
        return bdjs.j(messageCoreData.k());
    }

    private static int s(int i) {
        if (i == 215) {
            return 207;
        }
        if (i == 216 || i == 219 || i == 235 || i == 237) {
            return 213;
        }
        return i != 238 ? 206 : 207;
    }

    private final int t(MessageCoreData messageCoreData, int i) {
        if (((attl) this.m.b()).a() && i == 264) {
            return 264;
        }
        if (messageCoreData.cX() && messageCoreData.cB()) {
            return 213;
        }
        return messageCoreData.cX() ? 207 : 206;
    }

    private final MessageCoreData u(MessageCoreData messageCoreData, boolean z) {
        ConversationIdType z2 = messageCoreData.z();
        long o = messageCoreData.o();
        return z ? ((bdmq) this.e.b()).k(z2, o) : ((bdmq) this.e.b()).j(z2, o);
    }

    private static boolean v(int i) {
        return i == 216 || i == 219 || i == 233 || i == 237 || i == 235;
    }

    private static boolean w(int i) {
        return i == 215 || i == 238 || i == 234;
    }

    private final boolean x(bcyk bcykVar) {
        if (bcykVar == null) {
            return false;
        }
        Optional p = bcykVar.p();
        if (p.isEmpty()) {
            return false;
        }
        return y(bcykVar.X(), bcykVar.W(), (aoku) p.get());
    }

    private final boolean y(boolean z, boolean z2, aoku aokuVar) {
        return bzwd.a() && !z && !z2 && this.p.k(aokuVar.h());
    }

    private static boolean z(bcyk bcykVar) {
        return bcykVar != null && bcykVar.X() && bcykVar.L() == 2 && !bcykVar.W();
    }

    @Override // defpackage.cbut
    public final elfl c(final ConversationIdType conversationIdType, aoku aokuVar, boolean z, boolean z2, final int i) {
        if (y(z, z2, aokuVar)) {
            return elfo.g(new Callable() { // from class: cane
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final cano canoVar = cano.this;
                    ((canu) canoVar.j.b()).b(1);
                    ensk e = cano.b.e();
                    e.Y(ente.a, "BugleEtouffee");
                    enrr enrrVar = (enrr) e;
                    ensn ensnVar = csux.p;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    enrrVar.Y(ensnVar, conversationIdType2);
                    enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ProtocolChangeTombstoneManagerImpl.java");
                    final int i2 = i;
                    enrrVar2.r("insertProtocolTombstoneIfDraftTypeChanged, with draftMessageType: %d", i2);
                    canoVar.g.d("ProtocolChangeTombstoneManagerImpl#insertProtocolTombstoneIfDraftTypeChanged", new Runnable() { // from class: cani
                        /* JADX WARN: Code restructure failed: missing block: B:85:0x02f4, code lost:
                        
                            if (r2.k() == 264) goto L90;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 919
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cani.run():void");
                        }
                    });
                    return null;
                }
            }, this.r);
        }
        ensk e = b.e();
        e.Y(ente.a, "BugleEtouffee");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, conversationIdType);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", 187, "ProtocolChangeTombstoneManagerImpl.java")).I("Skip insert protocol tombstone. Conversation not valid for protocolTombstones. isGroup: %b, hasBot: %b", z, z2);
        return elfo.e(null);
    }

    @Override // defpackage.cbut
    public final elfl d(final ConversationIdType conversationIdType, boolean z, final int i) {
        if (z) {
            return elfo.e(null);
        }
        ((canu) this.j.b()).a(1);
        final camv camvVar = (camv) this.h.b();
        csjb a2 = camv.a.a();
        a2.I("onDraftTypeChanged");
        a2.A("conversationId", conversationIdType);
        a2.y("draftMessageType", i);
        a2.r();
        elfl b2 = ((cbwj) camvVar.c.b()).b("GroupProtocolChangeTombstoneManager#onDraftTypeChanged", new Runnable() { // from class: cams
            @Override // java.lang.Runnable
            public final void run() {
                ((canc) camv.this.d.b()).a(conversationIdType, i);
            }
        });
        b2.getClass();
        return b2;
    }

    @Override // defpackage.cbut
    public final elfl e(final ConversationIdType conversationIdType) {
        ((canu) this.j.b()).a(8);
        final camv camvVar = (camv) this.h.b();
        csjb c = camv.a.c();
        c.I("onEncryptionStatusChanged");
        c.A("conversationId", conversationIdType);
        c.r();
        elfl b2 = ((cbwj) camvVar.c.b()).b("GroupProtocolChangeTombstoneManager#onEncryptionStatusChanged", new Runnable() { // from class: camt
            @Override // java.lang.Runnable
            public final void run() {
                camv camvVar2 = camv.this;
                bdeo bdeoVar = (bdeo) camvVar2.g.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                bcyk a2 = bdeoVar.a(conversationIdType2);
                if (a2 != null) {
                    ((canc) camvVar2.d.b()).a(conversationIdType2, true != a2.K() ? 30 : 40);
                }
            }
        });
        b2.getClass();
        return b2;
    }

    public final void f(MessageCoreData messageCoreData) {
        boolean z;
        int t;
        boolean z2 = true;
        MessageCoreData u = u(messageCoreData, true);
        if (u == null) {
            return;
        }
        MessageCoreData u2 = u(messageCoreData, false);
        if (!bdjs.j(u.k())) {
            if (!bdjs.g(u.k()) || u2 == null) {
                return;
            }
            if (!cbvv.h(u2.k())) {
                int k = u.k();
                boolean z3 = u2.cX() && u2.cB() && v(k);
                if (u2.cX()) {
                    if (k != 215) {
                        if (k == 238) {
                            k = 238;
                        }
                    }
                    z = true;
                    if (!u2.cX() || (k != 214 && k != 236)) {
                        z2 = false;
                    }
                    if (z3 || z || z2) {
                        return;
                    }
                }
                z = false;
                if (!u2.cX()) {
                }
                z2 = false;
                if (z3) {
                    return;
                } else {
                    return;
                }
            }
            if (((asiz) this.l.b()).a()) {
                k(u, bqmn.r);
            }
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, u.z());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "deletePreviousTombstoneIfNeeded", 950, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted previous tombstone. tombstone: %s", u.k());
            ((cgpv) this.f.b()).a(u.B());
            return;
        }
        if (u2 != null) {
            messageCoreData = u2;
        }
        int k2 = u.k();
        if (!bdjs.g(messageCoreData.k())) {
            if (cbvv.h(messageCoreData.k()) || k2 == (t = t(messageCoreData, k2))) {
                return;
            }
            bdmq bdmqVar = (bdmq) this.e.b();
            ConversationIdType z4 = u.z();
            MessageIdType B = u.B();
            String[] strArr = MessagesTable.a;
            buxr buxrVar = new buxr();
            buxrVar.ap("updateConversationCreationTombstone2");
            buxrVar.U(t);
            bdmqVar.U(z4, B, buxrVar);
            this.c.e("Bugle.Tombstone.Generated", t);
            ensk e2 = b.e();
            e2.Y(ente.a, "BugleEtouffee");
            enrr enrrVar2 = (enrr) e2;
            enrrVar2.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateConversationCreationTombstone", 1019, "ProtocolChangeTombstoneManagerImpl.java")).u("updateConversationCreationTombstone: if message not a tombstone. oldTombstone: %s, newTombstone: %s", k2, t);
            return;
        }
        int s = s(messageCoreData.k());
        if (k2 != s) {
            bdmq bdmqVar2 = (bdmq) this.e.b();
            ConversationIdType z5 = u.z();
            MessageIdType B2 = u.B();
            String[] strArr2 = MessagesTable.a;
            buxr buxrVar2 = new buxr();
            buxrVar2.ap("updateConversationCreationTombstone1");
            buxrVar2.U(s(messageCoreData.k()));
            bdmqVar2.U(z5, B2, buxrVar2);
            this.c.e("Bugle.Tombstone.Generated", s);
            ensk e3 = b.e();
            e3.Y(ente.a, "BugleEtouffee");
            enrr enrrVar3 = (enrr) e3;
            enrrVar3.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateConversationCreationTombstone", 993, "ProtocolChangeTombstoneManagerImpl.java")).u("updateConversationCreationTombstone: if message is a tombstone. oldTombstone: %s, newTombstone: %s", k2, s);
        }
        if (((asiz) this.l.b()).a()) {
            k(messageCoreData, bqmn.s);
        }
        ((cgpv) this.f.b()).a(messageCoreData.B());
    }

    public final void g(ConversationIdType conversationIdType, int i, long j) {
        aztg e = ((bdtd) this.o.b()).e();
        ParticipantsTable.BindData a2 = e.a();
        List L = ((bczy) this.n.b()).L(conversationIdType);
        long g = ((bczy) this.n.b()).g(conversationIdType);
        int i2 = (i == 216 && ((bdmq) this.e.b()).l(conversationIdType) == null) ? 219 : i;
        ((cbvt) this.q.b()).j(Optional.empty(), conversationIdType, e, a2, L, i2, j, g);
        ensk h = b.h();
        h.Y(ente.a, "BugleEtouffee");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.p, conversationIdType);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertNewTombstone", 1391, "ProtocolChangeTombstoneManagerImpl.java")).v("inserted new conversation tombstone. Tombstone: %s, time: %s", i2, j);
    }

    public final void h(MessageCoreData messageCoreData, int i, long j) {
        MessageCoreData s = ((bdmq) this.e.b()).s(messageCoreData.z(), messageCoreData.B());
        if (s == null) {
            int s2 = s(i);
            ((cbvt) this.q.b()).o(Optional.empty(), messageCoreData.z(), ((bczy) this.n.b()).L(messageCoreData.z()), s2, j);
            return;
        }
        int k = s.k();
        if (p(i, k) || s.k() == 242) {
            return;
        }
        if (bdjs.g(k)) {
            if (((asiz) this.l.b()).a()) {
                k(s, bqmn.t);
            }
            ((cgpv) this.f.b()).a(s.B());
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, s.z());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneAtConversationBottomIfNeeded", 1187, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted existing bottom tombstone. Tombstone: %s", s.k());
            s = ((bdmq) this.e.b()).s(messageCoreData.z(), messageCoreData.B());
        }
        if (s != null && q(s)) {
            int t = t(messageCoreData, -1);
            if (t != s.k()) {
                s.bV(t);
                ((bdmq) this.e.b()).O(s);
                this.c.e("Bugle.Tombstone.Generated", t);
                return;
            }
            return;
        }
        if (messageCoreData == null || s == null || cbvv.h(messageCoreData.k()) || cbvv.h(s.k()) || messageCoreData.cX() != s.cX() || messageCoreData.cB() != s.cB()) {
            g(messageCoreData.z(), i, j);
        }
    }

    public final void i(MessageCoreData messageCoreData, int i, cand candVar, long j) {
        int i2;
        MessageCoreData s = ((bdmq) this.e.b()).s(messageCoreData.z(), messageCoreData.B());
        if (s == null) {
            int ordinal = candVar.ordinal();
            if (ordinal == 0) {
                i2 = 206;
            } else if (ordinal == 1) {
                i2 = 207;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Unknown tombstone protocol");
                }
                i2 = 213;
            }
            int s2 = s(i);
            ((cbvt) this.q.b()).o(Optional.empty(), messageCoreData.z(), ((bczy) this.n.b()).L(messageCoreData.z()), s2, j);
            this.c.e("Bugle.Tombstone.Generated", i2);
            return;
        }
        int k = s.k();
        if (bdjs.g(k)) {
            if (cand.b(k) == candVar) {
                return;
            }
            if (((asiz) this.l.b()).a()) {
                k(s, bqmn.t);
            }
            ((cgpv) this.f.b()).a(s.B());
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, s.z());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneAtConversationBottomIfNeededV2", 1282, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted existing bottom tombstone. Tombstone: %s", s.k());
            s = ((bdmq) this.e.b()).s(messageCoreData.z(), messageCoreData.B());
        }
        if (s != null) {
            if (q(s)) {
                int t = t(messageCoreData, s.k());
                if (t != s.k()) {
                    s.bV(t);
                    ((bdmq) this.e.b()).O(s);
                    this.c.e("Bugle.Tombstone.Generated", t);
                    return;
                }
                return;
            }
            cand a2 = cand.a(s);
            if (a2 != candVar) {
                this.c.e("Bugle.Tombstone.Generated", cany.a(a2, candVar).j);
                g(messageCoreData.z(), i, j);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (x(r0) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012e  */
    @Override // defpackage.cbut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cano.j(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    public final void k(MessageCoreData messageCoreData, bqmn bqmnVar) {
        ((ccix) this.s.b()).a(messageCoreData.B().b(), bqmnVar);
    }

    @Override // defpackage.cbut
    public final void l(final MessageCoreData messageCoreData) {
        boolean z;
        bcyk bcykVar;
        ConversationIdType z2 = messageCoreData.z();
        boolean a2 = bzwd.a();
        final boolean z3 = false;
        if (a2) {
            bcykVar = ((azwh) this.d.b()).a(z2);
            boolean z4 = z(bcykVar);
            z = true;
            if (!x(bcykVar) && !z4) {
                z = false;
            }
            z3 = z4;
        } else {
            z = a2;
            bcykVar = null;
        }
        if (bcykVar == null || !z) {
            ((bdmq) this.e.b()).O(messageCoreData);
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, z2);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 611, "ProtocolChangeTombstoneManagerImpl.java")).q("Skip updateMessageWithSurroundingTombstones. Conversation not valid for protocolTombstones.");
            return;
        }
        ensk e2 = b.e();
        e2.Y(ente.a, "BugleEtouffee");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.b, messageCoreData.B());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 620, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithSurroundingTombstones");
        this.g.d("ProtocolChangeTombstoneManagerImpl#updateMessageWithSurroundingTombstones", new Runnable() { // from class: canh
            @Override // java.lang.Runnable
            public final void run() {
                cano canoVar = cano.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (z3) {
                    ((canu) canoVar.j.b()).a(5);
                    camv camvVar = (camv) canoVar.h.b();
                    messageCoreData2.getClass();
                    camv.a.m("Invoking updateMessageWithSurroundingTombstones");
                    camr camrVar = (camr) camvVar.f.b();
                    MessageCoreData v = ((bdmq) camrVar.b.b()).v(messageCoreData2.B());
                    if (v == null) {
                        ((canw) camrVar.c.b()).c(messageCoreData2);
                        return;
                    }
                    ((canq) camrVar.d.b()).b(v);
                    ffbz ffbzVar = caof.a;
                    caof a3 = caoe.a(camx.b(messageCoreData2));
                    if (a3 != null) {
                        ((canq) camrVar.d.b()).a(messageCoreData2, a3, messageCoreData2.o() - 1);
                    }
                    if (messageCoreData2.cI() && !messageCoreData2.J().af() && v.J().af()) {
                        csjb c = canw.a.c();
                        c.A("messageId", messageCoreData2.B());
                        c.I("Marked message as read");
                        c.r();
                        messageCoreData2.bB(true);
                    }
                    ((canw) camrVar.c.b()).c(messageCoreData2);
                    return;
                }
                ((canu) canoVar.j.b()).b(5);
                MessageCoreData v2 = ((bdmq) canoVar.e.b()).v(messageCoreData2.B());
                if (v2 == null) {
                    ((bdmq) canoVar.e.b()).O(messageCoreData2);
                    return;
                }
                messageCoreData2.B();
                canoVar.f(v2);
                int b2 = cano.b(messageCoreData2.cX(), messageCoreData2.cB());
                if (((Boolean) bzwd.D.e()).booleanValue() || ((asnq) canoVar.k.b()).a()) {
                    canoVar.i(messageCoreData2, b2, cand.a(messageCoreData2), (-1) + messageCoreData2.o());
                } else {
                    canoVar.h(messageCoreData2, b2, messageCoreData2.o() - 1);
                }
                if (messageCoreData2.cI() && !messageCoreData2.J().af() && v2.J().af()) {
                    ensk e3 = cano.b.e();
                    e3.Y(ente.a, "BugleEtouffee");
                    enrr enrrVar3 = (enrr) e3;
                    enrrVar3.Y(csux.b, messageCoreData2.B());
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateReadStatusIfNeeded", 1472, "ProtocolChangeTombstoneManagerImpl.java")).q("Marked message as read");
                    messageCoreData2.bB(true);
                }
                ((bdmq) canoVar.e.b()).O(messageCoreData2);
                ensk e4 = cano.b.e();
                e4.Y(ente.a, "BugleEtouffee");
                enrr enrrVar4 = (enrr) e4;
                enrrVar4.Y(csux.b, messageCoreData2.B());
                ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstonesBody", 684, "ProtocolChangeTombstoneManagerImpl.java")).q("updated message");
            }
        });
    }

    @Override // defpackage.cbut
    public final void m(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData) {
        ((canu) this.j.b()).b(4);
        l(messageCoreData);
        this.g.d("ProtocolChangeTombstoneManagerImpl#updateTombstonesAfterMessageMove", new Runnable() { // from class: canf
            @Override // java.lang.Runnable
            public final void run() {
                ConversationIdType z = messageCoreData.z();
                ConversationIdType conversationIdType2 = conversationIdType;
                if (z.equals(conversationIdType2)) {
                    return;
                }
                cano canoVar = cano.this;
                MessageCoreData o = ((bdmq) canoVar.e.b()).o(conversationIdType2);
                if (o == null || !bdjs.g(o.k())) {
                    return;
                }
                if (((asiz) canoVar.l.b()).a()) {
                    canoVar.k(o, bqmn.q);
                }
                ((cgpv) canoVar.f.b()).a(o.B());
            }
        });
    }

    @Override // defpackage.cbut
    public final void n(List list) {
        if (bzwd.a()) {
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateTombstonesBeforeDelete", 500, "ProtocolChangeTombstoneManagerImpl.java")).q("updateTombstonesBeforeDelete");
            final MessageCoreData messageCoreData = (MessageCoreData) Collections.max(list, Comparator.CC.comparing(new Function() { // from class: canl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((MessageCoreData) obj).o());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            this.g.d("ProtocolChangeTombstoneManagementImpl#updateTombstonesBeforeDelete", new Runnable() { // from class: canm
                @Override // java.lang.Runnable
                public final void run() {
                    cano canoVar = cano.this;
                    azwh azwhVar = (azwh) canoVar.d.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bcyk a2 = azwhVar.a(messageCoreData2.z());
                    if (a2 == null || !a2.X() || a2.L() != 2) {
                        ((canu) canoVar.j.b()).b(2);
                        canoVar.f(messageCoreData2);
                        return;
                    }
                    ((canu) canoVar.j.b()).a(2);
                    camv camvVar = (camv) canoVar.h.b();
                    messageCoreData2.getClass();
                    camv.a.m("Invoking updateTombstonesBeforeDelete");
                    ((canq) camvVar.e.b()).b(messageCoreData2);
                }
            });
        }
    }

    @Override // defpackage.cbut
    public final void o(final MessageCoreData messageCoreData) {
        if (bzwd.a()) {
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateTombstonesBeforeResend", 539, "ProtocolChangeTombstoneManagerImpl.java")).q("updateTombstonesBeforeResend");
            this.g.d("ProtocolChangeTombstoneManagerImpl#updateTombstonesBeforeResend", new Runnable() { // from class: cank
                @Override // java.lang.Runnable
                public final void run() {
                    cano canoVar = cano.this;
                    azwh azwhVar = (azwh) canoVar.d.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    bcyk a2 = azwhVar.a(messageCoreData2.z());
                    if (a2 == null || !a2.X() || a2.L() != 2) {
                        ((canu) canoVar.j.b()).b(3);
                        canoVar.f(messageCoreData2);
                    } else {
                        ((canu) canoVar.j.b()).a(3);
                        camv camvVar = (camv) canoVar.h.b();
                        camv.a.m("Invoking updateTombstonesBeforeResend");
                        ((canq) camvVar.e.b()).b(messageCoreData2);
                    }
                }
            });
        }
    }

    @Override // defpackage.cbut
    public final boolean r(final MessageCoreData messageCoreData, final buxr buxrVar, final Optional optional) {
        bcyk a2 = ((azwh) this.d.b()).a(messageCoreData.z());
        if (z(a2)) {
            ((canu) this.j.b()).a(6);
            final camv camvVar = (camv) this.h.b();
            messageCoreData.getClass();
            csjb a3 = camv.a.a();
            a3.I("updateMessageWithBuilderAndSurroundingTombstones");
            a3.A("messageId", messageCoreData.B());
            a3.r();
            Object c = ((dtuu) camvVar.b.b()).c("GroupProtocolChangeTombstoneManagerDelegate#updateMessageWithBuilderAndSurroundingTombstones", new emyl() { // from class: camu
                @Override // defpackage.emyl
                public final Object get() {
                    camr camrVar = (camr) camv.this.f.b();
                    bdmq bdmqVar = (bdmq) camrVar.b.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    MessageCoreData v = bdmqVar.v(messageCoreData2.B());
                    buxr buxrVar2 = buxrVar;
                    boolean z = false;
                    if (v != null) {
                        ((canq) camrVar.d.b()).b(v);
                        long o = messageCoreData2.o();
                        try {
                            o = buxrVar2.c();
                        } catch (RuntimeException e) {
                            camr.a.s("receivedTimestamp not in builder, using existing receivedTimestamp", e);
                        }
                        ffbz ffbzVar = caof.a;
                        caof a4 = caoe.a(camx.b(messageCoreData2));
                        if (a4 != null) {
                            ((canq) camrVar.d.b()).a(messageCoreData2, a4, (-1) + o);
                            canw canwVar = (canw) camrVar.c.b();
                            csjb a5 = canw.a.a();
                            a5.I("updated message");
                            a5.A("messageId", messageCoreData2.B());
                            a5.r();
                            if (MessageData.cU(buxrVar2.a())) {
                                Optional optional2 = optional;
                                amdd q = amdg.q(buxrVar2, Optional.of(canw.a));
                                q.c(messageCoreData2.B());
                                q.i(Instant.ofEpochMilli(o));
                                ((amcr) q).f = optional2;
                                z = ((amdh) canwVar.d.b()).d(q.a());
                            } else {
                                z = ((bdmq) canwVar.b.b()).U(messageCoreData2.z(), messageCoreData2.B(), buxrVar2);
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            });
            c.getClass();
            return ((Boolean) c).booleanValue();
        }
        if (a2 != null && bzwd.a() && x(a2)) {
            ((canu) this.j.b()).b(6);
            ensk e = b.e();
            e.Y(ente.a, "BugleEtouffee");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithBuilderAndSurroundingTombstones", 728, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithBuilderAndSurroundingTombstones");
            return ((Boolean) this.g.c("ProtocolChangeTombstoneManagerImpl#updateMessageWithBuilderAndSurroundingTombstones", new emyl() { // from class: cang
                @Override // defpackage.emyl
                public final Object get() {
                    cano canoVar = cano.this;
                    bdmq bdmqVar = (bdmq) canoVar.e.b();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    MessageCoreData v = bdmqVar.v(messageCoreData2.B());
                    if (v == null) {
                        return false;
                    }
                    buxr buxrVar2 = buxrVar;
                    int b2 = cano.b(messageCoreData2.cX(), messageCoreData2.cB());
                    canoVar.f(v);
                    long a4 = cbus.a(messageCoreData2, buxrVar2, cano.a);
                    if (bzwd.b() || ((asnq) canoVar.k.b()).a()) {
                        canoVar.i(messageCoreData2, b2, cand.a(messageCoreData2), (-1) + messageCoreData2.o());
                    } else {
                        canoVar.h(messageCoreData2, b2, (-1) + a4);
                    }
                    if (!MessageData.cU(buxrVar2.a())) {
                        return Boolean.valueOf(((bdmq) canoVar.e.b()).U(messageCoreData2.z(), messageCoreData2.B(), buxrVar2));
                    }
                    Optional optional2 = optional;
                    amdd q = amdg.q(buxrVar2, Optional.of(cano.a));
                    q.c(messageCoreData2.B());
                    q.i(Instant.ofEpochMilli(a4));
                    ((amcr) q).f = optional2;
                    return Boolean.valueOf(((amdh) canoVar.i.b()).d(q.a()));
                }
            })).booleanValue();
        }
        if (!MessageData.cU(messageCoreData.k())) {
            return ((bdmq) this.e.b()).U(messageCoreData.z(), messageCoreData.B(), buxrVar);
        }
        amdh amdhVar = (amdh) this.i.b();
        cskc cskcVar = a;
        amdd q = amdg.q(buxrVar, Optional.of(cskcVar));
        q.c(messageCoreData.B());
        q.i(Instant.ofEpochMilli(cbus.a(messageCoreData, buxrVar, cskcVar)));
        ((amcr) q).f = optional;
        return amdhVar.d(q.a());
    }
}
