package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irz extends ffkk implements ffji {
    final /* synthetic */ isa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irz(isa isaVar) {
        super(1);
        this.a = isaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        isb isbVar = (isb) obj;
        if (isbVar.n()) {
            if (isbVar.g().b) {
                isbVar.k();
            }
            Map map = isbVar.g().h;
            isa isaVar = this.a;
            for (Map.Entry entry : map.entrySet()) {
                isaVar.d((imq) entry.getKey(), ((Number) entry.getValue()).intValue(), isbVar.i());
            }
            iwi iwiVar = isbVar.i().v;
            iwiVar.getClass();
            while (!ffkj.e(iwiVar, this.a.a.i())) {
                Set<imq> keySet = this.a.c(iwiVar).keySet();
                isa isaVar2 = this.a;
                for (imq imqVar : keySet) {
                    isaVar2.d(imqVar, isaVar2.a(iwiVar, imqVar), iwiVar);
                }
                iwiVar = iwiVar.v;
                iwiVar.getClass();
            }
        }
        return ffcu.a;
    }
}
