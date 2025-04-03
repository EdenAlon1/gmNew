package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adtu extends adtm {
    public final Optional a;
    public final Optional b;
    public final eoio c;
    private final Optional d;

    public adtu(Optional optional, Optional optional2, Optional optional3, eoio eoioVar) {
        this.a = optional;
        this.d = optional2;
        this.b = optional3;
        this.c = eoioVar;
    }

    @Override // defpackage.adtm
    public final eoio a() {
        return this.c;
    }

    @Override // defpackage.adtm
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.adtm
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.adtm
    public final Optional d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Optional optional;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adtm) {
            adtm adtmVar = (adtm) obj;
            if (this.a.equals(adtmVar.d()) && ((optional = this.d) != null ? optional.equals(adtmVar.b()) : adtmVar.b() == null) && this.b.equals(adtmVar.c()) && this.c.equals(adtmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Optional optional = this.d;
        return (((((hashCode * 1000003) ^ (optional == null ? 0 : optional.hashCode())) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eoio eoioVar = this.c;
        Optional optional = this.b;
        Optional optional2 = this.d;
        return "AdvancedFeedbackLauncherConfigData{throwable=" + String.valueOf(this.a) + ", psdMap=" + String.valueOf(optional2) + ", reportIssueType=" + String.valueOf(optional) + ", bugleAdvancedFeedbackSource=" + eoioVar.toString() + "}";
    }
}
