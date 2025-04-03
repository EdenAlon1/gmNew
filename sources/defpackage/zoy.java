package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoy implements dxq {
    @Override // defpackage.dxq
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.dxq
    public final void b(jzn jznVar, int i, int[] iArr, int[] iArr2) {
        jznVar.getClass();
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            if (length == 0) {
                iArr2[length] = 0;
            } else if (length != 1) {
                i -= iArr[length];
                iArr2[length] = i;
            } else {
                iArr2[length] = iArr[0];
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}
