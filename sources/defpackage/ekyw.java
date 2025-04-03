package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekyw extends ekwf implements ekxr {
    static final ekxp a = new ekxq();
    public static final /* synthetic */ int c = 0;
    public final boolean b;
    private final Exception d;

    public ekyw(UUID uuid, Exception exc, boolean z, elao elaoVar) {
        super("<missing root>", uuid, elaoVar);
        this.d = exc;
        this.b = z;
    }

    static ekyw k(elao elaoVar) {
        UUID b = ekyj.a.b();
        if (!elau.a()) {
            r();
            return new ekyw(b, a, false, elaoVar);
        }
        ekxp ekxpVar = new ekxp();
        r();
        return new ekyw(b, ekxpVar, ekyf.u(ekxpVar), elaoVar);
    }

    public static void r() {
        enip l = ekyf.l();
        if (l.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(l, new Consumer() { // from class: ekyv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                int i = ekyw.c;
                ((elcd) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ekxr
    public final elat f(String str, elae elaeVar, boolean z, elao elaoVar) {
        if (z) {
            ekyf.y();
        }
        return new ekyy(str, this, elaeVar, z, elaoVar);
    }

    @Override // defpackage.ekxr
    public final Exception g() {
        return this.d;
    }

    @Override // defpackage.ekxr
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.elat
    public final elaa i(elab elabVar) {
        return elaa.d(2);
    }

    @Override // defpackage.elat
    public final elae j() {
        return elad.a;
    }

    @Override // defpackage.elat
    public final elae l() {
        throw null;
    }

    @Override // defpackage.elat
    public final elat m(String str, elae elaeVar, elao elaoVar) {
        ekyf.y();
        return f(str, elaeVar, true, elaoVar);
    }

    @Override // defpackage.elat
    public final boolean q() {
        return false;
    }

    @Override // defpackage.elat
    public final void s() {
    }

    @Override // defpackage.elat
    public final void n(int i) {
    }

    @Override // defpackage.elat
    public final void p(boolean z) {
    }

    @Override // defpackage.elat
    public final void o(elab elabVar, Object obj) {
    }
}
