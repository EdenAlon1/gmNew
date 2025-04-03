package defpackage;

import android.os.CancellationSignal;
import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeze {
    public static final enru a = enru.c("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache");
    public final cqoh b;
    public final aelz c;
    public dtrs e;
    public final Map f;
    private final ffbr h;
    public aekq g = aekl.a(enoz.a, null, null);
    public agkk d = null;

    public aeze(cqoh cqohVar, aelz aelzVar, ffbr ffbrVar) {
        this.b = cqohVar;
        this.c = aelzVar;
        new HashMap();
        this.f = new HashMap();
        this.h = ffbrVar;
    }

    public static void c(String str, cgix cgixVar, SuperSortLabel superSortLabel, boolean z) {
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", "logQuery", 455, "HomeScreenQueryCache.java")).K("%s\nConversationListGroup: %s\nLabel: %s\nfirstLoad: %b", str, cgixVar, superSortLabel, Boolean.valueOf(z));
    }

    public final agkk a(agkk agkkVar, dtrs dtrsVar, CancellationSignal cancellationSignal) {
        dtrs dtrsVar2;
        if (((aubh) this.h.b()).a() && cancellationSignal.isCanceled()) {
            throw new dtyy((byte[]) null);
        }
        agkk agkkVar2 = this.d;
        if (agkkVar2 != null && (dtrsVar2 = this.e) != null) {
            agkkVar2.P(dtrsVar2);
        }
        this.d = agkkVar;
        this.e = dtrsVar;
        agkkVar.L(dtrsVar);
        return this.d;
    }

    public final aglz b(cgix cgixVar, SuperSortLabel superSortLabel) {
        aglz aglzVar = (aglz) this.f.get(superSortLabel);
        if (aglzVar != null) {
            return aglzVar;
        }
        afco afcoVar = new afco();
        int ordinal = cgixVar.ordinal();
        if (ordinal == 1) {
            afcoVar.a = true;
        } else if (ordinal != 2) {
            afcoVar.b = true;
        } else {
            afcoVar.c = true;
        }
        aglz a2 = afcoVar.a();
        this.f.put(superSortLabel, a2);
        return a2;
    }

    public final List d(agkk agkkVar, final Map map, final SuperSortLabel superSortLabel, final CancellationSignal cancellationSignal) {
        dtve r = agkkVar.r();
        agkkVar.O();
        agkkVar.r = cancellationSignal;
        dtri dtriVar = new dtri(agkkVar.e);
        dtriVar.v = new dtxh(agkkVar);
        dtza a2 = dtriVar.a();
        agki agkiVar = new agki(r, r.i(agkkVar.k, agkkVar.j, a2, cancellationSignal), agkkVar.l, (dtzj[]) agkkVar.i.toArray(new dtzj[0]), new dtyo() { // from class: dtyb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                ThreadLocal threadLocal = dtyq.a;
                return str;
            }
        }, agkkVar.m, agkkVar);
        agkiVar.dg(agkkVar.m, agkkVar.m.c(), agkkVar.R());
        Stream cZ = agkiVar.cZ();
        try {
            List list = (List) cZ.map(new Function() { // from class: aezb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    afke afkeVar = (afke) obj;
                    SuperSortLabel superSortLabel2 = superSortLabel;
                    aeze aezeVar = aeze.this;
                    if (cancellationSignal.isCanceled()) {
                        ensk j = aeze.a.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 428, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                        throw new CancellationException();
                    }
                    ekzz f = eleg.f("ConversationListDataSources#fromHomeScreenQuery");
                    try {
                        aeki ai = aeki.ai(afkeVar, superSortLabel2, aezeVar.b);
                        f.close();
                        return ai;
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: aezc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aeze aezeVar = aeze.this;
                    Map map2 = map;
                    aeki aekiVar = (aeki) obj;
                    if (cancellationSignal.isCanceled()) {
                        ensk j = aeze.a.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 439, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                        throw new CancellationException();
                    }
                    ekzz f = eleg.f("ConversationListDataSources#conversationListItemViewDataFactory");
                    try {
                        aelz aelzVar = aezeVar.c;
                        aekq aekqVar = aezeVar.g;
                        aelx aj = aely.aj();
                        aj.b(aekiVar);
                        aj.e(aeja.a(aekiVar));
                        aj.l(aeja.c(aekiVar));
                        ((aelu) aj).w = (bduq) map2.get(aekiVar.w());
                        aj.c(TextUtils.equals(aekiVar.ak("conversation_contains_vsms_participant"), "1"));
                        aj.d(aekiVar.al());
                        ((aelu) aj).D = "";
                        ((aelu) aj).J = null;
                        Iterator it = aelzVar.a.iterator();
                        while (it.hasNext()) {
                            ((aeko) it.next()).a().a(aj, aekiVar, aekqVar);
                        }
                        Iterator it2 = aelzVar.a(aekiVar).iterator();
                        while (it2.hasNext()) {
                            ((aema) it2.next()).e(aj, aekiVar);
                        }
                        aely a3 = aj.a();
                        f.close();
                        return a3;
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: aezd
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            if (cZ != null) {
                cZ.close();
            }
            return list;
        } catch (Throwable th) {
            if (cZ == null) {
                throw th;
            }
            try {
                cZ.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
