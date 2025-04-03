package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elbb implements DialogInterface.OnClickListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DialogInterface.OnClickListener c;

    public /* synthetic */ elbb(elbx elbxVar, String str, DialogInterface.OnClickListener onClickListener) {
        this.a = elbxVar;
        this.b = str;
        this.c = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        elbx elbxVar = this.a;
        DialogInterface.OnClickListener onClickListener = this.c;
        ekzm b = elbxVar.b(this.b);
        try {
            onClickListener.onClick(dialogInterface, i);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
