package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxe {
    public final oab a;
    public final boolean b;
    public final boolean c;
    private final Object d;

    public nxe(oab oabVar, boolean z, Object obj, boolean z2) {
        if (!oabVar.q && z) {
            throw new IllegalArgumentException(oabVar.e().concat(" does not allow nullable values"));
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + oabVar.e() + " has null value but is not nullable.");
        }
        this.a = oabVar;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final void a(String str, Bundle bundle) {
        Object obj;
        str.getClass();
        if (!this.c || (obj = this.d) == null) {
            return;
        }
        this.a.f(bundle, str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nxe nxeVar = (nxe) obj;
        if (this.b != nxeVar.b || this.c != nxeVar.c || !ffkj.e(this.a, nxeVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        return obj2 != null ? ffkj.e(obj2, nxeVar.d) : nxeVar.d == null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.d;
        return ((((hashCode + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = fflc.a;
        sb.append(new ffkb(getClass()).c());
        oab oabVar = this.a;
        Objects.toString(oabVar);
        sb.append(" Type: ".concat(oabVar.toString()));
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            Object obj = this.d;
            Objects.toString(obj);
            sb.append(" DefaultValue: ".concat(String.valueOf(obj)));
        }
        return sb.toString();
    }
}
