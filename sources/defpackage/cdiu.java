package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdiu {
    public static cdjw a(int i, csfz csfzVar) {
        cdjs cdjsVar = (cdjs) cdjw.b.createBuilder();
        cdjsVar.copyOnWrite();
        cdjw cdjwVar = (cdjw) cdjsVar.instance;
        cdjwVar.c |= 1;
        cdjwVar.d = i;
        cdjsVar.copyOnWrite();
        cdjw cdjwVar2 = (cdjw) cdjsVar.instance;
        cdjwVar2.f = 1;
        cdjwVar2.c |= 4;
        cdju cdjuVar = cdju.GENERATE_KEY;
        cdjsVar.copyOnWrite();
        cdjw cdjwVar3 = (cdjw) cdjsVar.instance;
        cdjwVar3.e = cdjuVar.g;
        cdjwVar3.c |= 2;
        ArrayList c = enkr.c(cdju.GENERATE_KEY, cdju.SYNC_BACKUP_KEY, cdju.SYNC_ENCRYPTION_KEY, cdju.SYNC_HMAC_KEY, cdju.COMPLETE_KEY_SYNC);
        cdjsVar.copyOnWrite();
        cdjw cdjwVar4 = (cdjw) cdjsVar.instance;
        eygi eygiVar = cdjwVar4.g;
        if (!eygiVar.c()) {
            cdjwVar4.g = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            cdjwVar4.g.h(((cdju) it.next()).g);
        }
        csgm csgmVar = (csgm) new tem().fP(csfzVar);
        cdjsVar.copyOnWrite();
        cdjw cdjwVar5 = (cdjw) cdjsVar.instance;
        cdjwVar5.h = csgmVar.d;
        cdjwVar5.c |= 8;
        return (cdjw) cdjsVar.build();
    }
}
