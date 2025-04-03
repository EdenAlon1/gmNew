package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekyy extends ekxs implements ekxr {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public ekyy(String str, ekxr ekxrVar, elae elaeVar, boolean z, elao elaoVar) {
        super("<missing root>:".concat(String.valueOf(str)), ekxrVar, elae.e(elaeVar, elad.b), elaoVar);
        this.b = ekxrVar.g();
        this.a = ekxrVar.h();
        this.c = z;
    }

    public static void k() {
        enip l = ekyf.l();
        if (l.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(l, new Consumer() { // from class: ekyx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((elcd) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ekxr
    public final elat f(String str, elae elaeVar, boolean z, elao elaoVar) {
        if (z && !this.c) {
            ekyf.y();
        }
        boolean z2 = true;
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new ekyy(str, this, elaeVar, z2, elaoVar);
    }

    @Override // defpackage.ekxr
    public final Exception g() {
        return this.b;
    }

    @Override // defpackage.ekxr
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.ekxs, defpackage.elat
    public final elaa i(elab elabVar) {
        elaa i = super.i(elabVar);
        return i.c() == 3 ? elaa.d(2) : i;
    }

    @Override // defpackage.elat
    public final elae l() {
        return elad.a;
    }

    @Override // defpackage.elat
    public final elat m(String str, elae elaeVar, elao elaoVar) {
        return f(str, elaeVar, true, elaoVar);
    }

    @Override // defpackage.elat
    public final boolean q() {
        return false;
    }

    public ekyy(UUID uuid, String str, elae elaeVar, Exception exc, boolean z, boolean z2, elao elaoVar) {
        super("<missing root>:".concat(String.valueOf(str)), uuid, elae.e(elaeVar, elad.b), elaoVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
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
