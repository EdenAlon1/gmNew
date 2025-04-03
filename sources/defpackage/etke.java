package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etke {
    public static final etsv a = new etst(etka.class, etfk.class, new etsu() { // from class: etkb
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            etka etkaVar = (etka) etfsVar;
            etsv etsvVar = etke.a;
            return etmb.c() ? new etmb(etkaVar.b.d(), etkaVar.c.c()) : new eujs(etkaVar.b.d(), etkaVar.c.c());
        }
    });
    public static final etft b;
    public static final etrz c;
    public static final etrx d;

    static {
        eubg.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", etfk.class, 3);
        c = new etrz() { // from class: etkc
        };
        d = new etrx() { // from class: etkd
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                etkf etkfVar = ((etkg) etgfVar).a;
                etsv etsvVar = etke.a;
                return etka.b(etkfVar, eujv.b(32), num);
            }
        };
    }
}
