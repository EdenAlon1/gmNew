package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpo implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public cpo() {
        this(null);
    }

    public final int a(int i) {
        if (this.a) {
            cpp.b(this);
        }
        return cpu.a(this.b, this.d, i);
    }

    public final int b(int i) {
        if (this.a) {
            cpp.b(this);
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            cpp.b(this);
        }
        return this.d;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cpo clone() {
        Object clone = super.clone();
        clone.getClass();
        cpo cpoVar = (cpo) clone;
        cpoVar.b = (int[]) this.b.clone();
        cpoVar.c = (Object[]) this.c.clone();
        return cpoVar;
    }

    public final Object e(int i) {
        if (this.a) {
            cpp.b(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void f(int i, Object obj) {
        int a = cpu.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = obj;
            return;
        }
        int i2 = ~a;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == cpp.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            cpp.b(this);
            i2 = ~cpu.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int d = cpu.d(i4 + 1);
            int[] copyOf = Arrays.copyOf(iArr, d);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, d);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            ffdo.l(iArr2, iArr2, i6, i2, i5);
            Object[] objArr2 = this.c;
            ffdo.n(objArr2, objArr2, i6, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object e = e(i2);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ cpo(byte[] bArr) {
        int d = cpu.d(10);
        this.b = new int[d];
        this.c = new Object[d];
    }
}
