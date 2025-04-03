package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakp extends ffhv implements ffjm {
    final /* synthetic */ cakw a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakp(ffgu ffguVar, cakw cakwVar, List list) {
        super(2, ffguVar);
        this.a = cakwVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw b = ((chef) this.a.c.b()).b(engq.a(this.b));
        b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(b, 10)), 16));
        enqv it = b.iterator();
        while (it.hasNext()) {
            E next = it.next();
            String g = ((boqd) next).g();
            g.getClass();
            linkedHashMap.put(g, next);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cakp cakpVar = new cakp(ffguVar, this.a, this.b);
        cakpVar.c = obj;
        return cakpVar;
    }
}
