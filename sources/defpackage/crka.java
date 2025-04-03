package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crka extends crjz implements ekhu, fbas, ekhq, ekkk, elar {
    private crkh ag;
    private Context ah;
    private final lkv ai = new lkv(this);
    private final ekxu aj = new ekxu(this);
    private boolean ak;

    @Deprecated
    public crka() {
        efbd.c();
    }

    public static crka aY(ezxf ezxfVar) {
        crka crkaVar = new crka();
        fbae.e(crkaVar);
        ekku.a(crkaVar, ezxfVar);
        return crkaVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return crkh.class;
    }

    @Override // defpackage.efam, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            crkh H = H();
            final View inflate = layoutInflater.inflate(R.layout.message_failure_options_bottom_modal_fragment, viewGroup, false);
            if (ezxe.SENT_OPTIONS.equals(H.d)) {
                if (!H.l()) {
                    H.j(inflate);
                } else if (byyr.d(H.g)) {
                    crkh.f(inflate, inflate.getResources().getString(R.string.group_recipient_offline_description));
                } else if (!H.f) {
                    crkh.f(inflate, inflate.getResources().getString(R.string.recipient_offline_description_v2, H.c));
                }
                H.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
                if (H.k() && H.f) {
                    H.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
                }
            } else if (ezxe.SENDING_OPTIONS.equals(H.d)) {
                if (H.m()) {
                    bzyb bzybVar = H.q;
                    String string = inflate.getResources().getString(R.string.still_sending_v2);
                    if (H.e && bzwd.f()) {
                        string = bzybVar.a.getString(R.string.still_sending_e2ee_v2);
                    }
                    crkh.f(inflate, string);
                } else {
                    H.e(inflate);
                }
                H.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
                H.b(inflate, inflate.getResources().getString(R.string.stop_sending_and_delete));
            } else if (ezxe.ERROR_OPTIONS.equals(H.d)) {
                H.c(inflate);
            } else if (ezxe.ERROR_NO_RETRY_NO_FALLBACK_OPTIONS.equals(H.d)) {
                H.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
            } else if (ezxe.SEND_TIMEOUT_OPTIONS.equals(H.d)) {
                H.c(inflate);
            } else if (ezxe.ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS.equals(H.d)) {
                H.g(inflate);
                H.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
            } else if (ezxe.XMS_STUCK_IN_SENDING_OPTIONS.equals(H.d)) {
                H.i(inflate, inflate.getResources().getString(R.string.resend_now_xms_message));
                H.b(inflate, inflate.getResources().getString(R.string.stop_sending_and_delete));
            } else if (ezxe.XMS_FAILED_TO_SEND_OPTIONS.equals(H.d)) {
                H.i(inflate, inflate.getResources().getString(R.string.resend_xms_message));
                H.b(inflate, inflate.getResources().getString(R.string.fail_to_send_delete_description));
            } else if (((bzqa) H.m.b()).i() && ezxe.ERROR_GROUP_FTD_OPTIONS.equals(H.d)) {
                H.h(inflate);
            } else {
                csjb e = crkh.a.e();
                e.I("Bottom sheet has unexpected option");
                e.A("option", H.d);
                e.r();
                H.d(inflate, inflate.getResources().getString(R.string.fail_to_send_fallback_description));
            }
            Dialog dialog = H.h.d;
            if (dialog != null) {
                dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: crkc
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                        if (findViewById != null) {
                            findViewById.setBackground(inflate.getContext().getDrawable(R.drawable.rounded_bottom_sheet));
                        }
                    }
                });
            }
            H.p = inflate;
            ekyf.q();
            return inflate;
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
        return this.ai;
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

    @Override // defpackage.efam, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.aj.j();
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
        this.aj.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.crjz
    protected final /* synthetic */ fbae aU() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ah == null) {
            this.ah = new ekkn(this, super.z());
        }
        return this.ah;
    }

    @Override // defpackage.efam, defpackage.ea
    public final void ae(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.aj.f();
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

    @Override // defpackage.crjz, defpackage.efam, defpackage.ea
    public final void ag(Activity activity) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ai() {
        elav b = this.aj.b();
        try {
            super.ai();
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

    @Override // defpackage.efam, defpackage.ea
    public final void am() {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.ea
    public final void ao() {
        elav b = this.aj.b();
        try {
            super.ao();
            try {
                BottomSheetBehavior.v((View) H().p.getParent()).D(3);
            } catch (IllegalArgumentException e) {
                csjb a = crkh.a.a();
                a.I("Failed to set behavior");
                a.s(e);
            }
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

    @Override // defpackage.efam, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.ekhu
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public final crkh H() {
        crkh crkhVar = this.ag;
        if (crkhVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return crkhVar;
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.aj.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.aj.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.aj.b = eldsVar;
    }

    @Override // defpackage.crjz, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    Object aX = aX();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    ezxf ezxfVar = (ezxf) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", ezxf.a, eyfcVar);
                    ezxfVar.getClass();
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof crka)) {
                        throw new IllegalStateException(a.J(eaVar, crkh.class));
                    }
                    crka crkaVar = (crka) eaVar;
                    cgrq cgrqVar = (cgrq) ((akgt) aX).a.a.pS.b();
                    bbfg bbfgVar = (bbfg) ((akgt) aX).b.aR.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    akzt akztVar = (akzt) ((akgt) aX).a.a.f.b();
                    bzyb bzybVar = (bzyb) ((akgt) aX).a.cH.b();
                    csjk csjkVar = (csjk) ((akgt) aX).a.a.el.b();
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.dp;
                    fbbf fbbfVar2 = akkpVar.aO;
                    fbbf fbbfVar3 = ((akgt) aX).b.bX;
                    fbbf fbbfVar4 = akisVar.cI;
                    asix asixVar = (asix) akkpVar.pR.b();
                    akis akisVar2 = ((akgt) aX).a;
                    akkp akkpVar2 = akisVar2.a;
                    this.ag = new crkh(ezxfVar, context2, crkaVar, cgrqVar, bbfgVar, elbxVar, akztVar, bzybVar, csjkVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, asixVar, akkpVar2.hI, akkpVar2.iA, akisVar2.b.ph);
                    this.Z.c(new ekkg(this.aj, this.ai));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.aj;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.crjz, defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
        try {
            super.h(bundle);
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

    @Override // defpackage.ehbo, defpackage.dn
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void i() {
        elav b = this.aj.b();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void j() {
        elav a = this.aj.a();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void l() {
        this.aj.k();
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

    @Override // defpackage.efam, defpackage.dn, defpackage.ea
    public final void m() {
        this.aj.k();
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
        this.aj.g().close();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        elav i = this.aj.i();
        try {
            super.onDismiss(dialogInterface);
            crkh H = H();
            H.k.e("Bugle.Message.Tap.Action.Cancel.Counts", H.a());
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

    @Override // defpackage.crjz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
