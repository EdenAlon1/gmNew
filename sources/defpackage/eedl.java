package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedl implements eeew {
    public static final /* synthetic */ int c = 0;
    public final eeeu b;
    private final List e;
    private final errl f;
    private final fiwq g;
    private final fizj h;
    private final eeet i;
    static final diyy a = diyv.b("enable_dns_client_exception_logging");
    private static final errl d = new erpq();

    public eedl(Optional optional, List list, eeet eeetVar, eeeu eeeuVar, errl errlVar, eeds eedsVar, Optional optional2, Optional optional3) {
        eeetVar.getClass();
        this.i = eeetVar;
        eeeuVar.getClass();
        this.b = eeeuVar;
        list.getClass();
        this.e = (List) Collection.EL.stream(list).map(new Function() { // from class: eedh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eeeq) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        errlVar.getClass();
        this.f = errlVar;
        this.g = eedsVar.a;
        this.h = f(optional, list, optional2, optional3);
    }

    public static fizj d(Optional optional, eeeq eeeqVar) {
        try {
            final fizt fiztVar = new fizt(eeeqVar.d());
            fiztVar.a = new InetSocketAddress(fiztVar.a.getAddress(), eeeqVar.a());
            fiztVar.c = eeeqVar.b().equals(eeev.TCP);
            optional.ifPresent(new Consumer() { // from class: eedi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    fizt.this.b = new InetSocketAddress((InetAddress) obj, 0);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return fiztVar;
        } catch (UnknownHostException e) {
            throw new RuntimeException("unknown DNS server initializing AsyncDnsClient", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture e(java.lang.String r9, final java.lang.Class r10) {
        /*
            r8 = this;
            int r0 = defpackage.eeey.a(r10)
            java.util.List r1 = r8.e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            int r9 = defpackage.engw.d
            engw r9 = defpackage.enou.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.erqt.i(r9)
            return r9
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "Unable to lookup records for null target!"
            defpackage.dkty.q(r10, r9)
            int r9 = defpackage.engw.d
            engw r9 = defpackage.enou.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.erqt.i(r9)
            return r9
        L2c:
            emww r1 = new emww
            java.lang.String r3 = ","
            r1.<init>(r3)
            java.util.List r3 = r8.e
            java.lang.String r1 = r1.b(r3)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r9
            r5 = 1
            r4[r5] = r1
            java.lang.String r1 = "Resolving %s using name servers: %s"
            defpackage.dkty.k(r1, r4)
            java.util.List r1 = r8.e
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            eeer r1 = defpackage.eeey.b(r9, r10, r1)
            fixz r4 = new fixz     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r4.<init>(r9, r0)     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            fiwq r6 = r8.g     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r4.c = r6     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            fizj r6 = r8.h     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r4.b = r6     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            eefi r6 = new eefi     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r6.<init>(r4)     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            eeet r4 = r8.i     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r4.a(r1)     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            errl r4 = r8.f     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            eedj r7 = new eedj     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            r7.<init>()     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            com.google.common.util.concurrent.ListenableFuture r9 = r4.submit(r7)     // Catch: java.lang.NoClassDefFoundError -> L77 java.lang.ExceptionInInitializerError -> L79 java.lang.RuntimeException -> L7b defpackage.fjad -> La3 java.lang.ClassCastException -> Ld3
            return r9
        L77:
            r9 = move-exception
            goto L7c
        L79:
            r9 = move-exception
            goto L7c
        L7b:
            r9 = move-exception
        L7c:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r0 = "Device internal error creating the DNS client."
            defpackage.dkty.s(r9, r0, r10)
            diyy r10 = defpackage.eedl.a
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9a
            eeeu r10 = r8.b
            eees r9 = defpackage.eeey.c(r1, r9)
            r10.a(r9)
        L9a:
            int r9 = defpackage.engw.d
            engw r9 = defpackage.enou.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.erqt.i(r9)
            return r9
        La3:
            r10 = move-exception
            java.lang.String r0 = defpackage.fjaf.a(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r5] = r9
            java.lang.String r9 = "Invalid %s lookup target: %s"
            defpackage.dkty.s(r10, r9, r3)
            diyy r9 = defpackage.eedl.a
            java.lang.Object r9 = r9.a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lca
            eeeu r9 = r8.b
            eees r10 = defpackage.eeey.c(r1, r10)
            r9.a(r10)
        Lca:
            int r9 = defpackage.engw.d
            engw r9 = defpackage.enou.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.erqt.i(r9)
            return r9
        Ld3:
            r9 = move-exception
            diyy r10 = defpackage.eedl.a
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Leb
            eeeu r10 = r8.b
            eees r0 = defpackage.eeey.c(r1, r9)
            r10.a(r0)
        Leb:
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.erqt.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eedl.e(java.lang.String, java.lang.Class):com.google.common.util.concurrent.ListenableFuture");
    }

    private static fizj f(final Optional optional, List list, Optional optional2, Optional optional3) {
        try {
            final fixj fixjVar = new fixj((fizj[]) ((List) Collection.EL.stream(list).map(new Function() { // from class: eede
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return eedl.d(Optional.this, (eeeq) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())).toArray(new fizj[0]));
            optional3.ifPresent(new Consumer() { // from class: eedf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    fixj.this.b = ((Integer) obj).intValue();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional2.ifPresent(new Consumer() { // from class: eedg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    fixj.this.b(((Integer) obj).intValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return fixjVar;
        } catch (UnknownHostException e) {
            throw new eedk(e);
        }
    }

    @Override // defpackage.eeew
    public final ListenableFuture a(String str) {
        final ListenableFuture e = e(str, fiwh.class);
        final ListenableFuture e2 = e(str, fiwd.class);
        return erqt.b(e, e2).a(new Callable() { // from class: eedb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = eedl.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) Collection.EL.stream((List) erqt.q(ListenableFuture.this)).map(new Function() { // from class: eedc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((fiwh) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList()));
                arrayList.addAll((java.util.Collection) Collection.EL.stream((List) erqt.q(e2)).map(new Function() { // from class: eedd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((fiwd) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList()));
                return arrayList;
            }
        }, d);
    }

    @Override // defpackage.eeew
    public final ListenableFuture b(String str) {
        return e(str, fiyj.class);
    }

    @Override // defpackage.eeew
    public final ListenableFuture c(String str) {
        return e(str, fizp.class);
    }
}
