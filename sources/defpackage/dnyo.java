package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyo implements dnym {
    public final int a;
    private final dnwq b;
    private final String c;
    private final dnyl d;
    private final float e;
    private final ffix f;
    private final List g;

    public dnyo() {
        this(null, null, 0, null, 0.0f, null, 63);
    }

    @Override // defpackage.dnym
    public final float a() {
        return this.e;
    }

    @Override // defpackage.dnym
    public final dnyl b() {
        return this.d;
    }

    @Override // defpackage.dnym
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dnym
    public final List d() {
        return this.g;
    }

    @Override // defpackage.dnym
    public final ffix e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnyo)) {
            return false;
        }
        dnyo dnyoVar = (dnyo) obj;
        return ffkj.e(this.b, dnyoVar.b) && ffkj.e(this.c, dnyoVar.c) && this.a == dnyoVar.a && this.d == dnyoVar.d && Float.compare(this.e, dnyoVar.e) == 0 && ffkj.e(this.f, dnyoVar.f);
    }

    @Override // defpackage.dnym
    public final int f() {
        return this.a;
    }

    public final int hashCode() {
        dnwq dnwqVar = this.b;
        int hashCode = dnwqVar == null ? 0 : dnwqVar.hashCode();
        String str = this.c;
        int hashCode2 = (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.a) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e);
        ffix ffixVar = this.f;
        return (hashCode2 * 31) + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleMonogramUiData(item=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", iconOverride=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "SELECTED" : "BLOCKED" : "NONE"));
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", spacerWeight=");
        sb.append(this.e);
        sb.append(", onClick=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dnyo(dnwq dnwqVar, String str, int i, dnyl dnylVar, float f, ffix ffixVar, int i2) {
        dnylVar = (i2 & 8) != 0 ? dnyl.a : dnylVar;
        i = (i2 & 4) != 0 ? 1 : i;
        int i3 = i2 & 1;
        str = (i2 & 2) != 0 ? null : str;
        dnwqVar = 1 == i3 ? null : dnwqVar;
        f = (i2 & 16) != 0 ? 0.05f : f;
        ffixVar = (i2 & 32) != 0 ? null : ffixVar;
        if (i == 0) {
            throw null;
        }
        dnylVar.getClass();
        this.b = dnwqVar;
        this.c = str;
        this.a = i;
        this.d = dnylVar;
        this.e = f;
        this.f = ffixVar;
        this.g = dnwqVar == null ? ffel.a : ffdx.b(dnwqVar);
    }
}
