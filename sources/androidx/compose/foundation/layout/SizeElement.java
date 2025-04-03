package androidx.compose.foundation.layout;

import defpackage.ebu;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends ivp<ebu> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean f;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = z;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ebu(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ebu ebuVar = (ebu) hvhVar;
        ebuVar.a = this.a;
        ebuVar.b = this.b;
        ebuVar.c = this.c;
        ebuVar.d = this.d;
        ebuVar.e = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return jzq.b(this.a, sizeElement.a) && jzq.b(this.b, sizeElement.b) && jzq.b(this.c, sizeElement.c) && jzq.b(this.d, sizeElement.d) && this.f == sizeElement.f;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + (true != this.f ? 1237 : 1231);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SizeElement(float r3, float r4, float r5, float r6, boolean r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 8
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r6 = r1
        L7:
            r0 = r8 & 4
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r8 & 2
            if (r0 == 0) goto L11
            r4 = r1
        L11:
            r0 = 1
            r8 = r8 & r0
            if (r0 != r8) goto L1b
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            goto L20
        L1b:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
        L20:
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeElement.<init>(float, float, float, float, boolean, int):void");
    }
}
