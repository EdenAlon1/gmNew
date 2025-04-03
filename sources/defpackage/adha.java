package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adha implements cfyq {
    private final errl a;
    private final cqoh b;

    public adha(errl errlVar, cqoh cqohVar) {
        this.a = errlVar;
        this.b = cqohVar;
    }

    private final elfl d(final long j) {
        return elfo.g(new Callable() { // from class: adgv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object apply;
                final long j2 = j;
                if (j2 < 0) {
                    String[] strArr = bvfh.a;
                    bvez bvezVar = new bvez();
                    bvezVar.f("deleteP2pSuggestionEventsAsync2");
                    return Integer.valueOf(bvezVar.d());
                }
                String[] strArr2 = bvfh.a;
                bvez bvezVar2 = new bvez();
                bvezVar2.f("deleteP2pSuggestionEventsAsync1");
                apply = new Function() { // from class: adgu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvfg bvfgVar = (bvfg) obj;
                        bvfgVar.aq(new dtwe("p2p_conversation_suggestion_event.timestamp", 10, Long.valueOf(j2)));
                        return bvfgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bvfg());
                bvezVar2.b = new bvff((bvfg) apply);
                return Integer.valueOf(bvezVar2.d());
            }
        }, this.a);
    }

    private static String e(SuggestionData suggestionData) {
        if (!f(suggestionData) || !(suggestionData instanceof SmartSuggestionItemSuggestionData)) {
            return null;
        }
        fbwy fbwyVar = ((SmartSuggestionItemSuggestionData) suggestionData).c.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        return fbwyVar.o;
    }

    private static boolean f(SuggestionData suggestionData) {
        if (!(suggestionData instanceof SmartSuggestionItemSuggestionData)) {
            return true;
        }
        fbri l = ((SmartSuggestionItemSuggestionData) suggestionData).l();
        return (l == fbri.SILENT && ((Boolean) adgt.a.e()).booleanValue()) || (l == fbri.EMOTION && ((Boolean) adgt.b.e()).booleanValue());
    }

    public final elfl a(eoqz eoqzVar, epjp epjpVar, fbqx fbqxVar, fbqp fbqpVar, int i, int i2, List list, MessageIdType messageIdType) {
        SuggestionData suggestionData;
        String str = "";
        if (!list.isEmpty() && (suggestionData = (SuggestionData) list.get(0)) != null) {
            str = Objects.toString(suggestionData.x(), "");
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            SuggestionData suggestionData2 = (SuggestionData) list.get(i3);
            if (suggestionData2 instanceof SmartSuggestionItemSuggestionData) {
                if (i3 != 0 && sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(((SmartSuggestionItemSuggestionData) suggestionData2).l().a());
            }
        }
        String sb2 = sb.toString();
        int i4 = engw.d;
        engw engwVar = enou.a;
        if (eoqzVar != eoqz.P2P_SUGGESTION_CLICK || i2 < 0 || list.size() <= i2) {
            engr engrVar = new engr();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuggestionData suggestionData3 = (SuggestionData) it.next();
                if (f(suggestionData3)) {
                    String e = e(suggestionData3);
                    if (!TextUtils.isEmpty(e)) {
                        engrVar.h(e);
                    }
                }
            }
            engwVar = engrVar.g();
        } else {
            String e2 = e((SuggestionData) list.get(i2));
            if (!TextUtils.isEmpty(e2)) {
                engwVar = engw.r(e2);
            }
        }
        String[] strArr = bvfh.a;
        bvdi bvdiVar = new bvdi();
        bvdiVar.f(messageIdType);
        bvdiVar.l(this.b.f().toEpochMilli());
        bvdiVar.d(eoqzVar);
        bvdiVar.j(epjpVar);
        bvdiVar.i(fbqxVar);
        bvdiVar.b(fbqpVar);
        bvdiVar.h(i);
        bvdiVar.c(i2);
        bvdiVar.e(str);
        bvdiVar.k(sb2);
        bvdiVar.g(TextUtils.join(",", engwVar));
        final bvdf a = bvdiVar.a();
        return elfo.g(new Callable() { // from class: adgy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final dtve b = bvfh.b();
                dtve b2 = bvfh.b();
                Function function = new Function() { // from class: bvdb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("p2p_conversation_suggestion_event", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final bvdf bvdfVar = bvdf.this;
                return Long.valueOf(dtub.b(b2, "p2p_conversation_suggestion_event", bvdfVar, function, new Consumer() { // from class: bvdc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bvdf bvdfVar2 = bvdf.this;
                            bvdfVar2.a = (String) new dtuj() { // from class: bvdd
                                @Override // defpackage.dtuj
                                public final Object a() {
                                    return String.valueOf(l);
                                }
                            }.a();
                            bvdfVar2.fY(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }));
            }
        }, this.a);
    }

    @Override // defpackage.cfyq
    public final void b() {
        csvs.c(d(-1L), "BugleUsageStatistics", "Failed to delete all P2pSuggestionEvent");
    }

    @Override // defpackage.cfyq
    public final void c(long j) {
        csvs.c(d(j), "BugleUsageStatistics", "Failed to delete all P2pSuggestionEvent before cutoff timestamp");
    }
}
