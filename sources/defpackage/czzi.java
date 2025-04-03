package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzi extends czyr implements ekhu, fbas, ekhq, ekkk, elar {
    private czzo ag;
    private Context ai;
    private final lkv aj = new lkv(this);
    private final ekxu ak = new ekxu(this);
    private boolean al;

    @Deprecated
    public czzi() {
        efbd.c();
    }

    public static czzi aY() {
        czzi czziVar = new czzi();
        fbae.e(czziVar);
        return czziVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czzo.class;
    }

    @Override // defpackage.efae, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return M;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.aj;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.efae, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.ak.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.ak.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.czyr
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ai == null) {
            this.ai = new ekkn(this, super.z());
        }
        return this.ai;
    }

    @Override // defpackage.efae, defpackage.ea
    public final void ae(Bundle bundle) {
        this.ak.k();
        try {
            super.ae(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.ak.f();
        try {
            super.af(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.czyr, defpackage.efae, defpackage.ea
    public final void ag(Activity activity) {
        this.ak.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.ea
    public final void ai() {
        elav b = this.ak.b();
        try {
            super.ai();
            H().g.f();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.ea
    public final void am() {
        this.ak.k();
        try {
            super.am();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.ea
    public final void ao() {
        elav b = this.ak.b();
        try {
            super.ao();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.ak.k();
        try {
            super.ap(view, bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekhu
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public final czzo H() {
        czzo czzoVar = this.ag;
        if (czzoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czzoVar;
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.ak.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.ak.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.ak.b = eldsVar;
    }

    @Override // defpackage.czyr, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof czzi)) {
                        throw new IllegalStateException(a.J(eaVar, czzo.class));
                    }
                    fbbf fbbfVar = ((akgt) aX).bh;
                    fbbf fbbfVar2 = ((akgt) aX).bi;
                    fbbf fbbfVar3 = ((akgt) aX).bj;
                    akis akisVar = ((akgt) aX).a;
                    czzo czzoVar = new czzo((czzi) eaVar, fbbfVar, fbbfVar2, fbbfVar3, akisVar.b.im, akisVar.he, akisVar.aJ);
                    this.ag = czzoVar;
                    czzoVar.p = this;
                    this.Z.c(new ekkg(this.ak, this.aj));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.ak;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.czyr, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.ak.k();
        try {
            LayoutInflater gI = super.gI(bundle);
            LayoutInflater cloneInContext = gI.cloneInContext(new ekkn(this, gI));
            ekyf.q();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.ak.k();
        try {
            super.h(bundle);
            czzo H = H();
            ((alse) H.e.b()).a(alrz.b, H.o.incrementAndGet());
            eg G = H.a.G();
            if (G instanceof czzn) {
                H.l = (czzn) G;
            } else if (G instanceof ekhu) {
                Object H2 = ((ekhu) G).H();
                if (H2 instanceof czzn) {
                    H.l = (czzn) H2;
                }
            }
            bcpt bcptVar = H.g;
            bcri bcriVar = (bcri) H.c.b();
            cgix cgixVar = cgix.HOME;
            ffbr ffbrVar = bcriVar.a;
            ffbr ffbrVar2 = bcriVar.b;
            azwc azwcVar = (azwc) bcriVar.c.b();
            azwcVar.getClass();
            G.getClass();
            cgixVar.getClass();
            bcptVar.c(new bcrh(ffbrVar, ffbrVar2, azwcVar, G, H, cgixVar, Optional.of(true), Optional.of(false)));
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        equr b;
        super.hf(bundle);
        final czzo H = H();
        eg G = H.a.G();
        View inflate = G.getLayoutInflater().inflate(R.layout.share_intent_conversation_list_view, (ViewGroup) null);
        H.j = (ListEmptyView) inflate.findViewById(R.id.no_conversations_view);
        H.j.c(R.drawable.ic_oobe_conv_list);
        czzl czzlVar = new czzl();
        bcrh bcrhVar = (bcrh) H.g.a();
        czzi czziVar = H.a;
        bcpt bcptVar = H.g;
        loo a = loo.a(czziVar);
        bcrh.a.m("init loader");
        bcrhVar.f = new Bundle();
        bcrhVar.f.putString("bindingId", bcptVar.b());
        bcrhVar.e = a;
        bcrhVar.e.c(1, bcrhVar.f, bcrhVar);
        czzh czzhVar = (czzh) H.d.b();
        ffbr ffbrVar = czzhVar.a;
        ekyo ekyoVar = (ekyo) czzhVar.b.b();
        ekyoVar.getClass();
        G.getClass();
        H.k = new czzg(ffbrVar, ekyoVar, G, H);
        H.k.B(true);
        H.i = (RecyclerView) inflate.findViewById(android.R.id.list);
        H.i.ap(czzlVar);
        H.i.aL();
        H.i.am(H.k);
        H.i.getViewTreeObserver().addOnGlobalLayoutListener(new elaz((elbx) H.f.b(), new czzm(H), "layout changed"));
        ehft ehftVar = new ehft(G);
        ehftVar.z(inflate);
        ehftVar.x(H.l.a());
        Bundle bundle2 = H.a.m;
        if (bundle2 == null || !bundle2.getBoolean("hide_conv_button_key")) {
            ehftVar.t(R.string.share_new_message, new DialogInterface.OnClickListener() { // from class: czzj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    czzo czzoVar = czzo.this;
                    czzoVar.m = true;
                    czzoVar.l.c();
                }
            });
        }
        if (bundle2 != null && (b = equr.b(bundle2.getInt("intent_source", 0))) != null) {
            H.n = b;
        }
        ehftVar.o(R.string.share_cancel, null);
        int dimensionPixelSize = G.getResources().getDimensionPixelSize(R.dimen.share_dialog_vertical_padding);
        ehftVar.b.top = dimensionPixelSize;
        ehftVar.b.bottom = dimensionPixelSize;
        iv create = ehftVar.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: czzk
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                czzo czzoVar = czzo.this;
                ((alse) czzoVar.e.b()).c(alrz.b, czzoVar.o.get());
            }
        });
        return create;
    }

    @Override // defpackage.efae, defpackage.dn
    public final void hw() {
        elav k = ekyf.k();
        try {
            super.hw();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void i() {
        elav b = this.ak.b();
        try {
            super.i();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void j() {
        elav a = this.ak.a();
        try {
            super.j();
            this.al = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.ak.k();
        try {
            super.k(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void l() {
        this.ak.k();
        try {
            super.l();
            elle.c(this);
            if (this.c) {
                elle.b(this);
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void m() {
        this.ak.k();
        try {
            super.m();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ak.g().close();
    }

    @Override // defpackage.efae, defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        eg G;
        elav i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            czzo H = H();
            if (!H.m && (G = H.a.G()) != null && !G.isChangingConfigurations()) {
                G.finish();
            }
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.czyr, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
