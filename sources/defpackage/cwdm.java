package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ ffkx c;
    final /* synthetic */ ffkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdm(List list, ffkx ffkxVar, ffkx ffkxVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = ffkxVar;
        this.d = ffkxVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            List list = this.b;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(axol.e(((cwdd) it.next()).b));
            }
            this.a = 1;
            obj = ffqv.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list2 = (List) obj;
        cwdf.b(list2);
        this.c.a = this.d.a && cwdf.a(list2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwdm(this.b, this.c, this.d, ffguVar);
    }
}
