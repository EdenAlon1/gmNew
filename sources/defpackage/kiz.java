package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kiz extends kiu {
    public kiu[] aL = new kiu[4];
    public int aM = 0;

    public final void af(kiu kiuVar) {
        if (kiuVar == this || kiuVar == null) {
            return;
        }
        int i = this.aM + 1;
        kiu[] kiuVarArr = this.aL;
        int length = kiuVarArr.length;
        if (i > length) {
            this.aL = (kiu[]) Arrays.copyOf(kiuVarArr, length + length);
        }
        kiu[] kiuVarArr2 = this.aL;
        int i2 = this.aM;
        kiuVarArr2[i2] = kiuVar;
        this.aM = i2 + 1;
    }

    public final void ag(ArrayList arrayList, int i, kju kjuVar) {
        for (int i2 = 0; i2 < this.aM; i2++) {
            kjuVar.d(this.aL[i2]);
        }
        for (int i3 = 0; i3 < this.aM; i3++) {
            kjn.a(this.aL[i3], i, arrayList, kjuVar);
        }
    }

    public void ah() {
    }
}
