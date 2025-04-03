package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fery extends feal {
    public final fdxj a;
    public final febo b;
    public final febs c;
    private final feaj d;

    public fery(febs febsVar, febo feboVar, fdxj fdxjVar, feaj feajVar) {
        febsVar.getClass();
        this.c = febsVar;
        feboVar.getClass();
        this.b = feboVar;
        fdxjVar.getClass();
        this.a = fdxjVar;
        feajVar.getClass();
        this.d = feajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fery feryVar = (fery) obj;
            if (emxb.a(this.a, feryVar.a) && emxb.a(this.b, feryVar.b) && emxb.a(this.c, feryVar.c) && emxb.a(this.d, feryVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        fdxj fdxjVar = this.a;
        febo feboVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + feboVar.toString() + " callOptions=" + fdxjVar.toString() + "]";
    }
}
