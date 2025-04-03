package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyjg extends eyji {
    public eyjg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.eyji
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.eyji
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.eyji
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.eyji
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.eyji
    public final void e(Object obj, long j, boolean z) {
        if (eyjj.d) {
            eyjj.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            eyjj.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.eyji
    public final void f(Object obj, long j, byte b) {
        if (eyjj.d) {
            eyjj.o(obj, j, b);
        } else {
            eyjj.p(obj, j, b);
        }
    }

    @Override // defpackage.eyji
    public final void g(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.eyji
    public final void h(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.eyji
    public final boolean i(Object obj, long j) {
        return eyjj.d ? eyjj.x(obj, j) : eyjj.y(obj, j);
    }
}
