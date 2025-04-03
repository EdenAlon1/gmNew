package defpackage;

import android.R;
import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elle {
    public static View a(dn dnVar) {
        View view = dnVar.Q;
        if (view != null) {
            return view;
        }
        Dialog dialog = dnVar.d;
        if (dialog != null) {
            return dialog.findViewById(R.id.content);
        }
        return null;
    }

    public static void b(dn dnVar) {
        c(dnVar);
        View a = a(dnVar);
        ea eaVar = dnVar.E;
        View findViewById = eaVar == null ? dnVar.G().findViewById(R.id.content) : eaVar instanceof dn ? a((dn) eaVar) : eaVar.Q;
        a.getClass();
        a.setTag(com.google.android.apps.messaging.R.id.tiktok_event_parent, findViewById);
    }

    public static void c(dn dnVar) {
        if (dnVar.c && a(dnVar) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!dnVar.c && dnVar.Q == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }
}
