package defpackage;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwqd extends cwqj {
    public Toolbar G;
    public ffbr H;
    public ffbr I;
    public eg J;

    private final void D(int i, int i2, int i3) {
        eZ().y(ColorStateList.valueOf(i));
        eZ().f().setTint(i2);
        getWindow().setStatusBarColor(i3);
    }

    @Override // defpackage.cwpv
    public final void X() {
        if (ad()) {
            D(crlu.a(this, R.attr.colorControlNormal), ehdr.d(this, com.google.android.apps.messaging.R.attr.colorOnActionBar, "BugleToolbarActivity"), getColor(com.google.android.apps.messaging.R.color.color_primary_background_alpha96));
        }
        super.X();
    }

    @Override // defpackage.cwpv
    public final void Y(Exception exc) {
        csjy.h("Bugle", exc, "Bad custom theme detected");
        setTheme(com.google.android.apps.messaging.R.style.FallbackAppCompatToolbarTheme);
        if (this.r) {
            cwqc.b(this);
        }
        this.s = true;
    }

    @Override // defpackage.cwpv
    public final void ab(ActionMode.Callback callback, View view, String str) {
        if (ad()) {
            int d = ehdr.d(this, com.google.android.apps.messaging.R.attr.colorPrimaryBrandIcon, "BugleToolbarActivity");
            D(d, d, ehdr.d(this, com.google.android.apps.messaging.R.attr.colorPrimaryBackground, "BugleToolbarActivity"));
        }
        super.ab(callback, view, str);
    }

    @Override // defpackage.cwpv, defpackage.cwps
    public cwml eY() {
        return cwml.o;
    }

    protected Toolbar eZ() {
        View findViewById = findViewById(com.google.android.apps.messaging.R.id.toolbar);
        if (findViewById != null) {
            try {
                return (Toolbar) findViewById;
            } catch (ClassCastException unused) {
                csix.c(String.valueOf(String.valueOf(getClass())).concat(" has a toolbar layout element that is not of type Toolbar"));
                return null;
            }
        }
        Toolbar toolbar = this.G;
        if (toolbar != null) {
            return toolbar;
        }
        return null;
    }

    @Override // defpackage.iy
    public void n(Toolbar toolbar) {
        super.n(toolbar);
        this.G = toolbar;
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = this.J.getIntent();
        if (intent == null || !intent.getBooleanExtra("via_report_issue_notification", false)) {
            return;
        }
        ((alsi) this.I.b()).a(((cnmx) this.H.b()).f(intent, "report_issue_event_key", 4));
    }

    @Override // defpackage.cwpv, defpackage.iy, defpackage.abe, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        Toolbar eZ = eZ();
        this.G = eZ;
        n(eZ);
    }
}
