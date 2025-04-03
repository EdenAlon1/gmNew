package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmq {
    public static final etsv a = new etst(etmm.class, etfp.class, new etsu() { // from class: etmn
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            etmm etmmVar = (etmm) etfsVar;
            etmq.a(etmmVar.a);
            return euhr.a(etmmVar);
        }
    });
    public static final etft b;
    public static final etrz c;
    public static final etrx d;

    static {
        etxg.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.AesSivKey", etfp.class, 3);
        c = new etrz() { // from class: etmo
        };
        d = new etrx() { // from class: etmp
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                etmt etmtVar = (etmt) etgfVar;
                etmq.a(etmtVar);
                return etml.a(etmtVar, eujv.b(etmtVar.a), num);
            }
        };
    }

    public static void a(etmt etmtVar) {
        int i = etmtVar.a;
        if (i != 64) {
            throw new InvalidAlgorithmParameterException(a.f(i, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
