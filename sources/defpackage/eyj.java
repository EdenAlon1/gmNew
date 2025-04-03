package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyj extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyj(List list, List list2) {
        super(1);
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        List list = this.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ffcf ffcfVar = (ffcf) list.get(i);
                iqjVar.f((iqk) ffcfVar.a, ((kaa) ffcfVar.b).a, 0.0f);
            }
        }
        List list2 = this.b;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ffcf ffcfVar2 = (ffcf) list2.get(i2);
                iqk iqkVar = (iqk) ffcfVar2.a;
                ffix ffixVar = (ffix) ffcfVar2.b;
                iqjVar.f(iqkVar, ffixVar != null ? ((kaa) ffixVar.invoke()).a : 0L, 0.0f);
            }
        }
        return ffcu.a;
    }
}
