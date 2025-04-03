package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adme {
    public static final cskc a = cskc.g("BugleGaia", "BugleExpressSignInFragmentPeer");
    public final eg b;
    public final adlt c;
    public final ejwl d;
    public final ejlq e;
    public final elbx f;
    public final eiyk g;
    public final eixo h;
    public final eixk i;
    public final elgr j;
    public final ebrs k;
    public final ebrt l;
    public final ejlr m = new adly(this);
    public final ejlr n = new adlz(this);
    public final ejwd o = new admc(this);
    public final ffbr p;
    public eisx q;
    private final eiyh r;

    public adme(Context context, eg egVar, adlt adltVar, ejwl ejwlVar, final ejlq ejlqVar, elbx elbxVar, eiyk eiykVar, eiyh eiyhVar, eixo eixoVar, eixk eixkVar, ebwq ebwqVar, final eizh eizhVar, elgr elgrVar, dwch dwchVar, errl errlVar, ffbr ffbrVar) {
        this.b = egVar;
        this.c = adltVar;
        this.d = ejwlVar;
        this.e = ejlqVar;
        this.f = elbxVar;
        this.g = eiykVar;
        this.r = eiyhVar;
        this.h = eixoVar;
        this.i = eixkVar;
        this.j = elgrVar;
        this.p = ffbrVar;
        ebrr j = ebrs.j(context);
        ebpg ebpgVar = new ebpg();
        ebpgVar.a = new ejhi(emxc.j("google"));
        ebpgVar.b = new adlw(context, ebwqVar);
        ebpgVar.d = new elay(elbxVar, "Click Add Accounts in TikTok Express SignIn", new View.OnClickListener() { // from class: adlx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eizh eizhVar2 = eizhVar;
                if (eizhVar2.b("google")) {
                    ejlqVar.g(new ejlp(eizhVar2.a("google")), adme.this.n);
                }
            }
        });
        ((ebpk) j).b = ebpgVar.c();
        j.g(errlVar);
        j.k(dwchVar);
        ebrs m = j.m();
        this.k = m;
        this.l = new ebrt(m);
    }

    public final void a() {
        ejjz.c(this.r.a(), "Failed account invalidation.", new Object[0]);
    }
}
