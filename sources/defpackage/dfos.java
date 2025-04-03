package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfos implements dfqp {
    public final int a;
    public final int b;

    public dfos(dfor dforVar) {
        this.a = dforVar.a;
        this.b = dforVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfos)) {
            return false;
        }
        dfos dfosVar = (dfos) obj;
        return this.a == dfosVar.a && this.b == dfosVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
