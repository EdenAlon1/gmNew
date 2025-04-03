package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvow implements dvmw {
    private final dvmw a;
    private final errl b;
    private final eafz c;
    private Map d;

    public dvow(dvmw dvmwVar, errl errlVar, eafz eafzVar) {
        this.a = dvmwVar;
        this.b = errlVar;
        this.c = eafzVar;
    }

    private final ListenableFuture i() {
        Map map = this.d;
        if (map != null) {
            return erqt.i(map);
        }
        this.c.b();
        return erny.f(erqc.o(this.a.b()), eldl.a(new emwl() { // from class: dvov
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dvow.this.f((Collection) obj);
            }
        }), this.b);
    }

    private final synchronized void j(dvpk dvpkVar) {
        if (!this.d.containsKey(dvpkVar.a())) {
            this.d.put(dvpkVar.a(), new HashSet());
        }
        Set set = (Set) this.d.get(dvpkVar.a());
        set.remove(dvpkVar);
        set.add(dvpkVar);
    }

    @Override // defpackage.dvmw
    public final synchronized ListenableFuture a(long j) {
        Map map = this.d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Collection<dvpk> collection = (Collection) entry.getValue();
                HashSet hashSet = new HashSet();
                for (dvpk dvpkVar : collection) {
                    if (dvpkVar.c >= j) {
                        hashSet.add(dvpkVar);
                    }
                }
                entry.setValue(hashSet);
            }
        }
        return this.a.a(j);
    }

    @Override // defpackage.dvmw
    public final synchronized ListenableFuture b() {
        return erny.f(erqc.o(i()), new emwl() { // from class: dvos
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dvow.this.h();
            }
        }, erpp.a);
    }

    @Override // defpackage.dvmw
    public final synchronized ListenableFuture c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dvpk dvpkVar = (dvpk) it.next();
            if (dvpkVar.b > dvpkVar.c) {
                return erqt.h(new dvmr());
            }
        }
        this.c.b();
        if (this.d != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                j((dvpk) it2.next());
            }
        }
        return this.a.c(collection);
    }

    public final synchronized ListenableFuture d(final String str, final long j) {
        this.c.b();
        return erny.f(erqc.o(i()), eldl.a(new emwl() { // from class: dvot
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Set<dvpk> g = dvow.this.g(str);
                HashSet hashSet = new HashSet();
                for (dvpk dvpkVar : g) {
                    long j2 = j;
                    if (dvpkVar.b <= j2 && j2 <= dvpkVar.c) {
                        hashSet.add(dvpkVar);
                    }
                }
                return hashSet;
            }
        }), erpp.a);
    }

    public final synchronized ListenableFuture e() {
        return erny.f(erqc.o(i()), new emwl() { // from class: dvou
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final synchronized Map f(Collection collection) {
        this.d = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j((dvpk) it.next());
        }
        return this.d;
    }

    public final synchronized Set g(String str) {
        if (this.d.containsKey(str)) {
            return (Set) this.d.get(str);
        }
        return enpd.a;
    }

    public final synchronized Set h() {
        Collection values;
        values = this.d.values();
        values.getClass();
        return enpw.e(new enez(values));
    }
}
