package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjd implements rjh {
    private final int a;
    private final boolean b;

    public rjd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.rjh
    public final /* bridge */ /* synthetic */ boolean a(Object obj, rjg rjgVar) {
        Drawable drawable = (Drawable) obj;
        Drawable j = rjgVar.j();
        if (j == null) {
            j = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{j, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        rjgVar.k(transitionDrawable);
        return true;
    }
}
