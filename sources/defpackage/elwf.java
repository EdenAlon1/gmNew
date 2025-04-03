package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwf extends elws {
    public final List a;
    public final Class b;
    private final boolean c;
    private final boolean d;

    public elwf(List list, boolean z, boolean z2, Class cls) {
        if (list == null) {
            throw new NullPointerException("Null getPossibleValues");
        }
        this.a = list;
        this.c = z;
        this.d = z2;
        this.b = cls;
    }

    @Override // defpackage.elwo
    public final List a() {
        return this.a;
    }

    @Override // defpackage.elwo
    public final boolean b() {
        return false;
    }

    @Override // defpackage.elwo
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.elwo
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.elws
    public final Class e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elws) {
            elws elwsVar = (elws) obj;
            if (this.a.equals(elwsVar.a()) && this.c == elwsVar.c() && this.d == elwsVar.d()) {
                elwsVar.b();
                if (this.b.equals(elwsVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Class cls = this.b;
        return "StringOrEnumProperty{getPossibleValues=" + this.a.toString() + ", isRequired=" + this.c + ", isValueMatchRequired=" + this.d + ", isProhibited=false, enumType=" + cls.toString() + "}";
    }
}
