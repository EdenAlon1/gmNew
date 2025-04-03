package defpackage;

import android.R;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrh implements egrf {
    public final fr a;
    public final eg b;
    public final dvxi c;
    private final egrj d;
    private final egre e;
    private final ffbr f;
    private final ffbr g;

    public egrh(eg egVar, egrj egrjVar, dvxi dvxiVar, egre egreVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = egVar.a();
        this.b = egVar;
        this.d = egrjVar;
        this.c = dvxiVar;
        this.e = egreVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
    }

    private final void p(egpx egpxVar) {
        this.d.b();
        if (this.a.h("SuggestionTabsFragment") == null) {
            q(egpy.a(egpxVar), "SuggestionTabsFragment");
        }
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
        this.d.a();
        this.a.as("BASE_STATE");
        n();
        o();
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
            q((ea) this.g.b(), "SuggestedPhotosFragment");
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
        this.b.gE().b(eaVar.Q(), new egrg(this, eaVar));
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
        if (this.a.g(R.id.content) == null) {
            cg cgVar = new cg(this.a);
            cgVar.x(R.id.content, (ea) this.f.b(), "PreviewFragment");
            cgVar.C();
            cgVar.c();
        }
    }

    @Override // defpackage.egrf
    public final void o() {
        new egpf().t(this.a, "UpdateFragment");
    }
}
