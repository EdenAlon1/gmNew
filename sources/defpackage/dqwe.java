package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqwe extends dtae implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    public dqwe(dtab dtabVar) {
        super(R.layout.gboard_emoji_screen_layout, dtabVar);
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        f();
    }

    @Override // defpackage.fbat
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new fbae(this);
                }
            }
        }
        return this.c;
    }

    protected final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        dqvo dqvoVar = (dqvo) this;
        akgt akgtVar = (akgt) aX();
        dqvoVar.aK = (ernh) akgtVar.a.lm.b();
        dqvoVar.aL = akgtVar.a.ll;
        dqvoVar.aM = (ffsk) akgtVar.g.b();
        dqvoVar.aN = Optional.of(akgtVar.a.hI);
        dqvoVar.a = (dqok) akgtVar.a.b.hC.b();
        dqvoVar.b = emxc.j(akgtVar.B());
        dqvoVar.c = akgtVar.C();
        dqvoVar.d = akgtVar.A();
        fbbf fbbfVar = akgtVar.c.d;
        fbbf fbbfVar2 = akgtVar.d;
        fbbf fbbfVar3 = akgtVar.g;
        akis akisVar = akgtVar.a;
        fbbf fbbfVar4 = akisVar.t;
        akko akkoVar = akisVar.b;
        dqvoVar.e = new dqwb(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akkoVar.pN, akgtVar.bS);
        Context context = (Context) akgtVar.a.q.b();
        errm errmVar = (errm) akgtVar.a.p.b();
        errm errmVar2 = (errm) akgtVar.a.t.b();
        dqvc dqvcVar = (dqvc) akgtVar.a.b.pO.b();
        akis akisVar2 = akgtVar.a;
        dqvoVar.ag = new dqvb(context, errmVar, errmVar2, dqvcVar, akisVar2.b.cL(), (dqkk) akisVar2.ll.b());
    }

    @Override // defpackage.dslv, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        f();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }
}
