package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egc extends ffkk implements ffji {
    final /* synthetic */ egy a;
    final /* synthetic */ egb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egc(egy egyVar, egb egbVar) {
        super(1);
        this.a = egyVar;
        this.b = egbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        egx c = this.a.c(((Number) obj).intValue());
        int i = c.a;
        ArrayList arrayList = new ArrayList(c.b.size());
        List list = c.b;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            egb egbVar = this.b;
            long j = ((efi) list.get(i3)).a;
            arrayList.add(new ffcf(Integer.valueOf(i), new jzk(egbVar.c(i2, 1))));
            i++;
            i2++;
        }
        return arrayList;
    }
}
