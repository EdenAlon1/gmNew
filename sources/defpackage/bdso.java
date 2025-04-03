package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdso {
    public static final entd a = entd.c("BugleDataModel");
    public static final cskc b = cskc.g("Bugle", "UpdateBugleParticipantAndConversations");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final dtuu f;
    public final fazb g;
    public final fazb h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    private final ffbr o;
    private final ffbr p;

    public bdso(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, dtuu dtuuVar, ffbr ffbrVar5, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        this.o = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = dtuuVar;
        this.p = ffbrVar5;
        this.g = fazbVar;
        this.h = fazbVar2;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
    }

    public final int a(bvvr bvvrVar, bdsp bdspVar) {
        return ((Boolean) ((cfup) bdrs.b.get()).e()).booleanValue() ? ((bdrv) this.p.b()).b(bvvrVar, bdspVar) : ((Boolean) ((cfup) bdrs.a.get()).e()).booleanValue() ? ((bdrv) this.p.b()).a(bvvrVar.b()) : bvvrVar.b().e();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoku, java.lang.Object] */
    public final void b(final ParticipantsTable.BindData bindData, final ConversationIdType conversationIdType) {
        final Optional of;
        ekzz f = eleg.f("UpdateBugleParticipantAndConversations.updateBugleParticipantToMoreCanonicalAndCompareAddress");
        try {
            aoku t = ((aolr) this.o.b()).t(bindData);
            if (t.z()) {
                of = Optional.of(t);
            } else {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "createMessagingIdentityFromE164", 379, "UpdateBugleParticipantAndConversations.java")).t("Input was not E164 %s, skipping the Bugle participant update", cskt.b(t.n()));
                of = Optional.empty();
            }
            if (!of.isEmpty()) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateBugleParticipantToMoreCanonicalAndCompareAddress", 345, "UpdateBugleParticipantAndConversations.java")).t("Verifying whether the Bugle participant can be updated to E164 %s", cskt.b(of.get().n()));
                final bdsn bdsnVar = (bdsn) this.f.c("UpdateBugleParticipantAndConversations#updateBugleParticipantToMoreCanonicalAndCompareAddress", new emyl() { // from class: bdsk
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x008e A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x008f  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [aoku, java.lang.Object] */
                    @Override // defpackage.emyl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 533
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdsk.get():java.lang.Object");
                    }
                });
                if (bdsnVar != null) {
                    this.f.d("UpdateBugleParticipantAndConversations#updateParticipantInConversations", new Runnable() { // from class: bdrx
                        @Override // java.lang.Runnable
                        public final void run() {
                            ParticipantsTable.BindData bindData2;
                            bdsn bdsnVar2 = bdsnVar;
                            ParticipantsTable.BindData a2 = bdsnVar2.a();
                            ParticipantsTable.BindData b2 = bdsnVar2.b();
                            final String c = bdsnVar2.c();
                            String S = a2.S();
                            String W = a2.W();
                            ConversationIdType conversationIdType2 = conversationIdType;
                            if (W == null) {
                                ensz enszVar = (ensz) bdso.a.h();
                                enszVar.Y(csux.o, conversationIdType2.toString());
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 217, "UpdateBugleParticipantAndConversations.java")).q("Existing participant's send destination is null.");
                                return;
                            }
                            final bdso bdsoVar = bdso.this;
                            if (c.equals(S)) {
                                bindData2 = b2;
                            } else {
                                ensz enszVar2 = (ensz) bdso.a.h();
                                enszVar2.Y(csux.m, S);
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 226, "UpdateBugleParticipantAndConversations.java")).t("Updating the Bugle participant in all conversations to participant id %s", c);
                                if (S.equals(c)) {
                                    throw new IllegalArgumentException("Old participant id cannot be the same as the new participant id");
                                }
                                ekzz f2 = eleg.f("UpdateBugleParticipantAndConversations#updateParticipantForAlLConversations");
                                try {
                                    efbd.b();
                                    final long parseLong = Long.parseLong(S);
                                    final long parseLong2 = Long.parseLong(c);
                                    final enin eninVar = new enin();
                                    bindData2 = b2;
                                    enip enipVar = (enip) bdsoVar.f.c("UpdateBugleParticipantAndConversations#replaceParticipantsAndGetConversationIds", new emyl() { // from class: bdsl
                                        @Override // defpackage.emyl
                                        public final Object get() {
                                            enip enipVar2;
                                            String[] strArr = bsdr.a;
                                            bsdi bsdiVar = new bsdi();
                                            bsdiVar.f("replaceParticipantInAllGroupConversations");
                                            final long j = parseLong;
                                            bsdiVar.c(new Function() { // from class: bdsm
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    bsdq bsdqVar = (bsdq) obj;
                                                    entd entdVar = bdso.a;
                                                    bsdqVar.f(j);
                                                    return bsdqVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            final bsdp bsdpVar = (bsdp) bsdiVar.b().b;
                                            engw engwVar = (engw) bsdr.a().r("conversation_to_participants-deleteAndReturnDeletedRows-txn", new emyl() { // from class: bsca
                                                @Override // defpackage.emyl
                                                public final Object get() {
                                                    String[] strArr2 = bsdr.a;
                                                    bsdm bsdmVar = new bsdm(bsdr.a);
                                                    bsdp bsdpVar2 = bsdp.this;
                                                    bsdmVar.k(bsdpVar2);
                                                    bsdmVar.z("conversation_to_participants-deleteAndReturnDeletedRows-query");
                                                    engw y = bsdmVar.b().y();
                                                    bsdi bsdiVar2 = new bsdi();
                                                    bsdiVar2.b = bsdpVar2;
                                                    bsdiVar2.f("conversation_to_participants-deleteAndReturnDeletedRows-delete");
                                                    bsdiVar2.b().b();
                                                    return y;
                                                }
                                            });
                                            final bdso bdsoVar2 = bdso.this;
                                            final long j2 = parseLong2;
                                            Iterable$EL.forEach(engwVar, new Consumer() { // from class: bdry
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj) {
                                                    bscj bscjVar = (bscj) obj;
                                                    boolean a3 = ((aswc) bdso.this.n.b()).a();
                                                    long j3 = j2;
                                                    if (!a3) {
                                                        String[] strArr2 = bsdr.a;
                                                        bsco bscoVar = new bsco();
                                                        bscoVar.d(bscjVar.m());
                                                        bscoVar.f(j3);
                                                        bscoVar.e(bscjVar.n());
                                                        bscoVar.g(bscjVar.l());
                                                        bscoVar.c();
                                                        return;
                                                    }
                                                    String[] strArr3 = bsdr.a;
                                                    bsco bscoVar2 = new bsco();
                                                    bscoVar2.d(bscjVar.m());
                                                    bscoVar2.f(j3);
                                                    bscoVar2.e(bscjVar.n());
                                                    bscoVar2.g(bscjVar.l());
                                                    bscj a4 = bscoVar2.a();
                                                    final dtve a5 = bsdr.a();
                                                    dtub.b(bsdr.a(), "conversation_to_participants", a4, new Function() { // from class: bsce
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            return Long.valueOf(dtve.this.T("conversation_to_participants", (ContentValues) obj2, 5));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: bscf
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void o(Object obj2) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            Iterable iterable = (Iterable) Collection.EL.stream(engwVar).map(new Function() { // from class: bdrz
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return ((bscj) obj).m();
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }).collect(endq.b);
                                            enin eninVar2 = eninVar;
                                            eninVar2.j(iterable);
                                            if (((aswc) bdsoVar2.n.b()).a()) {
                                                brwt b3 = brww.b();
                                                b3.ap("replaceParticipantInAllConversations");
                                                b3.c(j2);
                                                b3.e(new Function() { // from class: bdsg
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        brwv brwvVar = (brwv) obj;
                                                        entd entdVar = bdso.a;
                                                        brwvVar.c(j);
                                                        return brwvVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                final brws b4 = b3.b();
                                                final int i = 5;
                                                enipVar2 = (enip) Collection.EL.stream((engw) brww.c().r("conversation_participants.updateAndReturnUpdatedRows-txn", new emyl() { // from class: brwq
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.emyl
                                                    public final Object get() {
                                                        brwp a3 = brww.a();
                                                        a3.z("conversation_participants.updateAndReturnUpdatedRows-query");
                                                        brws brwsVar = brws.this;
                                                        engw engwVar2 = brwsVar.e;
                                                        int i2 = ((enou) engwVar2).c;
                                                        for (int i3 = 0; i3 < i2; i3++) {
                                                            a3.k((brwu) ((duap) engwVar2.get(i3)));
                                                        }
                                                        if (((dtrm) brwsVar.d).b) {
                                                            brwv brwvVar = new brwv();
                                                            brwvVar.as(brwsVar.h());
                                                            a3.d(brwvVar);
                                                        }
                                                        if (((dtrm) brwsVar.d).c) {
                                                            a3.r();
                                                        }
                                                        Integer num = i;
                                                        engw y = a3.b().y();
                                                        num.intValue();
                                                        brwsVar.t(5);
                                                        return y;
                                                    }
                                                })).map(new Function() { // from class: bdsh
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        return ((brvg) obj).l();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.b);
                                            } else {
                                                brwt b5 = brww.b();
                                                b5.ap("replaceParticipantInAllConversations");
                                                b5.c(j2);
                                                b5.e(new Function() { // from class: bdsi
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        brwv brwvVar = (brwv) obj;
                                                        entd entdVar = bdso.a;
                                                        brwvVar.c(j);
                                                        return brwvVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                final brws b6 = b5.b();
                                                enipVar2 = (enip) Collection.EL.stream((engw) brww.c().r("updateAndReturnUpdatedRowsAfterUpdate-txn-conversation_participants", new emyl() { // from class: brwr
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // defpackage.emyl
                                                    public final Object get() {
                                                        brwp a3 = brww.a();
                                                        a3.z("updateAndReturnUpdatedRowsAfterUpdate-pre-conversation_participants");
                                                        a3.u();
                                                        a3.n(new dtzq("ROWID", new Object[0]), "_rowid");
                                                        brws brwsVar = brws.this;
                                                        engw engwVar2 = brwsVar.e;
                                                        int i2 = ((enou) engwVar2).c;
                                                        for (int i3 = 0; i3 < i2; i3++) {
                                                            a3.k((brwu) ((duap) engwVar2.get(i3)));
                                                        }
                                                        if (((dtrm) brwsVar.d).b) {
                                                            brwv brwvVar = new brwv();
                                                            brwvVar.as(brwsVar.h());
                                                            a3.d(brwvVar);
                                                        }
                                                        engr engrVar = new engr();
                                                        brwa brwaVar = (brwa) a3.b().o();
                                                        while (brwaVar.moveToNext()) {
                                                            try {
                                                                engrVar.h(brwaVar.dd("_rowid"));
                                                            } catch (Throwable th) {
                                                                try {
                                                                    brwaVar.close();
                                                                } catch (Throwable th2) {
                                                                    th.addSuppressed(th2);
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        brwaVar.close();
                                                        String str = (String) Collection.EL.stream(engrVar.g()).collect(Collectors.joining(","));
                                                        brwsVar.e();
                                                        brwp a4 = brww.a();
                                                        a4.z("updateAndReturnUpdatedRowsAfterUpdate-post-conversation_participants");
                                                        brwv brwvVar2 = new brwv();
                                                        brwvVar2.as(new dtzq("ROWID IN ($R)", new Object[]{str}));
                                                        a4.d(brwvVar2);
                                                        return ((brwa) a4.b().o()).cW();
                                                    }
                                                })).map(new Function() { // from class: bdsh
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        return ((brvg) obj).l();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.b);
                                            }
                                            eninVar2.j(enipVar2);
                                            enip g = eninVar2.g();
                                            csjb a3 = bdso.b.a();
                                            a3.I("Conversations with replaced participants");
                                            a3.I(g);
                                            a3.r();
                                            return g;
                                        }
                                    });
                                    f2.close();
                                    if (!enipVar.isEmpty()) {
                                        ((akzt) bdsoVar.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantInConversations");
                                    }
                                    if (enipVar.isEmpty()) {
                                        ensz enszVar3 = (ensz) bdso.a.h();
                                        enszVar3.Y(csux.m, c);
                                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 244, "UpdateBugleParticipantAndConversations.java")).t("No conversation ids with existing participant %s found", S);
                                        return;
                                    }
                                    ParticipantsTable.BindData b3 = ((bdrr) bdsoVar.e.b()).b(c);
                                    if (b3 == null) {
                                        ensz enszVar4 = (ensz) bdso.a.h();
                                        enszVar4.Y(csux.m, c);
                                        enszVar4.Y(csux.o, conversationIdType2.toString());
                                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 259, "UpdateBugleParticipantAndConversations.java")).q("Found or created participant' is null.");
                                        return;
                                    }
                                    ((bczy) bdsoVar.c.b()).Z(enipVar, b3);
                                    ((bczy) bdsoVar.c.b()).Y(enipVar, c, S);
                                    for (bdqe bdqeVar : (Set) ((bdqf) bdsoVar.h.b()).a.b()) {
                                        ekzz b4 = bdqeVar.b();
                                        try {
                                            bdqeVar.d();
                                            if (b4 != null) {
                                                b4.close();
                                            }
                                        } finally {
                                        }
                                    }
                                    bdsoVar.f.g(new dtut() { // from class: bdsa
                                        @Override // defpackage.dtut
                                        public final ekzz a() {
                                            entd entdVar = bdso.a;
                                            return eleg.f("UBPAC::afterParticipantInConversationChanged::runAfterCommit");
                                        }
                                    }, "UpdateBugleParticipantAndConversations#afterParticipantInConversationChanged", new Runnable() { // from class: bdsb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            for (bdqe bdqeVar2 : (Set) ((bdqf) bdso.this.h.b()).a.b()) {
                                                ekzz a3 = bdqeVar2.a();
                                                try {
                                                    bdqeVar2.c();
                                                    if (a3 != null) {
                                                        a3.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (a3 != null) {
                                                        try {
                                                            a3.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                    });
                                } finally {
                                }
                            }
                            if (W.equals(bindData2.W())) {
                                return;
                            }
                            String W2 = bindData.W();
                            W2.getClass();
                            bdsp bdspVar = bdsp.c;
                            bvvr f3 = ParticipantsTable.f();
                            f3.ap("updateSendDestinationForParticipantId");
                            f3.O(W2);
                            f3.V(new Function() { // from class: bdsj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bvvw bvvwVar = (bvvw) obj;
                                    entd entdVar = bdso.a;
                                    bvvwVar.k(c);
                                    return bvvwVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            if (bdsoVar.a(f3, bdspVar) == 1) {
                                ((akzt) bdsoVar.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                                ((ensz) ((ensz) bdso.a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateSendDestinationForParticipantId", 554, "UpdateBugleParticipantAndConversations.java")).t("Successfully updated the Bugle participant to E164 %s", cskt.b(W2));
                            }
                            for (bdqm bdqmVar : (Set) ((bdqn) bdsoVar.g.b()).a.b()) {
                                ekzz b5 = bdqmVar.b();
                                try {
                                    bdqmVar.d();
                                    if (b5 != null) {
                                        b5.close();
                                    }
                                } finally {
                                }
                            }
                            bdsoVar.f.g(new dtut() { // from class: bdsc
                                @Override // defpackage.dtut
                                public final ekzz a() {
                                    entd entdVar = bdso.a;
                                    return eleg.f("UBPAC::afterParticipantSendDestinationUpdated::runAfterCommit");
                                }
                            }, "UpdateBugleParticipantAndConversations#afterParticipantSendDestinationUpdated", new Runnable() { // from class: bdsd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (bdqm bdqmVar2 : (Set) ((bdqn) bdso.this.g.b()).a.b()) {
                                        ekzz a3 = bdqmVar2.a();
                                        try {
                                            bdqmVar2.c();
                                            if (a3 != null) {
                                                a3.close();
                                            }
                                        } catch (Throwable th) {
                                            if (a3 != null) {
                                                try {
                                                    a3.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            });
                        }
                    });
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ConversationIdType conversationIdType, List list, final bdsp bdspVar) {
        ekzz f = eleg.f("UpdateBugleParticipantAndConversations#updateSendDestinationsForConversationParticipants");
        try {
            csix.h();
            List L = ((bczy) this.c.b()).L(conversationIdType);
            cpn cpnVar = new cpn();
            enqv it = ((engw) L).iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                String U = bindData.U();
                if (U != null) {
                    cpnVar.put(U, bindData);
                }
            }
            final ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                String U2 = bindData2.U();
                if (U2 != null) {
                    ParticipantsTable.BindData bindData3 = (ParticipantsTable.BindData) cpnVar.get(U2);
                    if (!bdtd.m(bindData2)) {
                        enru enruVar = bdqu.a;
                        if (bindData3 == null || !TextUtils.equals(bindData2.U(), bindData3.U()) || !TextUtils.equals(bindData2.W(), bindData3.W())) {
                            arrayList.add(bindData2);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                csjb c = b.c();
                c.I("Updating send destinations participants.");
                c.L("participantSendDiff", arrayList);
                c.c(conversationIdType);
                c.r();
                this.f.d("UpdateBugleParticipantAndConversations#updateSendDestinationsForParticipants", new Runnable() { // from class: bdse
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (ParticipantsTable.BindData bindData4 : arrayList) {
                            bdsp bdspVar2 = bdspVar;
                            bdso bdsoVar = bdso.this;
                            final String U3 = bindData4.U();
                            U3.getClass();
                            bvvr f2 = ParticipantsTable.f();
                            f2.ap("updateParticipantSendDestination");
                            f2.O(bindData4.W());
                            f2.V(new Function() { // from class: bdsf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bvvw bvvwVar = (bvvw) obj;
                                    entd entdVar = bdso.a;
                                    bvvwVar.w(-2);
                                    String[] strArr = ParticipantsTable.a;
                                    bvvw bvvwVar2 = new bvvw();
                                    bvvwVar2.r(U3);
                                    bvvwVar.ar(bvvwVar2);
                                    return bvvwVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int a2 = bdsoVar.a(f2, bdspVar2);
                            if (a2 == 1) {
                                ((akzt) bdsoVar.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                                a2 = 1;
                            }
                            ((bdrr) bdsoVar.e.b()).p(a2, a2 != 1 ? "Failed to update participant's send destination." : "Successfully updated participant's send destination.");
                        }
                    }
                });
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
