package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bdm {
    public static bdp a(bdp bdpVar, bdp bdpVar2) {
        if (bdpVar == null && bdpVar2 == null) {
            return bfn.b;
        }
        bfh b = bdpVar2 != null ? bfh.b(bdpVar2) : bfh.a();
        if (bdpVar != null) {
            Iterator it = bdpVar.r().iterator();
            while (it.hasNext()) {
                b(b, bdpVar2, bdpVar, (bdn) it.next());
            }
        }
        return bfn.f(b);
    }

    public static void b(bfh bfhVar, bdp bdpVar, bdp bdpVar2, bdn bdnVar) {
        if (!Objects.equals(bdnVar, bet.M)) {
            bfhVar.d(bdnVar, bdpVar2.h(bdnVar), bdpVar2.l(bdnVar));
            return;
        }
        boy boyVar = (boy) bdpVar2.m(bdnVar, null);
        boy boyVar2 = (boy) bdpVar.m(bdnVar, null);
        bdo h = bdpVar2.h(bdnVar);
        if (boyVar != null) {
            if (boyVar2 != null) {
                bow bowVar = boyVar.a;
                boz bozVar = boyVar.b;
                boz bozVar2 = boyVar2.b;
                if (bozVar == null) {
                    bozVar = bozVar2;
                }
                boyVar2 = new boy(bowVar, bozVar);
            }
            bfhVar.d(bdnVar, h, boyVar);
        }
        boyVar = boyVar2;
        bfhVar.d(bdnVar, h, boyVar);
    }
}
