package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhs {
    public static final String a = ejhj.class.getName();
    public static final enru b = enru.c("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer");
    public final ejlr c = new ejlr<eisx, Void>() { // from class: ejhs.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ejhs.this.i.b((eisx) obj);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((enrr) ((enrr) ((enrr) ejhs.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$1", "onFailure", 'j', "OGExpressSignInDialogFragmentPeer.java")).q("log in account failed");
            ejhj.aT(ejhs.this.f.getString(R.string.tiktok_account_login_failure)).t(ejhs.this.h.I(), ejhs.a);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr d = new ejlr<Void, String>() { // from class: ejhs.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((enrr) ((enrr) ((enrr) ejhs.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$2", "onFailure", '{', "OGExpressSignInDialogFragmentPeer.java")).q("add account failed");
            ejhj.aT(ejhs.this.f.getString(R.string.tiktok_add_account_error)).t(ejhs.this.h.I(), ejhs.a);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejwd e = new ejwd<List<eixn>>() { // from class: ejhs.3
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            Throwable th2 = null;
            ejhs.this.v = null;
            Throwable th3 = th;
            while (th3 != null) {
                Throwable a2 = ekho.a(th3);
                if ((a2 instanceof dfqd) || (a2 instanceof dfqc)) {
                    th2 = a2;
                    break;
                }
                th3 = a2.getCause();
            }
            if (th2 == null) {
                ((enrr) ((enrr) ((enrr) ejhs.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$3", "onError", (char) 173, "OGExpressSignInDialogFragmentPeer.java")).q("Load accounts failed");
                return;
            }
            if (th2 instanceof dfqd) {
                int i = ((dfqd) th2).a;
                ejhs ejhsVar = ejhs.this;
                ejhsVar.o.d(ejhsVar.g, i, 38294);
            } else {
                if (!(th2 instanceof dfqc)) {
                    ((enrr) ((enrr) ((enrr) ejhs.b.i()).g(th)).h("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/OGExpressSignInDialogFragmentPeer$3", "onError", (char) 170, "OGExpressSignInDialogFragmentPeer.java")).q("Load accounts failed with play service error");
                    return;
                }
                int i2 = ((dfqc) th2).a;
                ejhs ejhsVar2 = ejhs.this;
                ejhsVar2.o.d(ejhsVar2.g, i2, 38294);
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void b(Object obj) {
            int i = engw.d;
            engr engrVar = new engr();
            for (eixn eixnVar : (List) obj) {
                if (!eixnVar.b().k.equals("incognito")) {
                    if (eixnVar.b().k.equals("pseudonymous")) {
                        ejhs.this.v = eixnVar;
                    } else {
                        engrVar.h(eixnVar);
                    }
                }
            }
            ((ebpl) ejhs.this.r).a.a(engrVar.g());
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };
    public final Context f;
    public final Activity g;
    public final ea h;
    public final eito i;
    public final eiyk j;
    public final eiyh k;
    public final eixo l;
    public final ejlq m;
    public final ejwl n;
    public final dfpi o;
    public final emxc p;
    public final elgr q;
    public final ebrs r;
    public final ebrt s;
    public final Executor t;
    public ebpy u;
    public eixn v;

    public ejhs(Context context, Activity activity, ea eaVar, final emxc emxcVar, ekmz ekmzVar, elbx elbxVar, eito eitoVar, eiyk eiykVar, eiyh eiyhVar, final eizh eizhVar, eixo eixoVar, final ejlq ejlqVar, ejwl ejwlVar, dfpi dfpiVar, Executor executor, errl errlVar, dwch dwchVar, emxc emxcVar2, elgr elgrVar) {
        emxf.l(activity instanceof iy);
        this.f = context;
        this.g = activity;
        this.h = eaVar;
        this.i = eitoVar;
        this.j = eiykVar;
        this.k = eiyhVar;
        this.l = eixoVar;
        this.m = ejlqVar;
        this.n = ejwlVar;
        this.o = dfpiVar;
        this.p = emxcVar2;
        this.q = elgrVar;
        this.t = executor;
        ebpg ebpgVar = new ebpg();
        ebpgVar.a = new ejhi(emxcVar);
        ebpgVar.c = ejgp.a(ekmzVar, eaVar, new ejhi(emxcVar));
        ebpgVar.d = new elay(elbxVar, "Express SignIn Dialog: Clicked Add Account", new View.OnClickListener() { // from class: ejhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj = ((emxn) emxcVar).a;
                eizh eizhVar2 = eizhVar;
                String str = (String) obj;
                if (eizhVar2.b(str)) {
                    ejlqVar.g(new ejlp(eizhVar2.a(str)), ejhs.this.d);
                }
            }
        });
        ebpe c = ebpgVar.c();
        ebrr j = ebrs.j(context);
        ((ebpk) j).b = c;
        j.g(errlVar);
        j.k(dwchVar);
        ebrs m = j.m();
        this.r = m;
        this.s = new ebrt(m);
    }
}
