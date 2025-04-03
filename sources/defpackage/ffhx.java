package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhx extends ffde implements Serializable, List, java.util.List, fflg {
    private final Enum[] a;

    public ffhx(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new ffhy(this.a);
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        return ((Enum) ffdo.I(this.a, r4.ordinal())) == r4;
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ffda.b(i, this.a.length);
        return this.a[i];
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int ordinal = r4.ordinal();
        if (((Enum) ffdo.I(enumArr, ordinal)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.ffde, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
