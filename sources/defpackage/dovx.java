package defpackage;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovx extends ide {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    public dovx(float f, long j, long j2, long j3) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.ide
    public final Shader b(long j) {
        Shader c;
        Shader c2;
        double d = (this.a / 180.0f) * 3.141592653589793d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float sqrt = (float) Math.sqrt((((float) Math.pow(Float.intBitsToFloat(i), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat(i2), 2.0d))) / 2.0f);
        long f = iak.f(ias.b(j), (Float.floatToRawIntBits(cos * sqrt) << 32) | (Float.floatToRawIntBits(sin * sqrt) & 4294967295L));
        float min = Math.min(ffmk.c(Float.intBitsToFloat((int) (f >> 32)), 0.0f), Float.intBitsToFloat(i));
        float intBitsToFloat = Float.intBitsToFloat(i2) - Math.min(ffmk.c(Float.intBitsToFloat((int) (f & 4294967295L)), 0.0f), Float.intBitsToFloat(i2));
        long floatToRawIntBits = Float.floatToRawIntBits(min);
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        long j2 = (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
        c = ibh.c(iak.e((Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), j2), j2, ffdx.g(new ibw(this.b), new ibw(this.c)), null);
        if (ffcp.a(this.d, ibw.g)) {
            return c;
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i);
        float intBitsToFloat4 = Float.intBitsToFloat(i2);
        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat3);
        long floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat4);
        long j3 = this.d;
        c2 = ibh.c(0L, (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L), ffdx.g(new ibw(j3), new ibw(j3)), null);
        return new ComposeShader(c2, c, PorterDuff.Mode.DST_OVER);
    }
}
