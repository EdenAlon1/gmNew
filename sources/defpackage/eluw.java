package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eluw extends eluy {
    private final String a;
    private final Function b;
    private final elux c;

    public eluw(String str, Function function, elux eluxVar) {
        this.a = str;
        this.b = function;
        this.c = eluxVar;
    }

    @Override // defpackage.eluy
    public final elux a() {
        return this.c;
    }

    @Override // defpackage.eluy
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eluy
    public final Function c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eluy) {
            eluy eluyVar = (eluy) obj;
            if (this.a.equals(eluyVar.b())) {
                equals = this.b.equals(eluyVar.c());
                if (equals && this.c.equals(eluyVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        hashCode = this.b.hashCode();
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        elux eluxVar = this.c;
        return "ParamBinding{name=" + this.a + ", paramGetter=" + this.b.toString() + ", argumentSetter=" + eluxVar.toString() + "}";
    }
}
