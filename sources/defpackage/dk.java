package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dk implements DialogInterface.OnDismissListener {
    final /* synthetic */ dn a;

    public dk(dn dnVar) {
        this.a = dnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dn dnVar = this.a;
        Dialog dialog = dnVar.d;
        if (dialog != null) {
            dnVar.onDismiss(dialog);
        }
    }
}
