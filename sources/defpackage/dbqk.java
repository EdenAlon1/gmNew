package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqk extends dbqn implements dbsk {
    public static final cskc a = cskc.g("Bugle", "DittoActivity");
    private static final cfup r = cfvl.h(cfvl.b, "bugle_help_and_feedback_multi_device_context", "Messenger_multi_device");
    public View c;
    public abo d;
    public final DittoActivity e;
    public final ffbr f;
    public final fazb g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final boolean k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    private final ffbr s;
    public int b = 0;
    public Optional p = Optional.empty();

    public dbqk(DittoActivity dittoActivity, ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.e = dittoActivity;
        this.f = ffbrVar;
        this.g = fazbVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.s = ffbrVar5;
        this.k = ((cssv) ffbrVar6.b()).a();
        this.l = ffbrVar7;
        this.m = ffbrVar10;
        this.n = ffbrVar12;
        this.o = ffbrVar11;
        ((asmo) ffbrVar11.b()).a();
        if (adhu.b()) {
            eito eitoVar = (eito) ffbrVar8.b();
            eiwy e = eiwz.e(dittoActivity);
            e.d(ejgc.class);
            e.d(ejed.class);
            eitoVar.g(e.a());
            eitoVar.e(new ejgb((ejgc) ffbrVar9.b()));
            eitoVar.e(new dbqj(this));
        }
    }

    private final void e(String str, ea eaVar) {
        cg cgVar = new cg(this.e.a());
        cgVar.x(R.id.fragment_container, eaVar, str);
        cgVar.c();
    }

    public final void a() {
        ((adtc) this.s.b()).e(this.e, (String) r.e());
    }

    public final void b(Optional optional) {
        if (this.b == 2) {
            d();
        } else {
            c(optional);
        }
    }

    public final void c(Optional optional) {
        ea h = this.e.a().h("qr_welcome");
        if (h == null) {
            if (adhu.b() && optional.isPresent()) {
                Object obj = optional.get();
                h = new dbqf();
                fbae.e(h);
                ekky.b(h, (eisx) obj);
            } else {
                h = new dbqr();
                fbae.e(h);
            }
        }
        e("qr_welcome", h);
        this.b = 1;
    }

    final void d() {
        dbsa dbsaVar = (dbsa) this.e.a().h("qr_scanner");
        this.c.setVisibility(0);
        if (dbsaVar == null) {
            dbsaVar = new dbsa();
        }
        e("qr_scanner", dbsaVar);
        dbsaVar.H().m = this;
        this.b = 2;
    }
}
