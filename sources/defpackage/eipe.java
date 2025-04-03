package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.Button;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipe {
    public static final HashMap a = new HashMap();

    public static int a(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    static void b(Context context, Button button, eioq eioqVar) {
        if (eios.h(context).s(eioqVar)) {
            int c = eios.h(context).c(context, eioqVar);
            if (c != 0) {
                button.setTextColor(ColorStateList.valueOf(c));
                return;
            }
            return;
        }
        HashMap hashMap = a;
        if (!hashMap.containsKey(Integer.valueOf(button.getId()))) {
            throw new IllegalStateException("There is no saved default color for button");
        }
        button.setTextColor((ColorStateList) hashMap.get(Integer.valueOf(button.getId())));
    }

    static void c(Button button, int i) {
        if (i != 0) {
            button.setTextColor(ColorStateList.valueOf(i));
        }
    }

    static void d(Context context, Button button, eioq eioqVar) {
        c(button, eios.h(context).c(context, eioqVar));
    }
}
