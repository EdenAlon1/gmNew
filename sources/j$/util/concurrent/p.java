package j$.util.concurrent;

/* loaded from: classes9.dex */
class p {
    k[] a;
    k b = null;
    o c;
    o d;
    int e;
    int f;
    int g;
    final int h;

    p(k[] kVarArr, int i, int i2, int i3) {
        this.a = kVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    final k a() {
        k[] kVarArr;
        int length;
        int i;
        o oVar;
        k kVar = this.b;
        if (kVar != null) {
            kVar = kVar.d;
        }
        while (kVar == null) {
            if (this.f >= this.g || (kVarArr = this.a) == null || (length = kVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            k k = ConcurrentHashMap.k(kVarArr, i);
            if (k == null || k.a >= 0) {
                kVar = k;
            } else if (k instanceof g) {
                this.a = ((g) k).e;
                o oVar2 = this.d;
                if (oVar2 != null) {
                    this.d = oVar2.d;
                } else {
                    oVar2 = new o();
                }
                oVar2.c = kVarArr;
                oVar2.a = length;
                oVar2.b = i;
                oVar2.d = this.c;
                this.c = oVar2;
                kVar = null;
            } else {
                kVar = k instanceof q ? ((q) k).f : null;
            }
            if (this.c != null) {
                while (true) {
                    oVar = this.c;
                    if (oVar == null) {
                        break;
                    }
                    int i2 = this.e;
                    int i3 = oVar.a;
                    int i4 = i2 + i3;
                    this.e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.e = oVar.b;
                    this.a = oVar.c;
                    oVar.c = null;
                    o oVar3 = oVar.d;
                    oVar.d = this.d;
                    this.c = oVar3;
                    this.d = oVar;
                    length = i3;
                }
                if (oVar == null) {
                    int i5 = this.e + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i6 = this.f + 1;
                        this.f = i6;
                        this.e = i6;
                    }
                }
            } else {
                int i7 = i + this.h;
                this.e = i7;
                if (i7 >= length) {
                    int i8 = this.f + 1;
                    this.f = i8;
                    this.e = i8;
                }
            }
        }
        this.b = kVar;
        return kVar;
    }
}
