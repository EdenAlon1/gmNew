package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyn implements dnym {
    public final List a;
    private final String b;
    private final dnyl c;
    private final float d;
    private final ffix e;
    private final int f;

    public dnyn() {
        this(null, null, 0.0f, null, 63);
    }

    @Override // defpackage.dnym
    public final float a() {
        return this.d;
    }

    @Override // defpackage.dnym
    public final dnyl b() {
        return this.c;
    }

    @Override // defpackage.dnym
    public final String c() {
        return null;
    }

    @Override // defpackage.dnym
    public final List d() {
        return this.a;
    }

    @Override // defpackage.dnym
    public final ffix e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnyn)) {
            return false;
        }
        dnyn dnynVar = (dnyn) obj;
        String str = dnynVar.b;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i = dnynVar.f;
        return ffkj.e(this.a, dnynVar.a) && this.c == dnynVar.c && Float.compare(this.d, dnynVar.d) == 0 && ffkj.e(this.e, dnynVar.e);
    }

    @Override // defpackage.dnym
    public final int f() {
        return 1;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d);
        ffix ffixVar = this.e;
        return (hashCode * 31) + (ffixVar == null ? 0 : ffixVar.hashCode());
    }

    public final String toString() {
        return "MultiMonogramUiData(contentDescription=null, iconOverride=NONE, items=" + this.a + ", shape=" + this.c + ", spacerWeight=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ dnyn(List list, dnyl dnylVar, float f, ffix ffixVar, int i) {
        list = (i & 4) != 0 ? ffel.a : list;
        dnylVar = (i & 8) != 0 ? dnyl.a : dnylVar;
        int i2 = i & 2;
        f = (i & 16) != 0 ? 0.05f : f;
        ffixVar = (i & 32) != 0 ? null : ffixVar;
        if (i2 == 0) {
            throw null;
        }
        list.getClass();
        dnylVar.getClass();
        this.b = null;
        this.f = 1;
        this.a = list;
        this.c = dnylVar;
        this.d = f;
        this.e = ffixVar;
    }
}
