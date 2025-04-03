package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icy extends ide {
    private final List a;
    private final long c;
    private final float d;
    private final List b = null;
    private final int e = 0;

    public icy(List list, long j, float f) {
        this.a = list;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.ide
    public final Shader b(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long b = ias.b(j);
            intBitsToFloat = Float.intBitsToFloat((int) (b >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (b & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.c >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.c & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.c & 4294967295L));
        }
        List list = this.a;
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
        float f = this.d;
        if (f == Float.POSITIVE_INFINITY) {
            f = iar.b(j) / 2.0f;
        }
        long j3 = floatToRawIntBits2 | floatToRawIntBits;
        ibh.a(list, null);
        return new RadialGradient(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)), f, ibh.b(list), (float[]) null, ibi.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icy)) {
            return false;
        }
        icy icyVar = (icy) obj;
        if (!ffkj.e(this.a, icyVar.a)) {
            return false;
        }
        List list = icyVar.b;
        if (!ffkj.e(null, null) || !iak.i(this.c, icyVar.c) || this.d != icyVar.d) {
            return false;
        }
        int i = icyVar.e;
        return idp.b(0, 0);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + iaj.a(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            str = "center=" + ((Object) iak.h(this.c)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.d) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            str2 = "radius=" + this.d + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=" + ((Object) idp.a(0)) + ')';
    }
}
