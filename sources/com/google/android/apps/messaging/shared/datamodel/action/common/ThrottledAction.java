package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bbcd;
import defpackage.bbcg;
import defpackage.bbcs;
import defpackage.bbct;
import defpackage.bbdf;
import defpackage.cniz;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctba;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwn;
import defpackage.eogt;
import defpackage.erpp;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ThrottledAction extends Action<Void> {
    private static final cskc a = cskc.g("Bugle", "ThrottledAction");
    private final bbct b;

    /* compiled from: PG */
    public interface a {
        bbct hC();
    }

    protected ThrottledAction(Parcel parcel, eogt eogtVar) {
        super(parcel, eogtVar);
        this.b = ((a) ctba.a(a.class)).hC();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void B(bbcd bbcdVar) {
        bbcd.b(this.s, bbcdVar);
        H().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void F(bbcd bbcdVar) {
        bbcd.b(this.s, bbcdVar);
        H().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void G(long j) {
        int f = f();
        bbcs H = H();
        H.d(this, f, j, j, true);
        bbdf bbdfVar = H.c;
    }

    public final bbcs H() {
        bbcs bbcsVar;
        Class<?> cls = getClass();
        bbct bbctVar = this.b;
        synchronized (bbctVar.a) {
            if (!bbctVar.a.containsKey(cls)) {
                bbctVar.a.put(cls, (bbcs) bbctVar.b.b());
            }
            bbcsVar = (bbcs) bbctVar.a.get(cls);
        }
        return bbcsVar;
    }

    protected final void I(ThrottledAction throttledAction, String str) {
        bbcg bbcgVar = throttledAction.t;
        boolean z = false;
        boolean z2 = this.t.z(str, false);
        boolean z3 = bbcgVar.z(str, false);
        if (z2 && z3) {
            z = true;
        }
        this.t.p(str, z);
    }

    protected final void J(ThrottledAction throttledAction, String str) {
        this.t.p(str, this.t.z(str, false) || throttledAction.t.z(str, false));
    }

    public final void K() {
        H().d(this, f(), 0L, g(), false);
    }

    final boolean L() {
        bbcg bbcgVar = this.t;
        if (bbcgVar != null) {
            return bbcgVar.z("is_background", true);
        }
        csjb a2 = a.a();
        a2.I("actionParameters is null:");
        a2.I(getClass().getName());
        a2.r();
        return true;
    }

    public final void M() {
        G(g());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public ekzz a() {
        return eleg.f("ThrottledAction unknown action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new UnsupportedOperationException("#executeActionAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        if (!L()) {
            return H().a(this);
        }
        w();
        return elfo.e(null);
    }

    public abstract int f();

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        throw new UnsupportedOperationException("#doBackgroundWorkAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        return L() ? H().a(this).h(new emwn(null), erpp.a) : elfo.e(null);
    }

    public abstract long g();

    public abstract String h();

    public elfl k() {
        return elfo.f(new Runnable() { // from class: bbcr
            @Override // java.lang.Runnable
            public final void run() {
                ThrottledAction.this.i();
            }
        }, erpp.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture r(cniz cnizVar) {
        return H().b(this, f(), cnizVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture t() {
        return H().b(this, f(), null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void x(long j) {
        H().d(this, f(), j, j, false);
    }

    public ThrottledAction(eogt eogtVar) {
        super(eogtVar);
        this.b = ((a) ctba.a(a.class)).hC();
    }

    public void i() {
    }

    public void j(ThrottledAction throttledAction) {
    }
}
