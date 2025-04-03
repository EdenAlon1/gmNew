package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euqc {
    static void a(List list) {
        Set<euqa> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (euqa euqaVar : (Set) it2.next()) {
                        for (euqd euqdVar : euqaVar.a.c) {
                            if (euqdVar.a() && (set = (Set) hashMap.get(new euqb(euqdVar.a, euqdVar.b()))) != null) {
                                for (euqa euqaVar2 : set) {
                                    euqaVar.b.add(euqaVar2);
                                    euqaVar2.c.add(euqaVar);
                                }
                            }
                        }
                    }
                }
                HashSet<euqa> hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (euqa euqaVar3 : hashSet) {
                    if (euqaVar3.a()) {
                        hashSet2.add(euqaVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    euqa euqaVar4 = (euqa) hashSet2.iterator().next();
                    hashSet2.remove(euqaVar4);
                    i++;
                    for (euqa euqaVar5 : euqaVar4.b) {
                        euqaVar5.c.remove(euqaVar4);
                        if (euqaVar5.a()) {
                            hashSet2.add(euqaVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (euqa euqaVar6 : hashSet) {
                    if (!euqaVar6.a() && !euqaVar6.b.isEmpty()) {
                        arrayList.add(euqaVar6.a);
                    }
                }
                throw new euqe(arrayList);
            }
            eupm eupmVar = (eupm) it.next();
            euqa euqaVar7 = new euqa(eupmVar);
            for (euqq euqqVar : eupmVar.b) {
                euqb euqbVar = new euqb(euqqVar, !eupmVar.f());
                if (!hashMap.containsKey(euqbVar)) {
                    hashMap.put(euqbVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(euqbVar);
                if (!set2.isEmpty() && !euqbVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", euqqVar));
                }
                set2.add(euqaVar7);
            }
        }
    }
}
