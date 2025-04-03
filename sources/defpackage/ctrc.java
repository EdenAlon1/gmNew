package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrc implements ctqh {
    public final ffhd a;
    public final cqoh b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffsk f;
    private final ffhd g;
    private final dtuu h;

    public ctrc(ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, ffhd ffhdVar2, cqoh cqohVar, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        ffhdVar2.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        dtuuVar.getClass();
        ffbrVar2.getClass();
        this.e = ffskVar;
        this.a = ffhdVar;
        this.f = ffskVar2;
        this.g = ffhdVar2;
        this.b = cqohVar;
        this.c = ffbrVar;
        this.h = dtuuVar;
        this.d = ffbrVar2;
    }

    private static final engw t(bvhg bvhgVar) {
        efbd.b();
        bvhd a = bvhn.a();
        a.z("+getP2pSmartSuggestionItemSuggestions");
        a.k(bvhgVar);
        dtsu o = a.b().o();
        try {
            bvgp bvgpVar = (bvgp) o;
            int i = engw.d;
            engr engrVar = new engr();
            while (bvgpVar.moveToNext()) {
                dtro cO = bvgpVar.cO();
                cO.getClass();
                engrVar.h(bdut.a((bvfs) cO));
            }
            engw g = engrVar.g();
            g.getClass();
            ffig.a(o, null);
            return g;
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final elfl a(ConversationIdType conversationIdType, String str, fbre fbreVar) {
        elfl c;
        fbreVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new ctra(this, conversationIdType, str, fbreVar, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ctqh
    public final engw b(final MessageIdType messageIdType) {
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getClassificationsByMessageId");
        try {
            efbd.b();
            btvs a = btvy.a();
            a.z("getClassificationsByMessageId");
            a.c(new Function() { // from class: ctqm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btvx btvxVar = (btvx) obj;
                    btvxVar.aq(new dtrw("message_classifications_table.message_id", 3, btvx.at((Iterable) DesugarArrays.stream(new MessageIdType[]{MessageIdType.this}).map(new Function() { // from class: btvw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return String.valueOf(bdhb.a((MessageIdType) obj2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new btvv()))), true));
                    return btvxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dtsu o = a.b().o();
            try {
                engw cW = ((btvh) o).cW();
                cW.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(cW, 10));
                enqv it = cW.iterator();
                while (it.hasNext()) {
                    arrayList.add(((btus) it.next()).k());
                }
                engw a2 = engq.a(arrayList);
                ffig.a(o, null);
                ffig.a(f, null);
                return a2;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final engw c(MessageIdType messageIdType) {
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getSmartSuggestionsByMessageId");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.i(messageIdType);
            bvhmVar.f(bduu.a);
            engw t = t(new bvhg(bvhmVar));
            ffig.a(f, null);
            return t;
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final engw d(MessageIdType messageIdType) {
        messageIdType.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getSmartSuggestionsByMessageId");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.i(messageIdType);
            engw t = t(new bvhg(bvhmVar));
            ffig.a(f, null);
            return t;
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final Optional e(final MessageIdType messageIdType) {
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getShareImageConversationSuggestionByMessageId");
        try {
            efbd.b();
            buxo d = MessagesTable.d();
            d.z("getShareImageConversationSuggestionByMessageId");
            d.f(new Function() { // from class: ctqn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: ctqo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.q(MessageIdType.this);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buxm b = d.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.h(b);
            bvhmVar.e(fbri.RECENT_IMAGE);
            engw t = t(new bvhg(bvhmVar));
            Optional empty = ((enou) t).c != 1 ? Optional.empty() : Optional.of(t.get(0));
            ffig.a(f, null);
            return empty;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ctqh
    public final Optional f(String str) {
        str.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getSmartSuggestionBySuggestionId");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.c(str);
            engw t = t(new bvhg(bvhmVar));
            if (((enou) t).c > 1) {
                throw new IllegalStateException("Check failed.");
            }
            Optional empty = t.isEmpty() ? Optional.empty() : Optional.of(t.get(0));
            ffig.a(f, null);
            return empty;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ctqh
    public final Object g(ConversationIdType conversationIdType, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.g), new ctqt(null, this, conversationIdType), ffguVar);
    }

    @Override // defpackage.ctqh
    public final Object h(ConversationIdType conversationIdType, String str, fbre fbreVar, ffgu ffguVar) {
        Object a;
        return (str == null || str.length() == 0 || (a = ffra.a(ekxi.a(this.a), new ctqx(null, fbreVar, this, str, conversationIdType), ffguVar)) != ffhh.a) ? ffcu.a : a;
    }

    @Override // defpackage.ctqh
    public final List i(final ConversationIdType conversationIdType, long j) {
        conversationIdType.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getShareImageConversationSuggestionsByConversationId");
        try {
            efbd.b();
            buxo d = MessagesTable.d();
            d.z("getShareImageConversationSuggestionsByConversationId");
            d.f(new Function() { // from class: ctqk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((buum) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: ctql
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.m(ConversationIdType.this);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buxm b = d.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.h(b);
            bvhmVar.b(j);
            bvhmVar.e(fbri.RECENT_IMAGE);
            engw t = t(new bvhg(bvhmVar));
            ffig.a(f, null);
            return t;
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final List j(MessageIdType messageIdType) {
        messageIdType.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getShownSmartSuggestionsByMessageId");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.g(messageIdType);
            bvhmVar.aq(new dtrw("p2p_suggestions.suggestion_status", 3, bvhm.at((Iterable) enqc.a(ctmp.a).map(new Function() { // from class: bvhk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((fbrd) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new bvhj()))), true));
            engw t = t(new bvhg(bvhmVar));
            ffig.a(f, null);
            return t;
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final void k(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, ConversationIdType conversationIdType, final MessageIdType messageIdType, long j) {
        conversationIdType.getClass();
        messageIdType.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#addOrUpdateShareImageSuggestion");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhm bvhmVar = new bvhm();
            bvhmVar.g(messageIdType);
            bvhmVar.e(fbri.RECENT_IMAGE);
            if (t(new bvhg(bvhmVar)).isEmpty()) {
                engw r = engw.r(smartSuggestionItemSuggestionData.c);
                r.getClass();
                l(r, conversationIdType, messageIdType, j);
            } else {
                bvhf bvhfVar = new bvhf();
                bvhfVar.ap("addOrUpdateShareImageSuggestion");
                fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
                bvhfVar.a.put("suggestion", fbxaVar == null ? null : fbxaVar.toByteArray());
                bvhfVar.c(new Function() { // from class: ctqr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvhm bvhmVar2 = (bvhm) obj;
                        bvhmVar2.g(MessageIdType.this);
                        bvhmVar2.e(fbri.RECENT_IMAGE);
                        return bvhmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvhfVar.am();
                bvhfVar.b().e();
            }
            ffig.a(f, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ctqh
    public final void l(final List list, final ConversationIdType conversationIdType, final MessageIdType messageIdType, final long j) {
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#addSmartSuggestions");
        try {
            efbd.b();
            if (!dkta.a(list)) {
                this.h.d("SmartSuggestionDatabaseOperationsImpl#addSmartSuggestions", new Runnable() { // from class: ctqj
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageIdType messageIdType2;
                        Iterator it = list.iterator();
                        String str = null;
                        while (true) {
                            messageIdType2 = messageIdType;
                            if (!it.hasNext()) {
                                break;
                            }
                            fbxa fbxaVar = (fbxa) it.next();
                            String[] strArr = bvhn.a;
                            bvfx bvfxVar = new bvfx();
                            bvfxVar.g(messageIdType2);
                            fbwy fbwyVar = fbxaVar.e;
                            if (fbwyVar == null) {
                                fbwyVar = fbwy.b;
                            }
                            fbri b = fbri.b(fbwyVar.l);
                            if (b == null) {
                                b = fbri.UNRECOGNIZED;
                            }
                            long j2 = j;
                            bvfxVar.d(b);
                            bvfxVar.e(fbxaVar);
                            bvfxVar.c(j2);
                            bvfxVar.f(fbrd.RECEIVED);
                            final bvfs a = bvfxVar.a();
                            final dtve b2 = bvhn.b();
                            dtub.b(bvhn.b(), "p2p_suggestions", a, new Function() { // from class: bvfm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dtve.this.R("p2p_suggestions", (ContentValues) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bvfn
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    final Long l = (Long) obj;
                                    if (l.longValue() >= 0) {
                                        bvfs bvfsVar = bvfs.this;
                                        bvfsVar.a = (String) new dtuj() { // from class: bvfl
                                            @Override // defpackage.dtuj
                                            public final Object a() {
                                                return String.valueOf(l);
                                            }
                                        }.a();
                                        bvfsVar.fY(0);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            fbwy fbwyVar2 = fbxaVar.e;
                            fbri b3 = fbri.b((fbwyVar2 == null ? fbwy.b : fbwyVar2).l);
                            if (b3 == null) {
                                b3 = fbri.UNRECOGNIZED;
                            }
                            if (b3 == fbri.SCREEN_EFFECTS) {
                                if (fbwyVar2 == null) {
                                    fbwyVar2 = fbwy.b;
                                }
                                str = fbwyVar2.m;
                            }
                        }
                        ctrc ctrcVar = this;
                        if (((Boolean) ((cfup) czur.a.get()).e()).booleanValue() || ((Boolean) ((cfup) ctjd.bJ.get()).e()).booleanValue()) {
                            ((cbgf) ctrcVar.c.b()).l(conversationIdType, messageIdType2, new String[0]);
                        }
                        if (str != null) {
                            ayzs ayzsVar = (ayzs) ctrcVar.d.b();
                            if (ffkj.e(ayzsVar.f, bdhb.b(str))) {
                                ayzsVar.e.g(ayzs.a, null, null, ecrh.SUCCESS);
                            }
                        }
                    }
                });
            }
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final void m(final long j) {
        efbd.b();
        String[] strArr = bvhn.a;
        bvgz bvgzVar = new bvgz();
        bvgzVar.f("deleteNonShortcutSuggestionsOlderThan");
        bvgzVar.a(new Function() { // from class: ctqq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                bvhmVar.aq(new dtwe("p2p_suggestions.generated_timestamp", 8, Long.valueOf(ctrc.this.b.f().toEpochMilli() - j)));
                bvhmVar.aq(new dtrw("p2p_suggestions.smart_suggestion_type", 4, bvhm.at((Iterable) enqc.a(bduu.a).map(new Function() { // from class: bvhl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((fbri) obj2).a());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bvhj()))), true));
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvgzVar.d();
    }

    @Override // defpackage.ctqh
    public final void n() {
        efbd.b();
        String[] strArr = bvhn.a;
        bvgz bvgzVar = new bvgz();
        bvgzVar.f("deleteShortcutSuggestions");
        bvgzVar.e();
        bvgzVar.a(new Function() { // from class: ctqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                bvhmVar.f(bduu.a);
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvgzVar.d();
    }

    @Override // defpackage.ctqh
    public final void o(final List list) {
        list.getClass();
        String[] strArr = bvhn.a;
        bvgz bvgzVar = new bvgz();
        bvgzVar.f("deleteSmartSuggestions");
        bvgzVar.a(new Function() { // from class: ctqp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                bvhmVar.d(list);
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvgzVar.d();
    }

    @Override // defpackage.ctqh
    public final void p(SuggestionData suggestionData, fbrd fbrdVar) {
        suggestionData.getClass();
        fbrdVar.getClass();
        q(ffdx.b(suggestionData), fbrdVar);
    }

    @Override // defpackage.ctqh
    public final void q(List list, fbrd fbrdVar) {
        String b;
        list.getClass();
        fbrdVar.getClass();
        if (dkta.a(list)) {
            return;
        }
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SuggestionData suggestionData = (SuggestionData) it.next();
            if ((suggestionData instanceof SmartSuggestionData) && (b = suggestionData.b()) != null && b.length() != 0) {
                SmartSuggestionData smartSuggestionData = (SmartSuggestionData) suggestionData;
                if (fbrdVar.ordinal() > smartSuggestionData.j().ordinal()) {
                    smartSuggestionData.v(fbrdVar);
                    engrVar.h(b);
                }
            }
        }
        engw g = engrVar.g();
        if (g.isEmpty()) {
            return;
        }
        axol.k(this.e, null, new ctrb(this, g, fbrdVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ctqh
    public final engw r(List list) {
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#getMessageClassificationsForMessages");
        try {
            efbd.b();
            String[] strArr = btvy.a;
            btvx btvxVar = new btvx();
            engr engrVar = new engr();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
            }
            btvxVar.aq(new dtrw("message_classifications_table.message_id", 3, btvx.at(engrVar.g()), true));
            btvs a = btvy.a();
            a.z("getMessageClassificationsForMessages");
            a.k(new btvt(btvxVar));
            dtsu o = a.b().o();
            try {
                engw cW = ((btvh) o).cW();
                cW.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(cW, 10));
                enqv it2 = cW.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((btus) it2.next()).k());
                }
                engw a2 = engq.a(arrayList);
                ffig.a(o, null);
                ffig.a(f, null);
                return a2;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ctqh
    public final void s(final List list, fbrd fbrdVar) {
        fbrdVar.getClass();
        ekzz f = eleg.f("SmartSuggestionDatabaseOperationsImpl#updateP2pSuggestionsStatus");
        try {
            efbd.b();
            String[] strArr = bvhn.a;
            bvhf bvhfVar = new bvhf();
            bvhfVar.ap("updateSmartSuggestionsStatuses");
            bvhfVar.am();
            bvhfVar.a.put("suggestion_status", Integer.valueOf(fbrdVar.a()));
            bvhfVar.c(new Function() { // from class: ctqi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvhm bvhmVar = (bvhm) obj;
                    bvhmVar.d(list);
                    return bvhmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bvhfVar.b().e();
            ffig.a(f, null);
        } finally {
        }
    }
}
