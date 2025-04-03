package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqu extends cvrk implements ekhu, fbas, ekhq, ekkk, elar {
    private cvri a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cvqu() {
        efbd.c();
    }

    public static cvqu a(eisx eisxVar) {
        cvqu cvquVar = new cvqu();
        fbae.e(cvquVar);
        ekky.b(cvquVar, eisxVar);
        return cvquVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cvri.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            cvri H = H();
            layoutInflater.getClass();
            ComposeView composeView = new ComposeView(((cvqu) H.b.b()).A(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: cvqv
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.getClass();
                    windowInsets.getClass();
                    return windowInsets;
                }
            });
            composeView.a(new hpw(400788083, true, new cvrc(H)));
            ekyf.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
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

    @Override // defpackage.cvrk, defpackage.efaf, defpackage.ea
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
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            kwg.a(((cvqu) H().b.b()).fe().getWindow(), true);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            ((cwis) H().b().b.b()).b();
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

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cvri H() {
        cvri cvriVar = this.a;
        if (cvriVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cvriVar;
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

    @Override // defpackage.cvrk
    protected final /* bridge */ /* synthetic */ ekky e() {
        return new ekkt(this, false);
    }

    @Override // defpackage.cvrk, defpackage.ekkd, defpackage.ea
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
                    fazb a = fbaz.a(((akgo) aX).cz);
                    akis akisVar = ((akgo) aX).a;
                    akfv akfvVar = ((akgo) aX).d;
                    akfy akfyVar = ((akgo) aX).c;
                    fbbf fbbfVar = ((akgo) aX).ez;
                    fbbf fbbfVar2 = akfvVar.N;
                    fbbf fbbfVar3 = akfyVar.t;
                    fbbf fbbfVar4 = akfvVar.k;
                    fbbf fbbfVar5 = akfvVar.s;
                    fbbf fbbfVar6 = ((akgo) aX).az;
                    fbbf fbbfVar7 = akfvVar.Q;
                    akko akkoVar = akisVar.b;
                    this.a = new cvri(a, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, akkoVar.jC, akfvVar.x, akkoVar.kO);
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
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        r0.b().a(r0.d());
     */
    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.os.Bundle r4) {
        /*
            r3 = this;
            ekxu r0 = r3.c
            r0.k()
            r3.aY(r4)     // Catch: java.lang.Throwable -> Lca
            cvri r0 = r3.H()     // Catch: java.lang.Throwable -> Lca
            ffbr r1 = r0.b     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lca
            cvqu r1 = (defpackage.cvqu) r1     // Catch: java.lang.Throwable -> Lca
            eg r1 = r1.fe()     // Catch: java.lang.Throwable -> Lca
            android.view.Window r1 = r1.getWindow()     // Catch: java.lang.Throwable -> Lca
            r2 = 0
            defpackage.kwg.a(r1, r2)     // Catch: java.lang.Throwable -> Lca
            ffbr r1 = r0.g     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lca
            j$.util.Optional r1 = (j$.util.Optional) r1     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L3c
            ffbz r1 = r0.l     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Lca
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L47
        L3c:
            ffbr r1 = r0.c     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lca
            aiha r1 = (defpackage.aiha) r1     // Catch: java.lang.Throwable -> Lca
            r1.a()     // Catch: java.lang.Throwable -> Lca
        L47:
            ffbr r1 = r0.d     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lca
            cwdv r1 = (defpackage.cwdv) r1     // Catch: java.lang.Throwable -> Lca
            if (r4 != 0) goto L58
            ecrj r4 = r1.b     // Catch: java.lang.Throwable -> Lca
            ecda r1 = defpackage.alrv.H     // Catch: java.lang.Throwable -> Lca
            r4.e(r1)     // Catch: java.lang.Throwable -> Lca
        L58:
            ffbr r4 = r0.j     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lca
            atmy r4 = (defpackage.atmy) r4     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "Self-identity id is not provided."
            if (r4 == 0) goto L95
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r0.a()     // Catch: java.lang.Throwable -> Lca
            boolean r2 = r0.c()     // Catch: java.lang.Throwable -> Lca
            if (r2 == 0) goto L7b
            if (r4 == 0) goto L75
            goto L7b
        L75:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            throw r4     // Catch: java.lang.Throwable -> Lca
        L7b:
            if (r4 != 0) goto L89
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r4 = r0.b()     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> Lca
            r4.a(r1)     // Catch: java.lang.Throwable -> Lca
            goto Lbe
        L89:
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r1 = r0.b()     // Catch: java.lang.Throwable -> Lca
            boolean r2 = r0.d()     // Catch: java.lang.Throwable -> Lca
            r1.b(r2, r4)     // Catch: java.lang.Throwable -> Lca
            goto Lbe
        L95:
            boolean r4 = r0.c()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto Lb3
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r0.a()     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto Lad
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r1 = r0.b()     // Catch: java.lang.Throwable -> Lca
            boolean r2 = r0.d()     // Catch: java.lang.Throwable -> Lca
            r1.b(r2, r4)     // Catch: java.lang.Throwable -> Lca
            goto Lbe
        Lad:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            throw r4     // Catch: java.lang.Throwable -> Lca
        Lb3:
            com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel r4 = r0.b()     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> Lca
            r4.a(r1)     // Catch: java.lang.Throwable -> Lca
        Lbe:
            ffbr r4 = r0.h     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lca
            aspv r4 = (defpackage.aspv) r4     // Catch: java.lang.Throwable -> Lca
            defpackage.ekyf.q()
            return
        Lca:
            r4 = move-exception
            defpackage.ekyf.q()     // Catch: java.lang.Throwable -> Lcf
            goto Ld3
        Lcf:
            r0 = move-exception
            r4.addSuppressed(r0)
        Ld3:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqu.h(android.os.Bundle):void");
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

    @Override // defpackage.cvrk, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
