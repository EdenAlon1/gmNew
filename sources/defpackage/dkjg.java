package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkjg extends dkll {
    private final Optional a;

    public dkjg(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.dkll
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkll) {
            dkll dkllVar = (dkll) obj;
            dkllVar.b();
            if (this.a.equals(dkllVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return "SendCpimMessageResponse{type=OK, error=" + this.a.toString() + "}";
    }

    @Override // defpackage.dkll
    public final void b() {
    }
}
