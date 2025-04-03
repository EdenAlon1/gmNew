package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxn implements dsyj {
    final /* synthetic */ drxo a;
    private final /* synthetic */ dsyj b;

    public drxn(dsyj dsyjVar, drxo drxoVar) {
        this.a = drxoVar;
        this.b = dsyjVar;
    }

    @Override // defpackage.dsyj
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dsyj
    public final /* bridge */ /* synthetic */ View b() {
        drxo drxoVar = this.a;
        if (drxoVar.i == 3) {
            return drxoVar.c;
        }
        return null;
    }

    @Override // defpackage.dsyj
    public final dsyc c() {
        return this.b.c();
    }

    @Override // defpackage.dsyj
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.dsyj
    public final void e() {
        this.a.d.b.f();
    }

    @Override // defpackage.dsyj
    public final void f(int i) {
        this.b.f(i);
    }

    @Override // defpackage.dsyj
    public final boolean g() {
        return this.b.g();
    }

    @Override // defpackage.dsyj
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.dsyj
    public final boolean i(int i) {
        dryd drydVar = this.a.d.b;
        drydVar.f = false;
        if (!drydVar.a(-i, true) && drydVar.b()) {
            drydVar.f = true;
            if (this.a.d.b.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dsyj
    public final void j(int i) {
        this.b.j(i);
    }

    @Override // defpackage.dsyj
    public final void k(boolean z) {
        this.b.k(z);
    }
}
