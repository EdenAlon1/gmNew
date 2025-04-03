package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsk extends ffhv implements ffjm {
    final /* synthetic */ Iterable a;
    final /* synthetic */ azst b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsk(ffgu ffguVar, Iterable iterable, azst azstVar) {
        super(2, ffguVar);
        this.a = iterable;
        this.b = azstVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        azrk a = azrn.a("MyIdentityTablesOperations#getMyIdentitiesForTokens");
        a.c(new azsl(this.a));
        engw y = a.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            azqe azqeVar = (azqe) it.next();
            azst azstVar = this.b;
            azqeVar.getClass();
            arrayList.add(azstVar.i(azqeVar));
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azsk azskVar = new azsk(ffguVar, this.a, this.b);
        azskVar.c = obj;
        return azskVar;
    }
}
