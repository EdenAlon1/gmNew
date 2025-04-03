package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feca {
    public final fedm a;
    public final fdxd b;
    public final febw c;

    public feca(fedm fedmVar, fdxd fdxdVar, febw febwVar) {
        this.a = fedmVar;
        fdxdVar.getClass();
        this.b = fdxdVar;
        this.c = febwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feca)) {
            return false;
        }
        feca fecaVar = (feca) obj;
        return emxb.a(this.a, fecaVar.a) && emxb.a(this.b, fecaVar.b) && emxb.a(this.c, fecaVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("addressesOrError", this.a.toString());
        b.b("attributes", this.b);
        b.b("serviceConfigOrError", this.c);
        return b.toString();
    }
}
