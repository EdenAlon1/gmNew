package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqtf implements eygg {
    static final eygg a = new eqtf();

    private eqtf() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqtg eqtgVar;
        switch (i) {
            case 0:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED;
                break;
            case 1:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE;
                break;
            case 2:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE;
                break;
            case 3:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID;
                break;
            case 4:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED;
                break;
            case 5:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES;
                break;
            case 6:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL;
                break;
            case 7:
                eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE;
                break;
            default:
                eqtgVar = null;
                break;
        }
        return eqtgVar != null;
    }
}
