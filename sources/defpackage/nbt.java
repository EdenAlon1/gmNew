package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbt {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private nbt(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static nbt a(luv luvVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            luvVar.L(4);
            int j = (luvVar.j() & 3) + 1;
            if (j == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int j2 = luvVar.j() & 31;
            for (int i9 = 0; i9 < j2; i9++) {
                arrayList.add(b(luvVar));
            }
            int j3 = luvVar.j();
            for (int i10 = 0; i10 < j3; i10++) {
                arrayList.add(b(luvVar));
            }
            if (j2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = lwa.a;
                lvz i11 = lwa.i(bArr2, 4, bArr.length);
                int i12 = i11.e;
                int i13 = i11.f;
                int i14 = i11.h + 8;
                int i15 = i11.i + 8;
                int i16 = i11.j;
                int i17 = i11.k;
                int i18 = i11.l;
                int i19 = i11.m;
                float f2 = i11.g;
                str = lto.c(i11.a, i11.b, i11.c);
                i4 = i17;
                i5 = i18;
                i6 = i19;
                f = f2;
                i2 = i13;
                i3 = i14;
                i7 = i15;
                i8 = i16;
                i = i12;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new nbt(arrayList, j, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new lrg("Error parsing AVC config", e, true, 1);
        }
    }

    private static byte[] b(luv luvVar) {
        int n = luvVar.n();
        int i = luvVar.b;
        luvVar.L(n);
        byte[] bArr = luvVar.a;
        byte[] bArr2 = lto.a;
        byte[] bArr3 = new byte[n + 4];
        System.arraycopy(lto.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, n);
        return bArr3;
    }
}
