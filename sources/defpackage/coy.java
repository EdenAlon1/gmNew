package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coy {
    public Object[] b;
    public int c;

    public coy(int i) {
        this.b = i == 0 ? coz.a : new Object[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof coy) {
            coy coyVar = (coy) obj;
            int i = coyVar.c;
            int i2 = this.c;
            if (i == i2) {
                Object[] objArr = this.b;
                Object[] objArr2 = coyVar.b;
                ffmj q = ffmk.q(0, i2);
                int i3 = q.a;
                int i4 = q.b;
                if (i3 > i4) {
                    return true;
                }
                while (ffkj.e(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final int j(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.b;
            int i2 = this.c;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.b;
        int i3 = this.c;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object k() {
        if (o()) {
            cpx.d("ObjectList is empty.");
        }
        return this.b[0];
    }

    public final Object l(int i) {
        if (i < 0 || i >= this.c) {
            m(i);
        }
        return this.b[i];
    }

    public final void m(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.c - 1);
        cpx.c(sb.toString());
    }

    public final boolean n(Object obj) {
        return j(obj) >= 0;
    }

    public final boolean o() {
        return this.c == 0;
    }

    public final boolean p() {
        return this.c != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        cox coxVar = new cox(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) coxVar.invoke(obj));
            i2++;
        }
        return sb.toString();
    }
}
