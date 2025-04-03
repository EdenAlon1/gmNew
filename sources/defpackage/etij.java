package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etij {
    public static final etsv a = new etst(etig.class, etfk.class, new etsu() { // from class: etih
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            etig etigVar = (etig) etfsVar;
            etsv etsvVar = etij.a;
            return etle.d() ? new etle(etigVar.b.d(), etigVar.c.c()) : new euht(etigVar.b.d(), etigVar.c.c());
        }
    });
    public static final etrx b = new etrx() { // from class: etii
        @Override // defpackage.etrx
        public final etfs a(etgf etgfVar, Integer num) {
            etik etikVar = ((etil) etgfVar).a;
            etsv etsvVar = etij.a;
            return etig.b(etikVar, eujv.b(32), num);
        }
    };
    public static final etft c;

    static {
        etxk.a.getParserForType();
        c = new etrq("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", etfk.class, 3);
    }
}
