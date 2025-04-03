package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethb {
    public static final etsv a = new etst(etgx.class, etfk.class, new etsu() { // from class: etgy
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            return euig.c((etgx) etfsVar);
        }
    });
    public static final etft b;
    public static final etrz c;
    public static final etrx d;
    public static final int e;

    static {
        etvw.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", etfk.class, 3);
        c = new etrz() { // from class: etgz
        };
        d = new etrx() { // from class: etha
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                ethf ethfVar = (ethf) etgfVar;
                int i = ethfVar.a;
                etsv etsvVar = ethb.a;
                if (i == 16 || ethfVar.a == 32) {
                    return etgw.a(ethfVar, eujv.b(ethfVar.a), eujv.b(ethfVar.b), num);
                }
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
        };
        e = 2;
    }
}
