package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cewe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cewf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cewe(List list, cewf cewfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = cewfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cewe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                List list = this.b;
                cewf cewfVar = this.c;
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(emau.a(cewfVar.d, cewfVar.e, new cewd(cewfVar, (UUID) it.next(), null)));
                }
                this.a = 1;
                if (ffqv.a(arrayList, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            axnw.d(e);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cewe(this.b, this.c, ffguVar);
    }
}
