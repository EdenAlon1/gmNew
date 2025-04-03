package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtas extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ dtau b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ ffix d;
    final /* synthetic */ vk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtas(dtau dtauVar, RecyclerView recyclerView, ffix ffixVar, vk vkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtauVar;
        this.c = recyclerView;
        this.d = ffixVar;
        this.e = vkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtas) c((List) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        List list = (List) this.a;
        mv.a(new dtar(this.b, list)).b(new dtaq(list, this.b, this.c, this.d, this.e));
        this.b.d = list;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtas dtasVar = new dtas(this.b, this.c, this.d, this.e, ffguVar);
        dtasVar.a = obj;
        return dtasVar;
    }
}
