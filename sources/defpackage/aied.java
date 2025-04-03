package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aied extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aiew c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aied(aiew aiewVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = aiewVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aied aiedVar = new aied(this.c, (ffgu) obj3);
        aiedVar.a = (aidd) obj;
        aiedVar.b = (ahut) obj2;
        return aiedVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ahut, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        aidd aiddVar = (aidd) obj2;
        if (!ffkj.e(aiddVar.a, (String) this.c.e.a().a())) {
            return ffel.a;
        }
        List<ambn> list = aiddVar.b;
        aiew aiewVar = this.c;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (ambn ambnVar : list) {
            String f = ambnVar.f();
            arrayList.add(aiewVar.b(ambnVar, "corp_contact_".concat(f), r0, aiddVar.c));
        }
        return arrayList;
    }
}
