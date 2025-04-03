package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyij extends eyee {
    static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 1;
    public final int d;
    public final eyee e;
    public final eyee f;
    public final int g;
    private final int i;

    public eyij(eyee eyeeVar, eyee eyeeVar2) {
        this.e = eyeeVar;
        this.f = eyeeVar2;
        int d = eyeeVar.d();
        this.i = d;
        this.d = d + eyeeVar2.d();
        this.g = Math.max(eyeeVar.f(), eyeeVar2.f()) + 1;
    }

    static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : iArr[i];
    }

    public static eyee g(eyee eyeeVar, eyee eyeeVar2) {
        int d = eyeeVar.d();
        int d2 = eyeeVar2.d();
        byte[] bArr = new byte[d + d2];
        eyeeVar.G(bArr, 0, 0, d);
        eyeeVar2.G(bArr, 0, d, d2);
        return new eyec(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.eyee
    public final byte a(int i) {
        F(i, this.d);
        return b(i);
    }

    @Override // defpackage.eyee
    public final byte b(int i) {
        int i2 = this.i;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.eyee
    public final int d() {
        return this.d;
    }

    @Override // defpackage.eyee
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.eyee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eyee)) {
            return false;
        }
        eyee eyeeVar = (eyee) obj;
        if (this.d != eyeeVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = eyeeVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        eyih eyihVar = new eyih(this);
        eyeb next = eyihVar.next();
        eyih eyihVar2 = new eyih(eyeeVar);
        eyeb next2 = eyihVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = next.d() - i3;
            int d2 = next2.d() - i4;
            int min = Math.min(d, d2);
            if (!(i3 == 0 ? next.g(next2, i4, min) : next2.g(next, i3, min))) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == d) {
                i3 = 0;
                next = eyihVar.next();
            } else {
                i3 += min;
                next = next;
            }
            if (min == d2) {
                next2 = eyihVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // defpackage.eyee
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.eyee
    protected final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.eyee
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.eyee, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new eyif(this);
    }

    @Override // defpackage.eyee
    protected final int j(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.j(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.j(this.e.j(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.eyee
    public final eyee k(int i, int i2) {
        int s = s(i, i2, this.d);
        if (s == 0) {
            return eyee.b;
        }
        if (s == this.d) {
            return this;
        }
        int i3 = this.i;
        if (i2 <= i3) {
            return this.e.k(i, i2);
        }
        int i4 = i2 - i3;
        if (i >= i3) {
            return this.f.k(i - i3, i4);
        }
        return new eyij(this.e.C(i), this.f.k(0, i4));
    }

    @Override // defpackage.eyee
    public final eyel l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        eyih eyihVar = new eyih(this);
        while (eyihVar.hasNext()) {
            arrayList.add(eyihVar.next().o());
        }
        int i = eyel.g;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new eyei(arrayList, i3) : eyel.K(new eygv(arrayList));
    }

    @Override // defpackage.eyee
    public final InputStream m() {
        return new eyii(this);
    }

    @Override // defpackage.eyee
    protected final String n(Charset charset) {
        return new String(I(), charset);
    }

    @Override // defpackage.eyee
    public final ByteBuffer o() {
        return ByteBuffer.wrap(I()).asReadOnlyBuffer();
    }

    @Override // defpackage.eyee
    public final void p(eydv eydvVar) {
        this.e.p(eydvVar);
        this.f.p(eydvVar);
    }

    @Override // defpackage.eyee
    public final void q(OutputStream outputStream) {
        this.e.q(outputStream);
        this.f.q(outputStream);
    }

    @Override // defpackage.eyee
    public final boolean r() {
        eyee eyeeVar = this.e;
        eyee eyeeVar2 = this.f;
        return eyeeVar2.j(eyeeVar.j(0, 0, this.i), 0, eyeeVar2.d()) == 0;
    }

    @Override // defpackage.eyee
    /* renamed from: t */
    public final eydz iterator() {
        return new eyif(this);
    }

    Object writeReplace() {
        return new eyec(I());
    }
}
