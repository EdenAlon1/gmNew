package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybd implements dwqt {
    public final Executor a;
    public final ezib b;
    public final emyl c;
    public final emyl d;
    public final dybq e;
    public final emyv f;
    public final dwqy g;
    private final Context h;
    private final dxwy i;
    private final dycc j = new dycc();

    public dybd(dybc dybcVar) {
        this.h = dybcVar.a;
        this.a = dybcVar.c;
        this.b = dybcVar.b;
        dxwx dxwxVar = dybcVar.j;
        dwqy dwqyVar = dybcVar.h;
        this.i = new dxwy(dxwxVar, dwqyVar);
        this.c = dybcVar.d;
        this.e = dybcVar.g;
        this.d = dybcVar.f;
        this.f = dybcVar.i;
        this.g = dwqyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ListenableFuture c(enhk enhkVar, ezib ezibVar) {
        emxc i = emxc.i((dufs) enhkVar.get(ezibVar));
        if (!i.g() || ((dufs) i.c()).b().isEmpty()) {
            return erre.a;
        }
        return erqt.h(((enou) ((dufs) i.c()).b()).c == 1 ? (Throwable) ((dufs) i.c()).b().get(0) : dwoa.a(((dufs) i.c()).b(), "Multiple Geller sync failures", new Object[0]));
    }

    @Override // defpackage.dwqt
    public final ListenableFuture a(dwub dwubVar) {
        return this.j.b(new erog() { // from class: dyay
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dybc.c().booleanValue();
                final dybd dybdVar = dybd.this;
                dxth.c("%s: Starting GDD Sync for corpus: %s", "GddFileGroupPopulator", dybdVar.b.name());
                dybq dybqVar = dybdVar.e;
                emux emuxVar = emux.a;
                enhk enhkVar = dybqVar.a;
                ezib ezibVar = dybdVar.b;
                return elfr.k(!enhkVar.containsKey(ezibVar) ? erqt.i(emux.a) : elfr.j(((dxzx) dybqVar.a.get(ezibVar)).a(emuxVar), new emwl() { // from class: dybl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        engw engwVar = (engw) obj;
                        if (engwVar.isEmpty()) {
                            return emux.a;
                        }
                        String str = ((dwro) engwVar.get(0)).e;
                        return str.isEmpty() ? emux.a : emxc.j(str);
                    }
                }, dybqVar.b), new eroh() { // from class: dyak
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        emxc emxcVar = (emxc) obj;
                        boolean g = emxcVar.g();
                        final dybd dybdVar2 = dybd.this;
                        if (!g) {
                            dxth.c("%s: Empty configuration id found for corpus %s, skipping sync", "GddFileGroupPopulator", dybdVar2.b.name());
                            return erre.a;
                        }
                        final ezib ezibVar2 = dybdVar2.b;
                        final String str = (String) emxcVar.c();
                        final ListenableFuture b = dybdVar2.b(cgoc.a(), dwqm.GDD_INVALID_ACCOUNT, ezibVar2, str);
                        final ListenableFuture b2 = dybdVar2.b(!dybdVar2.g.H() ? erqt.i(emux.a) : erqt.i(emux.a), dwqm.GDD_FAIL_TO_RETRIEVE_ZWIEBACK_TOKEN, ezibVar2, str);
                        final ListenableFuture b3 = dycg.d(b, b2).b(new erog() { // from class: dyao
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                List list = (List) erqt.q(b);
                                final emxc emxcVar2 = (emxc) erqt.q(b2);
                                boolean isEmpty = list.isEmpty();
                                final ezib ezibVar3 = ezibVar2;
                                final String str2 = str;
                                if (isEmpty) {
                                    dxth.p("%s: Account was not provided, skipping private sync for corpus: %s, configuration: %s", "GddFileGroupPopulator", ezibVar3.name(), str2);
                                    return erre.a;
                                }
                                ListenableFuture listenableFuture = erre.a;
                                final ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (true) {
                                    final dybd dybdVar3 = dybd.this;
                                    if (!it.hasNext()) {
                                        return dycg.a(arrayList).b(new erog() { // from class: dyax
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                return dwoa.b(arrayList, "Private sync failure", new Object[0]);
                                            }
                                        }, dybdVar3.a);
                                    }
                                    final Account account = (Account) it.next();
                                    listenableFuture = dyce.a(listenableFuture).g(new eroh() { // from class: dyav
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            return dybd.this.b(elfo.d(new IllegalStateException("OAuth not supported")), dwqm.GDD_INVALID_AUTH_TOKEN, ezibVar3, str2);
                                        }
                                    }, dybdVar3.a).g(new eroh() { // from class: dyaw
                                        /* JADX WARN: Type inference failed for: r4v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            final String str3 = (String) obj2;
                                            final ezib ezibVar4 = ezibVar3;
                                            String name = ezibVar4.name();
                                            final Account account2 = account;
                                            dxth.d("%s: Performing private sync for corpus: %s, account: %s", "GddFileGroupPopulator", name, account2.name);
                                            final dybd dybdVar4 = dybd.this;
                                            final emyg c = emyg.c(dybdVar4.f);
                                            dycd e = dycd.e(dybdVar4.c.get());
                                            final emxc emxcVar3 = emxcVar2;
                                            dycd g2 = e.g(new eroh() { // from class: dyaz
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    return ((dufc) obj3).a(null, (String) emxc.this.f(), account2, str3, new enpx(ezibVar4), 4, emux.a);
                                                }
                                            }, dybdVar4.a).g(new eroh() { // from class: dyba
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    enhk enhkVar2 = (enhk) obj3;
                                                    emyg.this.a(TimeUnit.MILLISECONDS);
                                                    String str4 = account2.name;
                                                    dufz.a(enhkVar2);
                                                    return dybd.c(enhkVar2, ezibVar4);
                                                }
                                            }, dybdVar4.a);
                                            final String str4 = str2;
                                            return dybdVar4.b(g2.g(new eroh() { // from class: dyal
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    ezib ezibVar5 = ezibVar4;
                                                    String name2 = ezibVar5.name();
                                                    String str5 = str4;
                                                    dxth.d("%s: GDD Private Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", name2, str5);
                                                    dybd.this.d(2015, ezibVar5, str5);
                                                    return erre.a;
                                                }
                                            }, dybdVar4.a), dwqm.GDD_FAIL_IN_SYNC_RUNNER_PRIVATE, ezibVar4, str4);
                                        }
                                    }, dybdVar3.a);
                                    arrayList.add(listenableFuture);
                                }
                            }
                        }, dybdVar2.a);
                        final dycd g2 = dyce.a(b3).g(new eroh() { // from class: dyap
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ListenableFuture.this;
                            }
                        }, dybdVar2.a).g(new eroh() { // from class: dyaq
                            /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final emxc emxcVar2 = (emxc) obj2;
                                dybc.b().booleanValue();
                                final ezib ezibVar3 = ezibVar2;
                                dxth.c("%s: Performing public sync for corpus: %s", "GddFileGroupPopulator", ezibVar3.name());
                                final dybd dybdVar3 = dybd.this;
                                Object obj3 = ((emyr) dybdVar3.d).a;
                                final emyg c = emyg.c(dybdVar3.f);
                                final String str2 = (String) obj3;
                                dycd g3 = dycd.e(dybdVar3.c.get()).g(new eroh() { // from class: dyas
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        return ((dufc) obj4).a(str2, (String) emxc.this.f(), null, null, new enpx(ezibVar3), 3, emux.a);
                                    }
                                }, dybdVar3.a).g(new eroh() { // from class: dyat
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        enhk enhkVar2 = (enhk) obj4;
                                        emyg.this.a(TimeUnit.MILLISECONDS);
                                        dufz.a(enhkVar2);
                                        return dybd.c(enhkVar2, ezibVar3);
                                    }
                                }, dybdVar3.a);
                                final String str3 = str;
                                return dybdVar3.b(g3.g(new eroh() { // from class: dyau
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj4) {
                                        ezib ezibVar4 = ezibVar3;
                                        String name = ezibVar4.name();
                                        String str4 = str3;
                                        dxth.d("%s: GDD Public Sync succeeded for corpus: %s, configuration: %s", "GddFileGroupPopulator", name, str4);
                                        dybd.this.d(2014, ezibVar4, str4);
                                        return erre.a;
                                    }
                                }, dybdVar3.a), dwqm.GDD_FAIL_IN_SYNC_RUNNER_PUBLIC, ezibVar3, str3);
                            }
                        }, dybdVar2.a);
                        return dycd.e(dycg.b(g2, b3).b(new erog() { // from class: dyar
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return dycd.e(erqt.f(ListenableFuture.this, b3));
                            }
                        }, dybdVar2.a)).g(new eroh() { // from class: dyan
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return erre.a;
                            }
                        }, dybdVar2.a);
                    }
                }, dybdVar.a);
            }
        }, this.a);
    }

    public final ListenableFuture b(ListenableFuture listenableFuture, final dwqm dwqmVar, final ezib ezibVar, final String str) {
        return elfr.f(listenableFuture, Exception.class, new eroh() { // from class: dyam
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwql a = dwqn.a();
                dwqm dwqmVar2 = dwqmVar;
                a.a = dwqmVar2;
                a.c = (Exception) obj;
                a.b = String.format("refresh failed [%s]", dwqmVar2.name());
                dwqn a2 = a.a();
                String stackTraceString = Log.isLoggable("MDD", 6) ? Log.getStackTraceString(a2) : "";
                String str2 = str;
                ezib ezibVar2 = ezibVar;
                dybd dybdVar = dybd.this;
                dxth.i("%s: GDD Sync failed for corpus: %s, configuration: %s\n%s", "GddFileGroupPopulator", ezibVar2.name(), str2, stackTraceString);
                dybdVar.d(erkd.b(a2.a.aF), ezibVar2, str2);
                return erqt.h(a2);
            }
        }, this.a);
    }

    public final void d(int i, ezib ezibVar, String str) {
        String packageName = this.h.getPackageName();
        String name = ezibVar.name();
        dxwy dxwyVar = this.i;
        long k = dxwyVar.a.k();
        if (dxth.a(k)) {
            erih erihVar = (erih) erii.a.createBuilder();
            erihVar.copyOnWrite();
            erii eriiVar = (erii) erihVar.instance;
            eriiVar.b |= 524288;
            eriiVar.f = k;
            eriv erivVar = (eriv) eriw.a.createBuilder();
            erivVar.copyOnWrite();
            eriw eriwVar = (eriw) erivVar.instance;
            eriwVar.c = erkd.a(i);
            eriwVar.b |= 1;
            erivVar.copyOnWrite();
            eriw eriwVar2 = (eriw) erivVar.instance;
            eriwVar2.b |= 2;
            eriwVar2.d = str;
            erivVar.copyOnWrite();
            eriw eriwVar3 = (eriw) erivVar.instance;
            packageName.getClass();
            eriwVar3.b |= 4;
            eriwVar3.e = packageName;
            erivVar.copyOnWrite();
            eriw eriwVar4 = (eriw) erivVar.instance;
            name.getClass();
            eriwVar4.b |= 8;
            eriwVar4.f = name;
            eriw eriwVar5 = (eriw) erivVar.build();
            erihVar.copyOnWrite();
            erii eriiVar2 = (erii) erihVar.instance;
            eriwVar5.getClass();
            eriiVar2.t = eriwVar5;
            eriiVar2.d |= 32;
            dxwyVar.b.a((erii) erihVar.build(), erjx.a(1105));
        }
    }
}
