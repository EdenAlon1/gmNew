package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes2.dex */
class waj extends wbg {
    private ContextWrapper a;
    private boolean b;
    private boolean c = false;

    private final void e() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.wal
    protected final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        wbe wbeVar = (wbe) this;
        akgt akgtVar = (akgt) aX();
        wbeVar.a = akgtVar.h();
        wbeVar.b = akgtVar.i();
        wbeVar.c = akgtVar.j();
        akis akisVar = akgtVar.a;
        akkp akkpVar = akisVar.a;
        wbeVar.d = akkpVar.Z;
        wbeVar.e = akkpVar.ry;
        wbeVar.ag = akgtVar.C;
        wbeVar.ah = akisVar.b.oJ;
    }

    @Override // defpackage.wal, defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e();
        a();
    }

    @Override // defpackage.wal, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        e();
        a();
    }

    @Override // defpackage.wal, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.wal, defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        e();
        return this.a;
    }
}
