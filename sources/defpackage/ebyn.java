package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebyn extends ebyz {
    private final dfrl a;
    private final Status b;

    public ebyn(dfrl dfrlVar, Status status) {
        if (dfrlVar == null) {
            throw new NullPointerException("Null result");
        }
        this.a = dfrlVar;
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.ebyz
    public final dfrl a() {
        return this.a;
    }

    @Override // defpackage.ebyz
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebyz) {
            ebyz ebyzVar = (ebyz) obj;
            if (this.a.equals(ebyzVar.a()) && this.b.equals(ebyzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
