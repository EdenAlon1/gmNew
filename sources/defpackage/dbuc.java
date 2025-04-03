package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbuc {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer");
    public final dbtz b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final AnonymousClass1 g;

    /* JADX WARN: Type inference failed for: r1v1, types: [dbuc$1] */
    public dbuc(dbtz dbtzVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = dbtzVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = new ejlr<Void, Void>() { // from class: dbuc.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ensk h = dbuc.a.h();
                h.Y(ente.a, "BugleGDitto");
                ((enrr) h.h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer$resetPrimaryDeviceCallback$1", "onSuccess", 104, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Reset primary device successfully");
                ((akzt) dbuc.this.f.b()).e("Bugle.Gaia.Pairing.Reset.Primary.Device.Count", 1);
                ellj.f(dbuz.a, dbuc.this.b);
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ensk j = dbuc.a.j();
                j.Y(ente.a, "BugleGDitto");
                ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingResetPrimaryFragmentPeer$resetPrimaryDeviceCallback$1", "onFailure", 115, "GaiaPairingResetPrimaryFragmentPeer.kt")).q("Failed to reset primary device");
                ((akzt) dbuc.this.f.b()).e("Bugle.Gaia.Pairing.Reset.Primary.Device.Count", 2);
                dbtz dbtzVar2 = dbuc.this.b;
                final Snackbar r = Snackbar.r(dbtzVar2.N(), dbtzVar2.Y(R.string.cannot_reset_primary_error), -2);
                final dbuc dbucVar = dbuc.this;
                r.t(dbucVar.b.Y(R.string.dismiss_action_text), new View.OnClickListener() { // from class: dbub
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Snackbar.this.e();
                        View view2 = dbucVar.b.Q;
                        Button button = view2 != null ? (Button) view2.findViewById(R.id.gaia_pairing_reset_primary_button) : null;
                        if (button != null) {
                            button.setEnabled(true);
                        }
                    }
                });
                r.v(2);
                r.i();
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }
}
