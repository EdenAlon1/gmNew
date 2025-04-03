package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdo {
    public final cdn a;
    public final avi b = null;

    public cdo(cdn cdnVar) {
        this.a = cdnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdo)) {
            return false;
        }
        cdo cdoVar = (cdo) obj;
        if (this.a == cdoVar.a) {
            avi aviVar = cdoVar.b;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }
}
