package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iou implements ipo {
    final /* synthetic */ ipa a;
    final /* synthetic */ int b;
    final /* synthetic */ ipo c;
    private final /* synthetic */ ipo d;

    public iou(ipo ipoVar, ipa ipaVar, int i, ipo ipoVar2) {
        this.a = ipaVar;
        this.b = i;
        this.c = ipoVar2;
        this.d = ipoVar;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.d.k();
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.d.m();
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.d.n();
    }

    @Override // defpackage.ipo
    public final void o() {
        int i;
        this.a.e = this.b;
        this.c.o();
        ipa ipaVar = this.a;
        cop copVar = ipaVar.k;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = copVar.b[i5];
                        irb irbVar = (irb) copVar.c[i5];
                        int a = ipaVar.l.a(obj);
                        if (a < 0 || a >= ipaVar.e) {
                            irbVar.b();
                            copVar.c(i5);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
