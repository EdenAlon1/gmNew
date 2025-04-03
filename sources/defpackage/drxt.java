package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drxt implements ffxy {
    final /* synthetic */ ehrt a;

    public drxt(ehrt ehrtVar) {
        this.a = ehrtVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Object obj2;
        Size size = (Size) obj;
        size.getClass();
        int width = size.getWidth();
        size.getClass();
        int height = size.getHeight();
        ehrw ehrwVar = this.a.i;
        ehrwVar.getClass();
        Iterator a = new kvt(ehrwVar).a();
        while (true) {
            if (!a.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = a.next();
            if (((View) obj2) instanceof TextView) {
                break;
            }
        }
        View view = (View) obj2;
        if (view == null) {
            view = ehrwVar;
        }
        Drawable background = ehrwVar.getBackground();
        RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        if (rippleDrawable != null) {
            int i = width / 4;
            rippleDrawable.setHotspotBounds(i, ffmk.g(view.getTop(), height), width - i, height);
        }
        return ffcu.a;
    }
}
