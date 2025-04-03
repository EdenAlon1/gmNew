package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmd extends ddme implements eivv {
    final cskc a = cskc.g("Bugle", "ZeroStateSearchActivityPeer");
    public final ZeroStateSearchActivity b;
    public final ddny c;
    public final dede d;
    public final coke e;
    public final ddqu f;
    public final tam g;
    public final eito h;
    public final ffbr i;
    public abo j;
    private final adio l;

    public ddmd(ZeroStateSearchActivity zeroStateSearchActivity, ddny ddnyVar, dede dedeVar, coke cokeVar, ddqu ddquVar, tam tamVar, eito eitoVar, adio adioVar, ffbr ffbrVar) {
        this.b = zeroStateSearchActivity;
        this.c = ddnyVar;
        this.d = dedeVar;
        this.e = cokeVar;
        this.f = ddquVar;
        this.g = tamVar;
        this.l = adioVar;
        this.h = eitoVar;
        this.i = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        this.a.m("onAccountChanged called");
        eisx a = eivtVar.a();
        ddmw ddmwVar = new ddmw();
        fbae.e(ddmwVar);
        ekky.b(ddmwVar, a);
        this.a.m("Replacing account fragment");
        if (this.f.e().a() != null) {
            List list = (List) this.f.e().a();
            list.getClass();
            list.clear();
        }
        Bundle bundle = ddmwVar.m;
        Bundle extras = this.b.getIntent().getExtras();
        if (bundle == null || extras == null) {
            bundle = extras;
        } else {
            bundle.putAll(extras);
        }
        ddmwVar.at(bundle);
        cg cgVar = new cg(this.b.a());
        cgVar.x(R.id.zero_state_fragment_container, ddmwVar, "ZeroStateSearchFragmentPeer");
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        this.l.a(eiupVar);
    }

    public final void e() {
        ea h = this.b.a().h("ZeroStateSearchFragmentPeer");
        if (h != null) {
            ddnj H = ((ddmw) h).H();
            if (H.b.aF()) {
                if (H.z.g() || H.z.g()) {
                    return;
                }
                ddpl ddplVar = H.g;
                aler alerVar = ddplVar.f;
                if (alerVar != null) {
                    alerVar.a();
                    ddplVar.f = null;
                }
            }
        }
        this.j.h(false);
        this.b.gE().d();
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
