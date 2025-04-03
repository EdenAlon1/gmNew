package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsa implements amfx {
    private final ConversationId a;
    private final amfx b;

    public amsa(ConversationId conversationId, amfx amfxVar) {
        this.a = conversationId;
        this.b = amfxVar;
    }

    @Override // defpackage.amfx
    public final ayhd A() {
        return this.b.A();
    }

    @Override // defpackage.amfx
    public final azcr B() {
        return this.b.B();
    }

    @Override // defpackage.amfx
    public final ckte D() {
        return this.b.D();
    }

    @Override // defpackage.amfx
    public final eoxn E() {
        return this.b.E();
    }

    @Override // defpackage.amfx
    public final Instant F() {
        return this.b.F();
    }

    @Override // defpackage.amfx
    public final String G() {
        return this.b.G();
    }

    @Override // defpackage.amfx
    public final String H() {
        return this.b.H();
    }

    @Override // defpackage.amfx
    public final String I() {
        return this.b.I();
    }

    @Override // defpackage.amfx
    public final boolean J() {
        return this.b.J();
    }

    @Override // defpackage.amfx
    public final boolean K() {
        return this.b.K();
    }

    @Override // defpackage.amfx
    public final /* synthetic */ boolean L() {
        return amfw.a(this);
    }

    @Override // defpackage.amfx
    public final boolean M() {
        return this.b.M();
    }

    @Override // defpackage.alxj
    public final Uri a() {
        return this.b.a();
    }

    @Override // defpackage.alxj
    public final alxi b() {
        return this.b.b();
    }

    @Override // defpackage.alxj
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.alxj
    public final amny d() {
        return this.b.d();
    }

    @Override // defpackage.alxj
    public final ampp e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amsa)) {
            return false;
        }
        amsa amsaVar = (amsa) obj;
        return ffkj.e(this.a, amsaVar.a) && ffkj.e(this.b, amsaVar.b);
    }

    @Override // defpackage.alxj
    public final aqux f() {
        return this.b.f();
    }

    @Override // defpackage.alxj
    public final byyt g() {
        return this.b.g();
    }

    @Override // defpackage.alxj
    public final cfmh h() {
        return this.b.h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.alxj
    public final String i() {
        return this.b.i();
    }

    @Override // defpackage.alxj
    public final boolean j() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean k() {
        return this.b.k();
    }

    @Override // defpackage.alxj
    public final boolean l() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean m() {
        return this.b.m();
    }

    @Override // defpackage.alxj
    public final boolean n() {
        return this.b.n();
    }

    @Override // defpackage.alxj
    public final boolean o() {
        return this.b.o();
    }

    @Override // defpackage.alxj
    public final boolean p() {
        return this.b.p();
    }

    @Override // defpackage.alxj
    public final boolean q() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean r() {
        return this.b.r();
    }

    @Override // defpackage.alxj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.alxj
    public final boolean t() {
        return this.b.t();
    }

    public final String toString() {
        return ffpc.b("\n    EmergencySosConversationProperties: {\n        id: " + this.a + "\n        kind: " + b() + "\n        ConversationType: " + byyr.a(v()) + "\n        name: " + i() + "\n        nameIsAutomatic: " + r() + "\n        canAddPeople: false\n        archiveStatus: " + g() + "\n        isDeleted: " + u() + "\n        activeSelfIdentity: " + f() + "\n        longPressActionsEnabled: false\n        shouldShowSinName: false\n        canRequestManualSatelliteConnection: false\n        muteStatus: " + cjcn.b + "\n    }\n  ");
    }

    @Override // defpackage.alxj
    public final boolean u() {
        return this.b.u();
    }

    @Override // defpackage.amfx
    public final int v() {
        return this.b.v();
    }

    @Override // defpackage.amfx
    public final int w() {
        return this.b.w();
    }

    @Override // defpackage.amfx
    public final long x() {
        return this.b.x();
    }

    @Override // defpackage.amfx
    public final amtc z() {
        return this.b.z();
    }
}
