package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgo extends czgw implements ekhu, fbas, ekhq, ekkk, elar {
    private czgr ag;
    private Context ai;
    private final lkv aj = new lkv(this);
    private final ekxu ak = new ekxu(this);
    private boolean al;

    @Deprecated
    public czgo() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return czgr.class;
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

    @Override // defpackage.ekhu
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final czgr H() {
        czgr czgrVar = this.ag;
        if (czgrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czgrVar;
    }

    @Override // defpackage.czgw
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

    @Override // defpackage.czgw, defpackage.efae, defpackage.ea
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

    @Override // defpackage.czgw, defpackage.dn, defpackage.ea
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
                    if (!(eaVar instanceof czgo)) {
                        throw new IllegalStateException(a.J(eaVar, czgr.class));
                    }
                    czgo czgoVar = (czgo) eaVar;
                    bavz bavzVar = (bavz) ((akgt) aX).a.a.fM.b();
                    ctwb ctwbVar = (ctwb) ((akgt) aX).a.a.c.b();
                    ctyw ctywVar = (ctyw) ((akgt) aX).a.a.fu.b();
                    ddzb ddzbVar = (ddzb) ((akgt) aX).a.a.nk.b();
                    bbfy bbfyVar = (bbfy) ((akgt) aX).b.aF.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    cxao cxaoVar = (cxao) ((akgt) aX).a.a.fv.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    czgt czgtVar = (czgt) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", czgt.a, eyfcVar);
                    czgtVar.getClass();
                    this.ag = new czgr(czgoVar, bavzVar, ctwbVar, ctywVar, ddzbVar, bbfyVar, elbxVar, cxaoVar, ejlqVar, context2, czgtVar);
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

    @Override // defpackage.czgw, defpackage.dn, defpackage.ea
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
            czgr H = H();
            H.g.k(H.l);
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

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        String str;
        String str2;
        super.hf(bundle);
        final czgr H = H();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(H.k).inflate(R.layout.enter_phone_number_view, (ViewGroup) null, false);
        final EditText editText = (EditText) linearLayout.findViewById(R.id.phone_number_edit);
        final CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.dont_ask_again_check);
        TextView textView = (TextView) linearLayout.findViewById(R.id.message_text_view);
        if (H.b.a() <= 1 || TextUtils.isEmpty(H.i)) {
            Context context = H.k;
            Context context2 = H.k;
            String string = context.getString(R.string.enter_phone_number_title);
            String string2 = context2.getString(R.string.enter_phone_number_text);
            str = string;
            str2 = string2;
        } else {
            str = H.k.getString(R.string.enter_phone_number_title_for_sim, H.i);
            str2 = H.k.getString(R.string.enter_phone_number_text_for_sim, H.i);
        }
        textView.setText(str2);
        ehft ehftVar = new ehft(H.k);
        ehftVar.y(str);
        ehftVar.z(linearLayout);
        ehftVar.o(android.R.string.cancel, new elbb(H.e, "EnterPhoneDialog Cancel", new DialogInterface.OnClickListener() { // from class: czgp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                czgr czgrVar = czgr.this;
                czgrVar.a.hw();
                czgrVar.b(czgrVar.h, checkBox.isChecked());
            }
        }));
        ehftVar.t(android.R.string.ok, new elbb(H.e, "EnterPhoneDialog OK", new DialogInterface.OnClickListener() { // from class: czgq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final String obj = editText.getText().toString();
                czgr czgrVar = czgr.this;
                czgrVar.a.hw();
                czgrVar.b(czgrVar.h, checkBox.isChecked());
                if (TextUtils.isEmpty(obj)) {
                    return;
                }
                int i2 = czgrVar.h;
                czgrVar.n.a(i2).l(czgrVar.a.Y(R.string.mms_phone_number_pref_key), obj);
                ejlq ejlqVar = czgrVar.g;
                cxan a = czgrVar.f.a(i2);
                elfl j = a.b.j(new emwl() { // from class: cxae
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cwzz cwzzVar = (cwzz) obj2;
                        int i3 = cxan.d;
                        cwzzVar.getClass();
                        cwzy builder = cwzzVar.toBuilder();
                        builder.copyOnWrite();
                        cwzz cwzzVar2 = (cwzz) builder.instance;
                        String str3 = obj;
                        str3.getClass();
                        cwzzVar2.b |= 32;
                        cwzzVar2.h = str3;
                        return builder.build();
                    }
                });
                a.j(j);
                ejlqVar.i(ejlp.b(j), new ejlm(Integer.valueOf(i2)), czgrVar.l);
                if (czgrVar.j) {
                    czgrVar.c.h(R.string.toast_after_entered_phone_number_for_sending);
                }
            }
        }));
        return ehftVar.create();
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
        elav i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.czgw, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
