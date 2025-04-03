package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elpo extends elpq {
    private final String a;
    private final Function b;
    private final elpp c;

    public elpo(String str, Function function, elpp elppVar) {
        this.a = str;
        this.b = function;
        this.c = elppVar;
    }

    @Override // defpackage.elpq
    public final elpp a() {
        return this.c;
    }

    @Override // defpackage.elpq
    public final String b() {
        return this.a;
    }

    @Override // defpackage.elpq
    public final Function c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof elpq) {
            elpq elpqVar = (elpq) obj;
            if (this.a.equals(elpqVar.b())) {
                equals = this.b.equals(elpqVar.c());
                if (equals && this.c.equals(elpqVar.a())) {
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
        elpp elppVar = this.c;
        return "FieldBinding{name=" + this.a + ", valueGetter=" + this.b.toString() + ", valueSetter=" + elppVar.toString() + "}";
    }
}
