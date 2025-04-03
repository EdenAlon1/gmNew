package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkc extends FrameLayout implements ehkk {
    public ehkc(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_divider, (ViewGroup) this, true);
        b();
    }

    @Override // defpackage.or
    public final og a() {
        return null;
    }

    public final void b() {
        setVisibility(8);
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
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
