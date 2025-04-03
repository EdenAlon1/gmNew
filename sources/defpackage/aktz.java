package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aktz extends akug {
    public ffbr n;

    protected int C() {
        return R.layout.base_toolbar_settings_activity_gm3;
    }

    protected abstract Integer G();

    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps
    public cwml eY() {
        return cwml.n;
    }

    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        boolean a = ((auxx) this.n.b()).a();
        if (a) {
            abh.a(this);
        }
        setContentView(C());
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        if (!a) {
            getWindow().setStatusBarColor(0);
            viewGroup.setSystemUiVisibility(1792);
        }
        viewGroup.setOnApplyWindowInsetsListener(new ddxu(new ddxt() { // from class: aktw
            @Override // defpackage.ddxt
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
            }
        }));
        im k = k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.t(new View.OnClickListener() { // from class: aktx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aktz.this.gE().d();
                }
            });
        }
        Integer G = G();
        if (G == null) {
            if (!ahpj.a(this, false) || (findViewById = viewGroup.findViewById(R.id.fragment_container)) == null) {
                return;
            }
            ddzb.p(this, findViewById);
            return;
        }
        View findViewById2 = findViewById(G.intValue());
        findViewById2.setOnApplyWindowInsetsListener(new ddxu(new ddxt() { // from class: akty
            @Override // defpackage.ddxt
            public final void a(View view, WindowInsets windowInsets) {
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
            }
        }));
        if (ahpj.a(this, false)) {
            ddzb.p(this, findViewById2);
        }
    }
}
