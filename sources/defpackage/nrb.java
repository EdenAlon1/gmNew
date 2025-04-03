package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrb implements npd {
    public final Context a;
    public final nql b;
    public final ExoPlayer c;
    public int d;
    private final npk e;

    public nrb(final Context context, nql nqlVar, final mtk mtkVar, npm npmVar, int i, Looper looper, npc npcVar, ltn ltnVar, nqx nqxVar) {
        this.a = context;
        this.b = nqlVar;
        npk npkVar = new npk(npmVar);
        this.e = npkVar;
        mws mwsVar = nqxVar.a;
        final mxd mxdVar = new mxd(context);
        mxdVar.j(mwsVar);
        mee meeVar = new mee();
        meeVar.b(50000, 50000, 100, BasePaymentResult.ERROR_REQUEST_FAILED);
        meg a = meeVar.a();
        boolean z = nqlVar.b;
        boolean z2 = nqlVar.c;
        boolean z3 = nqlVar.d;
        final nra nraVar = new nra(z, npkVar, i, npcVar);
        mex mexVar = new mex(context, new emyl() { // from class: mep
            @Override // defpackage.emyl
            public final Object get() {
                return mim.this;
            }
        }, new emyl() { // from class: meq
            @Override // defpackage.emyl
            public final Object get() {
                return new msy(context, new ncj());
            }
        });
        lti.c(!mexVar.u);
        mexVar.d = new emyl() { // from class: mew
            @Override // defpackage.emyl
            public final Object get() {
                return mtk.this;
            }
        };
        lti.c(!mexVar.u);
        mexVar.e = new emyl() { // from class: mev
            @Override // defpackage.emyl
            public final Object get() {
                return mxl.this;
            }
        };
        mexVar.b(a);
        lti.c(!mexVar.u);
        lti.f(looper);
        mexVar.i = looper;
        lti.c(!mexVar.u);
        mexVar.t = false;
        lti.c(!mexVar.u);
        if (ltnVar != ltn.a) {
            lti.c(!mexVar.u);
            mexVar.b = ltnVar;
        }
        ExoPlayer a2 = mexVar.a();
        this.c = a2;
        a2.N(new nqz(this, npcVar));
        this.d = 0;
    }

    @Override // defpackage.npd
    public final int e(nrz nrzVar) {
        if (this.d == 2) {
            ExoPlayer exoPlayer = this.c;
            nrzVar.a = Math.min((int) ((exoPlayer.z() * 100) / exoPlayer.A()), 99);
        }
        return this.d;
    }

    @Override // defpackage.npd
    public final enhk f() {
        enhd enhdVar = new enhd();
        String str = this.e.b;
        if (str != null) {
            enhdVar.k(1, str);
        }
        String str2 = this.e.c;
        if (str2 != null) {
            enhdVar.k(2, str2);
        }
        return enhdVar.c();
    }

    @Override // defpackage.npd
    public final void g() {
        this.c.ae();
        this.d = 0;
    }

    @Override // defpackage.npd
    public final void h() {
        engw r = engw.r(this.b.a);
        mgl mglVar = (mgl) this.c;
        mglVar.au();
        List ak = mglVar.ak(r);
        mglVar.au();
        mglVar.ao(ak, -1, -9223372036854775807L, true);
        this.c.Q();
        this.d = 1;
    }
}
