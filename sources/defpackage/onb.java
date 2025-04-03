package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class onb implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ onc a;

    public onb(onc oncVar) {
        this.a = oncVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        onc oncVar = this.a;
        if (z) {
            oncVar.ah = oncVar.ag.add(oncVar.aj[i].toString()) | oncVar.ah;
        } else {
            oncVar.ah = oncVar.ag.remove(oncVar.aj[i].toString()) | oncVar.ah;
        }
    }
}
