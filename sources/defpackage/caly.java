package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caly implements bzqb {
    public static final engw a;
    public static final engw b;
    public static final cskc c;
    public static final enru d;
    public final caen e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final awtm i;
    public final ffbr j;
    public final ffbr k;
    private final errl l;
    private final bzqa m;
    private final ffbr n;
    private final dtuu o;
    private final ffbr p;
    private final caqi q;
    private final ffbr r;
    private final chef s;
    private final atue t;

    static {
        Integer valueOf = Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        a = engw.B(valueOf, 229, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 233, 234, 252, 215, 216, 219);
        b = engw.t(229, 226, 233);
        engw.s(valueOf, 234);
        c = cskc.g("BugleEtouffee", "EtouffeeDatabaseOperationsImpl");
        d = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl");
    }

    public caly(errl errlVar, caen caenVar, bzqa bzqaVar, ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, caqi caqiVar, chef chefVar, ffbr ffbrVar6, awtm awtmVar, ffbr ffbrVar7, atue atueVar, ffbr ffbrVar8) {
        this.l = errlVar;
        this.e = caenVar;
        this.m = bzqaVar;
        this.n = ffbrVar;
        this.f = ffbrVar2;
        this.o = dtuuVar;
        this.p = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.q = caqiVar;
        this.s = chefVar;
        this.r = ffbrVar6;
        this.i = awtmVar;
        this.j = ffbrVar7;
        this.t = atueVar;
        this.k = ffbrVar8;
    }

    private final void m(ConversationIdType conversationIdType) {
        bcyk a2 = ((azwh) this.n.b()).a(conversationIdType);
        if (a2 == null || !byyr.d(a2.L())) {
            return;
        }
        caqi caqiVar = this.q;
        caqg caqgVar = (caqg) caqh.a.createBuilder();
        String a3 = conversationIdType.a();
        caqgVar.copyOnWrite();
        caqh caqhVar = (caqh) caqgVar.instance;
        a3.getClass();
        caqhVar.b = a3;
        ((cevh) caqiVar.a.b()).a(ceyr.g("tombstone_manager_on_rcs_group_e2ee_status_change", (caqh) caqgVar.build()));
    }

    @Override // defpackage.bzqb
    public final MessageCoreData a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#getLatestVisibleMessageOrGroupEtouffeeTombstoneExcludingMessage");
        try {
            bdmq bdmqVar = (bdmq) this.f.b();
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.A(messageIdType);
            buxzVar.an(axuh.b);
            buxzVar.B(false);
            buxzVar.b(new Function() { // from class: calu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    engw engwVar = caly.a;
                    buxzVar2.al();
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: calv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    engw engwVar = caly.a;
                    buxzVar2.ag();
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: calw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    buxzVar2.ai(caly.a);
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessageCoreData m = bdmqVar.m(new buxs(buxzVar));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzqb
    public final elfl b(final String str) {
        if (!this.m.p()) {
            return elfo.e(Optional.empty());
        }
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#getParticipantRemoteRegistrationId");
        try {
            elfl g = elfo.g(new Callable() { // from class: calm
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str2 = str;
                    if (str2 == null) {
                        return Optional.empty();
                    }
                    caly calyVar = caly.this;
                    efbd.b();
                    engw c2 = calyVar.e.f.c(str2);
                    ArrayList arrayList = new ArrayList();
                    int i = ((enou) c2).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        boqd boqdVar = (boqd) c2.get(i2);
                        if (boqdVar.j()) {
                            String i3 = boqdVar.i();
                            if (!TextUtils.isEmpty(i3)) {
                                arrayList.add(i3);
                            }
                        }
                    }
                    if (arrayList.size() == 1) {
                        return Optional.of((String) arrayList.get(0));
                    }
                    if (arrayList.size() > 1) {
                        caly.c.r("Multiple registration id's found for other participant");
                    }
                    return Optional.empty();
                }
            }, this.l);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzqb
    public final engw c(int i) {
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#getPreviouslyE2eeCurrentlyNonE2eeConversations");
        try {
            bsob e = bsom.e();
            e.z("getPreviouslyE2eeCurrentlyNonE2eeConversations");
            e.r();
            e.i(new Function() { // from class: calp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    engw engwVar = caly.a;
                    bsolVar.m(0);
                    bsolVar.o(true);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.g(new Function() { // from class: calq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    engw engwVar = caly.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskp bskpVar = bsom.c;
            e.e(new bsny(bskpVar.r, false), new bsny(bskpVar.a, false));
            e.x(i);
            engw f2 = e.b().f();
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzqb
    public final engw d(final ConversationIdType conversationIdType, final engw engwVar) {
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#getRcsEncryptedMessages");
        try {
            buxo d2 = MessagesTable.d();
            d2.z("getRcsEncryptedMessages");
            d2.h(new Function() { // from class: cald
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    engw engwVar2 = caly.a;
                    buxzVar.m(ConversationIdType.this);
                    buxzVar.K(3);
                    buxzVar.ai(engwVar);
                    buxzVar.N(2);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = d2.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzqb
    public final Optional e(final MessageIdType messageIdType) {
        MessageCoreData v = ((bdmq) this.f.b()).v(messageIdType);
        if (v == null) {
            csjb e = c.e();
            e.I("Failed to find the message to resend.");
            e.d(messageIdType);
            e.r();
            return Optional.empty();
        }
        ffbr ffbrVar = this.n;
        final ConversationIdType z = v.z();
        bcyk a2 = ((azwh) ffbrVar.b()).a(z);
        if (a2 == null) {
            csjb e2 = c.e();
            e2.I("Failed to find the conversation of the message to resend");
            e2.d(messageIdType);
            e2.c(z);
            e2.r();
            return Optional.empty();
        }
        if (a2.L() == 2 && v.cB()) {
            final int b2 = bzwf.b() + 1;
            return (Optional) this.o.c("prepareMessageForGroupResending", new emyl() { // from class: call
                @Override // defpackage.emyl
                public final Object get() {
                    final MessageIdType messageIdType2 = messageIdType;
                    MessagesTable.BindData b3 = MessagesTable.b(messageIdType2);
                    if (b3 == null) {
                        caly.c.r("Failed to find the message for resend.");
                        return Optional.empty();
                    }
                    caly calyVar = caly.this;
                    buoy I = b3.I();
                    I.j(null);
                    I.i(null);
                    I.r(Optional.empty());
                    I.ad(bdgr.a);
                    I.x(Optional.of(UUID.randomUUID()));
                    I.U(calyVar.i.a());
                    I.R(0);
                    I.ao(19);
                    I.T(-1L);
                    I.w(false);
                    I.af(1L);
                    MessagesTable.BindData c2 = I.c();
                    bwdf c3 = PartsTable.c();
                    c3.z("prepareMessageForUnencryptedResending-parts");
                    c3.h(new Function() { // from class: cali
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            engw engwVar = caly.a;
                            bwdmVar.n(MessageIdType.this);
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwav bwavVar = (bwav) c3.b().o();
                    while (bwavVar.moveToNext()) {
                        try {
                            bvwp x = ((PartsTable.BindData) bwavVar.cO()).x();
                            x.J(c2.D());
                            x.d();
                        } catch (Throwable th) {
                            try {
                                bwavVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bwavVar.close();
                    btql b4 = btqq.b();
                    b4.z("prepareMessageForUnencryptedResending-link_preview");
                    b4.e(new Function() { // from class: calj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btqp btqpVar = (btqp) obj;
                            engw engwVar = caly.a;
                            btqpVar.b(MessageIdType.this);
                            return btqpVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    btps btpsVar = (btps) b4.b().o();
                    while (btpsVar.moveToNext()) {
                        try {
                            bton btonVar = (bton) btpsVar.cO();
                            btos btosVar = new btos();
                            btosVar.c(btonVar, true, btonVar.cJ);
                            btosVar.m(c2.D());
                            btosVar.d();
                        } catch (Throwable th3) {
                            try {
                                btpsVar.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    ConversationIdType conversationIdType = z;
                    int i = b2;
                    btpsVar.close();
                    buxr buxrVar = new buxr();
                    buxrVar.ap("prepareMessageForUnencryptedResending");
                    buxrVar.Y(new Function() { // from class: calk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            engw engwVar = caly.a;
                            buxzVar.q(MessageIdType.this);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    buxrVar.L(i);
                    buxrVar.U(22);
                    if (!((bdmq) calyVar.f.b()).S(buxrVar.b(), conversationIdType, messageIdType2)) {
                        csjb e3 = caly.c.e();
                        e3.I("Failed to update the original message");
                        e3.d(messageIdType2);
                        e3.c(conversationIdType);
                        e3.r();
                    }
                    return Optional.of(c2.D());
                }
            });
        }
        csjb a3 = c.a();
        a3.I("Not in a RCS group conversation, or message already not encrypted.");
        a3.d(messageIdType);
        a3.c(z);
        a3.r();
        return k(messageIdType) ? Optional.of(messageIdType) : Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bzqb
    public final void f(engw engwVar, ConversationIdType conversationIdType) {
        engw b2 = this.s.b((engw) Collection.EL.stream(engwVar).map(new Function() { // from class: calt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((awui) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
        int i = ((enou) b2).c;
        int i2 = 0;
        while (i2 < i) {
            boqd boqdVar = (boqd) b2.get(i2);
            if (boqdVar.j()) {
                i2++;
                if (!boqdVar.k()) {
                }
            }
            csjb a2 = c.a();
            a2.I("Group conversation will downgrade as one or more users does not have group e2ee capability");
            a2.c(conversationIdType);
            a2.r();
            l(conversationIdType, 0, caqc.DOWNGRADE_INVALID_PARTICIPANTS_IN_GROUP);
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bzqb
    public final void g(final SelfIdentityId selfIdentityId) {
        efbd.b();
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#disableEncryptionInConversations");
        try {
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("disableEncryptionInConversations");
            bsoeVar.ak();
            bsoeVar.q(0);
            if (this.t.a()) {
                bsoeVar.w(cfmh.a);
            }
            bsoeVar.ad(new Function() { // from class: cale
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    engw engwVar = caly.a;
                    bsolVar.m(1);
                    bsolVar.k(((SelfIdentityIdImpl) SelfIdentityId.this).a);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsoeVar.am();
            final bsod b2 = bsoeVar.b();
            final int i = 0;
            engw engwVar = (engw) bsom.f().r("conversations.updateAndReturnUpdatedRows-txn", new emyl() { // from class: bsoc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emyl
                public final Object get() {
                    bsob e = bsom.e();
                    e.z("conversations.updateAndReturnUpdatedRows-query");
                    bsod bsodVar = bsod.this;
                    engw engwVar2 = bsodVar.e;
                    int i2 = ((enou) engwVar2).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        e.k((bsof) ((duap) engwVar2.get(i3)));
                    }
                    if (((dtrm) bsodVar.d).b) {
                        bsol bsolVar = new bsol();
                        bsolVar.as(bsodVar.h());
                        e.h(bsolVar);
                    }
                    if (((dtrm) bsodVar.d).c) {
                        e.r();
                    }
                    Integer num = i;
                    engw y = e.b().y();
                    num.intValue();
                    bsodVar.t(0);
                    return y;
                }
            });
            ensk h = d.h();
            h.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/operations/EtouffeeDatabaseOperationsImpl", "disableEncryptionInConversations", 680, "EtouffeeDatabaseOperationsImpl.java")).r("Updated conversation encryption status in database. count %d", engwVar.size());
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                ((cbgf) this.p.b()).d(((bseh) it.next()).C());
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

    @Override // defpackage.bzqb
    public final void h(final awui awuiVar, final ConversationIdType conversationIdType, final int i, final caqc caqcVar) {
        efbd.b();
        this.o.d("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryption", new Runnable() { // from class: calh
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[Catch: all -> 0x01da, TRY_ENTER, TryCatch #2 {all -> 0x01da, blocks: (B:12:0x002b, B:22:0x00db, B:25:0x00e3, B:32:0x0104, B:34:0x0123, B:35:0x012a, B:37:0x0160, B:45:0x01d9, B:48:0x01d6, B:14:0x0031, B:17:0x0049, B:18:0x009f, B:20:0x00cc, B:39:0x0069, B:41:0x0077, B:44:0x01d1), top: B:11:0x002b, inners: #0, #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x01b1  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0104 A[Catch: all -> 0x01da, TryCatch #2 {all -> 0x01da, blocks: (B:12:0x002b, B:22:0x00db, B:25:0x00e3, B:32:0x0104, B:34:0x0123, B:35:0x012a, B:37:0x0160, B:45:0x01d9, B:48:0x01d6, B:14:0x0031, B:17:0x0049, B:18:0x009f, B:20:0x00cc, B:39:0x0069, B:41:0x0077, B:44:0x01d1), top: B:11:0x002b, inners: #0, #1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.calh.run():void");
            }
        });
    }

    @Override // defpackage.bzqb
    public final void i(ConversationIdType conversationIdType, int i, caqc caqcVar) {
        l(conversationIdType, i, caqcVar);
    }

    @Override // defpackage.bzqb
    public final boolean j(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#hasGroupSwitchToE2eeTombstone");
        try {
            buxo d2 = MessagesTable.d();
            d2.z("hasGroupSwitchToE2eeTombstone");
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.B(false);
            buxzVar.b(new Function() { // from class: calx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    buxzVar2.ai(caly.b);
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.g(buxzVar);
            d2.x(1);
            boolean T = d2.b().T();
            f.close();
            return T;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bzqb
    public final boolean k(final MessageIdType messageIdType) {
        return ((Boolean) this.o.c("EtouffeeDatabaseOperationsImpl.markMessageForManualUnencryptedResending", new emyl() { // from class: calr
            @Override // defpackage.emyl
            public final Object get() {
                caly calyVar = caly.this;
                bdmq bdmqVar = (bdmq) calyVar.f.b();
                final MessageIdType messageIdType2 = messageIdType;
                MessageCoreData v = bdmqVar.v(messageIdType2);
                if (v == null) {
                    return false;
                }
                ConversationIdType z = v.z();
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("markMessageForManualUnencryptedResending");
                buxrVar.al();
                buxrVar.C(0);
                buxrVar.Y(new Function() { // from class: cals
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        engw engwVar = caly.a;
                        buxzVar.q(MessageIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (v.cm()) {
                    buxrVar.D(-1L);
                }
                return Boolean.valueOf(((bdmq) calyVar.f.b()).S(buxrVar.b(), z, messageIdType2));
            }
        })).booleanValue();
    }

    public final void l(final ConversationIdType conversationIdType, final int i, caqc caqcVar) {
        ekzz f = eleg.f("EtouffeeDatabaseOperationsImpl#updateDraftDefaultEncryptionForAllIdentities");
        try {
            int i2 = 1;
            if (this.t.a()) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                int intValue = ((Integer) this.o.c("updateDraftDefaultEncryptionForAllIdentities", new emyl() { // from class: calf
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        engw engwVar = caly.a;
                        bsob e = bsom.e();
                        e.z("updateDraftDefaultEncryptionForAllIdentities-query");
                        final ConversationIdType conversationIdType2 = ConversationIdType.this;
                        e.i(new Function() { // from class: caln
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                engw engwVar2 = caly.a;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        engw y = e.b().y();
                        int i3 = ((enou) y).c;
                        if (i3 != 1) {
                            return Integer.valueOf(i3);
                        }
                        int i4 = i;
                        bseh bsehVar = (bseh) y.get(0);
                        if (bsehVar.l() != i4) {
                            atomicBoolean.getAndSet(true);
                        }
                        cfmh I = bsehVar.I();
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("updateDraftDefaultEncryption-conversations#update1");
                        bsoeVar.q(i4);
                        if (i4 == 1) {
                            bsoeVar.y();
                            cfmh cfmhVar = cfmh.b;
                            cfmhVar.getClass();
                            bsoeVar.w(new cfmh(cfmhVar.d | I.d));
                        } else {
                            bsoeVar.w(cfmh.a);
                        }
                        bsoeVar.ad(new Function() { // from class: calo
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                engw engwVar2 = caly.a;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return Integer.valueOf(bsoeVar.b().e());
                    }
                })).intValue();
                emxf.l(intValue <= 1);
                if (intValue == 1) {
                    ((cbgf) this.p.b()).d(conversationIdType);
                } else {
                    i2 = intValue;
                }
                if (atomicBoolean.get()) {
                    m(conversationIdType);
                }
                if (caqcVar != caqc.DEFAULT && i2 > 0) {
                    ((akzt) this.r.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", caqcVar.u);
                }
            } else {
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("updateDraftDefaultEncryption-conversations#update1");
                bsoeVar.q(i);
                if (i == 1) {
                    bsoeVar.y();
                }
                bsoeVar.ad(new Function() { // from class: calg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        engw engwVar = caly.a;
                        bsolVar.q(ConversationIdType.this);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int e = bsoeVar.b().e();
                emxf.l(e <= 1);
                if (e == 1) {
                    ((cbgf) this.p.b()).d(conversationIdType);
                    m(conversationIdType);
                } else {
                    i2 = e;
                }
                if (caqcVar != caqc.DEFAULT && i2 > 0) {
                    ((akzt) this.r.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", caqcVar.u);
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
}
