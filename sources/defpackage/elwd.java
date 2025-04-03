package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwd extends elwl {
    private final List a;
    private final Class b;

    public elwd(List list, Class cls) {
        if (list == null) {
            throw new NullPointerException("Null getPossibleValues");
        }
        this.a = list;
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
        return false;
    }

    @Override // defpackage.elwo
    public final boolean d() {
        return true;
    }

    @Override // defpackage.elwl
    public final Class e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elwl) {
            elwl elwlVar = (elwl) obj;
            if (this.a.equals(elwlVar.a())) {
                elwlVar.c();
                elwlVar.d();
                elwlVar.b();
                if (this.b.equals(elwlVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1231) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Class cls = this.b;
        return "EnumProperty{getPossibleValues=" + this.a.toString() + ", isRequired=false, isValueMatchRequired=true, isProhibited=false, enumType=" + cls.toString() + "}";
    }
}
