package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjn {
    public final fhmt a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 4096;
    public fhjl[] e = new fhjl[8];

    public fhjn(fhmt fhmtVar) {
        this.a = fhmtVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        ffdo.d(r0, null, 0, this.e.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(fhjl fhjlVar) {
        int i = fhjlVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        fhjl[] fhjlVarArr = this.e;
        int length = fhjlVarArr.length;
        if (i3 > length) {
            fhjl[] fhjlVarArr2 = new fhjl[length + length];
            System.arraycopy(fhjlVarArr, 0, fhjlVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = fhjlVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = fhjlVar;
        this.g++;
        this.h += i;
    }

    public final void c(fhmx fhmxVar) {
        long j;
        int[] iArr = fhkq.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < fhmxVar.b(); i2++) {
            j2 += fhkq.b[fhhl.z(fhmxVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) >= fhmxVar.b()) {
            d(fhmxVar.b(), 127, 0);
            this.a.K(fhmxVar);
            return;
        }
        fhmt fhmtVar = new fhmt();
        int b = fhmxVar.b();
        long j3 = 0;
        int i3 = 0;
        while (i < b) {
            int z = fhhl.z(fhmxVar.a(i));
            int i4 = fhkq.a[z];
            byte b2 = fhkq.b[z];
            long j4 = j3 << b2;
            long j5 = i4;
            i3 += b2;
            while (true) {
                j = j4 | j5;
                if (i3 >= 8) {
                    i3 -= 8;
                    fhmtVar.O((int) (j >> i3));
                }
            }
            i++;
            j3 = j;
        }
        if (i3 > 0) {
            fhmtVar.O((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        fhmx t = fhmtVar.t();
        d(t.b(), 127, 128);
        this.a.K(t);
    }

    public final void d(int i, int i2, int i3) {
        if (i < i2) {
            this.a.O(i | i3);
            return;
        }
        this.a.O(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.O(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.O(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                fhjl fhjlVar = this.e[length];
                fhjlVar.getClass();
                int i4 = this.h;
                fhjlVar.getClass();
                int i5 = fhjlVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            fhjl[] fhjlVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(fhjlVarArr, i6, fhjlVarArr, i6 + i3, this.g);
            fhjl[] fhjlVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(fhjlVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
