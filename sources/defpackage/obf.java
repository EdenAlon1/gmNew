package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class obf extends ffkk implements ffji {
    final /* synthetic */ obl a;
    final /* synthetic */ ea b;
    final /* synthetic */ nxm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obf(obl oblVar, ea eaVar, nxm nxmVar) {
        super(1);
        this.a = oblVar;
        this.b = eaVar;
        this.c = nxmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lkq] */
    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        List list = this.a.c;
        lkr lkrVar = (lkr) obj;
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (ffkj.e(((ffcf) it.next()).a, this.b.H)) {
                    z = true;
                    break;
                }
            }
        }
        if (lkrVar != null && !z) {
            lkk P = this.b.Q().P();
            if (((lkv) P).c.a(lkj.CREATED)) {
                obl oblVar = this.a;
                P.c(oblVar.e.invoke(this.c));
            }
        }
        return ffcu.a;
    }
}
