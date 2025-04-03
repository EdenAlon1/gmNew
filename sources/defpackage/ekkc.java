package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekkc extends ea implements elar {
    protected final ekxu a = new ekxu(this);

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        ffig.a(this.a.j(), null);
        return false;
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        ffig.a(this.a.h(i, i2), null);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        elav c = this.a.c();
        try {
            super.ae(bundle);
            ffig.a(c, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.a.f();
        try {
            super.af(i, i2, intent);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ai() {
        elav b = this.a.b();
        try {
            super.ai();
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void am() {
        elav c = this.a.c();
        try {
            super.am();
            ffig.a(c, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ao() {
        elav b = this.a.b();
        try {
            super.ao();
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        ffig.a(this.a.c(), null);
    }

    public elds bb() {
        throw null;
    }

    public void bd(elds eldsVar, boolean z) {
        throw null;
    }

    public void be(elds eldsVar) {
        throw null;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        lkr lkrVar = this.E;
        if (lkrVar instanceof elar) {
            ekxu ekxuVar = this.a;
            if (ekxuVar.a == null) {
                ekxuVar.e(((elar) lkrVar).bb(), true);
            }
        }
        this.a.d();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        elav c = this.a.c();
        try {
            super.h(bundle);
            ffig.a(c, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void i() {
        elav b = this.a.b();
        try {
            super.i();
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        ffig.a(this.a.c(), null);
    }

    @Override // defpackage.ea
    public final void l() {
        elav c = this.a.c();
        try {
            super.l();
            ffig.a(c, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void m() {
        elav c = this.a.c();
        try {
            super.m();
            ffig.a(c, null);
        } finally {
        }
    }

    protected final void p() {
        super.j();
    }

    protected final void q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final Animator y(int i, boolean z, int i2) {
        ffig.a(this.a.h(i, i2), null);
        return null;
    }
}
