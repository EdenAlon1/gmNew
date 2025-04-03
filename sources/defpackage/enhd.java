package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enhd {
    Object[] a;
    int b;
    enhc c;

    public enhd() {
        this(4);
    }

    private final enhk a(boolean z) {
        enhc enhcVar;
        enhc enhcVar2;
        if (z && (enhcVar2 = this.c) != null) {
            throw enhcVar2.a();
        }
        enoz w = enoz.w(this.b, this.a, this);
        if (!z || (enhcVar = this.c) == null) {
            return w;
        }
        throw enhcVar.a();
    }

    private final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, engh.f(length, i2));
        }
    }

    public enhk b() {
        return a(false);
    }

    public enhk c() {
        return a(true);
    }

    public void g(Map map) {
        l(map.entrySet());
    }

    @Deprecated
    public final enhk h() {
        return c();
    }

    public final void i(Map.Entry entry) {
        k(entry.getKey(), entry.getValue());
    }

    public final void j(enhd enhdVar) {
        enhdVar.getClass();
        d(this.b + enhdVar.b);
        Object[] objArr = enhdVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = enhdVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += enhdVar.b;
    }

    public void k(Object obj, Object obj2) {
        d(this.b + 1);
        endr.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void l(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i((Map.Entry) it.next());
        }
    }

    public enhd(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
