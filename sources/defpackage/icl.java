package defpackage;

import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icl extends ide {
    private final List a;
    private final List b;
    private final long c;
    private final long d;
    private final int e = 0;

    public icl(List list, List list2, long j, long j2) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ide
    public final Shader b(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.c >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.c >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.c & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.c & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.d >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.d >> 32));
        if (Float.intBitsToFloat((int) (this.d & 4294967295L)) != Float.POSITIVE_INFINITY) {
            j = this.d;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ibh.c((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icl)) {
            return false;
        }
        icl iclVar = (icl) obj;
        if (!ffkj.e(this.a, iclVar.a) || !ffkj.e(this.b, iclVar.b) || !iak.i(this.c, iclVar.c) || !iak.i(this.d, iclVar.d)) {
            return false;
        }
        int i = iclVar.e;
        return idp.b(0, 0);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return (((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + iaj.a(this.c)) * 31) + iaj.a(this.d)) * 31;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (((((this.c & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) iak.h(this.c)) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.d & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) iak.h(this.d)) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=" + ((Object) idp.a(0)) + ')';
    }
}
