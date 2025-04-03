package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cina extends ciqc {
    public final ephv a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public cina(ephv ephvVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = ephvVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.ciqc
    public final ephv a() {
        return this.a;
    }

    @Override // defpackage.ciqc
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.ciqc
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.ciqc
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciqc) {
            ciqc ciqcVar = (ciqc) obj;
            if (this.a.equals(ciqcVar.a()) && this.b.equals(ciqcVar.b()) && this.c.equals(ciqcVar.d()) && this.d.equals(ciqcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "ReportIssueNotificationData{issueType=" + this.a.toString() + ", message=" + String.valueOf(optional3) + ", throwable=" + String.valueOf(optional2) + ", psdMap=" + String.valueOf(optional) + "}";
    }
}
