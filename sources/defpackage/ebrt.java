package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebrt {
    private static final String a = String.valueOf(ebrt.class.getName()).concat(".SELECTED_ACCOUNT_ID");
    private final ebrs b;

    public ebrt(ebrs ebrsVar) {
        this.b = ebrsVar;
    }

    public final void a(Bundle bundle) {
        ((ebpl) this.b).a.b = bundle.getString(a);
    }

    public final void b(Bundle bundle) {
        ebpl ebplVar = (ebpl) this.b;
        Object a2 = ebplVar.b.a();
        if (a2 == null) {
            bundle.remove(a);
        } else {
            bundle.putString(a, ((ebph) ebplVar.f).a.b(a2));
        }
    }
}
