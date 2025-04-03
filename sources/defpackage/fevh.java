package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevh {
    final fear a;
    final Object b;

    public fevh(fear fearVar, Object obj) {
        this.a = fearVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fevh fevhVar = (fevh) obj;
            if (emxb.a(this.a, fevhVar.a) && emxb.a(this.b, fevhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("provider", this.a);
        b.b("config", this.b);
        return b.toString();
    }
}
