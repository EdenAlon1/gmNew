package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oiz extends AbstractList implements oko {
    public final List a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public oiz() {
        this.a = new ArrayList();
        this.e = true;
    }

    @Override // defpackage.oko
    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.b + this.g;
    }

    @Override // defpackage.oko
    public final int d() {
        return this.c;
    }

    @Override // defpackage.oko
    public final int e() {
        return this.b;
    }

    @Override // defpackage.oko
    public final int f() {
        return this.b + this.f + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = i - this.b;
        if (i >= 0 && i < f()) {
            if (i2 < 0 || i2 >= this.f) {
                return null;
            }
            return i(i2);
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + f());
    }

    @Override // defpackage.oko
    public final Object i(int i) {
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((oki) this.a.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((oki) this.a.get(i2)).b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.b + ", dataCount " + this.f + ", trailing " + this.c + ' ' + ffdx.aA(this.a, " ", null, null, null, 62);
    }

    public oiz(oiz oizVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = true;
        arrayList.addAll(oizVar.a);
        this.b = oizVar.b;
        this.c = oizVar.c;
        this.d = oizVar.d;
        this.e = oizVar.e;
        this.f = oizVar.f;
        this.g = oizVar.g;
    }
}
