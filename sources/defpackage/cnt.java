package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnt extends cmp {
    public cnt() {
        super(16);
    }

    public final void b(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        int length = fArr.length;
        if (length < i) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i, (length * 3) / 2));
            copyOf.getClass();
            this.a = copyOf;
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public cnt(int i) {
        super(i);
    }
}
