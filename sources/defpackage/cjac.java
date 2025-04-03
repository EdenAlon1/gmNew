package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjac {
    public final cjbl a;
    public final List b;
    private final Map c = new HashMap();
    private final Executor d;
    private final errl e;

    public cjac(cjbl cjblVar, Executor executor, errl errlVar, List list) {
        this.a = cjblVar;
        this.d = executor;
        this.e = errlVar;
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            if (bundle.containsKey("extra_im_notification_conversation_id")) {
                this.c.put(bdgq.b(bundle.getString("extra_im_notification_conversation_id")), bundle);
            }
        }
    }

    public final elfl a() {
        final ArrayList arrayList = new ArrayList();
        for (final Bundle bundle : this.b) {
            if (bundle.containsKey("extra_im_notification_conversation_id") && bundle.containsKey("extra_im_notification_message_ids") && bundle.containsKey("extra_im_notification_earliest_timestamp")) {
                arrayList.add(elfo.g(new Callable() { // from class: cjaa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        engw engwVar;
                        Bundle bundle2 = bundle;
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("extra_im_notification_message_ids");
                        stringArrayList.getClass();
                        Stream map = Collection.EL.stream(stringArrayList).map(new cizy());
                        int i = engw.d;
                        engw engwVar2 = (engw) map.collect(endq.a);
                        String string = bundle2.getString("extra_im_notification_conversation_id");
                        string.getClass();
                        long j = bundle2.getLong("extra_im_notification_earliest_timestamp");
                        ConversationIdType b = bdgq.b(string);
                        final cjbl cjblVar = cjac.this.a;
                        if (cjblVar.g.a()) {
                            engwVar = (engw) ((bcsy) cjblVar.e.b()).f((MessageIdType[]) engwVar2.toArray(new MessageIdType[0])).D().map(new Function() { // from class: cjbg
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bcsf) cjbl.this.f.b()).b((bgmp) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(endq.a);
                        } else {
                            bjji f = ((bcsq) cjblVar.d.b()).f(b, -1, 0);
                            String[] strArr = bjjn.a;
                            bjjm bjjmVar = new bjjm();
                            engr engrVar = new engr();
                            Iterator<E> it = engwVar2.iterator();
                            while (it.hasNext()) {
                                engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
                            }
                            bjjmVar.aq(new dtrw("messages._id", 3, bjjm.at(engrVar.g()), true));
                            f.k(new bjjj(bjjmVar));
                            engwVar = (engw) Collection.EL.stream(((bjjd) f.b().o()).cW()).map(new Function() { // from class: cjbh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bcsf) cjbl.this.f.b()).d((bigm) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(endq.a);
                        }
                        bcse bcseVar = (bcse) Collection.EL.stream(engwVar.a()).findFirst().orElse(null);
                        if (bcseVar == null) {
                            return null;
                        }
                        cjao cjaoVar = (cjao) cjap.a.createBuilder();
                        long min = Math.min(bcseVar.aJ() ? bcseVar.k() : bcseVar.i(), j);
                        cjaoVar.copyOnWrite();
                        cjap cjapVar = (cjap) cjaoVar.instance;
                        cjapVar.b |= 1;
                        cjapVar.c = min;
                        return new AbstractMap.SimpleEntry(string, (cjap) cjaoVar.build());
                    }
                }, this.e));
            }
        }
        return elfo.l(arrayList).a(new Callable() { // from class: cjab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cjav cjavVar = (cjav) cjax.a.createBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) erqt.q((elfl) it.next());
                    if (entry != null) {
                        cjavVar.b((String) entry.getKey(), (cjap) entry.getValue());
                    }
                }
                return (cjax) cjavVar.build();
            }
        }, this.d);
    }
}
