package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czml extends gu implements fbat {
    private ContextWrapper ai;
    private boolean aj;
    private volatile fbae ak;
    private final Object al = new Object();
    private boolean am = false;

    private final void b() {
        if (this.ai == null) {
            this.ai = new fbal.a(super.z(), this);
            this.aj = fazm.a(super.z());
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
        ContextWrapper contextWrapper = this.ai;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        f();
    }

    @Override // defpackage.fbat
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.ak == null) {
            synchronized (this.al) {
                if (this.ak == null) {
                    this.ak = new fbae(this);
                }
            }
        }
        return this.ak;
    }

    protected final void f() {
        if (this.am) {
            return;
        }
        this.am = true;
        MessageStatusListFragment messageStatusListFragment = (MessageStatusListFragment) this;
        akgt akgtVar = (akgt) aX();
        messageStatusListFragment.aj = (aliv) akgtVar.a.ig.b();
        messageStatusListFragment.ak = (alir) akgtVar.a.hv.b();
        messageStatusListFragment.al = (azwc) akgtVar.be.b();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        b();
        f();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.aj) {
            return null;
        }
        b();
        return this.ai;
    }
}
