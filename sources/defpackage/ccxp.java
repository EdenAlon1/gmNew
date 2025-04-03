package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxp extends ffhv implements ffjm {
    final /* synthetic */ Collection a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxp(ffgu ffguVar, Collection collection) {
        super(2, ffguVar);
        this.a = collection;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("+loadCorrelationIds");
        d.h(new ccxq(this.a));
        buum buumVar = MessagesTable.c;
        d.c(buumVar.a, buumVar.W);
        engw y = d.b().y();
        y.getClass();
        ArrayList<MessagesTable.BindData> arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (((MessagesTable.BindData) next).Q() != null) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(arrayList, 10)), 16));
        for (MessagesTable.BindData bindData : arrayList) {
            String b = bindData.D().b();
            String Q = bindData.Q();
            Q.getClass();
            ffcf ffcfVar = new ffcf(b, new ffch(Q));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxp ccxpVar = new ccxp(ffguVar, this.a);
        ccxpVar.b = obj;
        return ccxpVar;
    }
}
