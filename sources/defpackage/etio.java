package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etio {
    public static final etsv a = new etst(etit.class, etfk.class, new etsu() { // from class: etim
        @Override // defpackage.etsu
        public final Object a(etfs etfsVar) {
            etit etitVar = (etit) etfsVar;
            String str = etitVar.a.a;
            etsv etsvVar = etio.a;
            return etlt.c(etgd.a(str).a(etitVar.a.a), etitVar.b);
        }
    });
    public static final etft b;
    public static final etrx c;

    static {
        etzz.a.getParserForType();
        b = new etrq("type.googleapis.com/google.crypto.tink.KmsAeadKey", etfk.class, 6);
        c = new etrx() { // from class: etin
            @Override // defpackage.etrx
            public final etfs a(etgf etgfVar, Integer num) {
                etsv etsvVar = etio.a;
                return etit.b((etiv) etgfVar, num);
            }
        };
    }
}
