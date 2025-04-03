package defpackage;

import android.R;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrp implements egrf {
    public final fr a;
    public final eg b;
    public final dvxi c;
    private final egrj d;
    private final egre e;
    private final ffbr f;

    public egrp(eg egVar, egrj egrjVar, dvxi dvxiVar, egre egreVar, ffbr ffbrVar) {
        this.a = egVar.a();
        this.b = egVar;
        this.d = egrjVar;
        this.c = dvxiVar;
        this.e = egreVar;
        this.f = ffbrVar;
    }

    private final void p(egpx egpxVar) {
        if (!fdrm.t()) {
            this.d.b();
        }
        if (this.a.g(R.id.content) != null) {
            if (this.a.h("SuggestionTabsFragment") == null) {
                if (fdrm.t()) {
                    this.d.b();
                }
                q(egpy.a(egpxVar), "SuggestionTabsFragment");
                return;
            }
            return;
        }
        if (fdrm.t()) {
            this.d.b();
        }
        cg cgVar = new cg(this.a);
        cgVar.x(R.id.content, egpy.a(egpxVar), "SuggestionTabsFragment");
        cgVar.C();
        cgVar.c();
    }

    private final void q(ea eaVar, String str) {
        int b = this.a.b();
        cg cgVar = new cg(this.a);
        cgVar.x(R.id.content, eaVar, str);
        cgVar.C();
        cgVar.v(b == 0 ? "BASE_STATE" : null);
        cgVar.j();
        this.a.an();
    }

    @Override // defpackage.egrf
    public final void a() {
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
    }

    @Override // defpackage.egrf
    public final void b(ewiw ewiwVar) {
        if (this.a.h("ClusterPhotosFragment") == null) {
            q(egku.a(ewiwVar), "ClusterPhotosFragment");
        }
    }

    @Override // defpackage.egrf
    public final void c() {
        if (this.a.h("ClustersFragment") == null) {
            q(new egla(), "ClustersFragment");
        }
    }

    @Override // defpackage.egrf
    public final void d() {
        if (this.a.h("MeClusterPhotosFragment") == null) {
            q(new egnq(), "MeClusterPhotosFragment");
        }
    }

    @Override // defpackage.egrf
    public final void e() {
        if (this.a.h("SuggestedPhotosFragment") == null) {
            q((ea) this.f.b(), "SuggestedPhotosFragment");
        }
    }

    @Override // defpackage.egrf
    public final void f() {
        p(egpx.START_IN_ART_TAB);
    }

    @Override // defpackage.egrf
    public final void g() {
        p(egpx.START_IN_DEVICE_PHOTOS_TAB);
    }

    @Override // defpackage.egrf
    public final void h() {
        p(egpx.START_IN_GOOGLE_PHOTOS_TAB);
    }

    @Override // defpackage.egrf
    public final void i() {
        p(egpx.START_IN_MONOGRAM_TAB);
    }

    @Override // defpackage.egrf
    public final void j() {
        p(egpx.ONLY_SHOW_DEVICE_PHOTOS);
    }

    @Override // defpackage.egrf
    public final void k(ea eaVar) {
        this.b.gE().b(eaVar.Q(), new egro(this, eaVar));
    }

    @Override // defpackage.egrf
    public final void l() {
        this.b.onBackPressed();
    }

    @Override // defpackage.egrf
    public final void m(Uri uri) {
        this.e.a(uri);
    }

    @Override // defpackage.egrf
    public final void n() {
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
    }

    @Override // defpackage.egrf
    public final void o() {
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
    }
}
