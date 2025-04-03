package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuo extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    final /* synthetic */ gmk d;
    final /* synthetic */ ffix e;
    final /* synthetic */ int f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuo(List list, int i, List list2, gmk gmkVar, ffix ffixVar, int i2, List list3, List list4, int i3) {
        super(1);
        this.a = list;
        this.b = i;
        this.c = list2;
        this.d = gmkVar;
        this.e = ffixVar;
        this.f = i2;
        this.g = list3;
        this.h = list4;
        this.i = i3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        int i;
        List list = this.a;
        iqj iqjVar = (iqj) obj;
        Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((iqk) list.get(0)).a);
            int e = ffdx.e(list);
            if (e > 0) {
                int i2 = 1;
                while (true) {
                    Integer valueOf3 = Integer.valueOf(((iqk) list.get(i2)).a);
                    if (valueOf3.compareTo(valueOf) > 0) {
                        valueOf = valueOf3;
                    }
                    if (i2 == e) {
                        break;
                    }
                    i2++;
                }
            }
        }
        int max = Math.max(0, (this.b - (valueOf != null ? valueOf.intValue() : 0)) / 2);
        List list2 = this.c;
        if (list2.isEmpty()) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(((iqk) list2.get(0)).a);
            int e2 = ffdx.e(list2);
            if (e2 > 0) {
                int i3 = 1;
                while (true) {
                    Integer valueOf4 = Integer.valueOf(((iqk) list2.get(i3)).a);
                    if (valueOf4.compareTo(valueOf2) > 0) {
                        valueOf2 = valueOf4;
                    }
                    if (i3 == e2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        int intValue = valueOf2 != null ? valueOf2.intValue() : 0;
        List list3 = this.c;
        if (!list3.isEmpty()) {
            num = Integer.valueOf(((iqk) list3.get(0)).b);
            int e3 = ffdx.e(list3);
            if (e3 > 0) {
                int i4 = 1;
                while (true) {
                    Integer valueOf5 = Integer.valueOf(((iqk) list3.get(i4)).b);
                    if (valueOf5.compareTo(num) > 0) {
                        num = valueOf5;
                    }
                    if (i4 == e3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        int intValue2 = num != null ? num.intValue() : 0;
        int i5 = (this.b - intValue) / 2;
        int ordinal = this.d.c().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = this.f;
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            i = ffln.b(((Number) this.e.invoke()).floatValue());
        }
        int i6 = i - intValue2;
        List list4 = this.g;
        int i7 = this.i;
        int size = list4.size();
        for (int i8 = 0; i8 < size; i8++) {
            iqj.m(iqjVar, (iqk) list4.get(i8), 0, i7);
        }
        List list5 = this.h;
        int size2 = list5.size();
        for (int i9 = 0; i9 < size2; i9++) {
            iqj.m(iqjVar, (iqk) list5.get(i9), 0, 0);
        }
        List list6 = this.a;
        int size3 = list6.size();
        for (int i10 = 0; i10 < size3; i10++) {
            iqj.m(iqjVar, (iqk) list6.get(i10), max, 0);
        }
        List list7 = this.c;
        int size4 = list7.size();
        for (int i11 = 0; i11 < size4; i11++) {
            iqj.m(iqjVar, (iqk) list7.get(i11), i5, i6);
        }
        return ffcu.a;
    }
}
