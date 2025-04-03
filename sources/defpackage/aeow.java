package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeow implements DialogInterface.OnClickListener {
    final /* synthetic */ aeox a;

    public aeow(aeox aeoxVar) {
        this.a = aeoxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e = i;
    }
}
