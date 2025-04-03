package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.fbal;
import defpackage.vzn;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wat extends wai implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    public final lkv a = new lkv(this);
    private final ells ag = new ells();
    private boolean ah;
    private waz d;
    private Context e;

    @Deprecated
    public wat() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return waz.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final waz H = H();
            View inflate = layoutInflater.inflate(R.layout.info_and_options_fragment, viewGroup, false);
            vzg vzgVar = (vzg) H.e.I().h("conversation_settings_base_fragment");
            if (vzgVar == null) {
                vzi vziVar = H.o.c;
                if (vziVar == null) {
                    vziVar = vzi.a;
                }
                vzg vzgVar2 = new vzg();
                fbae.e(vzgVar2);
                ekku.a(vzgVar2, vziVar);
                cg cgVar = new cg(H.e.I());
                cgVar.t(0, vzgVar2, "conversation_settings_base_fragment");
                cgVar.c();
                vzgVar = vzgVar2;
            }
            if (inflate == null) {
                inflate = null;
            } else {
                H.r = (ContactIconView) inflate.findViewById(R.id.business_icon);
                H.s = (TextView) inflate.findViewById(R.id.business_name);
                H.t = (TextView) inflate.findViewById(R.id.business_description);
                H.u = (TabLayout) inflate.findViewById(R.id.info_and_options_tabs);
                H.v = (ImageView) inflate.findViewById(R.id.business_hero);
                ejwl ejwlVar = H.k;
                vzn H2 = vzgVar.H();
                ejuh b = ((wbh) H2.o.b()).b(H.e.a, H2.y);
                Consumer consumer = new Consumer() { // from class: wax
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        LinearLayout linearLayout;
                        engw g;
                        waz wazVar = waz.this;
                        bcum bcumVar = (bcum) obj;
                        vzg vzgVar3 = (vzg) wazVar.e.I().h("conversation_settings_base_fragment");
                        vzgVar3.getClass();
                        vzw vzwVar = vzgVar3.H().d;
                        mv.a(new vzu(vzwVar.m(), vzwVar.F(bcumVar))).c(vzwVar);
                        vzwVar.a = bcumVar;
                        wbf wbfVar = wazVar.d;
                        if (wbfVar != null) {
                            wbfVar.e(wbfVar.Q, true);
                        }
                        wbe wbeVar = wazVar.c;
                        if (wbeVar == null || !((atbw) wbeVar.e.b()).a() || (linearLayout = (LinearLayout) wbeVar.Q) == null) {
                            return;
                        }
                        if (bcumVar == null) {
                            int i = engw.d;
                            g = enou.a;
                        } else {
                            Optional g2 = bcumVar.g();
                            engr engrVar = new engr();
                            if (g2.isPresent() && ((engw) g2.get()).size() > 1) {
                                engrVar.h(bcul.SETTING_CHANGE_ACTIVE_SIM);
                            }
                            g = engrVar.g();
                        }
                        for (int i2 = 0; i2 < wbeVar.ai; i2++) {
                            linearLayout.removeViewAt(0);
                        }
                        int i3 = 0;
                        while (true) {
                            int i4 = ((enou) g).c;
                            if (i3 >= i4) {
                                wbeVar.ai = i4;
                                return;
                            }
                            bcul bculVar = (bcul) g.get(i3);
                            View inflate2 = wbeVar.fe().getLayoutInflater().inflate(R.layout.business_contact_action, (ViewGroup) linearLayout, false);
                            bcun a = ((bcuo) wbeVar.ag.b()).a(wbeVar.z());
                            a.b(bcumVar, bculVar);
                            ((TextView) inflate2.findViewById(R.id.business_contact_action_header)).setText(a.b);
                            ((TextView) inflate2.findViewById(R.id.business_contact_action_sub_header)).setText(a.c);
                            ((ImageView) inflate2.findViewById(R.id.business_contact_action_icon)).setImageResource(bculVar == bcul.SETTING_CHANGE_ACTIVE_SIM ? R.drawable.gs_sim_card_vd_theme_24 : 0);
                            View findViewById = inflate2.findViewById(R.id.business_contact_action_group_divider);
                            if (i3 >= r5.c - 1) {
                                findViewById.setVisibility(0);
                            } else {
                                findViewById.setVisibility(8);
                            }
                            ((ellq) wbeVar.ah.b()).b(inflate2, new ConversationSettingsOptionItemView.a(a));
                            linearLayout.addView(inflate2, i3);
                            i3++;
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final vzn H3 = vzgVar.H();
                ejwlVar.b(b, new vzn.b(consumer, new Consumer() { // from class: way
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ConversationIdType conversationIdType = vzn.this.y;
                        vzn.a.s("Error getting options list data for settings options, conversationId: ".concat(String.valueOf(String.valueOf(conversationIdType))), (Throwable) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                }));
                ejwl ejwlVar2 = H.k;
                final was wasVar = (was) H.l.b();
                final String str = H.o.d;
                ejwlVar2.b(new ejuy(wasVar.b, new eros() { // from class: wap
                    @Override // defpackage.eros
                    public final erph a(erpc erpcVar) {
                        final was wasVar2 = was.this;
                        final String str2 = str;
                        final elfl g = elfo.g(new Callable() { // from class: wao
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ((bdrr) was.this.d.b()).c(str2);
                            }
                        }, wasVar2.c);
                        final elfl h = wasVar2.f.a(str2).h(new emwl() { // from class: waq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                Optional optional = (Optional) obj;
                                boolean booleanValue = ((Boolean) ((cfup) was.a.get()).e()).booleanValue();
                                was wasVar3 = was.this;
                                String str3 = str2;
                                return !booleanValue ? (BusinessInfoData) optional.orElse(((cowf) wasVar3.e.b()).a(str3)) : optional.isPresent() ? (BusinessInfoData) optional.get() : ((cowf) wasVar3.e.b()).a(str3);
                            }
                        }, wasVar2.c);
                        return new erph(elfo.m(g, h).a(new Callable() { // from class: wan
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i = was.g;
                                return new war((ParticipantsTable.BindData) erqt.q(elfl.this), (BusinessInfoData) erqt.q(h));
                            }
                        }, erpp.a));
                    }
                }, "INFO_AND_OPTIONS_".concat(String.valueOf(str))), H.q);
            }
            if (inflate == null) {
                wbc.a(this, H());
            }
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
        return this.a;
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
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.wai, defpackage.efaf, defpackage.ea
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
            ellg.b(this).b = view;
            H();
            wbc.a(this, H());
            bm(view, bundle);
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

    @Override // defpackage.wai
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

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.wai, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar = akisVar.gH;
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof wat)) {
                        throw new IllegalStateException(a.J(eaVar, waz.class));
                    }
                    wat watVar = (wat) eaVar;
                    azze azzeVar = (azze) akisVar.a.fx.b();
                    adtc adtcVar = (adtc) ((akgt) aX).b.bt.b();
                    crjr h = ((akgt) aX).h();
                    crjt i = ((akgt) aX).i();
                    crjv j = ((akgt) aX).j();
                    akvg akvgVar = (akvg) ((akgt) aX).a.a.Px.b();
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    fbbf fbbfVar2 = ((akgt) aX).B;
                    akis akisVar2 = ((akgt) aX).a;
                    fbbf fbbfVar3 = akisVar2.jy;
                    fbbf fbbfVar4 = akisVar2.kk;
                    aolr aolrVar = (aolr) akisVar2.a.Z.b();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    wav wavVar = (wav) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", wav.a, eyfcVar);
                    wavVar.getClass();
                    this.d = new waz(fbbfVar, watVar, azzeVar, adtcVar, h, i, j, akvgVar, ejwlVar, fbbfVar2, fbbfVar3, fbbfVar4, aolrVar, wavVar);
                    this.Z.c(new ekkg(this.c, this.a));
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
            this.ah = true;
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

    @Override // defpackage.ekhu
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final waz H() {
        waz wazVar = this.d;
        if (wazVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return wazVar;
    }

    @Override // defpackage.wai, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
