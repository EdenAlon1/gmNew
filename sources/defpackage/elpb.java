package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpb extends elpa {
    public final Map a;
    private final Optional b;

    public elpb(Map map, Optional optional) {
        if (map == null) {
            throw new NullPointerException("Null paramValues");
        }
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.elpa
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.elpa
    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elpa) {
            elpa elpaVar = (elpa) obj;
            if (this.a.equals(elpaVar.b()) && this.b.equals(elpaVar.a())) {
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
        return "ArgumentsWrapper{paramValues=" + this.a.toString() + ", requestMetadata=" + optional.toString() + "}";
    }
}
