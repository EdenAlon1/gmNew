package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enin extends engg {
    Object[] d;
    private int e;

    public enin() {
        super(4);
    }

    public enip g() {
        enip j;
        int i = this.b;
        if (i == 0) {
            return enpd.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new enpx(obj);
        }
        if (this.d == null || enip.d(i) != this.d.length) {
            j = enip.j(this.b, this.a);
            this.b = j.size();
        } else {
            int i2 = this.b;
            Object[] objArr = this.a;
            if (enip.w(i2, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            j = new enpd(objArr, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return j;
    }

    @Override // defpackage.engg, defpackage.engh
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int d = enip.d(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (d <= length) {
                objArr.getClass();
                int hashCode = obj.hashCode();
                int a = engc.a(hashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = a & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        a = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void k(enin eninVar) {
        if (this.d == null) {
            a(eninVar.a, eninVar.b);
            return;
        }
        for (int i = 0; i < eninVar.b; i++) {
            Object obj = eninVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public enin(int i) {
        super(i);
        this.d = new Object[enip.d(i)];
    }
}
