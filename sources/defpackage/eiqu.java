package defpackage;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ImageView a;

    public eiqu(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!eipk.a() || this.a.getDrawable() == null || (this.a.getDrawable() instanceof VectorDrawable) || (this.a.getDrawable() instanceof pcj)) {
            return true;
        }
        if (!Build.TYPE.equals("userdebug") && !Build.TYPE.equals("eng")) {
            return true;
        }
        Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(String.valueOf(this.a.getContext().getPackageName())));
        return true;
    }
}
