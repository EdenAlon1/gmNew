package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dquw extends ffhv implements ffjm {
    final /* synthetic */ dquy a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquw(dquy dquyVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dquyVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dquw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        fffs fffsVar = new fffs((byte[]) null);
        int i = 0;
        for (Object obj2 : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            dquy dquyVar = this.a;
            dqog dqogVar = (dqog) obj2;
            String string = dquyVar.o.getString(dqst.a(dqogVar).a);
            string.getClass();
            fffsVar.add(new dqut(string, i2));
            dquyVar.p.put(i2, fffsVar.c - 1);
            Iterator it = dqogVar.b.iterator();
            while (it.hasNext()) {
                fffsVar.add(new dqus((dqqj) it.next(), i2));
            }
            i = i2;
        }
        return ffdx.a(fffsVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dquw(this.a, this.b, ffguVar);
    }
}
