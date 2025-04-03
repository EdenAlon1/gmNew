package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apbz implements aotl {
    public final aotl a;
    private final ffbz b;
    private final ffbz c;

    public apbz(ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, aorw aorwVar, boolean z, boolean z2) {
        this.a = ((aoye) ffbrVar.b()).a(bugleConversationId, aqgeVar, aqgeVar2, aqgeVar3, aorwVar, z, z2);
        this.b = ffca.a(new ffix() { // from class: apbx
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((aptw) ffbr.this.b()).a(this.a);
            }
        });
        this.c = ffca.a(new ffix() { // from class: apby
            @Override // defpackage.ffix
            public final Object invoke() {
                aqbp aqbpVar = (aqbp) ffbr.this.b();
                final apbz apbzVar = this;
                return aqbpVar.a(Optional.of(apbzVar.a), new ffbr() { // from class: apbv
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        alym f = apbz.this.a.f();
                        f.getClass();
                        return f;
                    }
                }, new ffbr() { // from class: apbw
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return apbz.this.a().a();
                    }
                });
            }
        });
    }

    @Override // defpackage.alye
    public final elfl A(MessageId messageId) {
        elfl A = this.a.A(messageId);
        A.getClass();
        return A;
    }

    @Override // defpackage.alye
    public final elfl B(MessageId messageId, String str, fjay fjayVar) {
        return this.a.B(messageId, str, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl C(MessageId messageId) {
        elfl C = this.a.C(messageId);
        C.getClass();
        return C;
    }

    @Override // defpackage.alye
    public final elfl D(MessageId messageId) {
        elfl D = this.a.D(messageId);
        D.getClass();
        return D;
    }

    @Override // defpackage.alye
    public final elfl E(MessageId messageId) {
        return this.a.E(messageId);
    }

    @Override // defpackage.alye
    public final elfl F(alyv alyvVar) {
        elfl F = this.a.F(alyvVar);
        F.getClass();
        return F;
    }

    @Override // defpackage.alye
    public final elfl G(MessageId messageId) {
        return this.a.G(messageId);
    }

    @Override // defpackage.alye
    public final elfl H(MessageId messageId, int i) {
        elfl H = this.a.H(messageId, i);
        H.getClass();
        return H;
    }

    @Override // defpackage.alye
    public final void I(MessageId messageId, int i) {
        this.a.I(messageId, i);
    }

    @Override // defpackage.alye
    public final void J(alxr alxrVar, int i) {
        this.a.J(alxrVar, i);
    }

    @Override // defpackage.alye
    public final elfl K(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar) {
        return this.a.K(messageId, apyvVar, cmrxVar, fjayVar, apxzVar);
    }

    @Override // defpackage.alye
    public final elfl L(int i) {
        return this.a.L(5);
    }

    @Override // defpackage.alye
    public final elfl M(int i) {
        return this.a.M(i);
    }

    @Override // defpackage.alye
    public final elfl N() {
        return this.a.N();
    }

    @Override // defpackage.alye
    public final void O(MessageId messageId, int i) {
        this.a.O(messageId, i);
    }

    @Override // defpackage.alye
    public final void P(MessageId messageId, int i) {
        this.a.P(messageId, i);
    }

    @Override // defpackage.alye
    public final void Q(int i) {
        this.a.Q(i);
    }

    @Override // defpackage.alye
    public final elfl R(MessageId messageId) {
        return this.a.R(messageId);
    }

    @Override // defpackage.aotl
    public final BugleConversationId S() {
        BugleConversationId bugleConversationId = ((aoyd) this.a).j;
        bugleConversationId.getClass();
        return bugleConversationId;
    }

    @Override // defpackage.aotl
    public final elfl T(String str) {
        elfl T = this.a.T(str);
        T.getClass();
        return T;
    }

    @Override // defpackage.aotl
    public final elfl U(cnbt cnbtVar) {
        return this.a.U(cnbtVar);
    }

    @Override // defpackage.aotl
    public final elfl V(Instant instant) {
        return this.a.V(instant);
    }

    @Override // defpackage.aotl
    public final elfl W(int i) {
        return this.a.W(i);
    }

    @Override // defpackage.aotl
    public final elfl X(aqvj aqvjVar) {
        elfl X = this.a.X(aqvjVar);
        X.getClass();
        return X;
    }

    @Override // defpackage.aotl
    public final void Y() {
        this.a.Y();
    }

    @Override // defpackage.aotl
    public final elfl Z(aqux aquxVar, appj appjVar, bdhg bdhgVar, Instant instant, Instant instant2, MessageId messageId) {
        return this.a.Z(aquxVar, appjVar, bdhgVar, instant, instant2, messageId);
    }

    @Override // defpackage.alye
    public final alxs a() {
        alxs a = this.a.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.aptx
    public final alxw aa(MessageId messageId, Instant instant) {
        return this.a.aa(messageId, instant);
    }

    @Override // defpackage.aptx
    public final apvd ab() {
        aotr aotrVar = ((aoyd) this.a).g;
        aotrVar.getClass();
        return aotrVar;
    }

    @Override // defpackage.aptx
    public final apvk ac() {
        apvk ac = this.a.ac();
        ac.getClass();
        return ac;
    }

    @Override // defpackage.aptx
    public final elfl af(MessageId messageId) {
        elfl af = this.a.af(messageId);
        af.getClass();
        return af;
    }

    @Override // defpackage.aptx
    public final elfl ag(int i, int i2) {
        elfl ag = this.a.ag(i, i2);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.aptx
    public final elfl ah(alxw alxwVar, int i) {
        elfl ah = this.a.ah(alxwVar, i);
        ah.getClass();
        return ah;
    }

    @Override // defpackage.aptx
    public final elfl ai(alxw alxwVar, int i) {
        elfl ai = this.a.ai(alxwVar, i);
        ai.getClass();
        return ai;
    }

    @Override // defpackage.aptx
    public final elfl aj(alxw alxwVar, int i) {
        elfl aj = this.a.aj(alxwVar, i);
        aj.getClass();
        return aj;
    }

    @Override // defpackage.aptx
    public final Instant ak(MessageId messageId) {
        Instant ak = this.a.ak(messageId);
        ak.getClass();
        return ak;
    }

    @Override // defpackage.aqbr
    public final void am(alxv alxvVar) {
        this.a.am(alxvVar);
    }

    @Override // defpackage.aptx
    public final void an() {
        this.a.an();
    }

    @Override // defpackage.aptx, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.alye
    public final alxu d() {
        Object a = this.c.a();
        a.getClass();
        return (alxu) a;
    }

    @Override // defpackage.alye
    public final alxy e() {
        Object a = this.b.a();
        a.getClass();
        return (apvl) a;
    }

    @Override // defpackage.alye
    public final alym f() {
        throw null;
    }

    @Override // defpackage.alye
    public final ConversationId g() {
        BugleConversationId bugleConversationId = ((aoyd) this.a).j;
        bugleConversationId.getClass();
        return bugleConversationId;
    }

    @Override // defpackage.alye
    public final aqge h(MessageId messageId) {
        return this.a.h(messageId);
    }

    @Override // defpackage.alye
    public final aqge i() {
        aqge i = this.a.i();
        i.getClass();
        return i;
    }

    @Override // defpackage.alye
    public final aqge j() {
        return this.a.j();
    }

    @Override // defpackage.alye
    public final ctbx k(alyd alydVar) {
        return this.a.k(alydVar);
    }

    @Override // defpackage.alye
    public final /* synthetic */ elfl l(MessageId messageId, engw engwVar) {
        return alyb.a();
    }

    @Override // defpackage.alye
    public final elfl m(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar) {
        return this.a.m(messageId, apyvVar, cmrxVar, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl n(MessageId messageId) {
        elfl n = this.a.n(messageId);
        n.getClass();
        return n;
    }

    @Override // defpackage.alye
    public final elfl o(engw engwVar) {
        elfl o = this.a.o(engwVar);
        o.getClass();
        return o;
    }

    @Override // defpackage.alye
    public final elfl p() {
        elfl p = this.a.p();
        p.getClass();
        return p;
    }

    @Override // defpackage.alye
    public final elfl q(engw engwVar) {
        return this.a.q(engwVar);
    }

    @Override // defpackage.alye
    public final elfl r(engw engwVar, cgrr cgrrVar) {
        return this.a.r(engwVar, cgrrVar);
    }

    @Override // defpackage.alye
    public final elfl s(engw engwVar) {
        elfl s = this.a.s(engwVar);
        s.getClass();
        return s;
    }

    @Override // defpackage.alye
    public final elfl t() {
        return this.a.t();
    }

    @Override // defpackage.alye
    public final elfl u(MessageId messageId) {
        elfl u = this.a.u(messageId);
        u.getClass();
        return u;
    }

    @Override // defpackage.alye
    public final elfl v() {
        elfl v = this.a.v();
        v.getClass();
        return v;
    }

    @Override // defpackage.alye
    public final elfl w() {
        elfl w = this.a.w();
        w.getClass();
        return w;
    }

    @Override // defpackage.alye
    public final elfl x() {
        elfl x = this.a.x();
        x.getClass();
        return x;
    }

    @Override // defpackage.alye
    public final elfl y() {
        elfl y = this.a.y();
        y.getClass();
        return y;
    }

    @Override // defpackage.alye
    public final elfl z(MessageId messageId) {
        elfl z = this.a.z(messageId);
        z.getClass();
        return z;
    }
}
