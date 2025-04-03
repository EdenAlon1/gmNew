package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zg implements View.OnClickListener {
    final nn a;
    final /* synthetic */ zi b;

    public zg(zi ziVar) {
        this.b = ziVar;
        this.a = new nn(ziVar.a.getContext(), ziVar.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zi ziVar = this.b;
        Window.Callback callback = ziVar.e;
        if (callback == null || !ziVar.f) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
