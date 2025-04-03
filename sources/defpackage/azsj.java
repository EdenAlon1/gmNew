package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsj extends ffhv implements ffjm {
    final /* synthetic */ azst a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsj(ffgu ffguVar, azst azstVar) {
        super(2, ffguVar);
        this.a = azstVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw y = azrn.a("MyIdentityTablesOperations#getAllMyIdentities").b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            azst azstVar = this.a;
            azqe azqeVar = (azqe) it.next();
            azqeVar.getClass();
            arrayList.add(azstVar.i(azqeVar));
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azsj azsjVar = new azsj(ffguVar, this.a);
        azsjVar.b = obj;
        return azsjVar;
    }
}
