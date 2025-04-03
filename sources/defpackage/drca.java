package defpackage;

import android.support.v7.widget.GridLayoutManager;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drca extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ drcf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drca(drcf drcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drca) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffci.b(obj);
        Map map = (Map) this.a;
        drcf drcfVar = this.b;
        drco drcoVar = drcfVar.am;
        ReactiveGridLayoutManager reactiveGridLayoutManager = null;
        if (drcoVar == null) {
            ffkj.c("recentStickersAdapter");
            drcoVar = null;
        }
        List list = drcoVar.f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            drap drapVar = (drap) entry.getKey();
            dqzc dqzcVar = (dqzc) entry.getValue();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (ffkj.e((drap) obj2, drapVar)) {
                    break;
                }
            }
            drap drapVar2 = (drap) obj2;
            if (drapVar2 == null) {
                drapVar.b = dqkw.a(new drao(new drll(new drbp(dqzcVar, null))));
            } else {
                drapVar = drapVar2;
            }
            arrayList.add(drapVar);
        }
        List a = dqie.a(list, arrayList, null, null, 28);
        drcoVar.f = arrayList;
        ReactiveGridLayoutManager reactiveGridLayoutManager2 = drcfVar.an;
        if (reactiveGridLayoutManager2 == null) {
            ffkj.c("stickerListLayoutManager");
        } else {
            reactiveGridLayoutManager = reactiveGridLayoutManager2;
        }
        dqie.b(a, ((GridLayoutManager) reactiveGridLayoutManager).b * 6, drcoVar);
        this.b.bJ();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drca drcaVar = new drca(this.b, ffguVar);
        drcaVar.a = obj;
        return drcaVar;
    }
}
