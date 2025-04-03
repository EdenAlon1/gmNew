package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvu {
    public final View a;
    public final hwf b;
    public final AutofillManager c;
    public AutofillId d;

    public hvu(View view, hwf hwfVar) {
        this.a = view;
        this.b = hwfVar;
        AutofillManager m144m = akb$$ExternalSyntheticApiModelOutline0.m144m(view.getContext().getSystemService(akb$$ExternalSyntheticApiModelOutline0.m148m()));
        if (m144m == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = m144m;
        view.setImportantForAutofill(1);
        Object obj = jhu.a(view).a;
        if (obj != null) {
            this.d = iy$$ExternalSyntheticApiModelOutline1.m414m(obj);
        } else {
            imn.a("Required value was null.");
            throw new ffbx();
        }
    }
}
