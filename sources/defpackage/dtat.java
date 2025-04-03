package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtat extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtau b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ ffix d;
    final /* synthetic */ vk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtat(dtau dtauVar, RecyclerView recyclerView, ffix ffixVar, vk vkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtauVar;
        this.c = recyclerView;
        this.d = ffixVar;
        this.e = vkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtat) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [ffxx, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtau dtauVar = this.b;
            RecyclerView recyclerView = this.c;
            ffix ffixVar = this.d;
            vk vkVar = this.e;
            ?? invoke = dtauVar.c.invoke();
            dtas dtasVar = new dtas(dtauVar, recyclerView, ffixVar, vkVar, null);
            this.a = 1;
            if (ffyk.b(invoke, dtasVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtat(this.b, this.c, this.d, this.e, ffguVar);
    }
}
