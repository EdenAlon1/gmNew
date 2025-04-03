package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhw implements dbxo {
    final /* synthetic */ uhx a;

    public uhw(uhx uhxVar) {
        this.a = uhxVar;
    }

    @Override // defpackage.dbxo
    public final void b(cxqz cxqzVar) {
        this.a.i.f(cxqzVar);
    }

    @Override // defpackage.dbxo
    public final boolean l() {
        return false;
    }

    @Override // defpackage.dbxo
    public final void m(ContentGridView contentGridView) {
        uhx uhxVar = this.a;
        Compose2oFragment h = uhxVar.h();
        czgy g = uhxVar.g();
        this.a.i = this.a.c.a(h, Boolean.valueOf(g.bb()), g.E(), null, this.a.h, contentGridView, g, null, null, h.H()).a(eymn.CAMERA_GALLERY, -1);
        h.H().a(this.a.i);
        uhx uhxVar2 = this.a;
        uhxVar2.i.v(new uhv(uhxVar2));
    }

    @Override // defpackage.dbxo
    public final void a() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void c(Configuration configuration) {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void d(Bundle bundle) {
    }

    @Override // defpackage.dbxo
    public final /* synthetic */ void i(Bundle bundle) {
    }
}
