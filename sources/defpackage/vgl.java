package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgl implements vgj {
    public static final entd a = entd.c("BugleReactions");
    public final cmsl b;

    public vgl(cmsl cmslVar) {
        this.b = cmslVar;
    }

    @Override // defpackage.vgj
    public final vgb a(bcse bcseVar) {
        Optional empty;
        cmsw cmswVar = new cmsw(bcseVar.u(), bcseVar.v().k() ? bcseVar.v() : bcseVar.w(), cmtc.a(bcseVar.g));
        cmrf cmrfVar = bcseVar.s;
        if (cmrfVar != null) {
            Iterator<E> it = cmrfVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                cmro cmroVar = (cmro) it.next();
                Iterator<E> it2 = cmroVar.d.iterator();
                while (it2.hasNext()) {
                    cmri cmriVar = ((cmrs) it2.next()).c;
                    if (cmriVar == null) {
                        cmriVar = cmri.a;
                    }
                    if (cmriVar.c) {
                        cmrl cmrlVar = cmroVar.c;
                        if (cmrlVar == null) {
                            cmrlVar = cmrl.a;
                        }
                        empty = Optional.of(cmrlVar);
                    }
                }
            }
        } else {
            empty = Optional.empty();
        }
        return new vfw(cmswVar, empty);
    }
}
