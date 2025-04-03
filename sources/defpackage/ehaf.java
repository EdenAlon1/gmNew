package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehaf {
    public static void a(ehab ehabVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        ehabVar.setBounds(rect);
        ehabVar.f(view, null);
    }
}
