package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ektu {
    public final ekwe a;
    public final ekrl b;
    public final eisx c;

    public ektu(ekwe ekweVar) {
        this.a = ekweVar;
        ekwc ekwcVar = ekweVar.c;
        this.b = new ekrl(ekwcVar == null ? ekwc.a : ekwcVar);
        this.c = (ekweVar.b & 2) != 0 ? eisx.b(ekweVar.d) : null;
    }

    final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ektu) {
            ektu ektuVar = (ektu) obj;
            if (this.b.equals(ektuVar.b)) {
                eisx eisxVar = this.c;
                eisx eisxVar2 = ektuVar.c;
                if (eisxVar == null) {
                    if (eisxVar2 == null) {
                        return true;
                    }
                } else if (eisxVar.equals(eisxVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
