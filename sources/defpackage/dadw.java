package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadw implements DialogInterface.OnShowListener {
    final /* synthetic */ Context a;
    final /* synthetic */ DebugGServiceKeysItemView b;

    public dadw(DebugGServiceKeysItemView debugGServiceKeysItemView, Context context) {
        this.a = context;
        this.b = debugGServiceKeysItemView;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.b.a.requestFocus();
        this.b.a.selectAll();
        ((InputMethodManager) this.a.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
