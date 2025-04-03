package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dimc {
    public final String a;
    public final Optional b;

    public dimc(String str) {
        this.a = str;
        this.b = Optional.empty();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dimc)) {
            return false;
        }
        dimc dimcVar = (dimc) obj;
        return TextUtils.equals(this.a, dimcVar.a) && this.b.equals(dimcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "Participant: " + dktx.URI_TEL.c(this.a) + ", timestamp: " + this.b.toString();
    }

    public dimc(String str, dktc dktcVar) {
        this.a = str;
        this.b = Optional.of(dktcVar);
    }
}
