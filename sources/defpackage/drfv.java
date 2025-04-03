package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ drgb d;
    final /* synthetic */ dtcq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drfv(List list, drgb drgbVar, dtcq dtcqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = list;
        this.d = drgbVar;
        this.e = dtcqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drfv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ArrayList arrayList;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            arrayList = obj2;
        } else {
            ffci.b(obj);
            List list = this.c;
            ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new dtcn((String) it.next()));
            }
            ffhd hT = this.d.aY().hT();
            drfu drfuVar = new drfu(this.e, arrayList2, null);
            this.a = arrayList2;
            this.b = 1;
            obj = ffra.a(hT, drfuVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            arrayList = arrayList2;
        }
        dtcq dtcqVar = this.e;
        arrayList.getClass();
        dtcqVar.e = arrayList;
        dqie.b((List) obj, dtcqVar.e.size(), this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drfv(this.c, this.d, this.e, ffguVar);
    }
}
