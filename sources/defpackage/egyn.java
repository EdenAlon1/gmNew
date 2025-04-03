package defpackage;

import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyn implements View.OnAttachStateChangeListener {
    final /* synthetic */ egym a;
    final /* synthetic */ TouchDelegate b;

    public egyn(egym egymVar, TouchDelegate touchDelegate) {
        this.a = egymVar;
        this.b = touchDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        egym egymVar = this.a;
        List list = egymVar.a;
        TouchDelegate touchDelegate = this.b;
        list.remove(touchDelegate);
        if (touchDelegate == egymVar.b) {
            egymVar.b = null;
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
