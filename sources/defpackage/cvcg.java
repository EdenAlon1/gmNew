package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvcg {
    public final errl c;
    public final errl d;
    public final cfyt e;
    private final emyl g;
    private final cqoh h;
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsKeyCryptor");
    private static final byte[] f = new byte[0];
    public static final cfva b = cfvl.q(168221060);

    public cvcg(errl errlVar, errl errlVar2, final Context context, cqoh cqohVar, cfyt cfytVar) {
        this.c = errlVar;
        this.d = errlVar2;
        this.g = emys.a(new emyl() { // from class: cvca
            @Override // defpackage.emyl
            public final Object get() {
                final Context context2 = context;
                return elfo.g(new Callable() { // from class: cvcc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cvcg.d(context2);
                    }
                }, cvcg.this.c);
            }
        });
        this.h = cqohVar;
        this.e = cfytVar;
    }

    static /* synthetic */ etql d(Context context) {
        try {
            cskc cskcVar = a;
            csjb c = cskcVar.c();
            c.I("Initializing HybridConfig...");
            c.r();
            etol.a();
            csjb c2 = cskcVar.c();
            c2.I("Constructing AndroidKeysetManager...");
            c2.r();
            etqk etqkVar = new etqk();
            etqkVar.c(context, "verified_sms_master_key", "verified_sms");
            etqkVar.e = etox.a;
            etqkVar.b("android-keystore://verified_sms");
            return etqkVar.a();
        } catch (IOException | GeneralSecurityException e) {
            a.o("Error while initializing Tink's HybridConfig/AndroidKeysetManager", e);
            throw new cvcf(e);
        }
    }

    public static KeyPair e(cvbt cvbtVar, etql etqlVar) {
        byte[] I = cvbtVar.d.I();
        byte[] I2 = cvbtVar.c.I();
        try {
            etfq etfqVar = (etfq) etqlVar.a().f(etth.a, etfq.class);
            byte[] bArr = f;
            KeyPair keyPair = new KeyPair(euif.e(etfqVar.a(I, bArr)), (ECPrivateKey) ((KeyFactory) euil.g.a("EC")).generatePrivate(new PKCS8EncodedKeySpec(etfqVar.a(I2, bArr))));
            csjb c = a.c();
            c.I("Deserialized key pair:");
            c.y("private_size", keyPair.getPrivate().getEncoded().length);
            c.y("public_size", keyPair.getPublic().getEncoded().length);
            c.M("private_class", keyPair.getPrivate().getClass().getName());
            c.M("public_class", keyPair.getPublic().getClass().getName());
            c.r();
            return keyPair;
        } catch (GeneralSecurityException e) {
            cskc cskcVar = a;
            csjb e2 = cskcVar.e();
            e2.I("Decryption failed, at rest information for key pair:");
            e2.y("private_encrypted_size", I2.length);
            e2.y("public_encrypted_size", I.length);
            e2.r();
            csjb e3 = cskcVar.e();
            e3.I("Error while decrypting/restoring VSMS key pair.");
            e3.s(e);
            throw new cvce("Error while decrypting/restoring VSMS key pair.", e);
        }
    }

    public final /* synthetic */ cvbt a(KeyPair keyPair, etql etqlVar) {
        try {
            etfr etfrVar = (etfr) etqlVar.a().c().f(etth.a, etfr.class);
            byte[] encoded = keyPair.getPrivate().getEncoded();
            byte[] bArr = f;
            byte[] a2 = etfrVar.a(encoded, bArr);
            byte[] a3 = etfrVar.a(keyPair.getPublic().getEncoded(), bArr);
            cvbs cvbsVar = (cvbs) cvbt.a.createBuilder();
            eyee x = eyee.x(a2);
            cvbsVar.copyOnWrite();
            ((cvbt) cvbsVar.instance).c = x;
            eyee x2 = eyee.x(a3);
            cvbsVar.copyOnWrite();
            ((cvbt) cvbsVar.instance).d = x2;
            eyja d = eykm.d(this.h.f().toEpochMilli());
            cvbsVar.copyOnWrite();
            cvbt cvbtVar = (cvbt) cvbsVar.instance;
            d.getClass();
            cvbtVar.e = d;
            cvbtVar.b |= 1;
            return (cvbt) cvbsVar.build();
        } catch (GeneralSecurityException e) {
            csjb b2 = a.b();
            b2.I("Error while encrypting VSMS key pair.");
            b2.s(e);
            throw new cvce("Error while encrypting VSMS key pair.", e);
        }
    }

    final elfl b(final List list) {
        csjb c = a.c();
        c.I("Decrypting VSMS key pairs...");
        c.y("number", list.size());
        c.r();
        return c().h(new emwl() { // from class: cvbz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final etql etqlVar = (etql) obj;
                cskc cskcVar = cvcg.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: cvby
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return cvcg.e((cvbt) obj2, etql.this);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return (engw) map.collect(endq.a);
            }
        }, this.c).f(Exception.class, new cvbx(this), this.d);
    }

    public final elfl c() {
        return (elfl) this.g.get();
    }
}
