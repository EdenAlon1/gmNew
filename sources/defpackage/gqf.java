package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqf extends ffkk implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ glo d;
    final /* synthetic */ int e;
    final /* synthetic */ ffjn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqf(float f, ffjm ffjmVar, ffjm ffjmVar2, glo gloVar, int i, ffjn ffjnVar) {
        super(2);
        this.a = f;
        this.b = ffjmVar;
        this.c = ffjmVar2;
        this.d = gloVar;
        this.e = i;
        this.f = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ipo ei;
        irg irgVar = (irg) obj;
        long j = ((jzk) obj2).a;
        int eo = irgVar.eo(90.0f);
        int eo2 = irgVar.eo(this.a);
        List a = irgVar.a(gqp.a, this.b);
        Integer num = 0;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((ipl) a.get(i)).a(Alert.DURATION_SHOW_INDEFINITELY)));
        }
        int intValue = num.intValue();
        long m = jzk.m(j, eo, 0, intValue, intValue, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ipl iplVar = (ipl) a.get(i2);
            iqk e = iplVar.e(m);
            float ek = irgVar.ek(Math.min(iplVar.b(e.b), e.a));
            float f = gpy.b;
            arrayList.add(e);
            arrayList2.add(new jzq(ek - (f + f)));
        }
        Integer valueOf = Integer.valueOf(eo2 + eo2);
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((iqk) arrayList.get(i3)).a);
        }
        int intValue2 = valueOf.intValue();
        ei = irgVar.ei(intValue2, intValue, ffem.a, new gqe(eo2, arrayList, irgVar, this.c, this.d, this.e, arrayList2, j, intValue2, intValue, this.f));
        return ei;
    }
}
