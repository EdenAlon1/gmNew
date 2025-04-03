package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dskl implements DialogInterface.OnClickListener {
    final /* synthetic */ ffrf a;

    public dskl(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.w(true);
    }
}
