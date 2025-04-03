package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dujl {
    public final dujk a;
    public View b;
    public Context c;
    public dukm d;
    public dujv e;
    public evpr f;
    public eukk g;
    public duja h;
    public boolean j;
    public dukf k;
    public String l;
    public boolean i = false;
    public boolean m = false;
    public boolean n = false;

    public dujl(dujk dujkVar) {
        this.a = dujkVar;
    }

    public static final void e(View view, String str) {
        ((TextView) view.findViewById(R.id.hats_lib_prompt_title_text)).setText(str);
    }

    public final void a() {
        int i;
        if (!this.n) {
            duja dujaVar = this.h;
            Dialog dialog = dujaVar.b;
            if (dujaVar.d) {
                i = -1;
            } else {
                dukm dukmVar = dujaVar.c;
                if (duko.a(dukmVar.a).x < dukmVar.b) {
                    i = duko.a(dukmVar.a).x;
                } else {
                    int dimensionPixelSize = dukmVar.a.getResources().getDimensionPixelSize(R.dimen.hats_lib_prompt_max_width);
                    int a = dukmVar.a();
                    i = a + a + dimensionPixelSize;
                }
            }
            dujaVar.a.gv(dujaVar.d ? dujaVar.a().getDimension(R.dimen.hats_lib_prompt_banner_elevation_sheet) : dujaVar.a().getDimension(R.dimen.hats_lib_prompt_banner_elevation_card));
            float gx = dujaVar.a.gx() * 1.5f;
            float gx2 = dujaVar.a.gx();
            RectF c = dujaVar.b != null ? dujaVar.c.c(dujaVar.d) : new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            if (dialog != null) {
                Window window = dujaVar.b.getWindow();
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.addFlags(32);
                window.clearFlags(2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 0;
                attributes.y = 0;
                attributes.width = i;
                attributes.gravity = 85;
                window.setAttributes(attributes);
            }
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dujaVar.a.getLayoutParams();
                marginLayoutParams.setMargins(Math.round(c.left - gx2), Math.round(c.top - gx), Math.round(c.right - gx2), Math.round(c.bottom - gx));
                dujaVar.a.setLayoutParams(marginLayoutParams);
            } catch (ClassCastException e) {
                throw new RuntimeException("HatsShowRequest.insertIntoParent can only be called with a ViewGroup whose LayoutParams extend MarginLayoutParams", e);
            }
        }
        this.n = true;
    }

    public final void b() {
        this.e.c("o");
        new dujx(this.f.h, dujy.a(this.c)).a(this.e);
    }

    public final void c(Button button) {
        duko.c(this.b.findViewById(R.id.hats_lib_prompt_buttons), button, R.dimen.hats_lib_button_accessibility_padding, R.dimen.hats_lib_button_accessibility_padding);
    }
}
