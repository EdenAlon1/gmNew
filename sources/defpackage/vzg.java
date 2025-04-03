package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzg extends wae implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private vzn d;
    private Context e;

    @Deprecated
    public vzg() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return vzn.class;
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vzn H() {
        vzn vznVar = this.d;
        if (vznVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vznVar;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            vzn H = H();
            if (i == 1000) {
                if (i2 == -1) {
                    Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null;
                    String obj = parcelableExtra == null ? "" : parcelableExtra.toString();
                    bcuj bcujVar = H.c;
                    bcujVar.d.a(bcujVar.a, null, obj, null, null).t();
                    csjy.i("Bugle", "user selected sound ".concat(String.valueOf(obj)));
                } else {
                    csjy.i("Bugle", "user canceled sound selection");
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.wae, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.wae
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

    @Override // defpackage.wae, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    fbbf fbbfVar = ((akgt) aX).v;
                    fbbf fbbfVar2 = ((akgt) aX).b.g;
                    akis akisVar = ((akgt) aX).a;
                    fbbf fbbfVar3 = akisVar.a.Px;
                    fbbf fbbfVar4 = ((akgt) aX).w;
                    fbbf fbbfVar5 = akisVar.cI;
                    fazb a = fbaz.a(((akgt) aX).x);
                    fbbf fbbfVar6 = ((akgt) aX).A;
                    fbbf fbbfVar7 = ((akgt) aX).b.e;
                    fbaz.a(((akgt) aX).a.a.an);
                    fazb a2 = fbaz.a(((akgt) aX).b.bU);
                    fazb a3 = fbaz.a(((akgt) aX).k);
                    fazb a4 = fbaz.a(((akgt) aX).l);
                    fazb a5 = fbaz.a(((akgt) aX).b.Z);
                    fbbf fbbfVar8 = ((akgt) aX).y;
                    fazb a6 = fbaz.a(((akgt) aX).a.aJ);
                    fazb a7 = fbaz.a(((akgt) aX).a.t);
                    akis akisVar2 = ((akgt) aX).a;
                    fbbf fbbfVar9 = akisVar2.kk;
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof vzg)) {
                        throw new IllegalStateException(a.J(eaVar, vzn.class));
                    }
                    vzg vzgVar = (vzg) eaVar;
                    fbbf fbbfVar10 = akisVar2.a.DL;
                    fbbf fbbfVar11 = akisVar2.aR;
                    Bundle a8 = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a8.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    vzi vziVar = (vzi) ProtoParsers.f(a8, "TIKTOK_FRAGMENT_ARGUMENT", vzi.a, eyfcVar);
                    vziVar.getClass();
                    this.d = new vzn(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, a, fbbfVar6, fbbfVar7, a2, a3, a4, a5, fbbfVar8, a6, a7, fbbfVar9, vzgVar, fbbfVar10, fbbfVar11, vziVar);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            vzn H = H();
            bcuk bcukVar = (bcuk) H.l.b();
            ConversationIdType conversationIdType = H.y;
            boolean z = H.A;
            boolean z2 = H.B;
            ayhd ayhdVar = H.C;
            bbes bbesVar = (bbes) bcukVar.a.b();
            bbesVar.getClass();
            conversationIdType.getClass();
            ayhdVar.getClass();
            H.c = new bcuj(bbesVar, conversationIdType, z, z2);
            csjy.i("Bugle", "showing group options for conversation ".concat(String.valueOf(String.valueOf(H.y))));
            ((ejlq) H.q.b()).k(H.E);
            ((ejlq) H.q.b()).k(H.F);
            ((ejlq) H.q.b()).k(H.I);
            ((ejlq) H.q.b()).k(H.G);
            ((ejwl) H.p.b()).b(((wbh) H.o.b()).a(H.x.a, H.y), H.D);
            cwpv cwpvVar = (cwpv) H.x.G();
            if (cwpvVar != null) {
                if (H.A) {
                    cwpvVar.setTitle(R.string.people_and_options_activity_title_group);
                }
                cwpvVar.k();
            }
            H.d = new vzw(H);
            H.e = new vzt(H, ((Boolean) vzz.b.e()).booleanValue());
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

    @Override // defpackage.wae, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
