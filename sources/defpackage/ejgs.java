package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import defpackage.ejgy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgs {
    public final eivw a;
    public final ejwl b;
    public final eixo c;
    final ejgy d;
    public final ejgy.a e;
    public final eiwl f;
    public final eivv g = new ejgr(this);
    private final ebbb h;

    /* JADX WARN: Type inference failed for: r1v17, types: [eawd, java.lang.Object] */
    public ejgs(ejgq ejgqVar, eivw eivwVar, ejwl ejwlVar, eixo eixoVar, ekmz ekmzVar, ebas ebasVar, ebgw ebgwVar, eiwl eiwlVar, emxc emxcVar, ejgy ejgyVar, ejgy.a aVar, ejhf ejhfVar, ScheduledExecutorService scheduledExecutorService, dwch dwchVar) {
        ebbc ebbcVar;
        eave eaveVar;
        ebas ebasVar2;
        ebga ebgaVar;
        ebtw ebtwVar;
        ebfw ebfwVar;
        eawd eawdVar;
        ExecutorService executorService;
        dwch dwchVar2;
        ebvw ebvwVar;
        this.a = eivwVar;
        this.b = ejwlVar;
        this.c = eixoVar;
        this.f = eiwlVar;
        this.d = ejgyVar;
        this.e = aVar;
        ejhi ejhiVar = new ejhi(emxcVar);
        ebbc ebbcVar2 = ejgyVar.c;
        Context z = ejgqVar.z();
        ebbf ebbfVar = new ebbf();
        Context applicationContext = z.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("Null applicationContext");
        }
        ebbfVar.b = applicationContext;
        ebbfVar.f = ebga.a().a();
        ebbfVar.h = ebfw.c().a();
        ebbfVar.n = new ebau();
        ebbfVar.d = ejhiVar;
        if (ebbcVar2 == null) {
            throw new NullPointerException("Null accountsModel");
        }
        ebbfVar.c = ebbcVar2;
        ebbfVar.e = ebasVar;
        ebgc ebgcVar = new ebgc(ejhfVar.b(ebbcVar2));
        ebgcVar.c = ebgwVar;
        ebbfVar.f = ebgcVar.a();
        ebbfVar.j = ejgp.a(ekmzVar, ejgqVar, ejhiVar);
        ebbfVar.g = new ebtv(ejhiVar, ejgqVar.z());
        ebbfVar.h = ejhfVar.a();
        ebbfVar.a = scheduledExecutorService;
        if (dwchVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        ebbfVar.m = dwchVar;
        ThreadFactory a = ebog.a();
        ExecutorService executorService2 = ebbfVar.l;
        if (!(executorService2 == null ? emux.a : emxc.j(executorService2)).g()) {
            ExecutorService executorService3 = ebbfVar.a;
            executorService3 = executorService3 == null ? Executors.newCachedThreadPool(a) : executorService3;
            if (executorService3 == null) {
                throw new NullPointerException("Null backgroundExecutor");
            }
            ebbfVar.l = executorService3;
        }
        if (ebbfVar.a == null) {
            ebbfVar.a = Executors.newSingleThreadScheduledExecutor(a);
        }
        if (!ebbfVar.e().g()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        }
        ebbfVar.k = ebbfVar.e().c();
        ebas ebasVar3 = ebbfVar.e;
        if (!(ebasVar3 == null ? emux.a : emxc.j(ebasVar3)).g()) {
            eave b = ebbfVar.b();
            ebbfVar.d();
            final ebat ebatVar = new ebat(b, emux.a);
            ebbd ebbdVar = new ebbd();
            ebbdVar.c = new ebaq() { // from class: ebav
                @Override // defpackage.ebaq, defpackage.eavd
                public final void a(View view, Object obj) {
                    Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                    intent.addFlags(32768);
                    intent.addFlags(524288);
                    view.getContext().startActivity(intent);
                }
            };
            ebbdVar.b = new ebaq() { // from class: ebaw
                @Override // defpackage.ebaq, defpackage.eavd
                public final void a(View view, Object obj) {
                    Context context = view.getContext();
                    context.startActivity(new Intent(context, (Class<?>) AddAccountActivity.class));
                }
            };
            ebbdVar.a = new ebaq() { // from class: ebax
                @Override // defpackage.ebaq, defpackage.eavd
                public final void a(View view, Object obj) {
                    if (obj == null) {
                        Log.d(ebat.a, "showMyAccount called with null account");
                        return;
                    }
                    ebat ebatVar2 = ebat.this;
                    if (!ebatVar2.b.g(obj)) {
                        Log.i(ebat.a, "showMyAccount called with non-Gaia account");
                        return;
                    }
                    String c = ebatVar2.b.c(obj);
                    ewon ewonVar = (ewon) ewop.a.createBuilder();
                    int i = ewom.HOME_SCREEN.qw;
                    ewonVar.copyOnWrite();
                    ewop ewopVar = (ewop) ewonVar.instance;
                    ewopVar.b |= 1;
                    ewopVar.c = i;
                    eayn.b(view, c, (ewop) ewonVar.build());
                }
            };
            ebbfVar.e = ebbdVar.a();
        }
        ebbfVar.c().a.b = ((ebgd) ebbfVar.d()).a;
        ebbfVar.d();
        dwch dwchVar3 = ebbfVar.m;
        if (dwchVar3 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if (!(dwchVar3 instanceof dwcg)) {
            ebbfVar.n = new ebvz(ebbfVar.b(), ebbfVar.c(), dwchVar3, (emyl) ebbfVar.q.d(new emyl() { // from class: ebay
                @Override // defpackage.emyl
                public final Object get() {
                    return new emyl() { // from class: ebaz
                        @Override // defpackage.emyl
                        public final Object get() {
                            return null;
                        }
                    };
                }
            }));
        }
        if (ebbfVar.o == null) {
            ebbfVar.o = new ebua(ebbfVar.a(), ebbfVar.a);
        }
        ebgc ebgcVar2 = new ebgc(ebbfVar.d());
        if (!((ebgd) ebbfVar.d()).h.g()) {
            ebbfVar.f();
            Context a2 = ebbfVar.a();
            eave b2 = ebbfVar.b();
            ebbfVar.d();
            ebgcVar2.f = emxc.j(new ebil(a2, b2, emux.a));
        }
        if (!((ebgd) ebbfVar.d()).i.g()) {
            ebbfVar.f();
            if (fdra.a.get().c(ebbfVar.a())) {
                ebgcVar2.g = emxc.j(new ebho(ebbfVar.b(), ebbfVar.a(), ebbfVar.o, ebbfVar.p));
            }
        }
        if (!((ebgd) ebbfVar.d()).d.g()) {
            ebgcVar2.b = emxc.j(new ebkz());
        }
        if (fdra.a.get().b(ebbfVar.a())) {
            ebgcVar2.c(true);
        }
        ebbfVar.f = ebgcVar2.a();
        Context context = ebbfVar.b;
        if (context != null && (ebbcVar = ebbfVar.c) != null && (eaveVar = ebbfVar.d) != null && (ebasVar2 = ebbfVar.e) != null && (ebgaVar = ebbfVar.f) != null && (ebtwVar = ebbfVar.g) != null && (ebfwVar = ebbfVar.h) != null && (eawdVar = ebbfVar.k) != null && (executorService = ebbfVar.l) != null && (dwchVar2 = ebbfVar.m) != null && (ebvwVar = ebbfVar.n) != null) {
            this.h = new ebbg(context, ebbcVar, eaveVar, ebasVar2, ebgaVar, ebtwVar, ebfwVar, ebbfVar.i, ebbfVar.j, eawdVar, executorService, dwchVar2, ebvwVar, ebbfVar.o, ebbfVar.p, ebbfVar.q);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ebbfVar.b == null) {
            sb.append(" applicationContext");
        }
        if (ebbfVar.c == null) {
            sb.append(" accountsModel");
        }
        if (ebbfVar.d == null) {
            sb.append(" accountConverter");
        }
        if (ebbfVar.e == null) {
            sb.append(" clickListeners");
        }
        if (ebbfVar.f == null) {
            sb.append(" features");
        }
        if (ebbfVar.g == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (ebbfVar.h == null) {
            sb.append(" configuration");
        }
        if (ebbfVar.k == null) {
            sb.append(" avatarImageLoader");
        }
        if (ebbfVar.l == null) {
            sb.append(" backgroundExecutor");
        }
        if (ebbfVar.m == null) {
            sb.append(" vePrimitives");
        }
        if (ebbfVar.n == null) {
            sb.append(" visualElements");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static ebbb a(fr frVar) {
        ejgq ejgqVar = (ejgq) frVar.h("$TikTok$NonAccountScopedOGAccountMenuManagerProviderFragment");
        if (ejgqVar == null) {
            ejgqVar = new ejgq();
            fbae.e(ejgqVar);
            cg cgVar = new cg(frVar);
            cgVar.u(ejgqVar, "$TikTok$NonAccountScopedOGAccountMenuManagerProviderFragment");
            cgVar.c();
        }
        return ejgqVar.H().h;
    }
}
