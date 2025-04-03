package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elax implements View.OnFocusChangeListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ View.OnFocusChangeListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ elax(elbx elbxVar, View.OnFocusChangeListener onFocusChangeListener, String str) {
        this.a = elbxVar;
        this.b = onFocusChangeListener;
        this.c = str;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.b;
        if (ekyf.v()) {
            onFocusChangeListener.onFocusChange(view, z);
            return;
        }
        ekzm b = this.a.b(this.c);
        try {
            onFocusChangeListener.onFocusChange(view, z);
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
