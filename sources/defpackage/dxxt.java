package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxxt implements dwqt {
    public final engw a;
    public final engw b;
    public final efbm c;
    public final emyl d;
    public final boolean e;
    private final String f;

    public dxxt(dxxs dxxsVar) {
        this.a = dxxsVar.a;
        this.b = dxxsVar.b;
        this.c = dxxsVar.c;
        this.f = dxxsVar.d;
        this.d = dxxsVar.e;
        this.e = dxxsVar.f;
    }

    public static ListenableFuture b(final dwpj dwpjVar, final engw engwVar) {
        return dycg.c(engwVar).a(new Callable() { // from class: dxxi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enin eninVar = new enin();
                int i = 0;
                while (true) {
                    engw engwVar2 = engw.this;
                    if (i >= ((enou) engwVar2).c) {
                        dwpi dwpiVar = (dwpi) dwpjVar.toBuilder();
                        dwpiVar.copyOnWrite();
                        ((dwpj) dwpiVar.instance).g = dwpj.emptyProtobufList();
                        enip g = eninVar.g();
                        dwpiVar.copyOnWrite();
                        dwpj dwpjVar2 = (dwpj) dwpiVar.instance;
                        dwpjVar2.a();
                        eydl.addAll(g, dwpjVar2.g);
                        return (dwpj) dwpiVar.build();
                    }
                    eninVar.j((Iterable) erqt.q((ListenableFuture) engwVar2.get(i)));
                    i++;
                }
            }
        }, erpp.a);
    }

    @Override // defpackage.dwqt
    public final ListenableFuture a(final dwub dwubVar) {
        dxth.b("%s: Refresh file groups config with MDD", "FilteringPopulator");
        dwrp f = dwrq.f();
        f.b(this.f);
        dycd g = dycd.e(dwubVar.e(f.a())).g(new eroh() { // from class: dxxh
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxxt dxxtVar = dxxt.this;
                dwns dwnsVar = (dwns) obj;
                if (dwnsVar == null || dwnsVar.h.size() == 0) {
                    dxth.b("%s: All slices file group unavailable or empty.", "FilteringPopulator");
                    return erqt.i(null);
                }
                try {
                    final dwpj dwpjVar = (dwpj) dxxtVar.c.c(Uri.parse(((dwno) dwnsVar.h.get(0)).d), efdx.b(dwpj.a));
                    eygr eygrVar = dwpjVar.g;
                    int i = engw.d;
                    engr engrVar = new engr();
                    engw engwVar = dxxtVar.a;
                    int size = engwVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        try {
                            engrVar.h(((dxxr) engwVar.get(i2)).a(eygrVar));
                        } catch (Exception e) {
                            dxth.k(e, "%s: Failed to apply filter", "FilteringPopulator");
                            return erqt.h(e);
                        }
                    }
                    final dwub dwubVar2 = dwubVar;
                    final engw g2 = engrVar.g();
                    return elfr.k(dxxtVar.d.get(), new eroh() { // from class: dxxo
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Object f2;
                            List<Account> list = (List) obj2;
                            int i3 = engw.d;
                            engr engrVar2 = new engr();
                            dwpj dwpjVar2 = dwpjVar;
                            final dwub dwubVar3 = dwubVar2;
                            engw engwVar2 = g2;
                            dxxt dxxtVar2 = dxxt.this;
                            if (dxxtVar2.e) {
                                engrVar2.h(dycd.e(dxxt.b(dwpjVar2, engwVar2)).g(new eroh() { // from class: dxxj
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        dwob dwobVar = new dwob();
                                        dwobVar.c((dwpj) obj3);
                                        return dwub.this.a(dwobVar.a());
                                    }
                                }, erpp.a).f(new emwl() { // from class: dxxk
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        if (((Boolean) obj3).booleanValue()) {
                                            dxth.b("%s: Added public filegroup to MDD", "FilteringPopulator");
                                            return null;
                                        }
                                        dxth.b("%s: Didn't add public filegroup to MDD", "FilteringPopulator");
                                        return null;
                                    }
                                }, erpp.a));
                            }
                            for (final Account account : list) {
                                engr engrVar3 = new engr();
                                engw engwVar3 = dxxtVar2.b;
                                int size2 = engwVar3.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    try {
                                        engrVar3.h(((dxxq) engwVar3.get(i4)).a());
                                    } catch (Exception e2) {
                                        dxth.k(e2, "%s: Failed to apply filter", "FilteringPopulator");
                                        f2 = erqt.h(e2);
                                    }
                                }
                                engrVar3.j(engwVar2);
                                f2 = dycd.e(dxxt.b(dwpjVar2, engrVar3.g())).g(new eroh() { // from class: dxxm
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        dwob dwobVar = new dwob();
                                        dwobVar.b(emxc.j(account));
                                        dwobVar.c((dwpj) obj3);
                                        return dwub.this.a(dwobVar.a());
                                    }
                                }, erpp.a).f(new emwl() { // from class: dxxn
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        if (((Boolean) obj3).booleanValue()) {
                                            dxth.b("%s: Added file group to MDD", "FilteringPopulator");
                                            return null;
                                        }
                                        dxth.b("%s: Didn't add file group to MDD", "FilteringPopulator");
                                        return null;
                                    }
                                }, erpp.a);
                                engrVar2.h(f2);
                            }
                            return dycg.c(engrVar2.g()).a(new Callable() { // from class: dxxl
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, erpp.a);
                        }
                    }, erpp.a);
                } catch (IOException e2) {
                    dxth.k(e2, "%s: Failed to read file using mobstore and parsing to proto", "FilteringPopulator");
                    return erqt.h(e2);
                }
            }
        }, erpp.a);
        elfr.l(g, new dxxp(), erpp.a);
        return g;
    }
}
