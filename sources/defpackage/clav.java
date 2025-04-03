package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clav extends clba {
    public final Optional a;
    public final Optional b;

    public clav(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.clba
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.clba
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clba) {
            clba clbaVar = (clba) obj;
            if (this.a.equals(clbaVar.b()) && this.b.equals(clbaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "RcsGroupTelephonyDataParseResult{rcsGroupTelephonyData=" + String.valueOf(this.a) + ", parseError=" + String.valueOf(optional) + "}";
    }
}
