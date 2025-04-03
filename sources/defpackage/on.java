package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class on implements PopupWindow.OnDismissListener {
    final /* synthetic */ oo a;

    public on(oo ooVar) {
        this.a = ooVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
