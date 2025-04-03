package defpackage;

import android.util.Range;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amd implements bhh {
    private final bdp a;

    public amd() {
        bfh a = bfh.a();
        a.c(bhh.r, new ajy());
        a.c(C, 34);
        a.c(n, ame.class);
        a.c(m, ame.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = a;
    }

    @Override // defpackage.beq
    public final /* synthetic */ int a() {
        return bep.a(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ int b() {
        return bhe.a(this);
    }

    @Override // defpackage.beq
    public final /* synthetic */ int c() {
        return bep.b(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ int d() {
        return bhe.b(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ Range e(Range range) {
        return bhe.c(this, range);
    }

    @Override // defpackage.beq
    public final /* synthetic */ aua f() {
        return bep.c(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ bal g() {
        return bhe.d(this);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ bdo h(bdn bdnVar) {
        return bfy.a(this, bdnVar);
    }

    @Override // defpackage.bfz
    public final bdp i() {
        return this.a;
    }

    @Override // defpackage.bhh
    public final /* synthetic */ bgk j() {
        return bhe.e(this);
    }

    @Override // defpackage.bhh
    public final bhj k() {
        return bhj.METERING_REPEATING;
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Object l(bdn bdnVar) {
        return bfy.b(this, bdnVar);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Object m(bdn bdnVar, Object obj) {
        return bfy.c(this, bdnVar, obj);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ Object n(bdn bdnVar, bdo bdoVar) {
        return bfy.d(this, bdnVar, bdoVar);
    }

    @Override // defpackage.bli
    public final /* synthetic */ String o() {
        return blh.a(this);
    }

    @Override // defpackage.bli
    public final /* synthetic */ String p(String str) {
        return blh.b(this, str);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ Set q(bdn bdnVar) {
        return bfy.e(this, bdnVar);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Set r() {
        return bfy.f(this);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ boolean s(bdn bdnVar) {
        return bfy.g(this, bdnVar);
    }

    @Override // defpackage.beq
    public final /* synthetic */ boolean t() {
        return bep.d(this);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ void u(ask askVar) {
        bfy.h(this, askVar);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ bgk v() {
        return bhe.g(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ bgf w() {
        return bhe.h(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ int x() {
        return bhe.i(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ boolean y() {
        return bhe.j(this);
    }

    @Override // defpackage.bhh
    public final /* synthetic */ boolean z() {
        return bhe.k(this);
    }
}
