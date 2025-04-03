package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adlo extends adni {
    private final ebsj a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public adlo(ebsj ebsjVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = ebsjVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.adni
    public final ebsj a() {
        return this.a;
    }

    @Override // defpackage.adni
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.adni
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.adni
    public final Optional d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adni) {
            adni adniVar = (adni) obj;
            if (this.a.equals(adniVar.a()) && this.b.equals(adniVar.d()) && this.c.equals(adniVar.c()) && this.d.equals(adniVar.b())) {
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
        return "Options{features=" + this.a.toString() + ", topViewCreator=" + String.valueOf(optional3) + ", continueButtonCallbacks=" + String.valueOf(optional2) + ", cancelButtonCallbacks=" + String.valueOf(optional) + "}";
    }
}
