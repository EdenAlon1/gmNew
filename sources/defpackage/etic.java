package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etic {
    public static final etsv a = new etst(ethy.class, etfk.class, new etsu() { // from class: ethz
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ethy ethyVar = (ethy) etfsVar;
            return new etmi(ethyVar.b.d(), ethyVar.c.c());
        }
    });
    public static final etrx b = new etrx() { // from class: etia
        @Override // defpackage.etrx
        public final etfs a(etgf etgfVar, Integer num) {
            etif etifVar = (etif) etgfVar;
            int i = etifVar.a;
            etsv etsvVar = etic.a;
            return ethx.a(etifVar, eujv.b(i), num);
        }
    };
    public static final etrz c = new etrz() { // from class: etib
    };
    public static final etft d;

    static {
        etxc.a.getParserForType();
        d = new etrq("type.googleapis.com/google.crypto.tink.AesGcmSivKey", etfk.class, 3);
    }

    public static boolean a() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
