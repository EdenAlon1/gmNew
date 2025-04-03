package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foe extends ffkk implements ffji {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foe(ArrayList arrayList, int i) {
        super(1);
        this.a = arrayList;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int i2 = this.b;
            iqk iqkVar = (iqk) arrayList.get(i);
            iqj.m(iqjVar, iqkVar, 0, (i2 - iqkVar.b) / 2);
        }
        return ffcu.a;
    }
}
