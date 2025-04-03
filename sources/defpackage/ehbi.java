package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbi implements View.OnClickListener {
    final /* synthetic */ ehbn a;

    public ehbi(ehbn ehbnVar) {
        this.a = ehbnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ehbn ehbnVar = this.a;
        if (ehbnVar.e && ehbnVar.isShowing()) {
            ehbn ehbnVar2 = this.a;
            if (!ehbnVar2.g) {
                TypedArray obtainStyledAttributes = ehbnVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                ehbnVar2.f = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                ehbnVar2.g = true;
            }
            if (ehbnVar2.f) {
                this.a.cancel();
            }
        }
    }
}
