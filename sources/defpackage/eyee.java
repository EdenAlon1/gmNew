package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eyee implements Iterable<Byte>, Serializable {
    public static final eyee b = new eyec(eygs.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    public static eyee A(String str) {
        return new eyec(str.getBytes(eygs.a));
    }

    public static eyee B(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            eyee z = i2 == 0 ? null : z(bArr, 0, i2);
            if (z == null) {
                return v(arrayList);
            }
            arrayList.add(z);
            i = Math.min(i + i, 8192);
        }
    }

    static void F(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.r(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.h(i, "Index < 0: "));
        }
    }

    private static eyee c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (eyee) it.next();
        }
        int i2 = i >>> 1;
        return c(it, i2).u(c(it, i - i2));
    }

    static int s(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.f(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.r(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.r(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eyee v(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? b : c(iterable.iterator(), size);
    }

    public static eyee w(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        s(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new eyec(bArr);
    }

    public static eyee x(byte[] bArr) {
        return z(bArr, 0, bArr.length);
    }

    public static eyee y(String str, Charset charset) {
        return new eyec(str.getBytes(charset));
    }

    public static eyee z(byte[] bArr, int i, int i2) {
        s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new eyec(bArr2);
    }

    public final eyee C(int i) {
        return k(i, d());
    }

    public final String D(Charset charset) {
        return d() == 0 ? "" : n(charset);
    }

    public final String E() {
        return D(eygs.a);
    }

    @Deprecated
    public final void G(byte[] bArr, int i, int i2, int i3) {
        s(i, i + i3, d());
        s(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final boolean H() {
        return d() == 0;
    }

    public final byte[] I() {
        int d = d();
        if (d == 0) {
            return eygs.b;
        }
        byte[] bArr = new byte[d];
        e(bArr, 0, 0, d);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    protected abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int d = d();
            i = i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    protected abstract int j(int i, int i2, int i3);

    public abstract eyee k(int i, int i2);

    public abstract eyel l();

    public abstract InputStream m();

    protected abstract String n(Charset charset);

    public abstract ByteBuffer o();

    public abstract void p(eydv eydvVar);

    public abstract void q(OutputStream outputStream);

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public eydz iterator() {
        return new eydw(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? eyiy.a(this) : eyiy.a(k(0, 47)).concat("..."));
    }

    public final eyee u(eyee eyeeVar) {
        if (Alert.DURATION_SHOW_INDEFINITELY - d() < eyeeVar.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + eyeeVar.d());
        }
        int i = eyij.h;
        if (eyeeVar.d() == 0) {
            return this;
        }
        if (d() == 0) {
            return eyeeVar;
        }
        int d = d() + eyeeVar.d();
        if (d < 128) {
            return eyij.g(this, eyeeVar);
        }
        if (this instanceof eyij) {
            eyij eyijVar = (eyij) this;
            if (eyijVar.f.d() + eyeeVar.d() < 128) {
                return new eyij(eyijVar.e, eyij.g(eyijVar.f, eyeeVar));
            }
            if (eyijVar.e.f() > eyijVar.f.f() && eyijVar.g > eyeeVar.f()) {
                return new eyij(eyijVar.e, new eyij(eyijVar.f, eyeeVar));
            }
        }
        if (d >= eyij.c(Math.max(f(), eyeeVar.f()) + 1)) {
            return new eyij(this, eyeeVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        eyig.a(this, arrayDeque);
        eyig.a(eyeeVar, arrayDeque);
        eyee eyeeVar2 = (eyee) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            eyeeVar2 = new eyij((eyee) arrayDeque.pop(), eyeeVar2);
        }
        return eyeeVar2;
    }
}
