package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhi extends dlhe {
    public final List a;
    public final List b;
    public final eyee c;
    public final List d;
    private final ffji e;

    public dlhi() {
        this(null);
    }

    @Override // defpackage.dlhe
    public final eyee a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhi)) {
            return false;
        }
        dlhi dlhiVar = (dlhi) obj;
        ffji ffjiVar = dlhiVar.e;
        return ffkj.e(null, null) && ffkj.e(this.a, dlhiVar.a) && ffkj.e(this.b, dlhiVar.b) && ffkj.e(this.c, dlhiVar.c) && ffkj.e(this.d, dlhiVar.d);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 992) * 31) + 1;
    }

    public /* synthetic */ dlhi(byte[] bArr) {
        ffel ffelVar = ffel.a;
        eyee eyeeVar = eyee.b;
        ffel ffelVar2 = ffel.a;
        eyeeVar.getClass();
        this.e = null;
        this.a = ffelVar;
        this.b = ffelVar;
        this.c = eyeeVar;
        this.d = ffelVar2;
    }
}
