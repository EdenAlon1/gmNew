package defpackage;

import android.content.DialogInterface;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elll implements DialogInterface.OnClickListener {
    public final /* synthetic */ ellq a;
    public final /* synthetic */ ellf b;

    public /* synthetic */ elll(ellq ellqVar, ellf ellfVar) {
        this.a = ellqVar;
        this.b = ellfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Button b = ((iv) dialogInterface).b(i);
        boolean a = ekys.a(b);
        ellf ellfVar = this.b;
        if (a) {
            ekzm d = this.a.a.d(i != -3 ? i != -2 ? i != -1 ? "Clicked dialog button" : "Clicked positive dialog button" : "Clicked negative dialog button" : "Clicked neutral dialog button");
            try {
                ellj.g(ellfVar, b);
                d.close();
            } catch (Throwable th) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
