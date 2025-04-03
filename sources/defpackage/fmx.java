package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmx extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ Integer i;
    final /* synthetic */ fke j;
    final /* synthetic */ Integer k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmx(List list, List list2, List list3, List list4, List list5, int i, int i2, int i3, Integer num, fke fkeVar, Integer num2) {
        super(1);
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = num;
        this.j = fkeVar;
        this.k = num2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iqjVar.e((iqk) list.get(i), 0, this.f, 0.0f);
        }
        List list2 = this.b;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            iqjVar.e((iqk) list2.get(i2), 0, 0, 0.0f);
        }
        List list3 = this.c;
        int i3 = this.g;
        int i4 = this.h;
        int size3 = list3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            iqjVar.e((iqk) list3.get(i5), 0, i3 - i4, 0.0f);
        }
        List list4 = this.d;
        int i6 = this.g;
        Integer num = this.i;
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            iqjVar.e((iqk) list4.get(i7), 0, i6 - (num != null ? num.intValue() : 0), 0.0f);
        }
        List list5 = this.e;
        fke fkeVar = this.j;
        int i8 = this.g;
        Integer num2 = this.k;
        int size5 = list5.size();
        for (int i9 = 0; i9 < size5; i9++) {
            iqjVar.e((iqk) list5.get(i9), fkeVar != null ? fkeVar.a : 0, i8 - (num2 != null ? num2.intValue() : 0), 0.0f);
        }
        return ffcu.a;
    }
}
