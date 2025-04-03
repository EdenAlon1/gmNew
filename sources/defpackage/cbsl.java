package defpackage;

import android.os.CancellationSignal;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.appdatasearch.QuerySpecification;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbsl extends cbsp {
    final /* synthetic */ Long a;
    final /* synthetic */ Set b;
    final /* synthetic */ ArrayMap c;
    final /* synthetic */ Set d;
    final /* synthetic */ Set e;
    final /* synthetic */ Set f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbsl(cbsq cbsqVar, List list, QuerySpecification querySpecification, Executor executor, kfb kfbVar, elbx elbxVar, CancellationSignal cancellationSignal, Long l, Set set, ArrayMap arrayMap, Set set2, Set set3, Set set4) {
        super(cbsqVar, list, querySpecification, executor, kfbVar, elbxVar, cancellationSignal);
        this.a = l;
        this.b = set;
        this.c = arrayMap;
        this.d = set2;
        this.e = set3;
        this.f = set4;
    }

    @Override // defpackage.cbsp
    public final void b(dewq dewqVar) {
        try {
            ekzz f = eleg.f("fetchMessageSearchResults.SearchQuery#processResult");
            try {
                if ("internal.3p:Message_no_gsa".equals(dewqVar.a())) {
                    Map d = cbsq.d(dewqVar);
                    emxf.m(d.containsKey("conversation_id"), "expecting document to contain conversation id");
                    Long e = cbsq.e(dewqVar);
                    long longValue = e.longValue();
                    long parseLong = Long.parseLong(cbsq.c(d, "conversation_id"));
                    Long l = this.a;
                    if ((l == null || l.equals(Long.valueOf(parseLong))) && longValue != -1) {
                        this.b.add(e);
                    }
                } else if ("internal.3p:Conversation_no_gsa".equals(dewqVar.a())) {
                    Long e2 = cbsq.e(dewqVar);
                    long longValue2 = e2.longValue();
                    Long l2 = this.a;
                    if (l2 == null || l2.equals(e2)) {
                        this.c.put(new ConversationIdType(longValue2), -1L);
                    }
                } else {
                    if ("internal.3p:DigitalDocument_no_gsa".equals(dewqVar.a())) {
                        Long e3 = cbsq.e(dewqVar);
                        if (e3.longValue() != -1) {
                            this.d.add(e3);
                        }
                    } else {
                        emxf.m("internal.3p:LocalBusiness_no_gsa".equals(dewqVar.a()), "expecting document to be either from location corpus");
                        Long e4 = cbsq.e(dewqVar);
                        if (e4.longValue() != -1) {
                            this.e.add(e4);
                        }
                    }
                    Map d2 = cbsq.d(dewqVar);
                    emxf.m(d2.containsKey("message_id"), "expecting document to contain message id");
                    this.f.add(Long.valueOf(Long.parseLong(cbsq.c(d2, "message_id"))));
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
        } catch (NullPointerException | NumberFormatException e5) {
            ensz enszVar = (ensz) ((ensz) cbsq.a.i()).g(e5);
            enszVar.Y(cbrm.a, dewqVar.b());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl$1", "processResult", 311, "IcingSearchApiImpl.java")).q("cannot get the id for result.");
        }
    }

    @Override // defpackage.cbsp
    public final void c(String str, kfb kfbVar) {
        this.b.removeAll(this.f);
        kfbVar.c(new cbsr(str, new cbme((Collection) Collection.EL.stream(this.b).map(new Function() { // from class: cbsi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new MessageIdType(((Long) obj).longValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cbsj())), this.c, this.d, this.e)));
    }

    @Override // defpackage.cbsp
    public final void d(kfb kfbVar) {
        this.b.removeAll(this.f);
        kfbVar.b(new cbme((java.util.Collection) Collection.EL.stream(this.b).map(new Function() { // from class: cbsk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new MessageIdType(((Long) obj).longValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cbsj())), this.c, this.d, this.e));
    }
}
