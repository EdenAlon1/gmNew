package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobq {
    public final eobp a;
    private final Comparator b;

    public eobq(eobp eobpVar) {
        eobpVar.getClass();
        this.a = eobpVar;
        this.b = null;
        emxf.l(eobpVar != eobp.SORTED);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eobq)) {
            return false;
        }
        eobq eobqVar = (eobq) obj;
        if (this.a == eobqVar.a) {
            Comparator comparator = eobqVar.b;
            if (emxb.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        return b.toString();
    }
}
