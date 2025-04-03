package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnh extends ffde implements RandomAccess {
    public static final fhng a = new fhng();
    public final fhmx[] b;
    public final int[] c;

    public fhnh(fhmx[] fhmxVarArr, int[] iArr) {
        this.b = fhmxVarArr;
        this.c = iArr;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof fhmx) {
            return super.contains((fhmx) obj);
        }
        return false;
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.b[i];
    }

    @Override // defpackage.ffde, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof fhmx) {
            return super.indexOf((fhmx) obj);
        }
        return -1;
    }

    @Override // defpackage.ffde, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof fhmx) {
            return super.lastIndexOf((fhmx) obj);
        }
        return -1;
    }
}
