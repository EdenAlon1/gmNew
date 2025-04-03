package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azso extends ffhv implements ffjm {
    final /* synthetic */ Iterable a;
    final /* synthetic */ azst b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azso(ffgu ffguVar, Iterable iterable, azst azstVar) {
        super(2, ffguVar);
        this.a = iterable;
        this.b = azstVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azso) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Iterable<ctwi> iterable = this.a;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        for (ctwi ctwiVar : iterable) {
            String w = ctwiVar.w();
            w.getClass();
            int a = ctwiVar.a();
            String r = ctwiVar.r();
            r.getClass();
            arrayList.add(new azvv(a, w, (aoku) fflm.b(ctwiVar.i(false)), r, 16));
        }
        return this.b.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azso azsoVar = new azso(ffguVar, this.a, this.b);
        azsoVar.c = obj;
        return azsoVar;
    }
}
