package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrn {
    public final long a;
    public final String d;
    public Optional e;
    public Optional f;
    public Optional c = Optional.ofNullable(null);
    public Optional b = Optional.empty();
    public Optional g = Optional.empty();

    public dkrn(long j, String str, String str2, String str3) {
        this.a = j;
        this.f = Optional.ofNullable(str2);
        this.d = str;
        this.e = Optional.ofNullable(str3);
    }

    public final void a(dilk dilkVar) {
        this.b = Optional.of(dilkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dkrn dkrnVar = (dkrn) obj;
            if (this.a == dkrnVar.a && Objects.equals(this.b, dkrnVar.b) && this.d.equals(dkrnVar.d) && Objects.equals(this.e, dkrnVar.e) && Objects.equals(this.f, dkrnVar.f) && Objects.equals(this.g, dkrnVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return "Group ID: " + this.d + ", rcs session ID: " + this.a + ", conference URI: " + dktx.URI.c(this.e) + ", conference Info: " + String.valueOf(this.b) + ", subject: " + dktx.MESSAGE_CONTENT.c(this.f);
    }
}
