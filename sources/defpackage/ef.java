package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ef extends en implements kop, koq, gx, gy, lmy, acd, ado, owz, fx, ktt {
    final /* synthetic */ eg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(eg egVar) {
        super(egVar, egVar, new Handler());
        this.a = egVar;
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return this.a.b;
    }

    @Override // defpackage.lmy
    public final lmx S() {
        return this.a.S();
    }

    @Override // defpackage.owz
    public final owv U() {
        return this.a.U();
    }

    @Override // defpackage.en, defpackage.ek
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.en, defpackage.ek
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ado
    public final adn d() {
        return this.a.h;
    }

    @Override // defpackage.en
    public final void f() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.kop
    public final void g(ksp kspVar) {
        throw null;
    }

    @Override // defpackage.acd
    public final aca gE() {
        return this.a.gE();
    }

    @Override // defpackage.fx
    public final void h(ea eaVar) {
        this.a.h(eaVar);
    }

    @Override // defpackage.kop
    public final void hv(ksp kspVar) {
        this.a.hv(kspVar);
    }
}
