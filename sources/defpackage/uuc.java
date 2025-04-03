package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuc implements ejxk {
    final /* synthetic */ uuy a;

    public uuc(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        csjy.p("BugleTyping", th, "Error loading data for typing indicator callback.");
    }

    @Override // defpackage.ejxk
    public final /* synthetic */ void b(Object obj) {
        enhk enhkVar = (enhk) obj;
        if (this.a.ap.b()) {
            csjy.n("BugleTyping", "onLoaded() typing indicator data before conversation ID has been loaded.");
            return;
        }
        enhk enhkVar2 = enhkVar.containsKey(this.a.ap) ? (enhk) enhkVar.get(this.a.ap) : enoz.a;
        final uuy uuyVar = this.a;
        if (!uuyVar.aL.g()) {
            csjy.n("BugleTyping", "typing indicator processed ConversationData is set. This can happen before onCreateActivity() or after onDestroy().");
            return;
        }
        final enip enipVar = (enip) Collection.EL.stream(enhkVar2.entrySet()).filter(new Predicate() { // from class: ush
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
            public final boolean test(Object obj2) {
                Map.Entry entry = (Map.Entry) obj2;
                String str = ((awui) entry.getKey()).d;
                awui awuiVar = (awui) entry.getKey();
                Instant instant = (Instant) entry.getValue();
                uuy uuyVar2 = uuy.this;
                if (instant.isAfter(uuyVar2.s.f())) {
                    cfva cfvaVar = aoqm.a;
                    boolean booleanValue = ((Boolean) new aopq().get()).booleanValue();
                    if (str != null && (!booleanValue || (awuiVar != null && (awuiVar.b & 2) != 0))) {
                        bcqs bcqsVar = (bcqs) uuyVar2.aL.a();
                        if (!bcqsVar.f) {
                            if (booleanValue) {
                                str = awuiVar.d;
                            }
                            csjy.o("BugleTyping", "%s is typing in this conversation, but participants are not loaded.", cskt.b(str));
                            return false;
                        }
                        ParticipantsTable.BindData c = bcqsVar.g.c(str, true != booleanValue ? null : awuiVar);
                        if (c != null) {
                            c.U().getClass();
                            return true;
                        }
                        if (booleanValue) {
                            str = awuiVar.d;
                        }
                        csjy.o("BugleTyping", "%s is typing in this conversation, but they aren't a participant.", cskt.b(str));
                        return false;
                    }
                    csjy.n("BugleTyping", "Received a ChatSessionEvent with a null user id");
                }
                return false;
            }
        }).map(new Function() { // from class: usi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (awui) ((Map.Entry) obj2).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: usj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((awui) obj2).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        Collection.EL.stream(enipVar).forEach(new Consumer() { // from class: usk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                cfup cfupVar = uuy.a;
                csjy.j("BugleTyping", "%s typing", cskt.b((String) obj2));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (!uuyVar.aL.g() || !((bcqs) uuyVar.aL.a()).q() || !((bcqs) uuyVar.aL.a()).n()) {
            upx upxVar = uuyVar.aB;
            int i = engw.d;
            upxVar.l(enou.a);
            return;
        }
        bctw bctwVar = ((bcqs) uuyVar.aL.a()).g;
        Stream filter = bctwVar.e().filter(new Predicate() { // from class: utf
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
            public final boolean test(Object obj2) {
                cfup cfupVar = uuy.a;
                return ((ParticipantsTable.BindData) obj2).U() != null;
            }
        }).filter(new Predicate() { // from class: utg
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
            public final boolean test(Object obj2) {
                cfup cfupVar = uuy.a;
                return enip.this.contains(((ParticipantsTable.BindData) obj2).U());
            }
        });
        int i2 = engw.d;
        engw engwVar = (engw) filter.collect(endq.a);
        csjy.j("BugleTyping", "%d active typing notifications.", Integer.valueOf(enipVar.size()));
        if (engwVar.size() > enipVar.size()) {
            csjy.o("BugleTyping", "Found %d participants for %d typing notifications. Trimming duplicate participants...", Integer.valueOf(engwVar.size()), Integer.valueOf(enipVar.size()));
            engr engrVar = new engr();
            enqu listIterator = enipVar.listIterator();
            while (listIterator.hasNext()) {
                ParticipantsTable.BindData c = bctwVar.c((String) listIterator.next(), null);
                if (c != null) {
                    if (c.r() != -2) {
                        csjy.n("BugleTyping", "Found a typing notification for a self-participant, skipping...");
                    } else {
                        engrVar.h(c);
                    }
                }
            }
            engwVar = engrVar.g();
            csjy.j("BugleTyping", "Trimmed to %d typing participants.", Integer.valueOf(((enou) engwVar).c));
        }
        uuyVar.aB.l(engwVar);
    }
}
