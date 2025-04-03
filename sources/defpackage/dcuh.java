package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcuh implements ellh {
    final /* synthetic */ dcty a;

    public dcuh(dcty dctyVar) {
        this.a = dctyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        int i = true != ((dcvv) ellfVar).a ? 2 : 3;
        dcty dctyVar = this.a;
        dctyVar.A(i);
        if (dctyVar.t != null) {
            cg cgVar = new cg(dctyVar.H.I());
            cgVar.n(dctyVar.t);
            cgVar.c();
            dctyVar.t = null;
        }
        if (dctyVar.Q) {
            ellj.g(dctyVar.s.d(), dctyVar.H.Q);
            return elli.a;
        }
        if (dctyVar.E != null) {
            ((MediaViewPager) dctyVar.D.b()).v(true);
        }
        if (le.n(dctyVar.N.h())) {
            ea eaVar = dctyVar.O;
            if (eaVar instanceof dcso) {
                dcsz H = ((dcso) eaVar).H();
                if (H.g()) {
                    H.d.e(0, 0, 0, 0);
                    H.d.d(0);
                    H.d.c();
                }
            }
        }
        dctyVar.C.setVisibility(true != dctyVar.aa ? 0 : 8);
        dctyVar.c().setVisibility(0);
        dctyVar.c.h(dctyVar);
        dctyVar.H.Q.setSystemUiVisibility(0);
        dctyVar.t(dctyVar.o);
        if (dctyVar.aa) {
            dctyVar.G.setVisibility(dctyVar.o == null ? 8 : 0);
        } else {
            dctyVar.y.setVisibility(dctyVar.o == null ? 8 : 0);
        }
        dctyVar.u(dctyVar.p);
        return elli.a;
    }
}
