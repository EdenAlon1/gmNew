package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gql extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gql(ffjm ffjmVar, ffjm ffjmVar2, ffjn ffjnVar) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ipo ei;
        irg irgVar = (irg) obj;
        long j = ((jzk) obj2).a;
        int b = jzk.b(j);
        List a = irgVar.a(gqp.a, this.a);
        int size = a.size();
        ffkz ffkzVar = new ffkz();
        if (size > 0) {
            ffkzVar.a = b / size;
        }
        Integer num = 0;
        int size2 = a.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(((ipl) a.get(i)).a(ffkzVar.a), num.intValue()));
        }
        int intValue = num.intValue();
        ArrayList arrayList = new ArrayList(a.size());
        int size3 = a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ipl iplVar = (ipl) a.get(i2);
            int i3 = ffkzVar.a;
            arrayList.add(iplVar.e(jzk.l(i3, i3, intValue, intValue)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            float ek = irgVar.ek(Math.min(((ipl) a.get(i4)).b(intValue), ffkzVar.a));
            float f = gpy.b;
            arrayList2.add(new gpz(irgVar.ek(ffkzVar.a) * i4, irgVar.ek(ffkzVar.a), ((jzq) ffgh.c(new jzq(ek - (f + f)), new jzq(24.0f))).a));
        }
        ei = irgVar.ei(b, intValue, ffem.a, new gqk(arrayList, irgVar, this.b, ffkzVar, j, intValue, this.c, arrayList2, b));
        return ei;
    }
}
