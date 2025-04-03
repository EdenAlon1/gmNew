package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejdr implements ejdd {
    public final ejcn a;
    public final errl b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final errl h;

    public ejdr(ejcn ejcnVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ejcnVar;
        this.h = errlVar;
        this.b = errlVar2;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.g = ffbrVar5;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    public static eixn a(ejec ejecVar) {
        eisx b = eisx.b(ejecVar.c);
        eixz eixzVar = ejecVar.d;
        if (eixzVar == null) {
            eixzVar = eixz.a;
        }
        int a = eizc.a(ejecVar.e);
        if (a == 0) {
            a = 1;
        }
        return new eizi(b, eixzVar, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static enhk b(Collection collection, ejdw ejdwVar) {
        int a;
        int i;
        eixz eixzVar;
        ejdx ejdxVar = (ejdx) ejdwVar.build();
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eixz eixzVar2 = (eixz) it.next();
            Iterator it2 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ejdx) ejdwVar.instance).d)).values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    ejeb ejebVar = (ejeb) ejec.a.createBuilder();
                    ejebVar.copyOnWrite();
                    ejec ejecVar = (ejec) ejebVar.instance;
                    eixzVar2.getClass();
                    ejecVar.d = eixzVar2;
                    ejecVar.b = 2 | ejecVar.b;
                    ejebVar.copyOnWrite();
                    ejec ejecVar2 = (ejec) ejebVar.instance;
                    ejecVar2.e = 0;
                    ejecVar2.b |= 4;
                    i = ((ejdx) ejdwVar.instance).c;
                    ejdwVar.copyOnWrite();
                    ejdx ejdxVar2 = (ejdx) ejdwVar.instance;
                    ejdxVar2.b |= 1;
                    ejdxVar2.c = i + 1;
                    ejebVar.copyOnWrite();
                    ejec ejecVar3 = (ejec) ejebVar.instance;
                    ejecVar3.b = 1 | ejecVar3.b;
                    ejecVar3.c = i;
                    ejdwVar.a(i, (ejec) ejebVar.build());
                    break;
                }
                ejec ejecVar4 = (ejec) it2.next();
                eixz eixzVar3 = ejecVar4.d;
                if (eixzVar3 == null) {
                    eixzVar3 = eixz.a;
                }
                if (eixzVar3.k.equals(eixzVar2.k) && eixzVar3.c.equals(eixzVar2.c)) {
                    ejeb ejebVar2 = (ejeb) ejecVar4.toBuilder();
                    ejebVar2.copyOnWrite();
                    ejec ejecVar5 = (ejec) ejebVar2.instance;
                    eixzVar2.getClass();
                    eixz eixzVar4 = ejecVar5.d;
                    if (eixzVar4 == null || eixzVar4 == (eixzVar = eixz.a)) {
                        ejecVar5.d = eixzVar2;
                    } else {
                        eixy eixyVar = (eixy) eixzVar.createBuilder(eixzVar4);
                        eixyVar.mergeFrom((eixy) eixzVar2);
                        ejecVar5.d = (eixz) eixyVar.buildPartial();
                    }
                    ejecVar5.b = 2 | ejecVar5.b;
                    ejdwVar.a(ejecVar4.c, (ejec) ejebVar2.build());
                    i = ejecVar4.c;
                }
            }
            hashMap.put(eisx.b(i), eixzVar2);
        }
        enhk j = enhk.j(hashMap);
        emxf.m(j.size() == collection.size(), "Provider had duplicate accounts.");
        enin eninVar = new enin();
        Iterator it3 = DesugarCollections.unmodifiableMap(ejdxVar.d).values().iterator();
        while (it3.hasNext()) {
            eninVar.c(eisx.b(((ejec) it3.next()).c));
        }
        enip<eisx> d = enpw.b(eninVar.g(), j.keySet()).d();
        enhd enhdVar = new enhd();
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ejdx) ejdwVar.instance).d));
        for (eisx eisxVar : d) {
            Integer valueOf = Integer.valueOf(eisxVar.a());
            if (unmodifiableMap.containsKey(valueOf) && (a = eizc.a(((ejec) unmodifiableMap.get(valueOf)).e)) != 0 && a == 2) {
                enhdVar.k(eisxVar, (ejec) unmodifiableMap.get(valueOf));
            }
        }
        enhk c = enhdVar.c();
        Iterator<E> it4 = d.iterator();
        while (it4.hasNext()) {
            int a2 = ((eisx) it4.next()).a();
            ejdwVar.copyOnWrite();
            ((ejdx) ejdwVar.instance).a().remove(Integer.valueOf(a2));
        }
        return c;
    }

    public static erqp c(eiyc eiycVar, Set set) {
        ListenableFuture h;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                h = ((eiye) it.next()).b(eiycVar);
                arrayList.add(h);
            } catch (Exception e) {
                h = erqt.h(e);
            }
            ejjz.c(h, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return erqt.a(arrayList);
    }

    final ListenableFuture d(ejcn ejcnVar, final emwl emwlVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return erny.f(ejcnVar.b(eldl.a(new emwl() { // from class: ejdn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejdq ejdqVar = (ejdq) emwl.this.apply((ejdx) obj);
                atomicReference.set(ejdqVar.b());
                return ejdqVar.a();
            }
        }), this.h), eldl.a(new emwl() { // from class: ejdo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return atomicReference.get();
            }
        }), erpp.a);
    }
}
