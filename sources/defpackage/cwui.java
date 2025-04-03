package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwui implements DialogInterface.OnClickListener {
    final /* synthetic */ cwuk a;

    public cwui(cwuk cwukVar) {
        this.a = cwukVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(i);
        dialogInterface.dismiss();
    }
}
