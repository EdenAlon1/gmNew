package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cwps extends cwqf {
    private static final cskc sq = cskc.g("Bugle", "BaseBugleActivity");
    private long o;
    private boolean p;
    public cqoh t;
    public cwqc u;
    public ffbr v;
    public bcqg w;
    public crjx x;
    public ffbr y;
    public ffbr z;

    protected boolean I() {
        return false;
    }

    protected void L() {
        ecqk.a.d(ecda.b(getClass()));
    }

    protected abstract cwml eY();

    protected BooleanSupplier fa() {
        return new BooleanSupplier() { // from class: cwpr
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                cwps cwpsVar = cwps.this;
                return cwpsVar.u.e(cwpsVar);
            }
        };
    }

    @Override // defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean asBoolean;
        super.onCreate(bundle);
        if (((audf) this.z.b()).a()) {
            ((cwmk) this.y.b()).a(this, eY());
        }
        L();
        asBoolean = fa().getAsBoolean();
        if (asBoolean) {
            sq.p("Redirecting to default SMS/permission check activity");
        }
        if (bundle != null && bundle.getBoolean("PrevDarkModeStateKey", this.x.g()) != this.x.g()) {
            this.w.a();
        }
        this.p = this.x.g();
    }

    @Override // defpackage.efac, defpackage.eg, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.u.a(this.t.f().toEpochMilli() - this.o);
    }

    @Override // defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((ctuk) this.v.b()).l(i);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        cwqc cwqcVar = this.u;
        if (I()) {
            ((carb) cwqcVar.e.b()).b();
        }
    }

    @Override // defpackage.efac, defpackage.eg, android.app.Activity
    protected void onResume() {
        boolean asBoolean;
        super.onResume();
        asBoolean = fa().getAsBoolean();
        if (asBoolean) {
            sq.p("Redirecting to default SMS/permission check activity");
        }
        final cwqc cwqcVar = this.u;
        efbd.c();
        axos.a(new Runnable() { // from class: cwpy
            @Override // java.lang.Runnable
            public final void run() {
                cwqc cwqcVar2 = cwqc.this;
                csvs.c(((algm) cwqcVar2.d.b()).f(cwqcVar2.b.f().toEpochMilli()), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
            }
        }, cwqcVar.c);
        if (!ctid.i(this)) {
            ehft ehftVar = new ehft(this);
            ehftVar.m(R.string.sms_disallowed_message);
            ehftVar.j(false);
            ehftVar.o(R.string.sms_disallowed_close_button, new DialogInterface.OnClickListener() { // from class: cwqa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    System.exit(0);
                }
            });
            ehftVar.a();
        } else if (!I()) {
            ((carb) cwqcVar.e.b()).b();
        }
        this.o = this.t.f().toEpochMilli();
    }

    @Override // defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("PrevDarkModeStateKey", this.p);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
