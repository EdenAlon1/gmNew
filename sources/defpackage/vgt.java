package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.reactions.ui.selection.ReactionSelectionDialogRecyclerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgt extends vga implements ekhu, fbas, ekhq, ekkk, elar {
    private vhe ai;
    private Context aj;
    private boolean al;
    private boolean am;
    public final lkv ag = new lkv(this);
    private final ekxu ak = new ekxu(this);

    @Deprecated
    public vgt() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return vhe.class;
    }

    @Override // defpackage.efae, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final vhe H = H();
            if (H.g.b()) {
                ensz a = vhe.a.a(H.g.a());
                a.Y(cmsm.d, H.m.b());
                a.Y(cmsm.f, H.n);
                ((ensz) a.h("com/google/android/apps/messaging/conversation/reactions/ui/selection/ReactionsSelectionDialogFragmentPeer", "onCreateView", BasePaymentResult.ERROR_REQUEST_FAILED, "ReactionsSelectionDialogFragmentPeer.java")).q("Initializing reactions selection dialog.");
            }
            H.f.d();
            H.u = layoutInflater.inflate(R.layout.scrollable_reactions_selection_dialog_fragment_with_add_reactions_button, (ViewGroup) null);
            View findViewById = H.u.findViewById(R.id.panel);
            if (H.c.g()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(findViewById.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_corner_radius));
                gradientDrawable.setColor(findViewById.getContext().getColor(R.color.reactions_selection_bar_background));
                int dimensionPixelSize = findViewById.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_background_padding);
                findViewById.setBackground(new InsetDrawable((Drawable) gradientDrawable, dimensionPixelSize, findViewById.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_background_padding_top), dimensionPixelSize, findViewById.getResources().getDimensionPixelSize(R.dimen.reactions_selection_bar_dialog_background_padding_bottom)));
            } else {
                findViewById.setBackground(findViewById.getContext().getDrawable(R.drawable.reactions));
            }
            final ReactionSelectionDialogRecyclerView reactionSelectionDialogRecyclerView = (ReactionSelectionDialogRecyclerView) H.u.findViewById(R.id.reactions_selection_dialog_recycler_view);
            vgf H2 = reactionSelectionDialogRecyclerView.H();
            Optional optional = H.l;
            MessageIdType messageIdType = H.m;
            String str = H.n;
            H2.h = optional;
            H2.i = messageIdType;
            H2.j = str;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(1, 0);
            vgc vgcVar = new vgc(H2, optional);
            H2.c.ap(gridLayoutManager);
            H2.c.am(vgcVar);
            H.u.findViewById(R.id.add_reactions_button).setOnClickListener(new elay(H.j, "ReactionsSelectionDialogFragmentPeer#initializeAddReactionsButton", new View.OnClickListener() { // from class: vhb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final vhe vheVar = vhe.this;
                    vhp a2 = vij.a(vheVar.l, Optional.ofNullable(vheVar.m.b()));
                    a2.t(vheVar.d.I(), "CustomReactionSelectionDialogFragment");
                    a2.H().i = new ffjm() { // from class: vhc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            vhe.this.b((cmrl) obj, (cmrm) obj2, eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER);
                            return ffcu.a;
                        }
                    };
                }
            }));
            H.a();
            H.u.setOnTouchListener(new View.OnTouchListener() { // from class: vgx
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    entd entdVar = vhe.a;
                    vgf H3 = ReactionSelectionDialogRecyclerView.this.H();
                    for (int i = 0; i < H3.c.getChildCount(); i++) {
                        ReactionSelectionDialogRecyclerView reactionSelectionDialogRecyclerView2 = H3.c;
                        vge vgeVar = (vge) reactionSelectionDialogRecyclerView2.k(reactionSelectionDialogRecyclerView2.getChildAt(i));
                        vgeVar.w.b.b(vgeVar.v);
                    }
                    return false;
                }
            });
            View view = H.u;
            this.al = false;
            ekyf.q();
            return view;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.ag;
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

    @Override // defpackage.vga
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhu
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final vhe H() {
        vhe vheVar = this.ai;
        if (vheVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.am) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vheVar;
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.aj == null) {
            this.aj = new ekkn(this, super.z());
        }
        return this.aj;
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

    @Override // defpackage.vga, defpackage.efae, defpackage.ea
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
            H().c();
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
            H().u.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
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
            if (!this.c && !this.al) {
                ellg.b(this).b = view;
                H();
                vhg.a(this, H());
            }
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

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
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

    @Override // defpackage.vga, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.am) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ai == null) {
                try {
                    Object aX = aX();
                    Context context2 = (Context) ((akgt) aX).a.q.b();
                    crjx crjxVar = (crjx) ((akgt) aX).a.a.r.b();
                    Activity activity = (Activity) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof vgt)) {
                        throw new IllegalStateException(a.J(eaVar, vhe.class));
                    }
                    vgt vgtVar = (vgt) eaVar;
                    vfs a = ((akgt) aX).b.a();
                    vhn vhnVar = new vhn(((akgt) aX).a.bC(), (errl) ((akgt) aX).a.t.b(), (bcsf) ((akgt) aX).a.a.vK.b(), (bcsq) ((akgt) aX).a.a.rq.b(), (bcsy) ((akgt) aX).a.a.vL.b(), (atky) ((akgt) aX).a.a.rs.b());
                    cmqt cmqtVar = (cmqt) ((akgt) aX).a.b.ih.b();
                    cmsl cmslVar = (cmsl) ((akgt) aX).a.lY.b();
                    ddwu ddwuVar = (ddwu) ((akgt) aX).a.b.oK.b();
                    bdtd bdtdVar = (bdtd) ((akgt) aX).a.a.aO.b();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    ddzb ddzbVar = (ddzb) ((akgt) aX).a.a.nk.b();
                    cuxh cuxhVar = (cuxh) ((akgt) aX).a.a.ae.b();
                    tam tamVar = (tam) ((akgt) aX).c.m.b();
                    Bundle a2 = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a2.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    vgv vgvVar = (vgv) ProtoParsers.f(a2, "TIKTOK_FRAGMENT_ARGUMENT", vgv.a, eyfcVar);
                    vgvVar.getClass();
                    this.ai = new vhe(context2, crjxVar, activity, vgtVar, a, vhnVar, cmqtVar, cmslVar, ddwuVar, bdtdVar, ejwlVar, ejlqVar, elbxVar, ddzbVar, cuxhVar, tamVar, vgvVar, ((akgt) aX).g());
                    this.Z.c(new ekkg(this.ak, this.ag));
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

    @Override // defpackage.vga, defpackage.dn, defpackage.ea
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

    @Override // defpackage.efae, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.ak.k();
        try {
            super.h(bundle);
            vhe H = H();
            H.i.k(H.k);
            H.d.q(1, R.style.UnsizedDialog);
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
            this.am = true;
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
        Window window;
        this.ak.k();
        try {
            super.l();
            vhe H = H();
            H.d();
            final Dialog dialog = H.d.d;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setFlags(262144, 262144);
                window.setFlags(32, 32);
                window.setFlags(131072, 131072);
                window.clearFlags(2);
                window.setGravity(51);
                window.getDecorView().setBackgroundColor(0);
                dialog.setCanceledOnTouchOutside(true);
                window.getDecorView().getRootView().setOnTouchListener(new View.OnTouchListener() { // from class: vgy
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        entd entdVar = vhe.a;
                        dialog.dismiss();
                        return false;
                    }
                });
            }
            elle.c(this);
            if (this.c) {
                if (!this.al) {
                    ellg.b(this).b = elle.a(this);
                    H();
                    vhg.a(this, H());
                    this.al = true;
                }
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

    @Override // defpackage.efae, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vhe H = H();
        vgf H2 = ((ReactionSelectionDialogRecyclerView) H.u.findViewById(R.id.reactions_selection_dialog_recycler_view)).H();
        ViewGroup.LayoutParams layoutParams = H2.c.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = H2.g.getResources().getDimensionPixelSize(R.dimen.scrollable_reactions_selection_bar_recycler_view_width);
        H2.c.setLayoutParams(layoutParams);
        H.d();
        H.a();
    }

    @Override // defpackage.efae, defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            vhe H = H();
            if (H.g.b()) {
                ensz a = vhe.a.a(H.g.a());
                a.Y(cmsm.d, H.m.b());
                a.Y(cmsm.f, H.n);
                ((ensz) a.h("com/google/android/apps/messaging/conversation/reactions/ui/selection/ReactionsSelectionDialogFragmentPeer", "onDismiss", 321, "ReactionsSelectionDialogFragmentPeer.java")).q("Reactions selection dialog was dismissed.");
            }
            H.f.b();
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

    @Override // defpackage.vga, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
