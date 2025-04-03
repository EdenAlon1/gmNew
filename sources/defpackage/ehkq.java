package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkq extends FrameLayout implements ehkk {
    public final TextView a;
    boolean b;
    public ColorStateList c;
    private og d;

    public ehkq(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    @Override // defpackage.or
    public final og a() {
        return this.d;
    }

    public final void b() {
        og ogVar = this.d;
        if (ogVar != null) {
            int i = 8;
            if (ogVar.isVisible() && !this.b) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    @Override // defpackage.ehkk
    public final void c() {
        b();
    }

    @Override // defpackage.or
    public final boolean e() {
        return false;
    }

    @Override // defpackage.or
    public final void f(og ogVar) {
        this.d = ogVar;
        ogVar.setCheckable(false);
        this.a.setText(ogVar.e);
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
