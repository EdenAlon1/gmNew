package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enix extends enhd {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public enix(Comparator comparator) {
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // defpackage.enhd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eniz c() {
        int i = this.b;
        if (i == 0) {
            return eniz.w(this.f);
        }
        if (i == 1) {
            Comparator comparator = this.f;
            Object obj = this.d[0];
            obj.getClass();
            Object obj2 = this.e[0];
            obj2.getClass();
            return eniz.z(comparator, obj, obj2);
        }
        Object[] copyOf = Arrays.copyOf(this.d, i);
        Arrays.sort(copyOf, this.f);
        Object[] objArr = new Object[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (this.f.compare(copyOf[i3], copyOf[i2]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + String.valueOf(copyOf[i3]) + " and " + String.valueOf(copyOf[i2]));
                }
            }
            Object obj3 = this.d[i2];
            obj3.getClass();
            int binarySearch = Arrays.binarySearch(copyOf, obj3, this.f);
            Object obj4 = this.e[i2];
            obj4.getClass();
            objArr[binarySearch] = obj4;
        }
        return new eniz(new enpe(engw.h(copyOf), this.f), engw.h(objArr));
    }

    @Override // defpackage.enhd
    @Deprecated
    public final /* bridge */ /* synthetic */ enhk b() {
        throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
    }

    @Override // defpackage.enhd
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void k(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.d.length;
        if (i > length) {
            int f = engh.f(length, i);
            this.d = Arrays.copyOf(this.d, f);
            this.e = Arrays.copyOf(this.e, f);
        }
        endr.a(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
    }

    @Override // defpackage.enhd
    public final /* synthetic */ void g(Map map) {
        super.g(map);
    }
}
