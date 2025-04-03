package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dwcs implements DialogInterface.OnShowListener {
    public final /* synthetic */ dn a;
    public final /* synthetic */ DialogInterface.OnShowListener b;

    public /* synthetic */ dwcs(dn dnVar, DialogInterface.OnShowListener onShowListener) {
        this.a = dnVar;
        this.b = onShowListener;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (dialogInterface == null || this.a.d == null) {
            return;
        }
        this.b.onShow(dialogInterface);
    }
}
