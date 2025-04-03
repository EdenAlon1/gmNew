package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hly extends hmq {
    public static final hly a = new hly();

    private hly() {
        super(1, 0, 2);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        hen henVar;
        int a2;
        int i;
        int i2;
        int a3 = hmvVar.a(0);
        if (hjvVar.n != 0) {
            hfp.j("Cannot move a group while inserting");
        }
        if (a3 < 0) {
            hfp.j("Parameter offset is out of bounds");
        }
        if (a3 == 0) {
            return;
        }
        int i3 = hjvVar.q;
        int i4 = hjvVar.s;
        int i5 = hjvVar.r;
        int i6 = i3;
        while (a3 > 0) {
            i6 += hjt.a(hjvVar.b, hjvVar.h(i6));
            if (i6 > i5) {
                hfp.j("Parameter offset is out of bounds");
            }
            a3--;
        }
        int a4 = hjt.a(hjvVar.b, hjvVar.h(i6));
        int c = hjvVar.c(hjvVar.b, hjvVar.h(hjvVar.q));
        int c2 = hjvVar.c(hjvVar.b, hjvVar.h(i6));
        int i7 = i6 + a4;
        int c3 = hjvVar.c(hjvVar.b, hjvVar.h(i7));
        int i8 = c3 - c2;
        hjvVar.F(i8, Math.max(hjvVar.q - 1, 0));
        hjvVar.E(a4);
        int[] iArr = hjvVar.b;
        int h = hjvVar.h(i7) * 5;
        ffdo.l(iArr, iArr, hjvVar.h(i3) * 5, h, (a4 * 5) + h);
        if (i8 > 0) {
            Object[] objArr = hjvVar.c;
            int d = hjvVar.d(c2 + i8);
            System.arraycopy(objArr, d, objArr, c, hjvVar.d(c3 + i8) - d);
        }
        int i9 = c2 + i8;
        int i10 = i9 - c;
        int i11 = hjvVar.k;
        int i12 = hjvVar.l;
        int length = hjvVar.c.length;
        int i13 = hjvVar.m;
        int i14 = i3 + a4;
        int i15 = i3;
        while (i15 < i14) {
            int h2 = hjvVar.h(i15);
            int i16 = i10;
            int c4 = hjvVar.c(iArr, h2) - i16;
            if (i13 < h2) {
                i = h2;
                i2 = 0;
            } else {
                i = h2;
                i2 = i11;
            }
            int[] iArr2 = iArr;
            iArr2[(i * 5) + 4] = hjv.W(hjv.W(c4, i2, i12, length), hjvVar.k, hjvVar.l, hjvVar.c.length);
            i15++;
            i10 = i16;
            iArr = iArr2;
            i11 = i11;
        }
        int i17 = i7 + a4;
        int f = hjvVar.f();
        int b = hjt.b(hjvVar.d, i7, f);
        ArrayList arrayList = new ArrayList();
        while (b < hjvVar.d.size() && (a2 = hjvVar.a((henVar = (hen) hjvVar.d.get(b)))) >= i7 && a2 < i17) {
            arrayList.add(henVar);
            hjvVar.d.remove(b);
        }
        int i18 = i3 - i7;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            hen henVar2 = (hen) arrayList.get(i19);
            int a5 = hjvVar.a(henVar2) + i18;
            if (a5 >= hjvVar.g) {
                henVar2.a = -(f - a5);
            } else {
                henVar2.a = a5;
            }
            hjvVar.d.add(hjt.b(hjvVar.d, a5, f), henVar2);
        }
        if (hjvVar.V(i7, a4)) {
            hfp.j("Unexpectedly removed anchors");
        }
        hjvVar.D(i4, hjvVar.r, i3);
        if (i8 > 0) {
            hjvVar.J(i9, i8, i7 - 1);
        }
    }
}
