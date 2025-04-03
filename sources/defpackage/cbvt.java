package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbvt implements cbur, cbup, cbuu, cbuo, cbun, cbuq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final cqoh f;
    public final ffbr g;
    public final azze h;
    public final bdvi i;
    public final dtuu j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final errl n;
    private final ffbr o;
    private final cpbw p;
    private final akzt q;
    private final cbgf r;
    private final byzp s;
    private final Optional t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;

    public cbvt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cpbw cpbwVar, cqoh cqohVar, akzt akztVar, ffbr ffbrVar5, cbgf cbgfVar, azze azzeVar, bdvi bdviVar, dtuu dtuuVar, byzp byzpVar, Optional optional, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, errl errlVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.o = ffbrVar4;
        this.p = cpbwVar;
        this.f = cqohVar;
        this.q = akztVar;
        this.g = ffbrVar5;
        this.r = cbgfVar;
        this.h = azzeVar;
        this.i = bdviVar;
        this.j = dtuuVar;
        this.s = byzpVar;
        this.t = optional;
        this.u = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
        this.n = errlVar;
        this.v = ffbrVar10;
        this.w = ffbrVar11;
    }

    private final void p(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        engw engwVar;
        aztg e = ((bdtd) this.g.b()).e();
        long g = ((bczy) this.d.b()).g(conversationIdType);
        Optional empty = Optional.empty();
        ParticipantsTable.BindData a2 = bindData != null ? bindData : e.a();
        if (bindData != null) {
            engwVar = engw.r(bindData);
        } else {
            int i = engw.d;
            engwVar = enou.a;
        }
        k(empty, conversationIdType, e, a2, engwVar, 245, this.f.f().toEpochMilli(), g, str);
    }

    @Override // defpackage.cbun
    public final elfl a(final ConversationIdType conversationIdType, final aqux aquxVar) {
        return elfo.g(new Callable() { // from class: cbvj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cbvt cbvtVar = cbvt.this;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final aqux aquxVar2 = aquxVar;
                cbvtVar.j.d("TombstoneInserter#insertActiveSelfIdentityChangedTombstone", new Runnable() { // from class: cbuz
                    @Override // java.lang.Runnable
                    public final void run() {
                        cbvt cbvtVar2 = cbvt.this;
                        bdmq bdmqVar = (bdmq) cbvtVar2.e.b();
                        ConversationIdType conversationIdType3 = conversationIdType2;
                        MessageCoreData o = bdmqVar.o(conversationIdType3);
                        if (o != null && o.k() == 259) {
                            int a2 = ((cgpv) cbvtVar2.l.b()).a(o.B());
                            ensk h = cbvt.a.h();
                            h.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstone", 1477, "TombstoneInserter.java")).r("Deleted %s active self identity tombstones", a2);
                        }
                        aqux aquxVar3 = aquxVar2;
                        aztg f = ((bdtd) cbvtVar2.g.b()).f(aquxVar3.g());
                        if (f == null) {
                            ensk j = cbvt.a.j();
                            j.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstone", 1505, "TombstoneInserter.java")).t("Skipped inserting self identity changed tombstone, no subscription for %s", aquxVar3);
                            return;
                        }
                        Optional of = Optional.of(aquxVar3);
                        ParticipantsTable.BindData a3 = f.a();
                        int i = engw.d;
                        MessageCoreData j2 = cbvtVar2.j(of, conversationIdType3, f, a3, enou.a, 259, cbvtVar2.f.f().toEpochMilli(), ((bczy) cbvtVar2.d.b()).g(conversationIdType3));
                        if (j2 != null) {
                            ensk h2 = cbvt.a.h();
                            h2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstone", 1498, "TombstoneInserter.java")).t("Inserted active self identity tombstone %s", j2.B());
                        } else {
                            ensk j3 = cbvt.a.j();
                            j3.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertActiveSelfIdentityChangedTombstone", 1502, "TombstoneInserter.java")).q("Failed to insert active self identity tombstone");
                        }
                    }
                });
                return true;
            }
        }, this.n);
    }

    @Override // defpackage.cbuo
    public final void b(final ConversationIdType conversationIdType, cuef cuefVar, final cuea cueaVar) {
        int i;
        final aztg e = ((bdtd) this.g.b()).e();
        final long g = ((bczy) this.d.b()).g(conversationIdType);
        switch (cuefVar.ordinal()) {
            case 1:
                i = 256;
                break;
            case 2:
                i = 258;
                break;
            case 3:
                i = PrivateKeyType.INVALID;
                break;
            case 4:
                i = 257;
                break;
            case 5:
                i = 262;
                break;
            case 6:
                i = 263;
                break;
            default:
                i = 0;
                break;
        }
        final int i2 = i;
        if (i2 == 0) {
            return;
        }
        final Optional empty = Optional.empty();
        final ParticipantsTable.BindData a2 = e.a();
        final long epochMilli = this.f.f().toEpochMilli();
        efbd.b();
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.p, conversationIdType);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertOrUpdateSubscriptionTombstoneInternal", 312, "TombstoneInserter.java")).r("Inserting tombstone with type: %d", i2);
    }

    @Override // defpackage.cbup
    public final void c(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        p(conversationIdType, bindData, str);
    }

    @Override // defpackage.cbup
    public final void d(ConversationIdType conversationIdType, String str) {
        p(conversationIdType, null, str);
    }

    @Override // defpackage.cbuq
    public final void e(ConversationIdType conversationIdType, boolean z, engw engwVar, Instant instant, aqux aquxVar) {
        int h = h(true, conversationIdType, z, Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: cbvb
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
                enru enruVar = cbvt.a;
                return ((ResolvedRecipient) obj).g().A();
            }
        }), engwVar.size(), aquxVar != null ? aquxVar.b() : -1);
        emxf.l(h != 0);
        o(Optional.ofNullable(aquxVar), conversationIdType, (List) Collection.EL.stream(engwVar).map(new Function() { // from class: cbvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = cbvt.a;
                return ((aqkx) ((ResolvedRecipient) obj)).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a), h, instant.toEpochMilli());
    }

    @Override // defpackage.cbur
    public final void f(final ConversationIdType conversationIdType, final String str) {
        final aztg e = ((bdtd) this.g.b()).e();
        this.j.d("TombstoneInserter#insertLocalGroupRenameTombstone", new Runnable() { // from class: cbuw
            @Override // java.lang.Runnable
            public final void run() {
                aztg aztgVar = e;
                Optional empty = Optional.empty();
                ParticipantsTable.BindData a2 = aztgVar.a();
                int i = engw.d;
                engw engwVar = enou.a;
                cbvt cbvtVar = cbvt.this;
                cbvtVar.k(empty, conversationIdType, aztgVar, a2, engwVar, 211, cbvtVar.f.f().toEpochMilli(), -1L, str);
            }
        });
    }

    @Override // defpackage.cbuu
    public final elfl g(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId, final Optional optional) {
        return elfo.g(new Callable() { // from class: cbvr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cbvt cbvtVar = cbvt.this;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                final Optional optional2 = optional;
                cbvtVar.j.d("TombstoneInserter#onRbmSimChange", new Runnable() { // from class: cbuy
                    @Override // java.lang.Runnable
                    public final void run() {
                        cbvt cbvtVar2 = cbvt.this;
                        bdmq bdmqVar = (bdmq) cbvtVar2.e.b();
                        ConversationIdType conversationIdType3 = conversationIdType2;
                        MessageCoreData o = bdmqVar.o(conversationIdType3);
                        if (o != null && o.di()) {
                            ((cgpv) cbvtVar2.l.b()).a(o.B());
                        }
                        SelfIdentityId selfIdentityId3 = selfIdentityId2;
                        List L = ((bczy) cbvtVar2.d.b()).L(conversationIdType3);
                        long g = ((bczy) cbvtVar2.d.b()).g(conversationIdType3);
                        aztg d = ((bdtd) cbvtVar2.g.b()).d(selfIdentityId3);
                        if (d == null) {
                            return;
                        }
                        cbvtVar2.k(optional2, conversationIdType3, d, d.a(), L, 240, cbvtVar2.f.f().toEpochMilli(), g, String.format(Locale.ENGLISH, "%d (%s) ", Integer.valueOf(d.c()), d.h()));
                    }
                });
                return null;
            }
        }, this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(boolean r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, boolean r7, boolean r8, int r9, int r10) {
        /*
            r4 = this;
            defpackage.csix.h()
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 205(0xcd, float:2.87E-43)
            r2 = 1
            if (r5 == 0) goto L40
            if (r7 == 0) goto L31
            if (r9 > r2) goto L2e
            ffbr r5 = r4.c
            java.lang.Object r5 = r5.b()
            azwh r5 = (defpackage.azwh) r5
            bcyk r5 = r5.a(r6)
            if (r5 == 0) goto L26
            boolean r5 = r5.W()
            if (r5 != 0) goto L23
            goto L26
        L23:
            r5 = 241(0xf1, float:3.38E-43)
            return r5
        L26:
            if (r8 == 0) goto L2b
            r5 = 242(0xf2, float:3.39E-43)
            return r5
        L2b:
            r5 = 207(0xcf, float:2.9E-43)
            return r5
        L2e:
            r5 = 203(0xcb, float:2.84E-43)
            return r5
        L31:
            if (r9 <= r2) goto L3d
            cpbw r5 = r4.p
            boolean r5 = r5.d(r10)
            if (r5 == 0) goto L3c
            return r0
        L3c:
            return r1
        L3d:
            r5 = 206(0xce, float:2.89E-43)
            return r5
        L40:
            r5 = 0
            if (r7 != 0) goto Lb1
            if (r9 <= r2) goto Lb1
            cpbw r7 = r4.p
            boolean r7 = r7.d(r10)
            ffbr r8 = r4.e
            java.lang.Object r8 = r8.b()
            bdmq r8 = (defpackage.bdmq) r8
            java.lang.String r9 = "MessageDatabaseOperations#getLatestOutgoingOrTombstoneMessageForConversation"
            ekzz r9 = defpackage.eleg.f(r9)
            java.lang.String[] r10 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a     // Catch: java.lang.Throwable -> La7
            buxz r10 = new buxz     // Catch: java.lang.Throwable -> La7
            r10.<init>()     // Catch: java.lang.Throwable -> La7
            r10.m(r6)     // Catch: java.lang.Throwable -> La7
            r6 = 2
            java.util.function.Function[] r6 = new java.util.function.Function[r6]     // Catch: java.lang.Throwable -> La7
            bdkb r3 = new bdkb     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            r6[r5] = r3     // Catch: java.lang.Throwable -> La7
            bdkc r3 = new bdkc     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            r6[r2] = r3     // Catch: java.lang.Throwable -> La7
            r10.b(r6)     // Catch: java.lang.Throwable -> La7
            buxs r6 = new buxs     // Catch: java.lang.Throwable -> La7
            r6.<init>(r10)     // Catch: java.lang.Throwable -> La7
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = r8.m(r6)     // Catch: java.lang.Throwable -> La7
            r9.close()
            if (r6 != 0) goto L89
            if (r7 != 0) goto L88
            return r1
        L88:
            return r0
        L89:
            int r8 = r6.d()
            if (r8 != r2) goto L96
            if (r7 != 0) goto L94
            r7 = 209(0xd1, float:2.93E-43)
            goto L9f
        L94:
            r7 = r2
            goto L97
        L96:
            r2 = r8
        L97:
            if (r2 != 0) goto L9e
            if (r7 == 0) goto L9e
            r7 = 208(0xd0, float:2.91E-43)
            goto L9f
        L9e:
            r7 = r5
        L9f:
            int r6 = r6.k()
            if (r6 != r7) goto La6
            return r5
        La6:
            return r7
        La7:
            r5 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r6 = move-exception
            r5.addSuppressed(r6)
        Lb0:
            throw r5
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbvt.h(boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, int, int):int");
    }

    public final MessageCoreData i(Optional optional, ConversationIdType conversationIdType, aztg aztgVar, ParticipantsTable.BindData bindData, int i, long j, String str, boolean z, boolean z2) {
        MessageCoreData p = this.s.p((String) optional.map(new Function() { // from class: cbvs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = cbvt.a;
                return ((aqux) obj).g().b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(bindData.S()), (SelfIdentityId) optional.map(new Function() { // from class: cbux
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aqux) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(aztgVar.g()), conversationIdType, i, j, str);
        if (z) {
            p.bB(false);
        }
        if (z2) {
            p.by();
        }
        ((bdjr) this.u.b()).a(p);
        this.q.e("Bugle.Tombstone.Generated", i);
        return p;
    }

    public final MessageCoreData j(final Optional optional, final ConversationIdType conversationIdType, final aztg aztgVar, final ParticipantsTable.BindData bindData, final List list, final int i, final long j, final long j2) {
        csix.h();
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.p, conversationIdType);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertTombstone", 270, "TombstoneInserter.java")).r("Inserting tombstone with type: %d", i);
        return (MessageCoreData) this.j.c("TombstoneInserter#insertTombstone", new emyl() { // from class: cbva
            @Override // defpackage.emyl
            public final Object get() {
                return cbvt.this.k(optional, conversationIdType, aztgVar, bindData, list, i, j, j2, null);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0253, code lost:
    
        if (r22.S().equals(r6.aA()) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0147, code lost:
    
        if (((java.lang.Integer) r10.get(0)).intValue() == 264) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData k(j$.util.Optional r19, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r20, defpackage.aztg r21, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r22, java.util.List r23, int r24, long r25, long r27, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbvt.k(j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aztg, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, java.util.List, int, long, long, java.lang.String):com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData");
    }

    public final void l(aztg aztgVar, long j, ConversationIdType conversationIdType, long j2, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aztgVar.a());
        j(Optional.empty(), conversationIdType, aztgVar, aztgVar.a(), arrayList, i, j, j2);
    }

    public final void m(final ConversationIdType conversationIdType, final int i, final long j) {
        this.t.ifPresent(new Consumer() { // from class: cbvd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cbvu cbvuVar = (cbvu) obj;
                bseh r = ((bczy) cbvt.this.d.b()).r(conversationIdType);
                if (r == null) {
                    return;
                }
                cpxu M = r.M();
                if (M.d()) {
                    return;
                }
                cbvuVar.a(M, i, j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void n(ConversationIdType conversationIdType, long j, MessageCoreData messageCoreData, ParticipantsTable.BindData bindData) {
        byyt s = ((bczy) this.d.b()).s(conversationIdType);
        if (s == null) {
            s = byyt.UNARCHIVED;
        }
        byyt byytVar = s;
        int k = messageCoreData.k();
        if (!bdjs.g(k) && k != 234 && k != 233 && k != 252 && k != 210 && k != 208 && k != 245) {
            bdfl bdflVar = (bdfl) this.o.b();
            MessageIdType B = messageCoreData.B();
            Long valueOf = Long.valueOf(messageCoreData.o());
            csix.h();
            bdflVar.h(conversationIdType, B, valueOf, byytVar, null, true, j, null, null);
        }
        this.i.c(conversationIdType, bindData, messageCoreData);
    }

    public final void o(Optional optional, ConversationIdType conversationIdType, List list, int i, long j) {
        aztg e = ((bdtd) this.g.b()).e();
        j(optional, conversationIdType, e, e.a(), list, i, j, -1L);
    }
}
