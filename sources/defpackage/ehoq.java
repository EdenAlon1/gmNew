package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehoq {
    public static ehoi a(int i) {
        return i != 1 ? new ehot() : new ehoj();
    }

    public static void b(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof ehop) {
            ((ehop) background).N(f);
        }
    }

    public static void c(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ehop) {
            d(view, (ehop) background);
        }
    }

    public static void d(View view, ehop ehopVar) {
        ehfz ehfzVar = ehopVar.q.c;
        if (ehfzVar == null || !ehfzVar.a) {
            return;
        }
        ehopVar.Q(ehjg.b(view));
    }
}
