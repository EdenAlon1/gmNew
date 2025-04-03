package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgv {
    final /* synthetic */ FloatingActionButton a;

    public ehgv(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            super/*ehjh*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean b() {
        return this.a.b;
    }
}
