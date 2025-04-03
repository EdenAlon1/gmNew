package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elay implements View.OnClickListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ String b;
    public final /* synthetic */ View.OnClickListener c;

    public /* synthetic */ elay(elbx elbxVar, String str, View.OnClickListener onClickListener) {
        this.a = elbxVar;
        this.b = str;
        this.c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        elbx elbxVar = this.a;
        View.OnClickListener onClickListener = this.c;
        ekzm b = elbxVar.b(this.b);
        try {
            onClickListener.onClick(view);
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
