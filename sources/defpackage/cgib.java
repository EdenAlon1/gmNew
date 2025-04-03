package defpackage;

import com.google.android.gms.kids.IndividualContactRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgib extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cgie c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgib(ffgu ffguVar, List list, cgie cgieVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = cgieVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgib) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cgie.c(cggs.a((aoku) it.next())));
        }
        IndividualContactRequest[] individualContactRequestArr = (IndividualContactRequest[]) arrayList.toArray(new IndividualContactRequest[0]);
        Object b = this.c.b.b();
        b.getClass();
        ffhd a = ekxi.a((ffhd) b);
        cgic cgicVar = new cgic(null, this.c, individualContactRequestArr);
        this.a = 1;
        Object a2 = ffra.a(a, cgicVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgib cgibVar = new cgib(ffguVar, this.b, this.c);
        cgibVar.d = obj;
        return cgibVar;
    }
}
