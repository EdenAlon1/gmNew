package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pn extends tq {
    final /* synthetic */ po a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(po poVar, View view) {
        super(view);
        this.a = poVar;
    }

    @Override // defpackage.tq
    public final ou a() {
        pp ppVar = this.a.a.j;
        if (ppVar == null) {
            return null;
        }
        return ppVar.a();
    }

    @Override // defpackage.tq
    public final boolean b() {
        this.a.a.p();
        return true;
    }

    @Override // defpackage.tq
    public final boolean c() {
        pt ptVar = this.a.a;
        if (ptVar.l != null) {
            return false;
        }
        ptVar.m();
        return true;
    }
}
