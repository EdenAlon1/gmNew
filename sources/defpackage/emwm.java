package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwm extends emwj implements Serializable {
    private static final long serialVersionUID = 0;
    private final emwl a;
    private final emwj b;

    public emwm(emwl emwlVar, emwj emwjVar) {
        this.a = emwlVar;
        this.b = emwjVar;
    }

    @Override // defpackage.emwj
    protected final int a(Object obj) {
        return this.b.c(this.a.apply(obj));
    }

    @Override // defpackage.emwj
    protected final boolean b(Object obj, Object obj2) {
        emwl emwlVar = this.a;
        return this.b.d(emwlVar.apply(obj), emwlVar.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emwm) {
            emwm emwmVar = (emwm) obj;
            if (this.a.equals(emwmVar.a) && this.b.equals(emwmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emwl emwlVar = this.a;
        return this.b.toString() + ".onResultOf(" + emwlVar.toString() + ")";
    }
}
