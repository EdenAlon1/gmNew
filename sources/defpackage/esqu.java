package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqu {
    public final fcek a;
    public final Optional b;

    public /* synthetic */ esqu(fcek fcekVar, Optional optional, int i) {
        optional = (i & 2) != 0 ? Optional.empty() : optional;
        fcekVar.getClass();
        optional.getClass();
        this.a = fcekVar;
        this.b = optional;
        fgtg fgtgVar = fgtg.GROUP_ID;
        fgtg b = fgtg.b(fcekVar.b);
        if (fgtgVar != (b == null ? fgtg.UNRECOGNIZED : b)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esqu)) {
            return false;
        }
        esqu esquVar = (esqu) obj;
        return ffkj.e(this.a, esquVar.a) && ffkj.e(this.b, esquVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupId(id=" + this.a + ", conferenceUri=" + this.b + ")";
    }
}
