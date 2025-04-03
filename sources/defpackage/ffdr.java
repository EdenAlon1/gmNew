package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdr extends ffde implements RandomAccess {
    final /* synthetic */ long[] a;

    public ffdr(long[] jArr) {
        this.a = jArr;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Long) {
            return ffdo.C(this.a, ((Number) obj).longValue()) >= 0;
        }
        return false;
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(this.a[i]);
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        return ffdo.C(this.a, ((Number) obj).longValue());
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Number) obj).longValue();
        long[] jArr = this.a;
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (longValue == jArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
