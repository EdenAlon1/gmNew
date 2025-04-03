package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grt extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ List b;
    final /* synthetic */ iqk c;
    final /* synthetic */ long d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grt(iqk iqkVar, List list, iqk iqkVar2, long j, float f, float f2) {
        super(1);
        this.a = iqkVar;
        this.b = list;
        this.c = iqkVar2;
        this.d = j;
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = this.a;
        int i = 0;
        if (iqkVar != null) {
            iqjVar.e(iqkVar, 0, 0, 0.0f);
        }
        List list = this.b;
        long j = this.d;
        float f = this.e;
        float f2 = this.f;
        int size = list.size();
        while (i < size) {
            iqk iqkVar2 = (iqk) list.get(i);
            int b = jzk.b(j);
            int i2 = iqkVar2.a / 2;
            int a = jzk.a(j);
            int i3 = iqkVar2.b / 2;
            double d = f;
            List list2 = list;
            double d2 = (i * f2) - 1.5707963267948966d;
            iqjVar.e(iqkVar2, ffln.a((Math.cos(d2) * d) + ((b >> 1) - i2)), ffln.a((d * Math.sin(d2)) + ((a >> 1) - i3)), 0.0f);
            i++;
            list = list2;
        }
        iqk iqkVar3 = this.c;
        if (iqkVar3 != null) {
            long j2 = this.d;
            iqjVar.e(iqkVar3, (jzk.d(j2) - iqkVar3.a) / 2, (jzk.c(j2) - iqkVar3.b) / 2, 0.0f);
        }
        return ffcu.a;
    }
}
