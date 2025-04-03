package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebnk {
    public static ebno a(final eayo eayoVar, final eavd eavdVar, Context context) {
        String str;
        View.OnClickListener onClickListener;
        if (!ebni.a(context)) {
            return null;
        }
        ebnl ebnlVar = new ebnl();
        ebnlVar.a(R.id.og_ai_not_set);
        ebnlVar.c = -1;
        ebnlVar.h = (byte) (ebnlVar.h | 2);
        ebnlVar.b(-1);
        ebnlVar.a(R.id.og_ai_add_another_account);
        Drawable a = ku.a(context, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
        a.getClass();
        ebnlVar.b = a;
        String string = context.getString(R.string.og_add_another_account);
        if (string == null) {
            throw new NullPointerException("Null label");
        }
        ebnlVar.d = string;
        ebnlVar.f = new View.OnClickListener() { // from class: ebnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eavd.this.a(view, eayoVar.a());
            }
        };
        ebnlVar.b(90141);
        if ((ebnlVar.h & 1) == 0) {
            throw new IllegalStateException("Property \"id\" has not been set");
        }
        emxf.m(ebnlVar.a != R.id.og_ai_not_set, "Did you forget to setId()?");
        if ((ebnlVar.h & 4) == 0) {
            throw new IllegalStateException("Property \"veId\" has not been set");
        }
        emxf.m(ebnlVar.e != -1, "Did you forget to setVeId()?");
        if ((ebnlVar.h & 2) == 0) {
            throw new IllegalStateException("Property \"iconResId\" has not been set");
        }
        int i = ebnlVar.c;
        emxf.m((i != -1) ^ (ebnlVar.b != null), "Either icon id or icon drawable must be specified");
        if (ebnlVar.h == 7 && (str = ebnlVar.d) != null && (onClickListener = ebnlVar.f) != null) {
            return new ebnm(ebnlVar.a, ebnlVar.b, ebnlVar.c, str, ebnlVar.e, onClickListener, ebnlVar.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & ebnlVar.h) == 0) {
            sb.append(" id");
        }
        if ((ebnlVar.h & 2) == 0) {
            sb.append(" iconResId");
        }
        if (ebnlVar.d == null) {
            sb.append(" label");
        }
        if ((ebnlVar.h & 4) == 0) {
            sb.append(" veId");
        }
        if (ebnlVar.f == null) {
            sb.append(" onClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
