package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfo implements DialogInterface.OnDismissListener {
    final /* synthetic */ cxfr a;

    public cxfo(cxfr cxfrVar) {
        this.a = cxfrVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b(-1);
        this.a.a();
    }
}
