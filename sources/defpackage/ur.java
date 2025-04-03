package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ur extends uo implements up {
    public static Method a;
    public up b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public ur(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.uo
    public final ti p(Context context, boolean z) {
        uq uqVar = new uq(context, z);
        uqVar.e = this;
        return uqVar;
    }
}
