package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqkj {
    public static final ffbz a = ffca.a(new ffix() { // from class: cqkh
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqkj.a;
            return new cqkc(new ffjm() { // from class: cqkd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqkj.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cqjg.f(cqgjVar) && cqjg.d(collection) && !cqjg.c(collection)) {
                        Object obj3 = null;
                        boolean z2 = false;
                        for (Object obj4 : collection) {
                            if (cqjg.g((cqgj) obj4)) {
                                if (z2) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj3 = obj4;
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        if (cqjo.c(cqgjVar, (cqgj) obj3)) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }, new ffjm() { // from class: cqke
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqkj.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cqjg.g((cqgj) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cqgj cqgjVar2 = (cqgj) obj3;
                    cqkk a2 = cqkj.a(cqgjVar2, cqgjVar);
                    List b2 = cqkj.b(collection, cqgjVar2, a2);
                    Collection<cqgj> collection2 = a2.b;
                    ArrayList arrayList = new ArrayList(ffdx.n(collection2, 10));
                    for (cqgj cqgjVar3 : collection2) {
                        eyee eyeeVar = a2.a.e;
                        eyeeVar.getClass();
                        arrayList.add(new cqji(cqgjVar3, eyeeVar));
                    }
                    return new cqjk(b2, 5, arrayList);
                }
            });
        }
    });
    public static final ffbz b = ffca.a(new ffix() { // from class: cqki
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqkj.a;
            return new cqkc(new ffjm() { // from class: cqkf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqkj.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cqjg.g(cqgjVar) && cqjg.c(collection)) {
                        Object obj3 = null;
                        boolean z2 = false;
                        for (Object obj4 : collection) {
                            if (cqjg.f((cqgj) obj4)) {
                                if (z2) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj3 = obj4;
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        if (cqjo.c((cqgj) obj3, cqgjVar)) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }, new ffjm() { // from class: cqkg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqkj.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cqjg.f((cqgj) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cqgj cqgjVar2 = (cqgj) obj3;
                    cqkk a2 = cqkj.a(cqgjVar, cqgjVar2);
                    List b2 = cqkj.b(collection, cqgjVar2, a2);
                    Collection<cqgj> collection2 = a2.b;
                    ArrayList arrayList = new ArrayList(ffdx.n(collection2, 10));
                    for (cqgj cqgjVar3 : collection2) {
                        eyee eyeeVar = a2.a.e;
                        eyeeVar.getClass();
                        arrayList.add(new cqji(cqgjVar3, eyeeVar));
                    }
                    return new cqjk(b2, 6, arrayList);
                }
            });
        }
    });

    public static final cqkk a(cqgj cqgjVar, cqgj cqgjVar2) {
        Collection a2 = cqjg.a(cqgjVar);
        ArrayList arrayList = new ArrayList(ffdx.n(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(cqjo.b((cqgj) it.next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            cqgj cqgjVar3 = (cqgj) next;
            eyja eyjaVar = (cqgjVar3.c == 5 ? (cqgd) cqgjVar3.d : cqgd.a).d;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eyjaVar.getClass();
            eyja eyjaVar2 = (cqgjVar2.c == 4 ? (cqgb) cqgjVar2.d : cqgb.a).c;
            if (eyjaVar2 == null) {
                eyjaVar2 = eyja.a;
            }
            eyjaVar2.getClass();
            eyja eyjaVar3 = eykm.a;
            Boolean valueOf = Boolean.valueOf(eykl.a(eyjaVar, eyjaVar2) >= 0);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        List list = (List) Map.EL.getOrDefault(linkedHashMap, true, ffel.a);
        List list2 = (List) linkedHashMap.get(false);
        return new cqkk(cqgjVar2, list, list2 != null ? cqjo.a(list2) : null);
    }

    public static final List b(Collection collection, cqgj cqgjVar, cqkk cqkkVar) {
        return ffdx.aa(ffdx.ae(ffdx.ae(ffdx.ac(collection, cqgjVar), cqkkVar.a), cqkkVar.c));
    }
}
