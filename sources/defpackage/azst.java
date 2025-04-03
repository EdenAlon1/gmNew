package defpackage;

import android.content.ContentValues;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azst implements azmn {
    public static final entd a = entd.c("BugleSelfIdentity");
    public final dtuu b;
    public final auig c;
    private final ffbr d;
    private final ffhd e;
    private final auid f;

    public azst(dtuu dtuuVar, ffbr ffbrVar, ffhd ffhdVar, auid auidVar, auig auigVar) {
        dtuuVar.getClass();
        ffbrVar.getClass();
        ffhdVar.getClass();
        auigVar.getClass();
        this.b = dtuuVar;
        this.d = ffbrVar;
        this.e = ffhdVar;
        this.f = auidVar;
        this.c = auigVar;
    }

    private final boolean k(final azvv azvvVar, final azsu azsuVar) {
        if (this.f.a()) {
            Object c = this.b.c("MyIdentityTablesOperations#updateSubscriptionsIfChanged", new emyl() { // from class: azrs
                @Override // defpackage.emyl
                public final Object get() {
                    Object apply;
                    entd entdVar = azst.a;
                    final azvv azvvVar2 = azvv.this;
                    aztp aztpVar = (aztp) ffdx.U(azsh.a(azvvVar2.a, azvvVar2.b));
                    azsu azsuVar2 = azsuVar;
                    if (aztpVar != null) {
                        String[] strArr = azuy.a;
                        azuv azuvVar = new azuv();
                        azuvVar.ap("updateSubscriptionsIfChanged");
                        azuvVar.d(azsuVar2);
                        if (azvvVar2.a() != null) {
                            azuvVar.f(azvvVar2.a());
                        }
                        apply = new Function() { // from class: azrp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                azux azuxVar = (azux) obj;
                                entd entdVar2 = azst.a;
                                azvv azvvVar3 = azvv.this;
                                azuxVar.d(azvvVar3.a);
                                azuxVar.c(azvvVar3.b);
                                return azuxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(new azux());
                        azuvVar.af(new azuw((azux) apply));
                        return Boolean.valueOf(azuvVar.c().e() != 0);
                    }
                    int i = azvvVar2.a;
                    String[] strArr2 = azuy.a;
                    aztu aztuVar = new aztu();
                    aztuVar.f(i);
                    aztuVar.e(azvvVar2.b);
                    aztuVar.c(azsuVar2);
                    azsh.d(aztuVar, azvvVar2);
                    aztp b = aztuVar.b(new Supplier() { // from class: azts
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new aztq();
                        }
                    });
                    final dtve b2 = azuy.b();
                    dtub.b(azuy.b(), "subscriptions", b, new Function() { // from class: aztj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.S("subscriptions", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: aztk
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return true;
                }
            });
            c.getClass();
            return ((Boolean) c).booleanValue();
        }
        int i = azvvVar.a;
        String[] strArr = azuy.a;
        aztu aztuVar = new aztu();
        aztuVar.f(i);
        aztuVar.e(azvvVar.b);
        aztuVar.c(azsuVar);
        azsh.d(aztuVar, azvvVar);
        return aztuVar.a().l(new Function() { // from class: azrt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azux azuxVar = (azux) obj;
                entd entdVar = azst.a;
                azvv azvvVar2 = azvv.this;
                azuxVar.d(azvvVar2.a);
                azuxVar.c(azvvVar2.b);
                return azuxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private static final azsi l(azsu azsuVar, azvv azvvVar) {
        String[] strArr = azoi.a;
        azof azofVar = new azof();
        azofVar.e(azvvVar.d);
        azsh.c(azofVar, azvvVar.e);
        return new azsi(azsuVar, azofVar.c(azsuVar));
    }

    @Override // defpackage.azmn
    public final azol a(final Iterable iterable) {
        Object c = this.b.c("MyIdentityTablesOperations#updateSubscriptionsAndIdentities", new emyl() { // from class: azse
            @Override // defpackage.emyl
            public final Object get() {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(ffdx.n(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    azsi j = this.j((azvv) it.next());
                    linkedHashSet.add(j.a);
                    arrayList.add(Boolean.valueOf(j.b));
                }
                Iterator it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    z |= ((Boolean) it2.next()).booleanValue();
                }
                return new azol(linkedHashSet, z);
            }
        });
        c.getClass();
        return (azol) c;
    }

    @Override // defpackage.azmn
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new azsj(null, this), ffguVar);
    }

    @Override // defpackage.azmn
    public final Object c(Iterable iterable, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new azsk(null, iterable, this), ffguVar);
    }

    @Override // defpackage.azmn
    public final Object d(azsu azsuVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new azsm(null, this, azsuVar), ffguVar);
    }

    @Override // defpackage.azmn
    public final Object e(Iterable iterable, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new azso(null, iterable, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azmn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cosz r6, defpackage.djrj r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.azsq
            if (r0 == 0) goto L13
            r0 = r8
            azsq r0 = (defpackage.azsq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azsq r0 = new azsq
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.e
            ffhd r8 = defpackage.ekxi.a(r8)
            azsp r2 = new azsp
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azst.f(cosz, djrj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.azpl
    public final azsu g(final int i, final String str, final aoku aokuVar) {
        Object obj;
        if (i < -1) {
            throw new IllegalStateException("Check failed.");
        }
        if (str != null && str.length() != 0 && i >= 0) {
            Object c = this.b.c("getOrCreateMyIdentityViaUpdateHelper", new emyl() { // from class: azsa
                @Override // defpackage.emyl
                public final Object get() {
                    return azst.this.j(new azvv(i, str, aokuVar, (String) null, 24)).a;
                }
            });
            c.getClass();
            return (azsu) c;
        }
        azut a2 = azuy.a();
        a2.z("querySubWithUnknownIccId");
        a2.c(new Function() { // from class: azsb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Object obj3;
                Object obj4;
                azux azuxVar = (azux) obj2;
                azuxVar.d(i);
                if (azst.this.c.a()) {
                    dtqt dtqtVar = (dtqt) azuy.c.e.a;
                    obj3 = dtqtVar.i.get();
                    obj4 = ((dtve) obj3).P().c.get();
                    if (dtqtVar.h <= ((Integer) obj4).intValue()) {
                        int intValue = azuy.c().intValue();
                        if (intValue < 60160) {
                            dtub.w("my_identity_token_with_foreign_key", intValue);
                        }
                        azuxVar.aq(new dtrx("subscriptions.my_identity_token_with_foreign_key", 6));
                        return azuxVar;
                    }
                }
                azuxVar.b();
                return azuxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = a2.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(new azsn((aztp) it.next()));
        }
        if (arrayList.size() == 1) {
            return ((azsn) arrayList.get(0)).a;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (ffkj.e(((azsn) obj).b, "unknown_iccid")) {
                break;
            }
        }
        azsn azsnVar = (azsn) obj;
        if (azsnVar != null) {
            return azsnVar.a;
        }
        Object c2 = this.b.c("createIdentityForSubWithUnknownIccId", new emyl() { // from class: azsc
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = azst.a;
                String[] strArr = azoi.a;
                azmy azmyVar = new azmy();
                azmyVar.g(new azsu(UUID.randomUUID()));
                azmyVar.d(azon.a);
                azmt b = azmyVar.b(new Supplier() { // from class: azmv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new azmu();
                    }
                });
                b.k();
                azsu d = b.d();
                d.getClass();
                ensz enszVar = (ensz) azst.a.h();
                ensn ensnVar = csux.t;
                final int i2 = i;
                enszVar.Y(ensnVar, Integer.valueOf(i2));
                enszVar.t("Create new MyIdentity %s with unknown ICCID and MSISDN", d);
                String[] strArr2 = azuy.a;
                aztu aztuVar = new aztu();
                aztuVar.f(i2);
                aztuVar.e("unknown_iccid");
                aztuVar.c(d);
                aztuVar.a().l(new Function() { // from class: azru
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        azux azuxVar = (azux) obj2;
                        entd entdVar2 = azst.a;
                        azuxVar.d(i2);
                        azuxVar.c("unknown_iccid");
                        return azuxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return d;
            }
        });
        c2.getClass();
        return (azsu) c2;
    }

    public final aoku h(String str) {
        aolr aolrVar = (aolr) this.d.b();
        emyl emylVar = new emyl() { // from class: azrv
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = azst.a;
                return Optional.empty();
            }
        };
        if (str == null) {
            str = "";
        }
        return aolrVar.c(str, emylVar);
    }

    public final azop i(azqe azqeVar) {
        azon azonVar;
        azsu azsuVar;
        String str;
        if (azqeVar.e().length != azqeVar.f().length) {
            throw new IllegalStateException("SubIds length " + azqeVar.e().length + " != sim iccIds length " + azqeVar.f().length);
        }
        azkz azkzVar = new azkz();
        azkzVar.a(false);
        azqeVar.az(0, "token");
        azsu azsuVar2 = azqeVar.a;
        if (azsuVar2 == null) {
            throw new NullPointerException("Null token");
        }
        azkzVar.f = azsuVar2;
        azkzVar.c = Optional.ofNullable(azqeVar.d());
        azqeVar.az(4, "address_type");
        azon azonVar2 = azqeVar.e;
        if (azonVar2 == null) {
            throw new NullPointerException("Null addressType");
        }
        azkzVar.d = azonVar2;
        Optional ofNullable = Optional.ofNullable(azqeVar.d());
        final ffji ffjiVar = new ffji() { // from class: azry
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return azst.this.h((String) obj);
            }
        };
        Optional map = ofNullable.map(new Function() { // from class: azrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = azst.a;
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map == null) {
            throw new NullPointerException("Null messagingIdentity");
        }
        azkzVar.e = map;
        azqeVar.az(6, "display_name");
        String str2 = azqeVar.f;
        if (str2 == null) {
            str2 = "";
        }
        azkzVar.h = str2;
        azqeVar.az(2, "provisioning_id");
        String str3 = azqeVar.c;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        azkzVar.i = Optional.ofNullable(str3);
        azqeVar.az(1, "canonical_token");
        azkzVar.g = Optional.ofNullable(azqeVar.b);
        if (this.f.a()) {
            azqeVar.az(3, "is_verified");
            azkzVar.a(azqeVar.d);
        }
        int length = azqeVar.e().length;
        for (int i = 0; i < length; i++) {
            int[] iArr = azqeVar.g;
            if (i >= iArr.length) {
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(azqeVar.g.length)));
            }
            int i2 = iArr[i];
            String[] strArr = azqeVar.h;
            if (i >= strArr.length) {
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(azqeVar.h.length)));
            }
            String str4 = strArr[i];
            if (azkzVar.a == null) {
                azkzVar.a = new enin();
            }
            azkzVar.a.c(new azte(i2, str4));
        }
        enin eninVar = azkzVar.a;
        if (eninVar != null) {
            azkzVar.b = eninVar.g();
        } else if (azkzVar.b == null) {
            azkzVar.b = enpd.a;
        }
        if (azkzVar.k == 1 && (azonVar = azkzVar.d) != null && (azsuVar = azkzVar.f) != null && (str = azkzVar.h) != null) {
            return new azla(azkzVar.b, azkzVar.c, azonVar, azkzVar.e, azsuVar, azkzVar.g, str, azkzVar.i, azkzVar.j);
        }
        StringBuilder sb = new StringBuilder();
        if (azkzVar.d == null) {
            sb.append(" addressType");
        }
        if (azkzVar.f == null) {
            sb.append(" token");
        }
        if (azkzVar.h == null) {
            sb.append(" displayName");
        }
        if (azkzVar.k == 0) {
            sb.append(" isVerified");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azsi j(final defpackage.azvv r10) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azst.j(azvv):azsi");
    }
}
