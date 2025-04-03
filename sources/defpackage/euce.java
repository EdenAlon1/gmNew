package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euce {
    public static final etsv a = new etst(eubz.class, etgh.class, new etsu() { // from class: euca
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            eubz eubzVar = (eubz) etfsVar;
            byte[] d2 = eubzVar.b.d();
            eubzVar.f().c();
            eubzVar.c().a.equals(eubx.c);
            return new euia(d2);
        }
    });
    public static final etsv b = new etst(eucf.class, etgi.class, new etsu() { // from class: eucb
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            eucf eucfVar = (eucf) etfsVar;
            if (etmj.a(1)) {
                return new euib(eucfVar.b.c(), eucfVar.c.c(), eucfVar.a.a.equals(eubx.c) ? new byte[]{0} : new byte[0]);
            }
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
    });
    public static final etft c;
    public static final etrz d;
    public static final etrx e;
    public static final etrp f;

    static {
        etym.a.getParserForType();
        f = new etrp("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", etgh.class);
        etyo.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", etgi.class, 5);
        d = new etrz() { // from class: eucc
        };
        e = new etrx() { // from class: eucd
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                euby eubyVar = (euby) etgfVar;
                etsv etsvVar = euce.a;
                byte[] b2 = ettg.b(32);
                if (b2.length == 32) {
                    return eubz.e(eucf.c(eubyVar.a, eujt.b(Arrays.copyOf(etqy.j(etqy.i(b2)), 32)), num), eujv.c(Arrays.copyOf(b2, 32)));
                }
                throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
            }
        };
    }
}
