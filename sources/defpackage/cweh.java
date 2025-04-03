package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cweh extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cwfa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cweh(cwfa cwfaVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cwfaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cweh cwehVar = new cweh(this.c, (ffgu) obj3);
        cwehVar.a = (cwdw) obj;
        cwehVar.b = (cwir) obj2;
        return cwehVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        cwdw cwdwVar = (cwdw) obj2;
        if (!ffkj.e(cwdwVar.a, (String) this.c.c.a().a())) {
            return ffel.a;
        }
        List<ambn> list = cwdwVar.b;
        cwfa cwfaVar = this.c;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (ambn ambnVar : list) {
            String f = ambnVar.f();
            arrayList.add(cwfaVar.f(ambnVar, "corp_contact_".concat(f), (cwir) obj3, cwdwVar.c));
        }
        return arrayList;
    }
}
