package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixm {
    public final emmt b;
    public final errl c;
    public final aixd d;
    private final ffbr f;
    private static final entd e = entd.c("BugleSmartsP13n");
    public static final cfup a = cfvl.m(cfvl.b, "p13n_model_file_spec", "");

    public aixm(emmt emmtVar, errl errlVar, aixd aixdVar, ffbr ffbrVar) {
        this.b = emmtVar;
        this.c = errlVar;
        this.d = aixdVar;
        this.f = ffbrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(String str, Exception exc) {
        int i;
        char c;
        ((ensz) ((ensz) ((ensz) e.j()).g(exc)).h("com/google/android/apps/messaging/p13n/PredicatesAggregatorFactory", "logError", 'o', "PredicatesAggregatorFactory.java")).q(str);
        try {
            i = 3;
            switch (str.hashCode()) {
                case -1642953530:
                    if (str.equals("SENTENCE_PIECE_CONFIG_NOT_FOUND")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 615976424:
                    if (str.equals("SENTENCE_PIECE_CONFIG_IS_EMPTY")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875210144:
                    if (str.equals("UNKNOWN_PREDICATES_AGGREGATOR_ERROR")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (IllegalArgumentException unused) {
        }
        if (c != 0) {
            if (c == 1) {
                i = 2;
            } else if (c != 2) {
                if (c != 3) {
                    throw new IllegalArgumentException();
                }
                i = 4;
            }
            akxl akxlVar = (akxl) this.f.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eqgl eqglVar = (eqgl) eqgo.a.createBuilder();
            eqglVar.copyOnWrite();
            eqgo eqgoVar = (eqgo) eqglVar.instance;
            eqgoVar.c = 1;
            eqgoVar.b = 1 | eqgoVar.b;
            eqglVar.copyOnWrite();
            eqgo eqgoVar2 = (eqgo) eqglVar.instance;
            eqgoVar2.d = i - 1;
            eqgoVar2.b |= 2;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eqgo eqgoVar3 = (eqgo) eqglVar.build();
            eqgoVar3.getClass();
            eolvVar2.bp = eqgoVar3;
            eolvVar2.f |= 65536;
            akxlVar.j(eoluVar);
        }
        i = 1;
        akxl akxlVar2 = (akxl) this.f.b();
        eolu eoluVar2 = (eolu) eolv.a.createBuilder();
        eolt eoltVar2 = eolt.BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT;
        eoluVar2.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar2.instance;
        eolvVar3.j = eoltVar2.dk;
        eolvVar3.b |= 1;
        eqgl eqglVar2 = (eqgl) eqgo.a.createBuilder();
        eqglVar2.copyOnWrite();
        eqgo eqgoVar4 = (eqgo) eqglVar2.instance;
        eqgoVar4.c = 1;
        eqgoVar4.b = 1 | eqgoVar4.b;
        eqglVar2.copyOnWrite();
        eqgo eqgoVar22 = (eqgo) eqglVar2.instance;
        eqgoVar22.d = i - 1;
        eqgoVar22.b |= 2;
        eoluVar2.copyOnWrite();
        eolv eolvVar22 = (eolv) eoluVar2.instance;
        eqgo eqgoVar32 = (eqgo) eqglVar2.build();
        eqgoVar32.getClass();
        eolvVar22.bp = eqgoVar32;
        eolvVar22.f |= 65536;
        akxlVar2.j(eoluVar2);
    }
}
