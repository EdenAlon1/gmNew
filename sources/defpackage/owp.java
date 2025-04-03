package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owp implements owu {
    public final Set a = new LinkedHashSet();

    public owp(owv owvVar) {
        owvVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.owu
    public final Bundle a() {
        Bundle a = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        List ak = ffdx.ak(this.a);
        a.putStringArrayList("classes_to_restore", ak instanceof ArrayList ? (ArrayList) ak : new ArrayList<>(ak));
        return a;
    }
}
