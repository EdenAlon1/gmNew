package defpackage;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubw {
    public static final etsv a = new etst(eubq.class, etgh.class, new etsu() { // from class: eubt
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            eubq eubqVar = (eubq) etfsVar;
            euiu euiuVar = (euiu) euhv.c.a(eubqVar.c().c);
            euic euicVar = (euic) euhv.e.a(eubqVar.c().b);
            Provider a2 = etqr.a();
            eubqVar.f().c();
            eubqVar.c().d.equals(eubn.c);
            return new euhu(euiuVar);
        }
    });
    public static final etsv b = new etst(eubs.class, etgi.class, new etsu() { // from class: eubu
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            eubs eubsVar = (eubs) etfsVar;
            eubk eubkVar = eubsVar.a.b;
            byte[] bArr = euhv.a;
            Provider a2 = etqr.a();
            return new euhv((ECPublicKey) (a2 != null ? KeyFactory.getInstance("EC", a2) : (KeyFactory) euil.g.a("EC")).generatePublic(new ECPublicKeySpec(eubsVar.b, euif.h((euic) euhv.e.a(eubkVar)))), (euiu) euhv.c.a(eubsVar.a.c), (euid) euhv.d.a(eubsVar.a.a), eubsVar.c.c(), eubsVar.a.d.equals(eubn.c) ? euhv.b : euhv.a, a2);
        }
    });
    public static final etft c;
    public static final etrx d;
    public static final int e;
    public static final etrp f;

    static {
        etxt.a.getParserForType();
        f = new etrp("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", etgh.class);
        etxv.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", etgi.class, 5);
        d = new etrx() { // from class: eubv
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                eubo euboVar = (eubo) etgfVar;
                ECParameterSpec eCParameterSpec = euboVar.b.e;
                etsv etsvVar = eubw.a;
                KeyPair c2 = euif.c(eCParameterSpec);
                return eubp.a(eubr.a(euboVar, ((ECPublicKey) c2.getPublic()).getW(), num), new euju(((ECPrivateKey) c2.getPrivate()).getS()));
            }
        };
        e = 2;
    }
}
