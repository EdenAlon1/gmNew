package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebai {
    private static final String e = "ebai";
    public final ebbb a;
    public final SelectedAccountDisc b;
    public final eays c = new ebah(this);
    public final eavy d = new eavy() { // from class: ebad
        @Override // defpackage.eavy
        public final void a() {
            ebai.this.b();
        }
    };

    public ebai(SelectedAccountDisc selectedAccountDisc, ebbb ebbbVar) {
        this.a = ebbbVar;
        this.b = selectedAccountDisc;
        ebap ebapVar = new ebap(ebbbVar, selectedAccountDisc);
        engr engrVar = new engr();
        engrVar.h(ebapVar);
        ebga ebgaVar = ((ebbg) ebbbVar).e;
        final engw g = engrVar.g();
        selectedAccountDisc.f = new View.OnTouchListener() { // from class: eazy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = 0;
                boolean z = false;
                while (true) {
                    engw engwVar = engw.this;
                    if (i >= ((enou) engwVar).c) {
                        break;
                    }
                    z |= ((View.OnTouchListener) engwVar.get(i)).onTouch(view, motionEvent);
                    i++;
                }
                if (z) {
                    emxf.m(motionEvent.getAction() != 0, "Internal onTouchListeners may not consume ACTION_DOWN.");
                }
                return z;
            }
        };
    }

    public final void a(Object obj) {
        ezon ezonVar = (ezon) ezoo.a.createBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        ezooVar.d = 8;
        ezooVar.b |= 2;
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        ezooVar2.f = 8;
        ezooVar2.b |= 32;
        ezonVar.copyOnWrite();
        ezoo ezooVar3 = (ezoo) ezonVar.instance;
        ezooVar3.e = 3;
        ezooVar3.b = 8 | ezooVar3.b;
        ezonVar.copyOnWrite();
        ezoo ezooVar4 = (ezoo) ezonVar.instance;
        ezooVar4.c = 36;
        ezooVar4.b |= 1;
        ((ebbg) this.a).f.a(obj, (ezoo) ezonVar.build());
    }

    public final void b() {
        final String str;
        eaww eawwVar;
        if (!((ebbg) this.a).b.e()) {
            ebpa.a(new Runnable() { // from class: ebaa
                @Override // java.lang.Runnable
                public final void run() {
                    ebai ebaiVar = ebai.this;
                    ebaiVar.b.setContentDescription(null);
                    int[] iArr = kvo.a;
                    ebaiVar.b.setImportantForAccessibility(4);
                }
            });
            return;
        }
        SelectedAccountDisc selectedAccountDisc = this.b;
        ebbg ebbgVar = (ebbg) this.a;
        emxc emxcVar = ebbgVar.h;
        ebbc ebbcVar = ebbgVar.b;
        Context context = selectedAccountDisc.getContext();
        if (ebbcVar.b().isEmpty()) {
            str = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
        } else {
            Object a = ((ebbg) this.a).b.a();
            if (a == null) {
                str = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
            } else {
                Object obj = this.b.c.l;
                String str2 = "";
                if (!a.equals(obj)) {
                    Log.w(e, String.format("Disc account not the same as selected account.%s", obj == null ? " Disc account null" : ""));
                }
                SelectedAccountDisc selectedAccountDisc2 = this.b;
                ebbb ebbbVar = this.a;
                AccountParticleDisc accountParticleDisc = selectedAccountDisc2.c;
                Object obj2 = accountParticleDisc.l;
                if (obj2 != null) {
                    String b = eavn.b(obj2, ((ebbg) ebbbVar).c);
                    eawz eawzVar = accountParticleDisc.m;
                    String str3 = null;
                    eawt eawtVar = (eawzVar == null || (eawwVar = eawzVar.a) == null) ? null : (eawt) eawwVar.a().f();
                    String c = eawtVar == null ? null : eawtVar.c();
                    if (c != null) {
                        String trim = c.trim();
                        if (!trim.isEmpty()) {
                            str3 = !trim.endsWith(".") ? String.valueOf(trim).concat(".") : trim;
                        }
                    }
                    String e2 = accountParticleDisc.e();
                    if (str3 != null && e2 != null) {
                        str2 = a.w(str3, e2, " ");
                    } else if (str3 != null) {
                        str2 = str3;
                    } else if (e2 != null) {
                        str2 = e2;
                    }
                    str2 = !str2.isEmpty() ? a.w(str2, b, "\n") : b;
                }
                String string = context.getString(R.string.og_account_and_settings);
                if (str2.isEmpty()) {
                    str = string;
                } else {
                    str = context.getString(R.string.og_signed_in_as_account, str2) + "\n" + string;
                }
            }
        }
        ebpa.a(new Runnable() { // from class: ebab
            @Override // java.lang.Runnable
            public final void run() {
                ebai ebaiVar = ebai.this;
                ebaiVar.b.setContentDescription(str);
                int[] iArr = kvo.a;
                ebaiVar.b.setImportantForAccessibility(1);
            }
        });
    }

    public final void c() {
        final ebbc ebbcVar = ((ebbg) this.a).b;
        if (ebbcVar.e()) {
            ebpa.a(new Runnable() { // from class: ebac
                @Override // java.lang.Runnable
                public final void run() {
                    ebai ebaiVar = ebai.this;
                    ebaiVar.b.c.l(ebbcVar.a());
                    ebaiVar.b();
                }
            });
        }
    }
}
