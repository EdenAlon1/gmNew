package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drwi extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    drwi() {
        this.d = new Object();
        this.e = false;
    }

    private final void e() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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
        e();
        b();
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        drwz drwzVar = (drwz) this;
        akgt akgtVar = (akgt) aX();
        drwzVar.aK = (ernh) akgtVar.a.lm.b();
        drwzVar.aL = akgtVar.a.ll;
        drwzVar.aM = (ffsk) akgtVar.g.b();
        drwzVar.aN = Optional.of(akgtVar.u);
        drwzVar.ag = new drxr(akgtVar.bY, akgtVar.bZ);
        drwzVar.ah = new drxp(akgtVar.r);
        akgb akgbVar = akgtVar.c;
        fbbf fbbfVar = akgbVar.d;
        fbbf fbbfVar2 = akgtVar.g;
        akkp akkpVar = akgtVar.a.a;
        drwzVar.ai = new drzj(fbbfVar, fbbfVar2, akkpVar.p, akkpVar.q, akgbVar.bx, akgtVar.cb);
        drwzVar.aj = Optional.of(new dqyz((ea) ((fbbb) akgtVar.d).a, (dqze) akgtVar.a.a.un.b(), new ajeh((ea) ((fbbb) akgtVar.d).a), (Optional) akgtVar.c.cJ.b(), Optional.of((adao) akgtVar.a.b.lO.b()), (Optional) akgtVar.bU.b(), (ffsk) akgtVar.a.a.p.b()));
        drwzVar.ak = Optional.of((dqza) akgtVar.a.a.Kh.b());
    }

    @Override // defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        e();
        b();
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
        e();
        return this.a;
    }

    public drwi(Integer num, dtab dtabVar) {
        super(num, dtabVar);
        this.d = new Object();
        this.e = false;
    }
}
