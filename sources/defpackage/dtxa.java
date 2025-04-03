package defpackage;

import android.content.ContentValues;
import android.util.Log;
import android.util.Pair;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxa implements dtxb {
    public final emyl a;
    private final Set b = new HashSet();

    public dtxa(final Map map, final Map map2) {
        this.a = emys.a(new emyl() { // from class: dtwn
            @Override // defpackage.emyl
            public final Object get() {
                final HashMap hashMap = new HashMap();
                enhk enhkVar = (enhk) map2;
                Collection.EL.stream(enhkVar.entrySet()).forEach(new Consumer() { // from class: dtwo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        String str = (String) enjk.h(emye.b('+').g((CharSequence) entry.getKey()), 0);
                        Map.EL.computeIfAbsent((java.util.Map) Map.EL.computeIfAbsent(hashMap, str, new Function() { // from class: dtwh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashMap();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }), (String) enjk.h(emye.b('+').g((CharSequence) entry.getKey()), 1), new Function() { // from class: dtwm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashSet();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                java.util.Map map3 = map;
                Collection.EL.stream(map3.entrySet()).forEach(new Consumer() { // from class: dtwp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        String str = (String) enjk.h(emye.b('+').g((CharSequence) entry.getKey()), 0);
                        Map.EL.computeIfAbsent((java.util.Map) Map.EL.computeIfAbsent(hashMap, str, new Function() { // from class: dtwk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashMap();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }), (String) enjk.h(emye.b('+').g((CharSequence) entry.getKey()), 1), new Function() { // from class: dtwl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return new HashSet();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Collection.EL.stream(enhkVar.entrySet()).forEach(new Consumer() { // from class: dtwq
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        List i = emye.b('+').i((CharSequence) entry.getKey());
                        String str = (String) i.get(0);
                        String str2 = (String) i.get(1);
                        java.util.Map map4 = (java.util.Map) hashMap.get(str);
                        engw engwVar = (engw) entry.getValue();
                        int size = engwVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((Set) map4.get(str2)).add((dtry) engwVar.get(i2));
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Collection.EL.stream(map3.entrySet()).forEach(new Consumer() { // from class: dtwr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        List i = emye.b('+').i((CharSequence) entry.getKey());
                        String str = (String) i.get(0);
                        String str2 = (String) i.get(1);
                        java.util.Map map4 = (java.util.Map) hashMap.get(str);
                        for (dtry dtryVar : (dtry[]) entry.getValue()) {
                            if (dtryVar.c() != null && !dtryVar.c().e().equals(str2)) {
                                ((Set) map4.get(dtryVar.c().e())).add(dtryVar);
                            }
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return hashMap;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dtwf j(dtve dtveVar, Predicate predicate, final dtuk dtukVar) {
        engw n;
        boolean test;
        ArrayList arrayList = new ArrayList();
        synchronized (dtub.a) {
            for (dtyq dtyqVar : this.b) {
                test = predicate.test(dtyqVar);
                if (test) {
                    arrayList.add(dtyqVar);
                }
            }
        }
        int i = engw.d;
        engr engrVar = new engr();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            final dtyq dtyqVar2 = (dtyq) arrayList.get(i2);
            java.util.Map map = (java.util.Map) dtyq.a.get();
            synchronized (dtub.a) {
                n = engw.n((java.util.Collection) Collection.EL.stream(dtyqVar2.q).map(new Function() { // from class: dtyg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ThreadLocal threadLocal = dtyq.a;
                        return (dtrs) ((Pair) obj).first;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new dtyd())));
            }
            engr engrVar2 = new engr();
            int size2 = n.size();
            int i3 = 0;
            while (i3 < size2) {
                final dtrs dtrsVar = (dtrs) n.get(i3);
                Object E = dtyq.E(new Supplier() { // from class: dtyh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        dtrs dtrsVar2 = dtrsVar;
                        try {
                            return dtrsVar2.d(dtyq.this, dtukVar);
                        } catch (Throwable th) {
                            ((enrr) ((enrr) dtyq.c.a(Level.SEVERE).g(th)).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 941, "QueryBase.java")).t("got exception invoking preChangeInTransaction on %s", dtrsVar2);
                            throw th;
                        }
                    }
                });
                ArrayList arrayList2 = arrayList;
                ((enrr) dtyq.c.a(dtyq.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 946, "QueryBase.java")).B("preChangeInTransactionWithObject; table: %s; cl: %s", dtyq.Z(((dtrj) dtyqVar2.e).a), dtrsVar.i);
                List list = (List) Map.EL.computeIfAbsent(map, dtrsVar, new Function() { // from class: dtxi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ThreadLocal threadLocal = dtyq.a;
                        return new ArrayList();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                list.add(E);
                engrVar2.h(new dtrh(dtyqVar2, dtrsVar, list.size() - 1, list));
                i3++;
                arrayList = arrayList2;
                size = size;
            }
            engrVar.h(engrVar2.g());
            i2++;
            arrayList = arrayList;
        }
        return new dtww(dtveVar, engrVar.g(), dtukVar);
    }

    private static final void k(int i) {
        if (i == 2) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                Log.i("D26R", ">>> ".concat(String.valueOf(String.valueOf(stackTraceElement))));
            }
        }
    }

    @Override // defpackage.dtxb
    public final dtwf a(final dtve dtveVar, final String str, final duap duapVar) {
        Integer a = dtua.a(str);
        if (a != null) {
            Log.i("D26R", "DELETE FROM " + str + " WHERE " + duapVar.a(dtzu.b()));
            k(a.intValue());
        }
        return j(dtveVar, new Predicate() { // from class: dtwi
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
                dtyq dtyqVar = (dtyq) obj;
                String str2 = str;
                return (dtyqVar.Q(str2) && !dtyqVar.S(Arrays.asList(duapVar))) || dtxa.this.e(dtveVar, str2, dtyqVar, null);
            }
        }, new dtwx(duapVar));
    }

    @Override // defpackage.dtxb
    public final dtwf b(final dtve dtveVar, final String str, final duaj duajVar) {
        Integer a = dtua.a(str);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            String j = duajVar.j(dtzu.b(), arrayList);
            StringBuilder sb = new StringBuilder();
            duan duanVar = duajVar.d;
            sb.append("UPDATE ");
            sb.append(duajVar.c);
            duam duamVar = ((dtrm) duanVar).h;
            if (duamVar != null) {
                duaj.q(sb, duajVar.d);
                duaj.r(sb, duamVar);
            } else {
                sb.append(" SET ");
                sb.append(duajVar.l(null));
                sb.append(" WHERE ");
                sb.append(j);
                sb.append("\nARGS:\n");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    sb.append(";");
                }
            }
            Log.i("D26R", a.m(sb.toString(), str, "UPDATE ", " "));
            k(a.intValue());
        }
        return j(dtveVar, new Predicate() { // from class: dtwt
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
                dtyq dtyqVar = (dtyq) obj;
                duaj duajVar2 = duajVar;
                Set<String> keySet = duajVar2.a.keySet();
                String[] strArr = (String[]) keySet.toArray(new String[0]);
                dtse dtseVar = dtyqVar.p;
                String str2 = str;
                if (dtseVar.c(str2, strArr) && !dtyqVar.S(duajVar2.e)) {
                    return true;
                }
                if (dtyqVar.n().c(str2, (String[]) duajVar2.a.keySet().toArray(new String[0]))) {
                    return true;
                }
                return dtxa.this.e(dtveVar, str2, dtyqVar, (List) Collection.EL.stream(keySet).collect(Collectors.toList()));
            }
        }, new dtwy(duajVar));
    }

    @Override // defpackage.dtxb
    public final void c(dtyq dtyqVar) {
        synchronized (dtub.a) {
            this.b.remove(dtyqVar);
        }
    }

    public final boolean d(final String str, final String str2, final List list, final List list2) {
        Set set;
        java.util.Map map = (java.util.Map) ((java.util.Map) this.a.get()).get(str);
        if (map == null || (set = (Set) map.get(str2)) == null) {
            return false;
        }
        return Collection.EL.stream(set).anyMatch(new Predicate() { // from class: dtwu
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
                dtry c;
                dtry dtryVar = (dtry) obj;
                String e = dtryVar.e();
                List list3 = list;
                boolean contains = list3.contains(e);
                dtxa dtxaVar = dtxa.this;
                String str3 = str;
                if (contains) {
                    List list4 = list2;
                    String str4 = str2;
                    Set<dtry> set2 = (Set) ((java.util.Map) ((java.util.Map) dtxaVar.a.get()).get(str3)).get(str4);
                    if (list4 == null) {
                        return true;
                    }
                    for (dtry dtryVar2 : set2) {
                        if (dtryVar2.g() && (c = dtryVar2.c()) != null && c.e().equals(str4) && list4.contains(c.d())) {
                            return true;
                        }
                    }
                }
                return dtxaVar.d(str3, dtryVar.e(), list3, null);
            }
        });
    }

    public final boolean e(dtve dtveVar, String str, dtyq dtyqVar, List list) {
        List list2 = (List) Collection.EL.stream(dtyqVar.m.a).collect(Collectors.toList());
        list2.add(dtyqVar.o);
        return ((dtrj) dtyqVar.e).z && d(((dtqy) dtveVar.l()).b, str, list2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtxb
    public final boolean f(String str, ContentValues contentValues, dtyq dtyqVar) {
        engw engwVar = ((dtrj) dtyqVar.e).h;
        if (engwVar != null) {
            int i = 0;
            while (i < ((enou) engwVar).c) {
                boolean e = ((duap) engwVar.get(i)).e(str, contentValues);
                i++;
                if (e) {
                    return true;
                }
            }
        }
        engw c = dtyqVar.m.c();
        int i2 = ((enou) c).c;
        int i3 = 0;
        while (i3 < i2) {
            boolean f = f(str, contentValues, ((dtvn) c.get(i3)).a);
            i3++;
            if (f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtxb
    public final dtwf g(dtve dtveVar, final String str, dtuk dtukVar) {
        Integer a = dtua.a(str);
        if (a != null) {
            Log.i("D26R", "BULK INSERT " + str + " " + dtukVar.a().length);
            for (int i = 0; i < dtukVar.a().length; i++) {
                Log.i("D26R", "  @" + i + " BINDDATA: " + dtukVar.a()[i].a());
            }
            k(a.intValue());
        }
        return j(dtveVar, new Predicate() { // from class: dtwj
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
                return ((dtyq) obj).Q(str);
            }
        }, dtukVar);
    }

    @Override // defpackage.dtxb
    public final dtwf h(dtve dtveVar, final String str, dtro dtroVar) {
        Integer a = dtua.a(str);
        if (a != null) {
            Log.i("D26R", "INSERT " + str + " " + dtroVar.a());
            k(a.intValue());
        }
        final ContentValues contentValues = new ContentValues();
        dtroVar.b(contentValues);
        return j(dtveVar, new Predicate() { // from class: dtws
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
                dtyq dtyqVar = (dtyq) obj;
                String str2 = str;
                if (dtyqVar.Q(str2)) {
                    return !dtxa.this.f(str2, contentValues, dtyqVar);
                }
                return false;
            }
        }, new dtwz(dtroVar));
    }

    @Override // defpackage.dtxb
    public final void i(dtyq dtyqVar) {
        boolean contains;
        synchronized (dtub.a) {
            dtyqVar.m();
            dtyqVar.n();
            synchronized (dtub.a) {
                contains = this.b.contains(dtyqVar);
            }
            if (contains) {
                return;
            }
            this.b.add(dtyqVar);
        }
    }
}
