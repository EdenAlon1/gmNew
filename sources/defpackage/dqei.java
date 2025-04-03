package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqei extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ dqfc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqei(List list, dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = list;
        this.d = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqei) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Iterator it;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            it = obj2;
        } else {
            ffci.b(obj);
            it = this.c.iterator();
        }
        while (it.hasNext()) {
            drnn drnnVar = (drnn) it.next();
            dqfc dqfcVar = this.d;
            enru enruVar = dqfc.a;
            dqlx dqlxVar = ((dqls) dqfcVar.bE().invoke()).b;
            this.a = it;
            this.b = 1;
            if (dqlxVar.a(drnnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqei(this.c, this.d, ffguVar);
    }
}
