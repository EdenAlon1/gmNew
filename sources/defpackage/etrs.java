package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etrs extends etgf {
    public final ette a;

    public etrs(ette etteVar) {
        this.a = etteVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        euag b = euag.b(this.a.b.d);
        if (b == null) {
            b = euag.UNRECOGNIZED;
        }
        return b != euag.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etrs)) {
            return false;
        }
        ette etteVar = ((etrs) obj).a;
        euag b = euag.b(this.a.b.d);
        if (b == null) {
            b = euag.UNRECOGNIZED;
        }
        euag b2 = euag.b(etteVar.b.d);
        if (b2 == null) {
            b2 = euag.UNRECOGNIZED;
        }
        if (b.equals(b2)) {
            if (this.a.b.b.equals(etteVar.b.b)) {
                if (this.a.b.c.equals(etteVar.b.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ette etteVar = this.a;
        return Objects.hash(etteVar.b, etteVar.a);
    }

    public final String toString() {
        etzp etzpVar = this.a.b;
        String str = etzpVar.b;
        euag b = euag.b(etzpVar.d);
        if (b == null) {
            b = euag.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
