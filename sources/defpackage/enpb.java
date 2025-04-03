package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpb implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public enpb(enny ennyVar) {
        enie enieVar = (enie) ennyVar;
        int size = enieVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (ennx ennxVar : enieVar.j()) {
            this.a[i] = ennxVar.b();
            this.b[i] = ennxVar.a();
            i++;
        }
    }

    Object readResolve() {
        enib enibVar = new enib(this.a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return enibVar.a();
            }
            enibVar.d(objArr[i], this.b[i]);
            i++;
        }
    }
}
