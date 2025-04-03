package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethk {
    public static final etsv a = new etst(ethh.class, etfk.class, new etsu() { // from class: ethi
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ethh ethhVar = (ethh) etfsVar;
            int i = euhl.a;
            if (!etmj.a(1)) {
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            }
            ethn ethnVar = ethhVar.a;
            return new euhl(ethhVar.b.d(), ethhVar.a.b, ethhVar.c.c());
        }
    });
    public static final etft b;
    public static final etrx c;

    static {
        etwm.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.AesEaxKey", etfk.class, 3);
        c = new etrx() { // from class: ethj
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                ethn ethnVar = (ethn) etgfVar;
                int i = ethnVar.a;
                etsv etsvVar = ethk.a;
                if (i != 24) {
                    return ethg.a(ethnVar, eujv.b(ethnVar.a), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
        };
    }
}
