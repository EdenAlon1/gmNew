package com.google.android.apps.messaging.ui.debug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.akgt;
import defpackage.akkp;
import defpackage.cort;
import defpackage.cost;
import defpackage.cosz;
import defpackage.daem;
import defpackage.davu;
import defpackage.ea;
import defpackage.efbd;
import defpackage.egyl;
import defpackage.ekhq;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekkg;
import defpackage.ekkj;
import defpackage.ekkk;
import defpackage.ekkn;
import defpackage.ekku;
import defpackage.ekyf;
import defpackage.elar;
import defpackage.elav;
import defpackage.eldl;
import defpackage.elds;
import defpackage.fbae;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.fbbb;
import defpackage.fflb;
import defpackage.ffsk;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.re;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMobileConfigurationFragment extends davu implements ekhu, fbas, ekhq, ekkk, elar {
    private daem a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public DebugMobileConfigurationFragment() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return daem.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.debug_mobile_configuration_fragment, viewGroup, false);
            inflate.getClass();
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
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final daem H() {
        daem daemVar = this.a;
        if (daemVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return daemVar;
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

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.davu, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bm(view, bundle);
            final daem H = H();
            view.getClass();
            View findViewById = H.a.N().findViewById(R.id.force_sync_button);
            findViewById.getClass();
            ((Button) findViewById).setOnClickListener(new View.OnClickListener() { // from class: daei
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ((dlqm) ((Optional) ((cguc) daem.this.b.b()).c.b()).get()).b();
                }
            });
            egyl.d(H.b(), new ScrollingMovementMethod());
            cost a = ((cort) H.c.b()).a();
            H.e = ((cort) H.c.b()).q();
            if (H.e.isEmpty()) {
                H.b().setText("No SIMs found");
            } else {
                final fflb fflbVar = new fflb();
                fflbVar.a = new LinkedHashMap();
                for (cosz coszVar : H.e) {
                    String str = coszVar.c;
                    str.getClass();
                    if (str.length() != 0) {
                        RadioGroup a2 = H.a();
                        coszVar.getClass();
                        String str2 = coszVar.c;
                        str2.getClass();
                        String str3 = coszVar.r;
                        String substring = str2.substring(str2.length() - 3);
                        substring.getClass();
                        String str4 = str3 + " " + substring + " sim:";
                        String str5 = true != str2.equals(a.c) ? "" : "Call ";
                        if (str2.equals(a.d)) {
                            str5 = str5.concat("Sms ");
                        }
                        if (str2.equals(a.e)) {
                            str5 = str5.concat("Data ");
                        }
                        if (str5.length() > 0) {
                            str4 = a.w(str5, str4, "Default ");
                        }
                        int i = coszVar.d;
                        re reVar = new re(a2.getContext());
                        reVar.setText(str4);
                        reVar.setId(i);
                        reVar.setHeight(48);
                        a2.addView(reVar);
                        Map map = (Map) fflbVar.a;
                        Integer valueOf = Integer.valueOf(coszVar.d);
                        String str6 = coszVar.c;
                        str6.getClass();
                        map.put(valueOf, str6);
                        String str7 = coszVar.c;
                        str7.getClass();
                        H.c(str7);
                    }
                }
                H.a().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: daej
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                        fflb fflbVar2 = fflbVar;
                        Map map2 = (Map) fflbVar2.a;
                        Integer valueOf2 = Integer.valueOf(i2);
                        Object obj = map2.get(valueOf2);
                        obj.getClass();
                        daem daemVar = daem.this;
                        daemVar.c((String) obj);
                        TextView b = daemVar.b();
                        Object obj2 = ((Map) fflbVar2.a).get(valueOf2);
                        obj2.getClass();
                        b.setText((CharSequence) ConcurrentMap.EL.getOrDefault(daemVar.f, obj2, "Press the Refresh button to get flag values from storage"));
                    }
                });
                View findViewById2 = H.a.N().findViewById(R.id.refresh_amber_flags_button);
                findViewById2.getClass();
                ((Button) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: daek
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        fflb fflbVar2 = fflb.this;
                        Map map2 = (Map) fflbVar2.a;
                        daem daemVar = H;
                        if (map2.containsKey(Integer.valueOf(daemVar.a().getCheckedRadioButtonId()))) {
                            TextView b = daemVar.b();
                            ConcurrentHashMap concurrentHashMap = daemVar.f;
                            Object obj = ((Map) fflbVar2.a).get(Integer.valueOf(daemVar.a().getCheckedRadioButtonId()));
                            obj.getClass();
                            b.setText((CharSequence) ConcurrentMap.EL.getOrDefault(concurrentHashMap, obj, "Press the Refresh button to get flag values from storage"));
                        }
                    }
                });
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

    @Override // defpackage.davu
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.davu, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof DebugMobileConfigurationFragment)) {
                        throw new IllegalStateException(a.J(eaVar, daem.class));
                    }
                    akkp akkpVar = ((akgt) aX).a.a;
                    this.a = new daem((DebugMobileConfigurationFragment) eaVar, akkpVar.Oe, akkpVar.bj, akkpVar.cK, (ffsk) akkpVar.q.b());
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
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

    @Override // defpackage.davu, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
