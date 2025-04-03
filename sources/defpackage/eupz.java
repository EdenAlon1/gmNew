package defpackage;

import android.os.Trace;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupz implements eupo, eurz {
    private static final euug c = new euug() { // from class: eupt
        @Override // defpackage.euug
        public final Object a() {
            return Collections.EMPTY_SET;
        }
    };
    private final List f;
    private final euqh h;
    private final eups i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public eupz(Executor executor, Iterable iterable, Collection collection, eups eupsVar) {
        euqh euqhVar = new euqh(executor);
        this.h = euqhVar;
        this.i = eupsVar;
        ArrayList<eupm> arrayList = new ArrayList();
        arrayList.add(eupm.e(euqhVar, euqh.class, eusu.class, eust.class));
        arrayList.add(eupm.e(this, eurz.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eupm eupmVar = (eupm) it.next();
            if (eupmVar != null) {
                arrayList.add(eupmVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((euug) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (final eupm<?> eupmVar2 : componentRegistrar.getComponents()) {
                            final String str = eupmVar2.a;
                            if (str != null) {
                                eupmVar2 = new eupm<>(str, eupmVar2.b, eupmVar2.c, eupmVar2.d, eupmVar2.e, new eupr() { // from class: euyw
                                    @Override // defpackage.eupr
                                    public final Object a(eupo eupoVar) {
                                        String str2 = str;
                                        eupm eupmVar3 = eupmVar2;
                                        try {
                                            Trace.beginSection(str2);
                                            return eupmVar3.f.a(eupoVar);
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                }, eupmVar2.g);
                            }
                            arrayList4.add(eupmVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (euqi e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((eupm) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                euqc.a(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                euqc.a(arrayList5);
            }
            for (final eupm eupmVar3 : arrayList) {
                this.a.put(eupmVar3, new euqj(new euug() { // from class: eupu
                    @Override // defpackage.euug
                    public final Object a() {
                        eupm eupmVar4 = eupmVar3;
                        return eupmVar4.f.a(new euqs(eupmVar4, eupz.this));
                    }
                }));
            }
            ArrayList arrayList6 = new ArrayList();
            for (eupm eupmVar4 : arrayList) {
                if (eupmVar4.f()) {
                    final euug euugVar = (euug) this.a.get(eupmVar4);
                    for (euqq euqqVar : eupmVar4.b) {
                        if (this.d.containsKey(euqqVar)) {
                            final euqn euqnVar = (euqn) ((euug) this.d.get(euqqVar));
                            arrayList6.add(new Runnable() { // from class: eupv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    euqn euqnVar2 = euqn.this;
                                    euug euugVar2 = euugVar;
                                    if (euqnVar2.b != euqn.a) {
                                        throw new IllegalStateException("provide() can be called only once.");
                                    }
                                    synchronized (euqnVar2) {
                                        euqnVar2.b = euugVar2;
                                    }
                                }
                            });
                        } else {
                            this.d.put(euqqVar, euugVar);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                eupm eupmVar5 = (eupm) entry.getKey();
                if (!eupmVar5.f()) {
                    euug euugVar2 = (euug) entry.getValue();
                    for (euqq euqqVar2 : eupmVar5.b) {
                        if (!hashMap.containsKey(euqqVar2)) {
                            hashMap.put(euqqVar2, new HashSet());
                        }
                        ((Set) hashMap.get(euqqVar2)).add(euugVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (this.e.containsKey(entry2.getKey())) {
                    final euqk euqkVar = (euqk) this.e.get(entry2.getKey());
                    for (final euug euugVar3 : (Set) entry2.getValue()) {
                        arrayList7.add(new Runnable() { // from class: eupw
                            @Override // java.lang.Runnable
                            public final void run() {
                                euqk.this.c(euugVar3);
                            }
                        });
                    }
                } else {
                    this.e.put((euqq) entry2.getKey(), euqk.b((Collection) entry2.getValue()));
                }
            }
            arrayList3.addAll(arrayList7);
            for (eupm eupmVar6 : this.a.keySet()) {
                for (euqd euqdVar : eupmVar6.c) {
                    if (euqdVar.b() && !this.e.containsKey(euqdVar.a)) {
                        this.e.put(euqdVar.a, euqk.b(Collections.EMPTY_SET));
                    } else if (this.d.containsKey(euqdVar.a)) {
                        continue;
                    } else {
                        if (euqdVar.b == 1) {
                            throw new euql(String.format("Unsatisfied dependency for component %s: %s", eupmVar6, euqdVar.a));
                        }
                        if (!euqdVar.b()) {
                            this.d.put(euqdVar.a, new euqn(euqn.a));
                        }
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) arrayList3.get(i2)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map = this.a;
            bool.booleanValue();
            f(map);
        }
    }

    @Override // defpackage.eupo
    public final synchronized euug a(euqq euqqVar) {
        return (euug) this.d.get(euqqVar);
    }

    @Override // defpackage.eupo
    public final /* synthetic */ euug b(Class cls) {
        return eupn.a(this, cls);
    }

    @Override // defpackage.eupo
    public final synchronized euug c(euqq euqqVar) {
        euqk euqkVar = (euqk) this.e.get(euqqVar);
        if (euqkVar != null) {
            return euqkVar;
        }
        return c;
    }

    @Override // defpackage.eupo
    public final /* synthetic */ Object d(euqq euqqVar) {
        throw null;
    }

    @Override // defpackage.eupo
    public final /* synthetic */ Object e(Class cls) {
        return eupn.c(this, cls);
    }

    public final void f(Map map) {
        Queue<euss> queue;
        for (Map.Entry entry : map.entrySet()) {
            eupm eupmVar = (eupm) entry.getKey();
            euug euugVar = (euug) entry.getValue();
            if (eupmVar.d == 1) {
                euugVar.a();
            }
        }
        euqh euqhVar = this.h;
        synchronized (euqhVar) {
            queue = euqhVar.a;
            if (queue != null) {
                euqhVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (euss eussVar : queue) {
                euqo.b(eussVar);
                synchronized (euqhVar) {
                    Queue queue2 = euqhVar.a;
                    if (queue2 != null) {
                        queue2.add(eussVar);
                    } else {
                        for (final Map.Entry entry2 : euqhVar.c()) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: euqg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    euws euwsVar = ((euwr) entry2.getKey()).a;
                                    if (euwsVar.b()) {
                                        euwsVar.a.g();
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
