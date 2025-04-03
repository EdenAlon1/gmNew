package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxx {
    public static final cskc a = cskc.g("Bugle", "SwitcherDialogFragmentPeer");
    public volatile acmd b;
    public float[] c;
    public final acxt d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public View i;
    public View j;
    public ImageView k;
    public ImageView l;
    public LottieAnimationView m;
    private final ffbr n;
    private final ffbr o;

    public acxx(acxt acxtVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.d = acxtVar;
        this.e = ffbrVar2;
        this.n = ffbrVar;
        this.f = ffbrVar3;
        this.o = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
    }

    public static int d(acmd acmdVar) {
        int ordinal = acmdVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 1 : 2;
        }
        return 3;
    }

    private final void e(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(this.c);
        gradientDrawable.setColor(((Context) this.e.b()).getColor(R.color.switcher_option_background_color));
        view.setBackground(gradientDrawable);
    }

    private final void f(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(((Context) this.e.b()).getResources().getDimensionPixelSize(R.dimen.switcher_option_background_border), ((Context) this.e.b()).getColor(R.color.switcher_option_background_border));
        gradientDrawable.setCornerRadii(this.c);
        view.setBackground(gradientDrawable);
    }

    public final void a() {
        int ordinal = this.b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                e(this.i);
                f(this.j);
                this.l.setVisibility(8);
                this.k.setVisibility(0);
                return;
            }
            if (ordinal != 3) {
                return;
            }
        }
        e(this.j);
        f(this.i);
        this.l.setVisibility(0);
        this.k.setVisibility(8);
    }

    public final void b(acmd acmdVar) {
        this.b = acmdVar;
        csjb a2 = a.a();
        a2.A("selectedMode", this.b.toString());
        a2.r();
        a();
    }

    public final synchronized void c(acmd acmdVar) {
        if (!((Optional) this.o.b()).isPresent()) {
            a.r("SatelliteDataService is empty, cannot not setTabletMode");
            return;
        }
        csjb a2 = a.a();
        a2.A("Set tabletMode", this.b.toString());
        a2.r();
        ((acls) ((Optional) this.o.b()).get()).c(acmdVar).k(axnw.b(), (Executor) this.n.b());
    }
}
