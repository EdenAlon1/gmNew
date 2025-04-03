package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbuw {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer");
    public final eisx b;
    public final dbud c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final Context g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr r;
    public dbtw t;
    private final ffbr u;
    public List s = new ArrayList();
    public final ejlr p = new dbus(this);
    public final ejlr q = new dbut(this);

    public dbuw(eisx eisxVar, dbud dbudVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13) {
        this.b = eisxVar;
        this.c = dbudVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = dbudVar.A();
        this.u = ffbrVar4;
        this.h = ffbrVar6;
        this.i = ffbrVar5;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
        this.o = ffbrVar13;
        this.r = ffbrVar12;
    }

    public final void a(View view, boolean z) {
        if (!crnx.j(this.g) || view == null) {
            return;
        }
        crnx.k(view, this.g.getResources().getString(true != z ? R.string.expandable_list_collapsed : R.string.expandable_list_expanded));
    }

    public final void b(List list) {
        ((ejlq) this.d.b()).i(new ejlp(((bzib) this.f.b()).b(list)), new ejlm(Integer.valueOf(list.size())), this.p);
    }

    public final void c() {
        this.c.fe().finish();
        ((akvg) this.u.b()).J(this.g, this.b);
    }

    public final void d(boolean z) {
        Button button = (Button) this.c.N().findViewById(R.id.switch_to_qr_button);
        if (z) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
    }

    public final void e() {
        final Snackbar r = Snackbar.r(this.c.fe().getWindow().getDecorView().getRootView(), this.c.Y(R.string.cannot_enable_gaia_error), -2);
        r.t(this.c.Y(R.string.dismiss_action_text), new View.OnClickListener() { // from class: dbuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.this.e();
            }
        });
        r.v(4);
        r.i();
    }
}
