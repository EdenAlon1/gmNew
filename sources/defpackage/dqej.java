package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqej extends ffkh implements ffji {
    public dqej(Object obj) {
        super(1, obj, dqfc.class, "handleMediaClick", "handleMediaClick(Lcom/google/android/libraries/compose/media/local/LocalMedia$Visual;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        drnm drnmVar = (drnm) obj;
        drnmVar.getClass();
        dqfc dqfcVar = (dqfc) this.g;
        enru enruVar = dqfc.a;
        Iterable iterable = (Iterable) dqfcVar.aY().c();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (doxw.a((doxx) it.next(), drnmVar)) {
                    ((dqls) dqfcVar.bE().invoke()).b.d(drnmVar);
                    break;
                }
            }
        }
        if (drnmVar.h() <= 0 || drnmVar.i() <= 0) {
            ffqy.d(dqfcVar.aV(), null, null, new dqel(dqfcVar, drnmVar, null), 3);
        } else {
            dqfcVar.ba(drnmVar);
        }
        return ffcu.a;
    }
}
