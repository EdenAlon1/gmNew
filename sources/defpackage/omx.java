package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class omx implements DialogInterface.OnClickListener {
    final /* synthetic */ omy a;

    public omx(omy omyVar) {
        this.a = omyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        omy omyVar = this.a;
        omyVar.ag = i;
        ((onm) omyVar).ak = -1;
        dialogInterface.dismiss();
    }
}
