package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class embm implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;
    private final List c;

    public embm(String str, Date date) {
        this.a = str;
        this.b = date == null ? null : Long.valueOf(date.getTime());
        this.c = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof embm)) {
            return false;
        }
        embm embmVar = (embm) obj;
        return Objects.equals(this.a, embmVar.a) && Objects.equals(this.b, embmVar.b) && Objects.equals(this.c, embmVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("tokenValue", this.a);
        b.b("expirationTimeMillis", this.b);
        b.b("scopes", this.c);
        return b.toString();
    }
}
