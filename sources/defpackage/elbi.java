package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elbi implements View.OnLayoutChangeListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ View.OnLayoutChangeListener b;
    public final /* synthetic */ String c = "ConversationFragmentPeer composeMessageView onLayoutChange";

    public /* synthetic */ elbi(elbx elbxVar, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.a = elbxVar;
        this.b = onLayoutChangeListener;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View.OnLayoutChangeListener onLayoutChangeListener = this.b;
        if (ekyf.v()) {
            onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            return;
        }
        ekzm b = this.a.b(this.c);
        try {
            onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            b.close();
        } finally {
        }
    }
}
