package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrw {
    public final ffbr a;
    public volatile SparseArray b;
    private final ffbr c;

    public csrw(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.c = ffbrVar2;
    }

    public final int[] a(int i) {
        Integer[] numArr;
        int[] E = ((ctwb) this.c.b()).h(i).E();
        SparseArray sparseArray = this.b;
        return (sparseArray == null || !((cssv) this.a.b()).a() || (numArr = (Integer[]) sparseArray.get(i)) == null) ? E : new int[]{numArr[0].intValue(), numArr[1].intValue()};
    }
}
