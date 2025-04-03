package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.material.snackbar.Snackbar;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejie {
    public static final enru a = enru.c("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer");
    public final eg e;
    public final ejia f;
    public final ejwl g;
    public final ejlq h;
    public final elbx i;
    public final eiyk j;
    public final ejgi k;
    public final emxc l;
    public final eixk m;
    public final elgr n;
    public final ebrs o;
    public final ebrt p;
    public final Executor q;
    public eixn s;
    private final eiyh t;
    public final ejlr b = new ejlr<eisx, Void>() { // from class: ejie.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ejie.this.m.c((eisx) obj);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ejie.this.m.a();
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr c = new ejlr<Void, String>() { // from class: ejie.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            Snackbar.q(ejie.this.f.Q, R.string.tiktok_add_account_error, 0).i();
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejwd d = new AnonymousClass3();
    public emxc r = emux.a;

    public ejie(Context context, eg egVar, ejia ejiaVar, final emxc emxcVar, ejwl ejwlVar, final ejlq ejlqVar, elbx elbxVar, eiyk eiykVar, eiyh eiyhVar, ejgj ejgjVar, Map map, eixk eixkVar, ekmz ekmzVar, final eizh eizhVar, elgr elgrVar, dwch dwchVar, Executor executor, errl errlVar) {
        Class cls;
        this.e = egVar;
        this.f = ejiaVar;
        this.g = ejwlVar;
        this.h = ejlqVar;
        this.i = elbxVar;
        this.j = eiykVar;
        this.t = eiyhVar;
        this.m = eixkVar;
        this.n = elgrVar;
        this.q = executor;
        ebrr j = ebrs.j(context);
        ebpg ebpgVar = new ebpg();
        ebpgVar.a = new ejhi(emxcVar);
        ebpgVar.c = ejgp.a(ekmzVar, ejiaVar, new ejhi(emxcVar));
        ebpgVar.d = new elay(elbxVar, "Click Add Accounts in TikTok Express SignIn", new View.OnClickListener() { // from class: ejid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = ((emxn) emxcVar).a;
                eizh eizhVar2 = eizhVar;
                String str = (String) obj;
                if (eizhVar2.b(str)) {
                    ejlqVar.g(new ejlp(eizhVar2.a(str)), ejie.this.c);
                }
            }
        });
        ((ebpk) j).b = ebpgVar.c();
        j.g(errlVar);
        j.k(dwchVar);
        ebrs m = j.m();
        this.o = m;
        this.p = new ebrt(m);
        Intent intent = egVar.getIntent();
        if (intent.getBooleanExtra("$tiktok$eligibility_intents$mapper_class_owned", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("$tiktok$eligibility_intents$mapper_class");
            serializableExtra.getClass();
            cls = (Class) serializableExtra;
        } else {
            cls = null;
        }
        if (cls == null) {
            eizl eizlVar = ejgjVar.a;
            emux emuxVar = emux.a;
            this.k = new ejgi(eizlVar, emuxVar, ejgjVar.c);
            this.l = emuxVar;
            return;
        }
        emxf.p(ejgjVar.b.containsKey(cls), "EligibilityMapper not found for %s", cls);
        this.k = new ejgi(ejgjVar.a, emxc.j((ejgl) ((ffbr) ejgjVar.b.get(cls)).b()), ejgjVar.c);
        emxf.p(map.containsKey(cls), "AccountIneligibleDialogCreator not provided for mapperClass: %s", cls);
        this.l = emxc.j((ejhy) ((ffbr) map.get(cls)).b());
    }

    public final void a() {
        ejjz.c(this.t.b(), "Failed account invalidation.", new Object[0]);
    }

    /* compiled from: PG */
    /* renamed from: ejie$3, reason: invalid class name */
    class AnonymousClass3 implements ejwd<enhk<eixn, ejgk>> {
        public AnonymousClass3() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            Throwable th2;
            ejie.this.s = null;
            Throwable th3 = th;
            while (th3 != null) {
                Throwable a = ekho.a(th3);
                if ((a instanceof dfqi) || (a instanceof UserRecoverableAuthException)) {
                    th2 = a;
                    break;
                }
                th3 = a.getCause();
            }
            th2 = null;
            if (th2 == null) {
                ((enrr) ((enrr) ((enrr) ejie.a.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 151, "ExpressSignInFragmentPeer.java")).q("Load accounts failed due to non user recoverable error.");
                Snackbar q = Snackbar.q(ejie.this.f.Q, R.string.tiktok_load_account_failure, -2);
                q.w(R.string.tiktok_retry, new elay(ejie.this.i, "Load account error, click retry", new View.OnClickListener() { // from class: ejif
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ejie.this.a();
                    }
                }));
                q.i();
                return;
            }
            final Intent a2 = th2 instanceof dfqi ? ((dfqi) th2).a() : ((UserRecoverableAuthException) th2).a();
            if (a2 == null) {
                ((enrr) ((enrr) ((enrr) ejie.a.i()).g(th2)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 168, "ExpressSignInFragmentPeer.java")).q("Load accounts failed due to user recoverable error.");
                Snackbar.q(ejie.this.f.Q, R.string.tiktok_play_services_error, -2).i();
            } else {
                Snackbar q2 = Snackbar.q(ejie.this.f.Q, R.string.tiktok_play_services_error, -2);
                q2.w(R.string.tiktok_fix_it, new elay(ejie.this.i, "Play services error, click fix", new View.OnClickListener() { // from class: ejig
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ejie.this.f.startActivityForResult(a2, 29878);
                    }
                }));
                q2.i();
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void b(Object obj) {
            enhk enhkVar = (enhk) obj;
            ejie.this.r = emxc.j(enhkVar);
            int i = engw.d;
            engr engrVar = new engr();
            enqu listIterator = enhkVar.entrySet().listIterator();
            while (listIterator.hasNext()) {
                eixn eixnVar = (eixn) ((Map.Entry) listIterator.next()).getKey();
                if (!eixnVar.b().k.equals("incognito")) {
                    if (eixnVar.b().k.equals("pseudonymous")) {
                        ejie.this.s = eixnVar;
                    } else {
                        engrVar.h(eixnVar);
                    }
                }
            }
            ((ebpl) ejie.this.o).a.a(engrVar.g());
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }
}
