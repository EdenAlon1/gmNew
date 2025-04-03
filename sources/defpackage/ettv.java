package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettv {
    public static final etrx a = new etrx() { // from class: etts
        @Override // defpackage.etrx
        public final etfs a(etgf etgfVar, Integer num) {
            etty ettyVar = (etty) etgfVar;
            ettv.a(ettyVar);
            return ettq.a(ettyVar, eujv.b(ettyVar.a), num);
        }
    };
    public static final etsv b = new etst(ettr.class, ettz.class, new etsu() { // from class: ettt
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ettv.a(((ettr) etfsVar).a);
            return new etvg();
        }
    });
    public static final etsv c = new etst(ettr.class, etge.class, new etsu() { // from class: ettu
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            ettr ettrVar = (ettr) etfsVar;
            ettv.a(ettrVar.a);
            return new eujd(ettrVar);
        }
    });
    public static final etft d;

    static {
        etvq.a.getParserForType();
        d = new etrq("type.googleapis.com/google.crypto.tink.AesCmacKey", etge.class, 3);
    }

    public static void a(etty ettyVar) {
        if (ettyVar.a != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
