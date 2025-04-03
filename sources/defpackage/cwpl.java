package defpackage;

import android.app.Activity;
import android.os.UserManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpl extends cwpm {
    public TextView a;
    public TextView b;
    public final cpdr c;
    public final cnjw d;
    public final UserManager e;
    public final Activity f;
    public final cesz g;
    private final ctud i;
    private final ffbr j;
    private final ayfg k;
    private final cwqc l;

    public cwpl(cpdr cpdrVar, ctud ctudVar, ffbr ffbrVar, ayfg ayfgVar, cnjw cnjwVar, cwqc cwqcVar, UserManager userManager, PermissionCheckActivity permissionCheckActivity, cesz ceszVar) {
        this.c = cpdrVar;
        this.i = ctudVar;
        this.j = ffbrVar;
        this.k = ayfgVar;
        this.d = cnjwVar;
        this.l = cwqcVar;
        this.e = userManager;
        this.f = permissionCheckActivity;
        this.g = ceszVar;
    }

    public final void a() {
        if (this.f.isFinishing()) {
            return;
        }
        this.k.g(this.f);
        this.f.finish();
        this.f.setTitle("");
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        ((TextView) this.f.findViewById(R.id.enable_permission_title)).setText(R.string.required_permissions_no_promptable_title);
        ((TextView) this.f.findViewById(R.id.enable_permission_procedure)).setText(R.string.required_permissions_no_promptable_promo);
    }

    public final void c() {
        if (this.i.k()) {
            a();
        } else {
            ((ctuk) this.j.b()).g(new cwpk(this));
        }
    }

    public final boolean d() {
        if (this.l.f()) {
            return false;
        }
        a();
        return true;
    }
}
