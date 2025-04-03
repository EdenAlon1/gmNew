package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqe extends ffkk implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ irg c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ glo e;
    final /* synthetic */ int f;
    final /* synthetic */ List g;
    final /* synthetic */ long h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ ffjn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqe(int i, List list, irg irgVar, ffjm ffjmVar, glo gloVar, int i2, List list2, long j, int i3, int i4, ffjn ffjnVar) {
        super(1);
        this.a = i;
        this.b = list;
        this.c = irgVar;
        this.d = ffjmVar;
        this.e = gloVar;
        this.f = i2;
        this.g = list2;
        this.h = j;
        this.i = i3;
        this.j = i4;
        this.k = ffjnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        ArrayList arrayList = new ArrayList();
        int i = this.a;
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = this.g;
            irg irgVar = this.c;
            iqk iqkVar = (iqk) list.get(i2);
            iqj.m(iqjVar, iqkVar, i, 0);
            arrayList.add(new gpz(irgVar.ek(i), irgVar.ek(iqkVar.a), ((jzq) list2.get(i2)).a));
            i += iqkVar.a;
        }
        List a = this.c.a(gqp.b, this.d);
        long j = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int size2 = a.size();
        for (int i5 = 0; i5 < size2; i5++) {
            iqk e = ((ipl) a.get(i5)).e(jzk.m(j, i3, i3, 0, 0, 8));
            iqj.m(iqjVar, e, 0, i4 - e.b);
        }
        List a2 = this.c.a(gqp.c, new hpw(1734082948, true, new gqd(this.k, arrayList)));
        int i6 = this.i;
        int i7 = this.j;
        int size3 = a2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            iqj.m(iqjVar, ((ipl) a2.get(i8)).e(jzj.c(i6, i7)), 0, 0);
        }
        glo gloVar = this.e;
        irg irgVar2 = this.c;
        int i9 = this.a;
        int i10 = this.f;
        Integer num = gloVar.d;
        if (num == null || num.intValue() != i10) {
            gloVar.d = Integer.valueOf(i10);
            gpz gpzVar = (gpz) ffdx.N(arrayList, i10);
            if (gpzVar != null) {
                int eo = irgVar2.eo(((gpz) ffdx.P(arrayList)).a()) + i9;
                int b = eo - gloVar.a.b();
                int eo2 = irgVar2.eo(gpzVar.a) - ((b / 2) - (irgVar2.eo(gpzVar.b) / 2));
                dji djiVar = gloVar.a;
                int i11 = ffmk.i(eo2, 0, ffmk.f(eo - b, 0));
                if (djiVar.c() != i11) {
                    ffqy.d(gloVar.b, null, null, new gln(gloVar, i11, null), 3);
                }
            }
        }
        return ffcu.a;
    }
}
