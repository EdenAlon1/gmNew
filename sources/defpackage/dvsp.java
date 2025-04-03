package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsp extends ea implements dwma {
    private static final entd ag = entd.c("GnpSdk");
    public dvsn a = null;
    private boolean ah;
    public dvso b;
    public dvsu c;
    public boolean d;
    public dvqr e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_feature_highlight_fragment, viewGroup);
    }

    public final void a() {
        fr frVar;
        if (G() == null || G().isFinishing() || !aF() || this.s || (frVar = this.B) == null) {
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.n(this);
        cgVar.k();
    }

    @Override // defpackage.dwma
    public final dwlz b() {
        dvsn dvsnVar = this.a;
        if (dvsnVar != null) {
            return dvsnVar.d;
        }
        return null;
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((dvbo) ((ffbr) eajj.a(context).fM().get(dvsp.class)).b()).a(this);
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) ag.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightFragment", "onAttach", 'r', "FeatureHighlightFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("showing")) {
            z = true;
        }
        this.ah = z;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("showing", this.ah);
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x026b, code lost:
    
        if (r9.equals(r12) != false) goto L146;
     */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvsp.l():void");
    }
}
