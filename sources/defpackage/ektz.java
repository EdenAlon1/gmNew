package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ektz {
    public final dlpw a;
    public final ekts b;
    private final eksm c;
    private final errl d;

    public ektz(dlpw dlpwVar, eksm eksmVar, ekts ektsVar, errl errlVar) {
        this.a = dlpwVar;
        this.c = eksmVar;
        this.b = ektsVar;
        this.d = errlVar;
        Boolean bool = false;
        bool.getClass();
    }

    public final ListenableFuture a(final Set set, final long j, final Map map) {
        return erny.f(this.c.b(), eldl.a(new emwl() { // from class: ekty
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v16, types: [emxc] */
            /* JADX WARN: Type inference failed for: r0v20, types: [emxc] */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                long j2;
                Map map2;
                ekrd ekrdVar;
                emux emuxVar;
                ekty ektyVar = this;
                Map map3 = (Map) obj;
                ArrayList<ektw> arrayList = new ArrayList();
                ektz ektzVar = ektz.this;
                long epochMilli = ektzVar.a.f().toEpochMilli();
                for (Map.Entry entry : map.entrySet()) {
                    Set set2 = set;
                    ektu ektuVar = (ektu) entry.getKey();
                    ekrh e = ((ekrp) entry.getValue()).e();
                    Long l = (Long) map3.get(ektuVar);
                    if (set2.contains(ektuVar)) {
                        j2 = epochMilli;
                    } else {
                        j2 = j;
                        if (l != null) {
                            j2 = l.longValue();
                        }
                    }
                    enin eninVar = new enin();
                    emux emuxVar2 = emux.a;
                    ekrd ekrdVar2 = (ekrd) e;
                    long j3 = ekrdVar2.a;
                    for (ekrj ekrjVar : ((enhk) ekrdVar2.c).values()) {
                        long a = ekrjVar.a();
                        if (a != -1) {
                            map2 = map3;
                            long j4 = j2 + a + ekrdVar2.a;
                            if (epochMilli <= j4) {
                                if (emuxVar2.g()) {
                                    ekrdVar = ekrdVar2;
                                    emuxVar = emxc.j(Long.valueOf(Math.min(((Long) emuxVar2.c()).longValue(), j4)));
                                } else {
                                    ekrdVar = ekrdVar2;
                                    emuxVar = emxc.j(Long.valueOf(j4));
                                }
                                emuxVar2 = emuxVar;
                                eninVar.c(ekrjVar.b());
                            } else {
                                ekrdVar = ekrdVar2;
                            }
                        } else {
                            map2 = map3;
                            ekrdVar = ekrdVar2;
                            eninVar.c(ekrjVar.b());
                        }
                        map3 = map2;
                        ekrdVar2 = ekrdVar;
                    }
                    HashSet hashSet = new HashSet();
                    ektv.a(eninVar.g(), hashSet);
                    arrayList.add(new ekru(hashSet, j3 + j2, emuxVar2));
                    ektyVar = this;
                    map3 = map3;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ektw ektwVar = (ektw) arrayList.get(i);
                    long convert = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                    long j5 = convert + epochMilli;
                    if (ektwVar.a() < j5) {
                        long max = Math.max(epochMilli, ektwVar.a());
                        HashSet hashSet2 = new HashSet();
                        emxc emxcVar = emux.a;
                        ektv.a(ektwVar.c(), hashSet2);
                        if (ektwVar.b().g()) {
                            long j6 = j5 - max;
                            emxf.l(j6 > 0);
                            emxf.l(j6 <= convert);
                            emxcVar = emxc.j(Long.valueOf(((Long) ektwVar.b().c()).longValue() + j6));
                        }
                        arrayList.set(i, new ekru(hashSet2, j5, emxcVar));
                    }
                }
                long abs = Math.abs(((SecureRandom) ektzVar.b.a.b()).nextLong());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long convert2 = abs % (eexk.b(ekub.a) ? timeUnit.convert(5L, TimeUnit.SECONDS) : timeUnit.convert(15L, TimeUnit.MINUTES));
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ektw ektwVar2 = (ektw) arrayList.get(i2);
                    HashSet hashSet3 = new HashSet();
                    emxc emxcVar2 = emux.a;
                    ektv.a(ektwVar2.c(), hashSet3);
                    long a2 = ektwVar2.a() + convert2;
                    if (ektwVar2.b().g()) {
                        emxcVar2 = emxc.j(Long.valueOf(((Long) ektwVar2.b().c()).longValue() + convert2));
                    }
                    arrayList.set(i2, new ekru(hashSet3, a2, emxcVar2));
                }
                cmh cmhVar = new cmh();
                for (ektw ektwVar3 : arrayList) {
                    Set c = ektwVar3.c();
                    ektw ektwVar4 = (ektw) cmhVar.get(c);
                    if (ektwVar4 == null) {
                        cmhVar.put(c, ektwVar3);
                    } else {
                        cmhVar.put(c, ektw.d(ektwVar4, ektwVar3));
                    }
                }
                emxc emxcVar3 = emux.a;
                for (ektw ektwVar5 : cmhVar.values()) {
                    if (ektwVar5.b().g()) {
                        emxcVar3 = emxcVar3.g() ? emxc.j(Long.valueOf(Math.min(((Long) emxcVar3.c()).longValue(), ((Long) ektwVar5.b().c()).longValue()))) : ektwVar5.b();
                    }
                }
                if (!emxcVar3.g()) {
                    return cmhVar;
                }
                HashMap hashMap = new HashMap(cmhVar);
                enpd enpdVar = enpd.a;
                HashSet hashSet4 = new HashSet();
                long longValue = ((Long) emxcVar3.c()).longValue();
                ektv.a(enpdVar, hashSet4);
                ekru ekruVar = new ekru(hashSet4, longValue, emxcVar3);
                ektw ektwVar6 = (ektw) hashMap.get(enpdVar);
                if (ektwVar6 == null) {
                    hashMap.put(enpdVar, ekruVar);
                } else {
                    hashMap.put(enpdVar, ektw.d(ektwVar6, ekruVar));
                }
                return DesugarCollections.unmodifiableMap(hashMap);
            }
        }), this.d);
    }
}
