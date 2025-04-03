package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdx extends ffhv implements ffjm {
    final /* synthetic */ Set a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azdx(ffgu ffguVar, Set set) {
        super(2, ffguVar);
        this.a = set;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azdx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = azdt.a;
        azdq azdqVar = new azdq(azdt.a);
        azdqVar.z("DestinationsTableOperations#getDestinations");
        azdqVar.c(new azdy(this.a));
        engw y = azdqVar.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            azcw azcwVar = (azcw) it.next();
            azcwVar.getClass();
            arrayList.add(azdw.a(azcwVar));
        }
        if (arrayList.size() == this.a.size()) {
            return arrayList;
        }
        throw new IllegalStateException("Did not find a Destination for every token queried. Number of unique tokens queried: " + this.a.size() + ". Result size: " + arrayList.size() + ".");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azdx azdxVar = new azdx(ffguVar, this.a);
        azdxVar.b = obj;
        return azdxVar;
    }
}
