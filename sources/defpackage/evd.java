package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evd extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ eve b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evd(List list, eve eveVar) {
        super(1);
        this.a = list;
        this.b = eveVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        List a = esa.a(this.a, this.b.a);
        if (a != null) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                ffcf ffcfVar = (ffcf) a.get(i);
                iqk iqkVar = (iqk) ffcfVar.a;
                ffix ffixVar = (ffix) ffcfVar.b;
                iqjVar.f(iqkVar, ffixVar != null ? ((kaa) ffixVar.invoke()).a : 0L, 0.0f);
            }
        }
        return ffcu.a;
    }
}
