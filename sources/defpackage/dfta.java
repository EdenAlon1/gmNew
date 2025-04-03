package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfta {
    public final dfrz a;
    public final Feature b;

    public dfta(dfrz dfrzVar, Feature feature) {
        this.a = dfrzVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dfta)) {
            dfta dftaVar = (dfta) obj;
            if (dfwq.a(this.a, dftaVar.a) && dfwq.a(this.b, dftaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("key", this.a, arrayList);
        dfwp.b("feature", this.b, arrayList);
        return dfwp.a(arrayList, this);
    }
}
