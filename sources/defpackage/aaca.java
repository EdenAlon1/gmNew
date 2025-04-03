package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaca implements alxr {
    public final List a;
    private final /* synthetic */ alxr b;
    private final aacb c;
    private final apyd d;
    private final alya e;
    private final boolean f;

    public aaca(alxr alxrVar, alxr alxrVar2) {
        alya aabyVar;
        this.b = alxrVar2;
        boolean z = true;
        List ae = alxrVar instanceof aaca ? ffdx.ae(((aaca) alxrVar).a, alxrVar2) : ffdx.g(alxrVar, alxrVar2);
        this.a = ae;
        this.c = new aacb(ae);
        this.d = new aabz(this);
        if (!ae.isEmpty()) {
            Iterator it = ae.iterator();
            while (it.hasNext()) {
                if (!(((alxr) it.next()).d() instanceof alyn)) {
                    aabyVar = alxrVar2.d();
                    break;
                }
            }
        }
        aabyVar = new aaby(alxrVar2, this);
        this.e = aabyVar;
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((alxr) it2.next()).y()) {
                    break;
                }
            }
        }
        z = false;
        this.f = z;
    }

    @Override // defpackage.alxr
    public final apxv A() {
        return this.b.A();
    }

    @Override // defpackage.alxr
    public final int B() {
        return this.b.B();
    }

    @Override // defpackage.alxr
    public final int C() {
        return this.b.C();
    }

    @Override // defpackage.alxr
    public final alxq a() {
        return this.b.a();
    }

    @Override // defpackage.alxr
    public final MessageId b() {
        return this.b.b();
    }

    @Override // defpackage.alxr
    public final alxz c() {
        return this.b.c();
    }

    @Override // defpackage.alxr
    public final alya d() {
        return this.e;
    }

    @Override // defpackage.alxr
    public final alyu e() {
        return this.b.e();
    }

    @Override // defpackage.alxr
    public final ConversationId f() {
        return this.b.f();
    }

    @Override // defpackage.alxr
    public final /* synthetic */ appj g() {
        return this.c;
    }

    @Override // defpackage.alxr
    public final appu h() {
        return this.b.h();
    }

    @Override // defpackage.alxr
    public final apyd i() {
        return this.d;
    }

    @Override // defpackage.alxr
    public final aqcm j() {
        return this.b.j();
    }

    @Override // defpackage.alxr
    public final aqge k(int i) {
        return this.b.k(i);
    }

    @Override // defpackage.alxr
    public final aqge l() {
        return this.b.l();
    }

    @Override // defpackage.alxr
    public final elfl m() {
        return this.b.m();
    }

    @Override // defpackage.alxr
    public final Instant n() {
        return this.b.n();
    }

    @Override // defpackage.alxr
    public final Instant o() {
        return this.b.o();
    }

    @Override // defpackage.alxr
    public final Long p() {
        return this.b.p();
    }

    @Override // defpackage.alxr
    public final String q() {
        return this.b.q();
    }

    @Override // defpackage.alxr
    public final String r() {
        return this.b.r();
    }

    @Override // defpackage.alxr
    public final boolean s(aqux aquxVar) {
        return this.b.s(aquxVar);
    }

    @Override // defpackage.alxr
    public final boolean t() {
        return this.b.t();
    }

    @Override // defpackage.alxr
    public final boolean u(aqux aquxVar) {
        return this.b.u(aquxVar);
    }

    @Override // defpackage.alxr
    public final boolean v() {
        return this.b.v();
    }

    @Override // defpackage.alxr
    public final boolean w() {
        return this.b.w();
    }

    @Override // defpackage.alxr
    public final boolean x() {
        return this.b.x();
    }

    @Override // defpackage.alxr
    public final boolean y() {
        return this.f;
    }

    @Override // defpackage.alxr
    public final aqdr z() {
        return this.b.z();
    }
}
