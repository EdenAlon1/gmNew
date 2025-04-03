package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlc {
    public static final /* synthetic */ int a = 0;
    private static final cfup b = cfvl.a("cms_local_media_restore_retry_limit", 3);

    public static final cdwo a(cdwi cdwiVar, cdlb cdlbVar, int i, boolean z, boolean z2) {
        eyhz parserForType = cejh.a.getParserForType();
        parserForType.getClass();
        int longValue = (int) ((Number) b.e()).longValue();
        poh pohVar = new poh();
        pohVar.c(i);
        pohVar.a = z;
        pohVar.c = z2;
        poj a2 = pohVar.a();
        cdwt cdwtVar = new cdwt();
        poa poaVar = poa.EXPONENTIAL;
        long longValue2 = ((Number) cdwo.b.e()).longValue();
        cfyt cfytVar = cdwiVar.e;
        asjt asjtVar = cdwiVar.g;
        babm babmVar = cdwiVar.f;
        return new cdwo(cdwiVar.b, a2, cdwiVar.a, cdwtVar, Object.class, babmVar, cdlbVar, Object.class, parserForType, poaVar, asjtVar, longValue, longValue2, cevc.WORKMANAGER_ONLY, Optional.empty(), null, cfytVar);
    }
}
