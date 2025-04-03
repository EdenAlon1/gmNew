package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ qso b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsn(qso qsoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = qsoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qsn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffsk ffskVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffskVar = (ffsk) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffsk ffskVar2 = (ffsk) this.c;
            ffji ffjiVar = ((qsm) this.b.a).a;
            this.c = ffskVar2;
            this.a = 1;
            Object invoke = ffjiVar.invoke(this);
            if (invoke == ffhhVar) {
                return ffhhVar;
            }
            ffskVar = ffskVar2;
            obj = invoke;
        }
        qsw qswVar = (qsw) obj;
        fflb fflbVar = new fflb();
        qso qsoVar = this.b;
        synchronized (ffskVar) {
            qsoVar.b = qswVar;
            fflbVar.a = new ArrayList(qsoVar.c);
            qsoVar.c.clear();
        }
        Iterator it = ((Iterable) fflbVar.a).iterator();
        while (it.hasNext()) {
            ((riw) it.next()).g(qswVar.a, qswVar.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        qsn qsnVar = new qsn(this.b, ffguVar);
        qsnVar.c = obj;
        return qsnVar;
    }
}
