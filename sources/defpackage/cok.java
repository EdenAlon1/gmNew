package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cok extends coy {
    public coi a;

    public cok() {
        this((byte[]) null);
    }

    public final Object a(int i) {
        if (i < 0 || i >= this.c) {
            m(i);
        }
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i != this.c - 1) {
            ffdo.n(objArr, objArr, i, i + 1, this.c);
        }
        int i2 = this.c - 1;
        this.c = i2;
        objArr[i2] = null;
        return obj;
    }

    public final Object b(int i, Object obj) {
        if (i < 0 || i >= this.c) {
            m(i);
        }
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void c() {
        ffdo.d(this.b, null, 0, this.c);
        this.c = 0;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.c) || i2 < 0 || i2 > i3) {
            cpx.c("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.c);
        }
        if (i2 < i) {
            cpx.a("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            int i4 = this.c;
            if (i2 < i4) {
                Object[] objArr = this.b;
                ffdo.n(objArr, objArr, i, i2, i4);
            }
            int i5 = this.c;
            int i6 = i5 - (i2 - i);
            ffdo.d(this.b, null, i6, i5);
            this.c = i6;
        }
    }

    public final void e(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ffdo.n(objArr, objArr2, 0, 0, length);
        this.b = objArr2;
    }

    public final void f(int i) {
        cpx.c("Index " + i + " must be in 0.." + this.c);
    }

    public final boolean g(Object obj) {
        int j = j(obj);
        if (j < 0) {
            return false;
        }
        a(j);
        return true;
    }

    public final void h(Object obj) {
        int i = this.c + 1;
        Object[] objArr = this.b;
        if (objArr.length < i) {
            e(i, objArr);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        objArr2[i2] = obj;
        this.c = i2 + 1;
    }

    public final void i(List list) {
        int i = this.c;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size() + i;
        Object[] objArr = this.b;
        if (objArr.length < size) {
            e(size, objArr);
        }
        Object[] objArr2 = this.b;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.c += list.size();
    }

    public cok(int i) {
        super(i);
    }

    public /* synthetic */ cok(byte[] bArr) {
        super(16);
    }
}
