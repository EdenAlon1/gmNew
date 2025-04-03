package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermd extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;
    final int b;
    final int c;

    public ermd(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Byte) && erme.a(this.a, ((Byte) obj).byteValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ermd)) {
            return super.equals(obj);
        }
        ermd ermdVar = (ermd) obj;
        int size = size();
        if (ermdVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != ermdVar.a[ermdVar.b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        emxf.v(i, size());
        return Byte.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Byte) || (a = erme.a(this.a, ((Byte) obj).byteValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a - this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.a;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (bArr[i2] == byteValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Byte b = (Byte) obj;
        emxf.v(i, size());
        int i2 = this.b;
        byte[] bArr = this.a;
        int i3 = i2 + i;
        byte b2 = bArr[i3];
        b.getClass();
        bArr[i3] = b.byteValue();
        return Byte.valueOf(b2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        emxf.k(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        return new ermd(bArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append((int) this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append((int) this.a[i]);
        }
    }
}
