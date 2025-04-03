package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwz implements amxx, amfx {
    public final amfx a;
    private final avji b;
    private final ffbz c;

    public amwz(amfx amfxVar, avji avjiVar) {
        amfxVar.getClass();
        this.a = amfxVar;
        this.b = avjiVar;
        this.c = ffca.a(new ffix() { // from class: amwy
            @Override // defpackage.ffix
            public final Object invoke() {
                ConversationId c = amwz.this.a.c();
                c.getClass();
                return new RbmConversationId(((BugleConversationId) c).a);
            }
        });
    }

    @Override // defpackage.amfx
    public final ayhd A() {
        return this.a.A();
    }

    @Override // defpackage.amfx
    public final azcr B() {
        return this.a.B();
    }

    @Override // defpackage.amfx
    public final ckte D() {
        return this.a.D();
    }

    @Override // defpackage.amfx
    public final eoxn E() {
        return this.a.E();
    }

    @Override // defpackage.amfx
    public final Instant F() {
        return this.a.F();
    }

    @Override // defpackage.amfx
    public final String G() {
        return this.a.G();
    }

    @Override // defpackage.amfx
    public final String H() {
        return this.a.H();
    }

    @Override // defpackage.amfx
    public final String I() {
        return this.a.I();
    }

    @Override // defpackage.amfx
    public final boolean J() {
        return this.a.J();
    }

    @Override // defpackage.amfx
    public final boolean K() {
        return this.a.K();
    }

    @Override // defpackage.amfx
    public final /* synthetic */ boolean L() {
        return amfw.a(this);
    }

    @Override // defpackage.amfx
    public final boolean M() {
        return true;
    }

    @Override // defpackage.alxj
    public final Uri a() {
        return this.a.a();
    }

    @Override // defpackage.alxj
    public final alxi b() {
        return this.a.b();
    }

    @Override // defpackage.alxj
    public final ConversationId c() {
        return (ConversationId) this.c.a();
    }

    @Override // defpackage.alxj
    public final amny d() {
        return this.a.d();
    }

    @Override // defpackage.alxj
    public final ampp e() {
        return this.a.e();
    }

    @Override // defpackage.alxj
    public final aqux f() {
        return this.a.f();
    }

    @Override // defpackage.alxj
    public final byyt g() {
        return this.a.g();
    }

    @Override // defpackage.alxj
    public final cfmh h() {
        return this.a.h();
    }

    @Override // defpackage.alxj
    public final String i() {
        return this.a.i();
    }

    @Override // defpackage.alxj
    public final boolean j() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.alxj
    public final boolean l() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.alxj
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.alxj
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.alxj
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.alxj
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.alxj
    public final boolean r() {
        return this.a.r();
    }

    @Override // defpackage.alxj
    public final boolean s() {
        return this.a.s();
    }

    @Override // defpackage.alxj
    public final boolean t() {
        return this.a.t();
    }

    @Override // defpackage.alxj
    public final boolean u() {
        return this.a.u();
    }

    @Override // defpackage.amfx
    public final int v() {
        return this.a.v();
    }

    @Override // defpackage.amfx
    public final int w() {
        return this.a.w();
    }

    @Override // defpackage.amfx
    public final long x() {
        return this.a.x();
    }

    @Override // defpackage.amxx
    public final avji y() {
        return this.b;
    }

    @Override // defpackage.amfx
    public final amtc z() {
        return this.a.z();
    }
}
