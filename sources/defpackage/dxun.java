package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxun implements dxti {
    public static final /* synthetic */ int e = 0;
    private static final TimeZone f = DesugarTimeZone.getTimeZone("UTC");
    public final effy a;
    public final Executor b;
    public final Random c;
    public final dxbv d;

    public dxun(effy effyVar, dxbv dxbvVar, Executor executor, Random random) {
        this.a = effyVar;
        this.d = dxbvVar;
        this.b = executor;
        this.c = random;
    }

    public static long g(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.dxti
    public final ListenableFuture a() {
        return this.a.b(new emwl() { // from class: dxtz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = dxun.e;
                return dwtr.a;
            }
        }, erpp.a);
    }

    @Override // defpackage.dxti
    public final ListenableFuture b() {
        int i = engw.d;
        final AtomicReference atomicReference = new AtomicReference(enou.a);
        return elfr.j(this.a.b(new emwl() { // from class: dxul
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtr dwtrVar = (dwtr) obj;
                int i2 = dxun.e;
                atomicReference.set(dwtrVar.d);
                dwtp dwtpVar = (dwtp) dwtrVar.toBuilder();
                dwtpVar.copyOnWrite();
                ((dwtr) dwtpVar.instance).d = dwtr.emptyProtobufList();
                return (dwtr) dwtpVar.build();
            }
        }, this.b), eldl.a(new emwl() { // from class: dxua
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = dxun.e;
                return (List) atomicReference.get();
            }
        }), this.b);
    }

    @Override // defpackage.dxti
    public final ListenableFuture c() {
        final AtomicReference atomicReference = new AtomicReference(emux.a);
        return elfr.j(this.a.b(new emwl() { // from class: dxuj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtr dwtrVar = (dwtr) obj;
                long a = dxun.this.d.a();
                Long valueOf = Long.valueOf(a);
                eyja eyjaVar = dwtrVar.c;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                long b = eykm.b(eyjaVar);
                Long valueOf2 = Long.valueOf(b);
                dwtp dwtpVar = (dwtp) dwtrVar.toBuilder();
                valueOf.getClass();
                eyja d = eykm.d(a);
                dwtpVar.copyOnWrite();
                dwtr dwtrVar2 = (dwtr) dwtpVar.instance;
                d.getClass();
                dwtrVar2.c = d;
                dwtrVar2.b |= 1;
                dwtr dwtrVar3 = (dwtr) dwtpVar.build();
                if ((dwtrVar.b & 1) != 0) {
                    AtomicReference atomicReference2 = atomicReference;
                    valueOf.getClass();
                    long g = dxun.g(a);
                    valueOf2.getClass();
                    atomicReference2.set(emxc.j(Integer.valueOf(ermn.g(TimeUnit.MILLISECONDS.toDays(g - dxun.g(b))))));
                }
                return dwtrVar3;
            }
        }, erpp.a), new emwl() { // from class: dxuk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = dxun.e;
                return (emxc) atomicReference.get();
            }
        }, erpp.a);
    }

    @Override // defpackage.dxti
    public final ListenableFuture d(final String str) {
        final AtomicReference atomicReference = new AtomicReference(emux.a);
        return elfr.j(this.a.b(new emwl() { // from class: dxue
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtr dwtrVar = (dwtr) obj;
                long a = dxun.this.d.a();
                emxc emxcVar = emux.a;
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(dwtrVar.g);
                String str2 = str;
                if (unmodifiableMap.containsKey(str2)) {
                    emxcVar = emxc.j(Long.valueOf(eykm.b((eyja) DesugarCollections.unmodifiableMap(dwtrVar.g).get(str2))));
                }
                dwtp dwtpVar = (dwtp) dwtrVar.toBuilder();
                eyja d = eykm.d(a);
                d.getClass();
                dwtpVar.copyOnWrite();
                dwtr dwtrVar2 = (dwtr) dwtpVar.instance;
                eyhm eyhmVar = dwtrVar2.g;
                if (!eyhmVar.b) {
                    dwtrVar2.g = eyhmVar.a();
                }
                dwtrVar2.g.put(str2, d);
                dwtpVar.copyOnWrite();
                dwtr dwtrVar3 = (dwtr) dwtpVar.instance;
                dwtrVar3.c = null;
                dwtrVar3.b &= -2;
                dwtr dwtrVar4 = (dwtr) dwtpVar.build();
                if (emxcVar.g()) {
                    atomicReference.set(emxc.j(Long.valueOf(TimeUnit.MILLISECONDS.toHours(a - ((Long) emxcVar.c()).longValue()))));
                }
                return dwtrVar4;
            }
        }, erpp.a), new emwl() { // from class: dxuf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = dxun.e;
                return (emxc) atomicReference.get();
            }
        }, erpp.a);
    }

    @Override // defpackage.dxti
    public final ListenableFuture e() {
        return elfr.k(this.a.a(), new eroh() { // from class: dxud
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtr dwtrVar = (dwtr) obj;
                dwtv dwtvVar = dwtrVar.f;
                if (dwtvVar == null) {
                    dwtvVar = dwtv.a;
                }
                if ((dwtvVar.b & 1) == 0) {
                    final dxun dxunVar = dxun.this;
                    return dycd.e(dxunVar.a.b(new emwl() { // from class: dxug
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dwtr dwtrVar2 = (dwtr) obj2;
                            dwtv dwtvVar2 = dwtrVar2.f;
                            if (dwtvVar2 == null) {
                                dwtvVar2 = dwtv.a;
                            }
                            if ((dwtvVar2.b & 1) != 0) {
                                return dwtrVar2;
                            }
                            dxun dxunVar2 = dxun.this;
                            long nextLong = dxunVar2.c.nextLong();
                            dwtp dwtpVar = (dwtp) dwtrVar2.toBuilder();
                            dwtv dwtvVar3 = dwtrVar2.f;
                            if (dwtvVar3 == null) {
                                dwtvVar3 = dwtv.a;
                            }
                            dwtu dwtuVar = (dwtu) dwtvVar3.toBuilder();
                            dwtuVar.copyOnWrite();
                            dwtv dwtvVar4 = (dwtv) dwtuVar.instance;
                            dwtvVar4.b |= 1;
                            dwtvVar4.c = nextLong;
                            eyja d = eykm.d(dxunVar2.d.a());
                            dwtuVar.copyOnWrite();
                            dwtv dwtvVar5 = (dwtv) dwtuVar.instance;
                            d.getClass();
                            dwtvVar5.d = d;
                            dwtvVar5.b |= 2;
                            dwtpVar.copyOnWrite();
                            dwtr dwtrVar3 = (dwtr) dwtpVar.instance;
                            dwtv dwtvVar6 = (dwtv) dwtuVar.build();
                            dwtvVar6.getClass();
                            dwtrVar3.f = dwtvVar6;
                            dwtrVar3.b |= 4;
                            return (dwtr) dwtpVar.build();
                        }
                    }, dxunVar.b)).g(new eroh() { // from class: dxuh
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return dxun.this.a.a();
                        }
                    }, dxunVar.b).f(new emwl() { // from class: dxui
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            dwtv dwtvVar2 = ((dwtr) obj2).f;
                            return dwtvVar2 == null ? dwtv.a : dwtvVar2;
                        }
                    }, dxunVar.b);
                }
                dwtv dwtvVar2 = dwtrVar.f;
                if (dwtvVar2 == null) {
                    dwtvVar2 = dwtv.a;
                }
                return erqt.i(dwtvVar2);
            }
        }, this.b);
    }

    @Override // defpackage.dxti
    public final ListenableFuture f(final dwte dwteVar) {
        return this.a.b(new emwl() { // from class: dxub
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwtr dwtrVar = (dwtr) obj;
                int i = dxun.e;
                eygr eygrVar = dwtrVar.d;
                final dwte dwteVar2 = dwte.this;
                int a = enjk.a(eygrVar, new emxg() { // from class: dxuc
                    @Override // defpackage.emxg
                    public final boolean a(Object obj2) {
                        dwte dwteVar3 = (dwte) obj2;
                        int i2 = dxun.e;
                        dwte dwteVar4 = dwte.this;
                        dwtm dwtmVar = dwteVar4.c;
                        if (dwtmVar == null) {
                            dwtmVar = dwtm.a;
                        }
                        dwtm dwtmVar2 = dwteVar3.c;
                        if (dwtmVar2 == null) {
                            dwtmVar2 = dwtm.a;
                        }
                        return dwtmVar.equals(dwtmVar2) && dwteVar4.f == dwteVar3.f && dwteVar4.d == dwteVar3.d;
                    }
                });
                if (a == -1) {
                    dwtp dwtpVar = (dwtp) dwtrVar.toBuilder();
                    dwtpVar.copyOnWrite();
                    dwtr dwtrVar2 = (dwtr) dwtpVar.instance;
                    dwteVar2.getClass();
                    dwtrVar2.a();
                    dwtrVar2.d.add(dwteVar2);
                    return (dwtr) dwtpVar.build();
                }
                dwte dwteVar3 = (dwte) dwtrVar.d.get(a);
                dwtd dwtdVar = (dwtd) dwteVar3.toBuilder();
                long j = dwteVar3.g + dwteVar2.g;
                dwtdVar.copyOnWrite();
                dwte dwteVar4 = (dwte) dwtdVar.instance;
                dwteVar4.b |= 16;
                dwteVar4.g = j;
                long j2 = dwteVar3.h + dwteVar2.h;
                dwtdVar.copyOnWrite();
                dwte dwteVar5 = (dwte) dwtdVar.instance;
                dwteVar5.b |= 32;
                dwteVar5.h = j2;
                dwte dwteVar6 = (dwte) dwtdVar.build();
                dwtp dwtpVar2 = (dwtp) dwtrVar.toBuilder();
                dwtpVar2.copyOnWrite();
                dwtr dwtrVar3 = (dwtr) dwtpVar2.instance;
                dwteVar6.getClass();
                dwtrVar3.a();
                dwtrVar3.d.set(a, dwteVar6);
                return (dwtr) dwtpVar2.build();
            }
        }, this.b);
    }
}
