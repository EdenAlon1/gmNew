package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.SwitchImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcps {
    public boolean a = false;
    public boolean b;
    private SwitchImageView c;
    private final dcma d;

    public dcps(dcma dcmaVar) {
        this.d = dcmaVar;
    }

    static final int e(boolean z) {
        return z ? R.string.camera_flash_on : R.string.camera_flash_off;
    }

    static final int f(boolean z) {
        return z ? R.drawable.ic_flash_on_shadow : R.drawable.ic_flash_off_shadow;
    }

    public final void a(SwitchImageView switchImageView, boolean z) {
        this.c = switchImageView;
        this.b = z;
        switchImageView.b(f(true), new View.OnClickListener() { // from class: dcpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcps.this.b();
            }
        }, switchImageView.getContext().getString(e(true)));
        this.c.b(f(false), new View.OnClickListener() { // from class: dcpr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcps.this.b();
            }
        }, switchImageView.getContext().getString(e(false)));
        d();
    }

    public final void b() {
        boolean z = !this.a;
        this.d.a.m(z);
        this.a = z;
        c();
    }

    public final void c() {
        d();
        this.c.c(f(this.a));
    }

    public final void d() {
        this.c.d(f(this.a), true != this.b ? 0 : 4);
    }
}
