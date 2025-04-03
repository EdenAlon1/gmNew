package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnm {
    public static final etsv a = new etst(etnu.class, etfq.class, new etsu() { // from class: etnj
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return euhw.b((etnu) etfsVar);
        }
    });
    public static final etsv b = new etst(etnv.class, etfr.class, new etsu() { // from class: etnk
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return euhx.b((etnv) etfsVar);
        }
    });
    public static final etft c;
    public static final etrx d;
    public static final etrp e;

    static {
        etye.a.getParserForType();
        e = new etrp("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", etfq.class);
        etyg.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", etfr.class, 5);
        d = new etrx() { // from class: etnl
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                ECParameterSpec eCParameterSpec;
                etnt etntVar = (etnt) etgfVar;
                etnp etnpVar = etntVar.b;
                etsv etsvVar = etnm.a;
                if (etnpVar == etnp.a) {
                    eCParameterSpec = etrc.a;
                } else if (etnpVar == etnp.b) {
                    eCParameterSpec = etrc.b;
                } else {
                    if (etnpVar != etnp.c) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(String.valueOf(etnpVar))));
                    }
                    eCParameterSpec = etrc.c;
                }
                KeyPair c2 = euif.c(eCParameterSpec);
                return etnu.d(etnv.c(etntVar, ((ECPublicKey) c2.getPublic()).getW(), num), new euju(((ECPrivateKey) c2.getPrivate()).getS()));
            }
        };
    }
}
