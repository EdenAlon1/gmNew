package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class copc implements comc {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    public final errl c;
    public final errl d;
    public final comb e;
    public final String f;
    public final eyhs g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final coph i;
    public elfl j;
    private final Executor k;
    private final Optional l;
    private final copf m;

    public copc(ffbr ffbrVar, errl errlVar, errl errlVar2, comv comvVar) {
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.k = new ersb(errlVar);
        coma comaVar = (coma) comvVar;
        this.e = comaVar.a;
        this.f = (String) comaVar.b.orElse("");
        this.g = comaVar.c;
        this.l = comaVar.e;
        Optional optional = comaVar.d;
        optional.getClass();
        copg copgVar = (copg) fflm.b(optional);
        if (copgVar instanceof copf) {
            this.m = (copf) copgVar;
            this.i = null;
        } else if (copgVar instanceof coph) {
            this.i = (coph) copgVar;
            this.m = new coor(this);
        } else {
            this.m = null;
            this.i = null;
        }
    }

    private final bxwm y() {
        String[] strArr = bxws.a;
        bxwn bxwnVar = new bxwn(bxws.a);
        bxwnVar.z("getReadRowQuery");
        bxwnVar.c(new Function() { // from class: conn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwr bxwrVar = (bxwr) obj;
                copc copcVar = copc.this;
                bxwrVar.b(copcVar.e.a());
                bxwrVar.c(copcVar.f);
                return bxwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bxwnVar.b();
    }

    @Override // defpackage.comc
    public final eyhs a(ffji ffjiVar) {
        if (!((dtuu) this.b.b()).i()) {
            throw new IllegalStateException("Check failed.");
        }
        try {
            eyhs eyhsVar = (eyhs) ffjiVar.invoke(l());
            if (v(eyhsVar)) {
                return eyhsVar;
            }
        } catch (eygu e) {
            ((ensz) ((ensz) a.j()).g(e)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", this.e, cskt.e(this.f));
        }
        throw new IllegalStateException("Failed to update data in settings store");
    }

    @Override // defpackage.comc
    public final Object b(ffgu ffguVar) {
        Object c;
        elfl f = f();
        return (f == null || (c = fgfz.c(f, ffguVar)) != ffhh.a) ? ffcu.a : c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.comc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cooy
            if (r0 == 0) goto L13
            r0 = r5
            cooy r0 = (defpackage.cooy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cooy r0 = new cooy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffxx r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.copc.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.comc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.copb
            if (r0 == 0) goto L13
            r0 = r6
            copb r0 = (defpackage.copb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            copb r0 = new copb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            cooh r6 = new cooh
            r6.<init>()
            elfl r5 = r4.j(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.copc.d(ffji, ffgu):java.lang.Object");
    }

    @Override // defpackage.comc
    public final ffxx e() {
        return ffyo.a(new coox(new coou(dtyu.a(y()), this), this));
    }

    @Override // defpackage.copd
    public final elfl f() {
        return elfo.g(new Callable() { // from class: cono
            @Override // java.util.concurrent.Callable
            public final Object call() {
                copc.this.n();
                return null;
            }
        }, this.k);
    }

    @Override // defpackage.copd
    public final elfl g() {
        elfl g = elfo.g(new Callable() { // from class: cood
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = bxws.a;
                bxwn bxwnVar = new bxwn(bxws.a);
                bxwnVar.z("getAllExistingDataAsync");
                final copc copcVar = copc.this;
                bxwnVar.c(new Function() { // from class: conq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bxwr bxwrVar = (bxwr) obj;
                        bxwrVar.b(copc.this.e.a());
                        return bxwrVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bxwnVar.b().y();
            }
        }, this.c);
        final ffji ffjiVar = new ffji() { // from class: cooe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                List<bxvl> list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.getClass();
                copc copcVar = copc.this;
                for (bxvl bxvlVar : list) {
                    try {
                        byte[] l = bxvlVar.l();
                        if (l != null) {
                            String k = bxvlVar.k();
                            if (k == null) {
                                k = "";
                            }
                            linkedHashMap.put(k, copcVar.p(l));
                        }
                    } catch (eygu unused) {
                    }
                }
                return engq.e(linkedHashMap);
            }
        };
        return g.h(new emwl() { // from class: coof
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = copc.a;
                return ffji.this.invoke(obj);
            }
        }, this.d);
    }

    @Override // defpackage.copd
    public final elfl h() {
        a.n().D("Reading row. key = %s, subkey = %s", this.e, cskt.e(this.f));
        elfl g = elfo.g(new Callable() { // from class: conu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return copc.this.s();
            }
        }, this.c);
        if (x()) {
            final ffji ffjiVar = new ffji() { // from class: conv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    Optional optional = (Optional) obj;
                    optional.getClass();
                    return copc.this.o(optional);
                }
            };
            return g.i(new eroh() { // from class: conw
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.d);
        }
        final ffji ffjiVar2 = new ffji() { // from class: conx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return (eyhs) ((Optional) obj).orElse(copc.this.g);
            }
        };
        return g.h(new emwl() { // from class: cony
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = copc.a;
                return ffji.this.invoke(obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.copd
    public final elfl i(final String str) {
        str.getClass();
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(str) || this.f.equals(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        elfl g = elfo.g(new Callable() { // from class: conm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final copc copcVar = copc.this;
                dtuu dtuuVar = (dtuu) copcVar.b.b();
                final String str2 = str;
                dtuuVar.d("moveDataFromSync", new Runnable() { // from class: coni
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String[] strArr = bxws.a;
                        bxwr bxwrVar = new bxwr();
                        copc copcVar2 = copc.this;
                        bxwrVar.b(copcVar2.e.a());
                        bxwrVar.c(str2);
                        bxwq bxwqVar = new bxwq(bxwrVar);
                        bxwn bxwnVar = new bxwn(bxws.a);
                        bxwnVar.z("moveDataFromSync#update");
                        bxwa[] bxwaVarArr = {bxws.c.d};
                        int a2 = bxws.b().a();
                        Integer.valueOf(a2).getClass();
                        if (((Integer) bxws.b.getOrDefault(bxwaVarArr[0].toString(), -1)).intValue() > a2) {
                            dtub.w("columnReference.toString()", a2);
                        }
                        bxwnVar.m(bxwaVarArr);
                        bxwnVar.k(bxwqVar);
                        engw y = bxwnVar.b().y();
                        byte[] l = ((enou) y).c == 1 ? ((bxvl) y.get(0)).l() : null;
                        if (l != null) {
                            copcVar2.w(l);
                            bxwj bxwjVar = new bxwj();
                            bxwjVar.f("moveDataFromSync#delete");
                            bxwjVar.b = bxwqVar;
                            bxwjVar.d();
                        }
                    }
                });
                return copcVar.s();
            }
        }, this.k);
        g.getClass();
        return g;
    }

    @Override // defpackage.copd
    public final elfl j(final emwl emwlVar) {
        if (x()) {
            elfl h = h();
            final ffji ffjiVar = new ffji() { // from class: conz
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    return copc.this.r(emwlVar);
                }
            };
            return h.h(new emwl() { // from class: coob
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.k);
        }
        elfl g = elfo.g(new Callable() { // from class: cooc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return copc.this.r(emwlVar);
            }
        }, this.k);
        g.getClass();
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.copd
    public final enhk k() {
        String[] strArr = bxws.a;
        bxwn bxwnVar = new bxwn(bxws.a);
        bxwnVar.z("getAllExistingDataSync");
        bxwnVar.c(new Function() { // from class: cong
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwr bxwrVar = (bxwr) obj;
                bxwrVar.b(copc.this.e.a());
                return bxwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = bxwnVar.b().y();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y.getClass();
        enqv it = y.iterator();
        while (it.hasNext()) {
            bxvl bxvlVar = (bxvl) it.next();
            try {
                byte[] l = bxvlVar.l();
                if (l != null) {
                    String k = bxvlVar.k();
                    if (k == null) {
                        k = "";
                    }
                    linkedHashMap.put(k, p(l));
                }
            } catch (eygu unused) {
            }
        }
        return engq.e(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [eyhs, java.lang.Object] */
    @Override // defpackage.copd
    public final eyhs l() {
        Optional s = s();
        if (s.isPresent()) {
            return s.get();
        }
        if (this.i == null || this.h.get()) {
            if (this.m != null && !this.h.get()) {
                throw new IllegalStateException("Async migration is not done");
            }
        } else {
            if (this.i == null) {
                throw new IllegalStateException("Migration is not defined.");
            }
            final ffji ffjiVar = new ffji() { // from class: conk
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    copc copcVar = copc.this;
                    eyhs eyhsVar = (eyhs) obj;
                    if (copcVar.u(eyhsVar)) {
                        try {
                            eyhs eyhsVar2 = (eyhs) copcVar.i.a().orElse(copcVar.g);
                            if (!copcVar.u(eyhsVar2)) {
                                copcVar.i.c();
                            }
                            return eyhsVar2;
                        } catch (eygu e) {
                            ((ensz) ((ensz) copc.a.j()).g(e)).q("Failed to get the previous data to migrate. The previous data is ignored.");
                        }
                    }
                    return eyhsVar;
                }
            };
            eyhs r = r(new emwl() { // from class: conl
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            });
            this.h.set(true);
            try {
                if (!u(r)) {
                    this.i.b();
                }
            } catch (Throwable th) {
                ((ensz) ((ensz) a.j()).g(th)).q("Failed to clear previous data.");
            }
            r.getClass();
            s = Optional.of(r);
        }
        Object orElse = s.orElse(this.g);
        orElse.getClass();
        return (eyhs) orElse;
    }

    @Override // defpackage.copd
    public final eyhs m(final emwl emwlVar) {
        Object c = ((dtuu) this.b.b()).c("SettingsStoreImpl#updateDataSync", new emyl() { // from class: coog
            @Override // defpackage.emyl
            public final Object get() {
                final emwl emwlVar2 = emwlVar;
                return copc.this.a(new ffji() { // from class: conr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        eyhs eyhsVar = (eyhs) obj;
                        entd entdVar = copc.a;
                        eyhsVar.getClass();
                        Object apply = emwl.this.apply(eyhsVar);
                        apply.getClass();
                        return (eyhs) apply;
                    }
                });
            }
        });
        c.getClass();
        return (eyhs) c;
    }

    @Override // defpackage.copd
    public final void n() {
        Object apply;
        String[] strArr = bxws.a;
        bxwj bxwjVar = new bxwj();
        bxwjVar.f("clearSync");
        apply = new Function() { // from class: cooa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr2 = bxws.a;
                bxwr bxwrVar = new bxwr();
                copc copcVar = copc.this;
                bxwrVar.b(copcVar.e.a());
                bxwrVar.c(copcVar.f);
                return bxwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bxwr());
        bxwjVar.b = new bxwq((bxwr) apply);
        bxwjVar.d();
    }

    public final elfl o(Optional optional) {
        if (optional.isPresent()) {
            a.n().q("Skip migration because settings store has value.");
            this.h.set(true);
            elfl e = elfo.e(optional.get());
            e.getClass();
            return e;
        }
        if (this.m == null || this.h.get()) {
            ((ensz) a.j()).I("Migration cannot be run because it is not set or has already run. migration is null = %s, migration has run = %s", this.m == null, this.h.get());
            elfl e2 = elfo.e(this.g);
            e2.getClass();
            return e2;
        }
        elfl elflVar = this.j;
        if (elflVar != null) {
            return elflVar;
        }
        a.n().D("Run migration. key = %s, subkey = %s", this.e, cskt.e(this.f));
        try {
            final copf copfVar = this.m;
            elfl b = copfVar.b();
            final ffji ffjiVar = new ffji() { // from class: cooi
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((ensz) ((ensz) copc.a.j()).g((eygu) obj)).q("Failed to get the previous data to migrate. The previous data is ignored.");
                    return copc.this.g;
                }
            };
            elfl e3 = b.e(eygu.class, new emwl() { // from class: cooj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.d);
            final ffji ffjiVar2 = new ffji() { // from class: cook
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    final eyhs eyhsVar = (eyhs) obj;
                    final copc copcVar = copc.this;
                    final copf copfVar2 = copfVar;
                    final ffji ffjiVar3 = new ffji() { // from class: cons
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            copc copcVar2 = copc.this;
                            eyhs eyhsVar2 = (eyhs) obj2;
                            if (copcVar2.u(eyhsVar2)) {
                                eyhsVar2 = eyhsVar;
                                if (copcVar2.u(eyhsVar2)) {
                                    return copcVar2.g;
                                }
                                copf copfVar3 = copfVar2;
                                copc.a.n().t("Migrating data. key = %s", copcVar2.e);
                                copfVar3.c();
                            }
                            return eyhsVar2;
                        }
                    };
                    return copcVar.r(new emwl() { // from class: cont
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = copc.a;
                            return ffji.this.invoke(obj2);
                        }
                    });
                }
            };
            elfl h = e3.h(new emwl() { // from class: cool
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.k);
            final ffji ffjiVar3 = new ffji() { // from class: coom
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    copc copcVar = copc.this;
                    copcVar.h.set(true);
                    if (copcVar.u((eyhs) obj)) {
                        return elfo.e(null);
                    }
                    copf copfVar2 = copfVar;
                    ((ensz) copc.a.h()).q("Removing previous data.");
                    elfl a2 = copfVar2.a();
                    final ffji ffjiVar4 = new ffji() { // from class: cone
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            ((ensz) ((ensz) copc.a.j()).g((Throwable) obj2)).q("Failed to clear previous data.");
                            return null;
                        }
                    };
                    return a2.e(Throwable.class, new emwl() { // from class: conp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = copc.a;
                            ffji.this.invoke(obj2);
                            return null;
                        }
                    }, copcVar.d);
                }
            };
            elfl i = h.i(new eroh() { // from class: coon
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.d);
            final ffji ffjiVar4 = new ffji() { // from class: cooo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    return elfo.e(copc.this.q());
                }
            };
            elfl i2 = i.i(new eroh() { // from class: conf
                /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    entd entdVar = copc.a;
                    return ffji.this.invoke(obj);
                }
            }, this.c);
            this.j = i2;
            i2.k(new copa(this), this.d);
            return i2;
        } catch (Exception e4) {
            ((ensz) ((ensz) a.j()).g(e4)).q("Failed to call migration");
            this.j = null;
            elfl d = elfo.d(e4);
            d.getClass();
            return d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eyhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [eyhs, java.lang.Object] */
    public final eyhs p(byte[] bArr) {
        Object obj;
        if (!this.l.isPresent()) {
            ?? h = this.g.getParserForType().h(bArr);
            h.getClass();
            return h;
        }
        try {
            ?? h2 = this.g.getParserForType().h(bArr);
            h2.getClass();
            return h2;
        } catch (eygu e) {
            obj = this.l.get().get();
            eygu eyguVar = (eygu) obj;
            eyguVar.getClass();
            ffbt.a(eyguVar, e);
            throw eyguVar;
        }
    }

    public final eyhs q() {
        Object orElse = s().orElse(this.g);
        orElse.getClass();
        return (eyhs) orElse;
    }

    public final eyhs r(final emwl emwlVar) {
        return (eyhs) ((dtuu) this.b.b()).c("SettingsStoreImpl#updateDataSyncInternal", new emyl() { // from class: conj
            @Override // defpackage.emyl
            public final Object get() {
                copc copcVar = copc.this;
                try {
                    eyhs eyhsVar = (eyhs) emwlVar.apply(copcVar.q());
                    eyhsVar.getClass();
                    if (copcVar.v(eyhsVar)) {
                        return eyhsVar;
                    }
                } catch (eygu e) {
                    ((ensz) ((ensz) copc.a.j()).g(e)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", copcVar.e, cskt.e(copcVar.f));
                }
                throw new IllegalStateException("Failed to update data in settings store");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional s() {
        engw y = y().y();
        if (y == null || y.isEmpty()) {
            return Optional.empty();
        }
        if (((enou) y).c > 1) {
            throw new IllegalStateException("Found more than one instance of data");
        }
        byte[] l = ((bxvl) y.get(0)).l();
        return Optional.of(l != null ? p(l) : this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.bxwm r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cooz
            if (r0 == 0) goto L13
            r0 = r6
            cooz r0 = (defpackage.cooz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cooz r0 = new cooz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            copc r5 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            elfl r5 = r5.w()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L89
            r5 = r4
        L46:
            engw r6 = (defpackage.engw) r6
            r0 = 0
            if (r6 == 0) goto L88
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L52
            goto L88
        L52:
            int r1 = r6.size()
            if (r1 > r3) goto L6b
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            bxvl r6 = (defpackage.bxvl) r6
            byte[] r6 = r6.l()
            if (r6 == 0) goto L6a
            eyhs r5 = r5.p(r6)
            return r5
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r6.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected one entry, found "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L88:
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.copc.t(bxwm, ffgu):java.lang.Object");
    }

    public final boolean u(eyhs eyhsVar) {
        return eyhsVar == null || this.g.equals(eyhsVar);
    }

    public final boolean v(eyhs eyhsVar) {
        byte[] byteArray = eyhsVar.toByteArray();
        byteArray.getClass();
        return w(byteArray);
    }

    public final boolean w(byte[] bArr) {
        Object apply;
        entd entdVar = a;
        entdVar.n().D("Saving row. key = %s, subkey = %s", this.e, cskt.e(this.f));
        String[] strArr = bxws.a;
        bxwp bxwpVar = new bxwp();
        bxwpVar.ap("SettingsStoreImpl#saveRow");
        apply = new Function() { // from class: conh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxwr bxwrVar = (bxwr) obj;
                copc copcVar = copc.this;
                bxwrVar.b(copcVar.e.a());
                bxwrVar.c(copcVar.f);
                return bxwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bxwr());
        bxwpVar.af(new bxwq((bxwr) apply));
        bxwpVar.a.put(GroupManagementRequest.DATA_TAG, bArr);
        if (bxwpVar.b().e() != 0) {
            entdVar.n().q("Updated settings data");
            return true;
        }
        bxvo bxvoVar = new bxvo();
        bxvoVar.c(this.e.a());
        bxvoVar.d(this.f);
        bxvoVar.b(bArr);
        final bxvl a2 = bxvoVar.a();
        final dtve a3 = bxws.a();
        long b = dtub.b(bxws.a(), "settings", a2, new Function() { // from class: bxvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("settings", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxvj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bxvl bxvlVar = bxvl.this;
                    bxvlVar.a = new bxvk(l).a.longValue();
                    bxvlVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long valueOf = Long.valueOf(b);
        ensk n = entdVar.n();
        valueOf.getClass();
        n.s("Inserted settings data, id = %d", b);
        valueOf.getClass();
        return b >= 0;
    }

    public final boolean x() {
        return (this.m == null || this.h.get()) ? false : true;
    }
}
