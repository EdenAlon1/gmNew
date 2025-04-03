package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uml implements DialogInterface.OnCancelListener {
    final /* synthetic */ ffgu a;

    public uml(ffgu ffguVar) {
        this.a = ffguVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.w(0);
    }
}
