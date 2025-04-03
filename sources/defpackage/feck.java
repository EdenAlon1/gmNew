package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feck implements fecn {
    private final Object[] a;
    private final Object[] b;

    public feck(Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
    }

    @Override // defpackage.fecn
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.fecn
    public final fecn b(Object obj, Object obj2, int i, int i2) {
        Object[] objArr;
        int length;
        int i3 = 0;
        int hashCode = this.a[0].hashCode();
        if (hashCode != i) {
            return fecl.d(new fecm(obj, obj2), i, this, hashCode, i2);
        }
        while (true) {
            objArr = this.a;
            length = objArr.length;
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (objArr[i3] == obj) {
                break;
            }
            i3++;
        }
        if (i3 != -1) {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Object[] copyOf2 = Arrays.copyOf(this.b, this.a.length);
            copyOf[i3] = obj;
            copyOf2[i3] = obj2;
            return new feck(copyOf, copyOf2);
        }
        int i4 = length + 1;
        Object[] objArr2 = this.b;
        Object[] copyOf3 = Arrays.copyOf(objArr, i4);
        Object[] objArr3 = this.a;
        Object[] copyOf4 = Arrays.copyOf(objArr2, i4);
        copyOf3[objArr3.length] = obj;
        copyOf4[this.a.length] = obj2;
        return new feck(copyOf3, copyOf4);
    }

    @Override // defpackage.fecn
    public final Object c(Object obj, int i, int i2) {
        int i3 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return this.b[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        for (int i = 0; i < this.b.length; i++) {
            sb.append("(key=");
            sb.append(this.a[i]);
            sb.append(" value=");
            sb.append(this.b[i]);
            sb.append(") ");
        }
        sb.append(")");
        return sb.toString();
    }
}
