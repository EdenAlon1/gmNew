package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejds extends eiyk {
    private final ejcw a;
    private final ejdd b;

    public ejds(ejcw ejcwVar, ejdd ejddVar) {
        this.a = ejcwVar;
        this.b = ejddVar;
    }

    @Override // defpackage.eiyk
    public final ListenableFuture a(final eisx eisxVar) {
        final ejdr ejdrVar = (ejdr) this.b;
        return erny.g(ejdrVar.a.a(), eldl.d(new eroh() { // from class: ejdp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eisx eisxVar2 = eisxVar;
                ejec b = ejcw.b((ejdx) obj, eisxVar2);
                int a = eizc.a(b.e);
                if (a != 0 && a == 2) {
                    return erqt.i(null);
                }
                final ejdr ejdrVar2 = ejdr.this;
                final eizj eizjVar = new eizj(eisxVar2, ((eizi) ejdr.a(b)).a);
                Set set = (Set) ejdrVar2.c.b();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        final ejfi ejfiVar = ((ejfe) it.next()).a;
                        errl errlVar = ejfiVar.a;
                        final eisx eisxVar3 = eizjVar.a;
                        arrayList.add(errlVar.submit(new Runnable() { // from class: ejfh
                            @Override // java.lang.Runnable
                            public final void run() {
                                String b2 = ejer.b(eisxVar3);
                                enqu listIterator = ejfi.this.b.a().listIterator();
                                while (listIterator.hasNext()) {
                                    File file = new File((File) listIterator.next(), b2);
                                    if (file.exists() && !file.setWritable(true, true)) {
                                        throw new RuntimeException("Could not make data dir writable.");
                                    }
                                }
                            }
                        }));
                    } catch (Exception e) {
                        arrayList.add(erqt.h(e));
                    }
                }
                return erny.g(erqt.c(arrayList).b(eldl.c(new erog() { // from class: ejde
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final eisx eisxVar4 = eisxVar2;
                        return ejdr.this.a.b(new emwl() { // from class: ejdh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ejdw ejdwVar = (ejdw) ((ejdx) obj2).toBuilder();
                                eisx eisxVar5 = eisx.this;
                                int a2 = eisxVar5.a();
                                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((ejdx) ejdwVar.instance).d);
                                Integer valueOf = Integer.valueOf(a2);
                                if (!unmodifiableMap.containsKey(valueOf)) {
                                    throw new IllegalArgumentException();
                                }
                                ejeb ejebVar = (ejeb) ((ejec) unmodifiableMap.get(valueOf)).toBuilder();
                                ejebVar.copyOnWrite();
                                ejec ejecVar = (ejec) ejebVar.instance;
                                ejecVar.e = 1;
                                ejecVar.b |= 4;
                                ejdwVar.a(eisxVar5.a(), (ejec) ejebVar.build());
                                return (ejdx) ejdwVar.build();
                            }
                        }, erpp.a);
                    }
                }), erpp.a), eldl.d(new eroh() { // from class: ejdf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final ejdr ejdrVar3 = ejdr.this;
                        Set set2 = (Set) ejdrVar3.g.b();
                        final eiyc eiycVar = eizjVar;
                        return ejdr.c(eiycVar, set2).b(eldl.c(new erog() { // from class: ejdm
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return ejdr.c(eiycVar, (Set) ejdr.this.d.b()).a(new Callable() { // from class: ejdl
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, erpp.a);
                            }
                        }), erpp.a);
                    }
                }), erpp.a);
            }
        }), erpp.a);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture b(String str, String str2) {
        ejcw ejcwVar = this.a;
        final String str3 = "pseudonymous";
        return elfr.j(ejcwVar.a.a(), new emwl(str3, str3) { // from class: ejcs
            public final /* synthetic */ String a = "pseudonymous";
            public final /* synthetic */ String b = "pseudonymous";

            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Iterator it = DesugarCollections.unmodifiableMap(((ejdx) obj).d).values().iterator();
                while (true) {
                    String str4 = this.a;
                    if (!it.hasNext()) {
                        throw new eizq("No account is found for ".concat(str4));
                    }
                    ejec ejecVar = (ejec) it.next();
                    eixz eixzVar = ejecVar.d;
                    if (eixzVar == null) {
                        eixzVar = eixz.a;
                    }
                    if (eixzVar.k.equals(str4)) {
                        eixz eixzVar2 = ejecVar.d;
                        if (eixzVar2 == null) {
                            eixzVar2 = eixz.a;
                        }
                        if (eixzVar2.c.equals(this.b)) {
                            return eisx.b(ejecVar.c);
                        }
                    }
                }
            }
        }, ejcwVar.b);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture c(final eisx eisxVar) {
        return elfr.j(this.a.a.a(), new emwl() { // from class: ejct
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ejcw.a(ejcw.b((ejdx) obj, eisx.this));
            }
        }, erpp.a);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture d() {
        ejcw ejcwVar = this.a;
        return elfr.j(ejcwVar.a.a(), new emwl() { // from class: ejcv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enin eninVar = new enin();
                Iterator it = DesugarCollections.unmodifiableMap(((ejdx) obj).d).values().iterator();
                while (it.hasNext()) {
                    eninVar.c(eisx.b(((ejec) it.next()).c));
                }
                return eninVar.g();
            }
        }, ejcwVar.b);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture e() {
        ejcw ejcwVar = this.a;
        return elfr.j(ejcwVar.a.a(), new emwl() { // from class: ejcu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = engw.d;
                engr engrVar = new engr();
                Iterator it = DesugarCollections.unmodifiableMap(((ejdx) obj).d).values().iterator();
                while (it.hasNext()) {
                    engrVar.h(ejcw.a((ejec) it.next()));
                }
                return engrVar.g();
            }
        }, ejcwVar.b);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture f() {
        ejcw ejcwVar = this.a;
        return elfr.j(ejcwVar.a.a(), new emwl() { // from class: ejco
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enin eninVar = new enin();
                for (ejec ejecVar : DesugarCollections.unmodifiableMap(((ejdx) obj).d).values()) {
                    int a = eizc.a(ejecVar.e);
                    if (a != 0 && a == 2) {
                        eninVar.c(eisx.b(ejecVar.c));
                    }
                }
                return eninVar.g();
            }
        }, ejcwVar.b);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture g() {
        ejcw ejcwVar = this.a;
        return elfr.j(ejcwVar.a.a(), new emwl() { // from class: ejcr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = engw.d;
                engr engrVar = new engr();
                for (ejec ejecVar : DesugarCollections.unmodifiableMap(((ejdx) obj).d).values()) {
                    int a = eizc.a(ejecVar.e);
                    if (a != 0 && a == 2) {
                        engrVar.h(ejcw.a(ejecVar));
                    }
                }
                return engrVar.g();
            }
        }, ejcwVar.b);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture h(final eisx eisxVar) {
        return elfr.j(this.a.a.a(), new emwl() { // from class: ejcq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int a = eizc.a(ejcw.b((ejdx) obj, eisx.this).e);
                boolean z = false;
                if (a != 0 && a == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, erpp.a);
    }

    @Override // defpackage.eiyk
    public final ListenableFuture i() {
        return elfr.j(this.a.a.a(), new emwl() { // from class: ejcp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return DesugarCollections.unmodifiableMap(((ejdx) obj).d).keySet();
            }
        }, erpp.a);
    }

    @Override // defpackage.eiyk
    public final eixn j(eisx eisxVar) {
        try {
            ejcn ejcnVar = this.a.a;
            dtoq dtoqVar = ejcnVar.c;
            final effy effyVar = ejcnVar.a;
            effyVar.getClass();
            return ejcw.a(ejcw.b((ejdx) dtoqVar.b(new erog() { // from class: ejck
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return effy.this.a();
                }
            }), eisxVar));
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    @Override // defpackage.eiyk
    public final ListenableFuture k(final Collection collection) {
        ekzz f = eleg.f("Sync Accounts");
        ejdd ejddVar = this.b;
        try {
            elfl h = elfl.g(((ejdr) ejddVar).d(((ejdr) ejddVar).a, new emwl() { // from class: ejdj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ejdw ejdwVar = (ejdw) ((ejdx) obj).toBuilder();
                    return new ejdt(ejdr.b(collection, ejdwVar), (ejdx) ejdwVar.build());
                }
            })).i(new ejdk((ejdr) ejddVar), ((ejdr) ejddVar).b).h(new emwn(null), erpp.a);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eiyk
    public final ListenableFuture l(final Collection collection, final enip enipVar) {
        emxf.a(!enipVar.isEmpty());
        enqu listIterator = enipVar.listIterator();
        ejdd ejddVar = this.b;
        while (listIterator.hasNext()) {
            ((String) listIterator.next()).getClass();
            emxf.a(!r3.isEmpty());
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eixz eixzVar = (eixz) it.next();
            boolean z = false;
            emxf.a((eixzVar.b & 256) != 0);
            emxf.a(1 == (eixzVar.b & 1));
            emxf.a((eixzVar.b & 16) != 0);
            if (eixzVar.i) {
                int i = eixzVar.b;
                if ((i & 128) != 0) {
                    if ((i & 1) == 0) {
                    }
                }
                emxf.a(z);
                emxf.i(enipVar.contains(eixzVar.k), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", enipVar, eixzVar.k);
            }
            z = true;
            emxf.a(z);
            emxf.i(enipVar.contains(eixzVar.k), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", enipVar, eixzVar.k);
        }
        ekzz f = eleg.f("Sync Accounts for Types");
        try {
            elfl h = elfl.g(((ejdr) ejddVar).d(((ejdr) ejddVar).a, new emwl() { // from class: ejdi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ejdx ejdxVar = (ejdx) obj;
                    enhd enhdVar = new enhd();
                    ejdw ejdwVar = (ejdw) ejdxVar.toBuilder();
                    ejdwVar.copyOnWrite();
                    ((ejdx) ejdwVar.instance).a().clear();
                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(ejdxVar.d).entrySet()) {
                        eixz eixzVar2 = ((ejec) entry.getValue()).d;
                        if (eixzVar2 == null) {
                            eixzVar2 = eixz.a;
                        }
                        if (enip.this.contains(eixzVar2.k)) {
                            ejdwVar.a(((Integer) entry.getKey()).intValue(), (ejec) entry.getValue());
                        } else {
                            enhdVar.i(entry);
                        }
                    }
                    enhk b = ejdr.b(collection, ejdwVar);
                    enhk c = enhdVar.c();
                    ejdwVar.copyOnWrite();
                    ((ejdx) ejdwVar.instance).a().putAll(c);
                    return new ejdt(b, (ejdx) ejdwVar.build());
                }
            })).i(new ejdk((ejdr) ejddVar), ((ejdr) ejddVar).b).h(new emwn(null), erpp.a);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
