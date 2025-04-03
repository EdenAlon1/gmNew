package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etht {
    public static final etsv a = new etst(ethp.class, etfk.class, new etsu() { // from class: ethq
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ethp ethpVar = (ethp) etfsVar;
            ethw ethwVar = ethpVar.a;
            return new euhp(ethpVar.b.d(), ethpVar.c);
        }
    });
    public static final etft b;
    public static final etrz c;
    public static final etrx d;
    public static final int e;

    static {
        etwy.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.AesGcmKey", etfk.class, 3);
        c = new etrz() { // from class: ethr
        };
        d = new etrx() { // from class: eths
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                ethw ethwVar = (ethw) etgfVar;
                int i = ethwVar.a;
                etsv etsvVar = etht.a;
                if (i != 24) {
                    return etho.a(ethwVar, eujv.b(ethwVar.a), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
        };
        e = 2;
    }
}
