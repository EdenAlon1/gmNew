package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fitx implements fiuo {
    private final fiuo[] a;
    private final int b;

    public fitx(fiuo[] fiuoVarArr) {
        int a;
        this.a = fiuoVarArr;
        int length = fiuoVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            fiuo fiuoVar = fiuoVarArr[length];
            if (fiuoVar != null && (a = fiuoVar.a()) > i) {
                i = a;
            }
        }
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        Object b = fiukVar.b();
        boolean z = false;
        Object obj = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            fiuo[] fiuoVarArr = this.a;
            int length = fiuoVarArr.length;
            if (i6 >= length) {
                break;
            }
            fiuo fiuoVar = fiuoVarArr[i6];
            if (fiuoVar != null) {
                int c = fiuoVar.c(fiukVar, charSequence, i);
                if (c >= i) {
                    if (c <= i4) {
                        continue;
                    } else {
                        if (c >= charSequence.length() || (i3 = i6 + 1) >= length || fiuoVarArr[i3] == null) {
                            break;
                        }
                        obj = fiukVar.b();
                        i4 = c;
                    }
                } else if (c < 0 && (i2 = ~c) > i5) {
                    i5 = i2;
                }
                fiukVar.h(b);
                i6++;
            } else {
                if (i4 <= i) {
                    return i;
                }
                z = true;
            }
        }
        if (i4 <= i && (i4 != i || !z)) {
            return ~i5;
        }
        if (obj != null) {
            fiukVar.h(obj);
        }
        return i4;
    }
}
