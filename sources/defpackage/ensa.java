package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensa extends ents {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(ensn ensnVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ensnVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ents
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ents
    public final ensn c(int i) {
        if (i < this.b) {
            return (ensn) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ents
    public final Object d(ensn ensnVar) {
        int a = a(ensnVar);
        if (a != -1) {
            return ensnVar.c(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.ents
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(ensn ensnVar, Object obj) {
        int a;
        if (!ensnVar.b && (a = a(ensnVar)) != -1) {
            obj.getClass();
            this.a[a + a + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        ensnVar.getClass();
        objArr2[i3] = ensnVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
