package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoet {
    public final long a;
    public final eoeu b;
    private final int c = 0;
    private final int d;

    public eoet(long j, eoeu eoeuVar) {
        this.a = j;
        eoeuVar.getClass();
        this.b = eoeuVar;
        this.d = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eoet) {
            eoet eoetVar = (eoet) obj;
            if (this.a == eoetVar.a) {
                int i = eoetVar.d;
                int i2 = eoetVar.c;
                if (emxb.a(null, null) && emxb.a(this.b, eoetVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 2, null, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        eoeu eoeuVar = this.b;
        if (eoeuVar != eoeu.UNIT) {
            sb.append(eoeuVar.name().toLowerCase());
        }
        sb.append("BYTE".toLowerCase());
        if (this.a != -1) {
            sb.append('s');
        }
        return sb.toString();
    }
}
