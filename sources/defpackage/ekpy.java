package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpy implements fbba {
    /* JADX WARN: Multi-variable type inference failed */
    public static engw a(Map map, cpn cpnVar, Object obj) {
        List list;
        int i;
        int i2;
        Set keySet = map.keySet();
        synchronized (cpnVar) {
            list = (List) cpnVar.get(keySet);
            if (list == null) {
                list = new ArrayList(keySet);
                Collections.shuffle(list, ((ekpv) obj).a);
                cpn cpnVar2 = new cpn();
                ArrayDeque arrayDeque = new ArrayDeque(list);
                HashSet hashSet = new HashSet(list);
                while (true) {
                    i = 0;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    ekpt ekptVar = (ekpt) arrayDeque.remove();
                    engw engwVar = ekptVar.b;
                    int i3 = ((enou) engwVar).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ekpt ekptVar2 = (ekpt) engwVar.get(i4);
                        ekpv.b(cpnVar2, ekptVar, ekptVar2);
                        if (hashSet.add(ekptVar2)) {
                            arrayDeque.add(ekptVar2);
                        }
                    }
                    engw engwVar2 = ekptVar.c;
                    int i5 = ((enou) engwVar2).c;
                    while (i < i5) {
                        ekpt ekptVar3 = (ekpt) engwVar2.get(i);
                        ekpv.b(cpnVar2, ekptVar3, ekptVar);
                        if (hashSet.add(ekptVar3)) {
                            arrayDeque.add(ekptVar3);
                        }
                        i++;
                    }
                }
                enip o = enip.o(list);
                try {
                    ArrayList<ermy> arrayList = new ArrayList(list.size());
                    HashMap hashMap = new HashMap(list.size());
                    int i6 = 0;
                    for (Object obj2 : list) {
                        ermy ermyVar = new ermy(obj2, i6);
                        arrayList.add(ermyVar);
                        List list2 = (List) hashMap.get(obj2);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(obj2, list2);
                        }
                        list2.add(ermyVar);
                        i6++;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        ermy ermyVar2 = (ermy) arrayList.get(i);
                        ekpu.a(ermyVar2.a, o, cpnVar2);
                        Iterator it = ekpu.a(ermyVar2.a, o, cpnVar2).iterator();
                        while (true) {
                            i2 = i + 1;
                            if (it.hasNext()) {
                                List list3 = (List) hashMap.get(it.next());
                                if (list3 != null) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        ((ermy) it2.next()).c.add(ermyVar2);
                                        ermyVar2.d++;
                                    }
                                } else {
                                    ermyVar2.d++;
                                }
                            }
                        }
                        i = i2;
                    }
                    ArrayList arrayList2 = new ArrayList(list.size());
                    PriorityQueue priorityQueue = new PriorityQueue();
                    for (ermy ermyVar3 : arrayList) {
                        if (ermyVar3.d == 0) {
                            priorityQueue.add(ermyVar3);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        ermy ermyVar4 = (ermy) priorityQueue.poll();
                        arrayList2.add(ermyVar4);
                        for (ermy ermyVar5 : ermyVar4.c) {
                            int i7 = ermyVar5.d - 1;
                            ermyVar5.d = i7;
                            if (i7 == 0) {
                                priorityQueue.add(ermyVar5);
                            }
                        }
                    }
                    if (arrayList2.size() != list.size()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ermy ermyVar6 : arrayList) {
                            if (ermyVar6.d > 0) {
                                arrayList3.add(ermyVar6.a);
                            }
                        }
                        throw new ermx(arrayList3);
                    }
                    list.clear();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        list.add(((ermy) it3.next()).a);
                    }
                    cpnVar.put(keySet, list);
                } catch (ermx e) {
                    throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
                }
            }
        }
        int i8 = engw.d;
        engr engrVar = new engr();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((Set) map.get((ekpt) it4.next())).iterator();
            while (it5.hasNext()) {
                engrVar.h((evew) ((ffbr) it5.next()).b());
            }
        }
        engw g = engrVar.g();
        g.getClass();
        return g;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
