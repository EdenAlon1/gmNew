package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsn extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ ipq b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsn(List list, ipq ipqVar, float f, int i, List list2) {
        super(1);
        this.a = list;
        this.b = ipqVar;
        this.c = f;
        this.d = i;
        this.e = list2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ipq ipqVar;
        iqj iqjVar = (iqj) obj;
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List list2 = (List) list.get(i);
            int size2 = list2.size();
            int[] iArr = new int[size2];
            int i2 = 0;
            while (true) {
                ipqVar = this.b;
                if (i2 >= size2) {
                    break;
                }
                iArr[i2] = ((iqk) list2.get(i2)).a + (i2 < ffdx.e(list2) ? ipqVar.eo(this.c) : 0);
                i2++;
            }
            int[] iArr2 = new int[size2];
            dxu.b.b(ipqVar, this.d, iArr, ipqVar.q(), iArr2);
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                iqjVar.e((iqk) list2.get(i3), iArr2[i3], ((Number) this.e.get(i)).intValue(), 0.0f);
            }
        }
        return ffcu.a;
    }
}
