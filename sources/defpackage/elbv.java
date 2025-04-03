package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbv implements View.OnLongClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ View.OnLongClickListener b;
    final /* synthetic */ elbx c;

    public elbv(elbx elbxVar, String str, View.OnLongClickListener onLongClickListener) {
        this.a = str;
        this.b = onLongClickListener;
        this.c = elbxVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ekzm b = this.c.b(this.a);
        try {
            boolean onLongClick = this.b.onLongClick(view);
            b.close();
            return onLongClick;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClickUseDefaultHapticFeedback(View view) {
        boolean onLongClickUseDefaultHapticFeedback;
        onLongClickUseDefaultHapticFeedback = this.b.onLongClickUseDefaultHapticFeedback(view);
        return onLongClickUseDefaultHapticFeedback;
    }
}
