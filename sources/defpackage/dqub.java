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
public abstract class dqub extends dtae implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    public dqub(dtab dtabVar) {
        super(R.layout.emoji_screen_layout, dtabVar);
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
        bh();
    }

    @Override // defpackage.fbat
    /* renamed from: bg, reason: merged with bridge method [inline-methods] */
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

    protected final void bh() {
        if (this.e) {
            return;
        }
        this.e = true;
        dqtz dqtzVar = (dqtz) this;
        akgt akgtVar = (akgt) aX();
        dqtzVar.aK = (ernh) akgtVar.a.lm.b();
        dqtzVar.aL = akgtVar.a.ll;
        dqtzVar.aM = (ffsk) akgtVar.g.b();
        dqtzVar.aN = Optional.of(akgtVar.a.hI);
        dqtzVar.a = (dqoh) akgtVar.a.b.hC.b();
        dqtzVar.b = (ffsk) akgtVar.a.a.p.b();
        dqtzVar.c = (dqxh) akgtVar.c.cP.b();
        dqtzVar.d = new dquy((Activity) akgtVar.c.d.b(), (ffsk) akgtVar.a.a.p.b(), (dqoy) akgtVar.a.b.hH.b(), (dqkk) akgtVar.a.ll.b(), (ffsk) akgtVar.g.b(), (dqxh) akgtVar.c.cP.b());
        dqtzVar.e = new dquz((dqoy) akgtVar.a.b.hH.b(), (dqkk) akgtVar.a.ll.b(), (dqxh) akgtVar.c.cP.b(), (ffsk) akgtVar.g.b());
        dqtzVar.ah = emxc.j(akgtVar.B());
        dqtzVar.ai = akgtVar.C();
        dqtzVar.aj = akgtVar.z();
        dqtzVar.al = (dqoy) akgtVar.a.b.hH.b();
    }

    @Override // defpackage.dslv, defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        bh();
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
