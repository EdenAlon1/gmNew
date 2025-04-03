package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evkt {
    @Deprecated
    public evkt() {
    }

    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final evkq b() {
        if (this instanceof evkq) {
            return (evkq) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final evkw c() {
        if (this instanceof evkw) {
            return (evkw) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            evpn evpnVar = new evpn(stringWriter);
            evpnVar.d(1);
            evnc.b(this, evpnVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
