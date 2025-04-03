package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdc {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsKeyService");
    public final cvbr b;
    public final cvcg c;
    public final errl d;
    private final emyl e = emys.a(new emyl() { // from class: cvch
        @Override // defpackage.emyl
        public final Object get() {
            return new erth();
        }
    });

    public cvdc(cvbr cvbrVar, cvcg cvcgVar, errl errlVar) {
        this.b = cvbrVar;
        this.c = cvcgVar;
        this.d = errlVar;
    }

    public static cvda a(KeyPair keyPair, cvbt cvbtVar) {
        eyja eyjaVar;
        eyee x = eyee.x(keyPair.getPublic().getEncoded());
        if ((cvbtVar.b & 1) != 0) {
            eyjaVar = cvbtVar.e;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
        } else {
            eyjaVar = eykm.c;
        }
        return new cvbu(x, eyjaVar);
    }

    static /* synthetic */ KeyPair d() {
        try {
            cskc cskcVar = a;
            cskcVar.p("Generating keys...");
            KeyPair c = euif.c(etrc.b);
            csjb c2 = cskcVar.c();
            c2.I("Key pair info");
            c2.y("private_size", c.getPrivate().getEncoded().length);
            c2.y("public_size", c.getPublic().getEncoded().length);
            c2.M("private_class", c.getPrivate().getClass().getName());
            c2.M("public_class", c.getPublic().getClass().getName());
            c2.r();
            return c;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            csjb b = a.b();
            b.I("Error while generating key pair.");
            b.s(e);
            throw new RuntimeException("Error while generating new key pair.", e);
        }
    }

    public final elfl b() {
        return this.b.d().i(new eroh() { // from class: cvci
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cvas cvasVar = (cvas) obj;
                final engw n = engw.n(DesugarCollections.unmodifiableMap(cvasVar.e).keySet());
                Stream stream = Collection.EL.stream(n);
                final cvdc cvdcVar = cvdc.this;
                return elfo.a((Iterable) stream.map(new Function() { // from class: cvcv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        str.getClass();
                        eyhm eyhmVar = cvasVar.e;
                        if (!eyhmVar.containsKey(str)) {
                            throw new IllegalArgumentException();
                        }
                        cvdc cvdcVar2 = cvdc.this;
                        Stream stream2 = Collection.EL.stream(((cvan) eyhmVar.get(str)).b);
                        cvcg cvcgVar = cvdcVar2.c;
                        cvcgVar.getClass();
                        Stream map = stream2.map(new cvct(cvcgVar));
                        int i = engw.d;
                        return elfo.a((Iterable) map.collect(endq.a));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a)).h(new emwl() { // from class: cvcw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        enhd enhdVar = new enhd();
                        int i = 0;
                        while (true) {
                            engw engwVar = engw.this;
                            if (i >= engwVar.size()) {
                                return enhdVar.c();
                            }
                            enhdVar.k((String) engwVar.get(i), (List) Collection.EL.stream((List) list.get(i)).map(new Function() { // from class: cvcm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return eyee.x(((KeyPair) obj3).getPublic().getEncoded());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(endq.a));
                            i++;
                        }
                    }
                }, cvdcVar.d);
            }
        }, this.d);
    }

    public final elfl c() {
        return this.b.d();
    }

    public final List e(ECPrivateKey eCPrivateKey, java.util.Collection collection, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ECPublicKey e = euif.e(((eyee) it.next()).I());
                final eyee x = eyee.x(erth.a(eCPrivateKey, e));
                arrayList.addAll((java.util.Collection) Collection.EL.stream(erth.c(eCPrivateKey, engw.r(e), str)).map(new Function() { // from class: cvcp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return eyee.x((byte[]) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cvcq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eyee eyeeVar = (eyee) obj;
                        etee eteeVar = (etee) etef.a.createBuilder();
                        eteeVar.copyOnWrite();
                        etef etefVar = (etef) eteeVar.instance;
                        eyeeVar.getClass();
                        etefVar.b = eyeeVar;
                        eteeVar.copyOnWrite();
                        ((etef) eteeVar.instance).c = eyee.this;
                        return (etef) eteeVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a));
            }
            return arrayList;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e2);
        }
    }
}
