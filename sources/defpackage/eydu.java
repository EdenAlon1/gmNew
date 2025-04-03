package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eydu extends eydo implements RandomAccess, eygc, eyia {
    public static final boolean[] a;
    public static final eydu b;
    public int c;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        a = zArr;
        b = new eydu(zArr, 0, false);
    }

    eydu() {
        this(a, 0, true);
    }

    private static int h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hJ();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[h(length)];
            System.arraycopy(this.d, 0, zArr2, 0, i);
            System.arraycopy(this.d, i, zArr2, i3, this.c - i);
            this.d = zArr2;
        }
        this.d[i] = booleanValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.eydo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        hJ();
        eygs.d(collection);
        if (!(collection instanceof eydu)) {
            return super.addAll(collection);
        }
        eydu eyduVar = (eydu) collection;
        int i = eyduVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.d;
        if (i3 > zArr.length) {
            this.d = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(eyduVar.d, 0, this.d, this.c, eyduVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.eygr
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eygc e(int i) {
        if (i >= this.c) {
            return new eydu(i == 0 ? a : Arrays.copyOf(this.d, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eydu)) {
            return super.equals(obj);
        }
        eydu eyduVar = (eydu) obj;
        if (this.c != eyduVar.c) {
            return false;
        }
        boolean[] zArr = eyduVar.d;
        for (int i = 0; i < this.c; i++) {
            if (this.d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eygc
    public final void f(boolean z) {
        hJ();
        int i = this.c;
        int length = this.d.length;
        if (i == length) {
            boolean[] zArr = new boolean[h(length)];
            System.arraycopy(this.d, 0, zArr, 0, this.c);
            this.d = zArr;
        }
        boolean[] zArr2 = this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr2[i2] = z;
    }

    @Override // defpackage.eygc
    public final boolean g(int i) {
        j(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(g(i));
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + eygs.a(this.d[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        hJ();
        j(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        hJ();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.d;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hJ();
        j(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public eydu(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.c = i;
    }

    @Override // defpackage.eydo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
