package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cexh b;
    final /* synthetic */ ceyc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cexp(ffgu ffguVar, cexh cexhVar, ceyc ceycVar) {
        super(2, ffguVar);
        this.b = cexhVar;
        this.c = ceycVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cexp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (((Boolean) ceyc.a.e()).booleanValue()) {
                int ordinal = this.b.ordinal();
                if (ordinal == 0) {
                    return ffen.a;
                }
                if (ordinal == 1) {
                    return ((Map) this.c.b.b()).keySet();
                }
                throw new ffcd();
            }
            ceyc ceycVar = this.c;
            this.a = 1;
            obj = ceycVar.f(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Set entrySet = ((Map) obj).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((cexh) ((Map.Entry) obj2).getValue()) == this.b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cexp cexpVar = new cexp(ffguVar, this.b, this.c);
        cexpVar.d = obj;
        return cexpVar;
    }
}
