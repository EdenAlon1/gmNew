package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dskn implements DialogInterface.OnCancelListener {
    final /* synthetic */ ffrf a;

    public dskn(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.h(null);
    }
}
