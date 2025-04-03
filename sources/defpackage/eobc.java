package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eobc extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;
    private Object[][] a;
    private int b;

    public eobc(int i) {
        this.a = new Object[(i >> 8) + 1][];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.b >> 8;
        Object[][] objArr = this.a;
        if (i == objArr.length) {
            objArr = (Object[][]) Arrays.copyOf(objArr, i + i);
            this.a = objArr;
            objArr[i] = new Object[256];
        } else if (objArr[i] == null) {
            objArr[i] = new Object[256];
        }
        Object[] objArr2 = objArr[i];
        int i2 = this.b;
        objArr2[i2 & PrivateKeyType.INVALID] = obj;
        this.b = i2 + 1;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a[i >> 8][i & PrivateKeyType.INVALID];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object[][] objArr = this.a;
        Object[] objArr2 = objArr[i];
        objArr[i >> 8][i & PrivateKeyType.INVALID] = obj;
        return objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}
