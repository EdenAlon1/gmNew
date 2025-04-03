package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daef implements DialogInterface.OnShowListener {
    final /* synthetic */ Context a;
    final /* synthetic */ DebugMmsConfigItemView b;

    public daef(DebugMmsConfigItemView debugMmsConfigItemView, Context context) {
        this.a = context;
        this.b = debugMmsConfigItemView;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.b.f.requestFocus();
        this.b.f.selectAll();
        ((InputMethodManager) this.a.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
