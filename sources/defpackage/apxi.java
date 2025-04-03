package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxi implements apxk, alye {
    public final ffsk a;
    public final csuu b;
    private final ffsk c;
    private final ffbr d;
    private final alye e;

    public apxi(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, csuu csuuVar, alye alyeVar) {
        this.a = ffskVar;
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.b = csuuVar;
        this.e = alyeVar;
    }

    public static final long T(apor aporVar) {
        if (aporVar instanceof apnt) {
            throw null;
        }
        if (aporVar instanceof apny) {
            return ((apny) aporVar).d;
        }
        throw new ffcd();
    }

    private static final Uri U(apor aporVar) {
        if (aporVar instanceof apny) {
            return ((apmz) ((apny) aporVar).c).d;
        }
        if (!(aporVar instanceof apnt)) {
            throw new ffcd();
        }
        throw null;
    }

    @Override // defpackage.alye
    public final elfl A(MessageId messageId) {
        return this.e.A(messageId);
    }

    @Override // defpackage.alye
    public final elfl B(MessageId messageId, String str, fjay fjayVar) {
        return this.e.B(messageId, str, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl C(MessageId messageId) {
        return this.e.C(messageId);
    }

    @Override // defpackage.alye
    public final elfl D(MessageId messageId) {
        return this.e.D(messageId);
    }

    @Override // defpackage.alye
    public final elfl E(MessageId messageId) {
        return this.e.E(messageId);
    }

    @Override // defpackage.alye
    public final elfl F(alyv alyvVar) {
        return this.e.F(alyvVar);
    }

    @Override // defpackage.alye
    public final elfl G(MessageId messageId) {
        return this.e.G(messageId);
    }

    @Override // defpackage.alye
    public final elfl H(MessageId messageId, int i) {
        return this.e.H(messageId, i);
    }

    @Override // defpackage.alye
    public final void I(MessageId messageId, int i) {
        this.e.I(messageId, i);
    }

    @Override // defpackage.alye
    public final void J(alxr alxrVar, int i) {
        this.e.J(alxrVar, i);
    }

    @Override // defpackage.alye
    public final elfl K(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar) {
        return this.e.K(messageId, apyvVar, cmrxVar, fjayVar, apxzVar);
    }

    @Override // defpackage.alye
    public final elfl L(int i) {
        return this.e.L(5);
    }

    @Override // defpackage.alye
    public final elfl M(int i) {
        return this.e.M(i);
    }

    @Override // defpackage.alye
    public final elfl N() {
        return this.e.N();
    }

    @Override // defpackage.alye
    public final void O(MessageId messageId, int i) {
        this.e.O(messageId, i);
    }

    @Override // defpackage.alye
    public final void P(MessageId messageId, int i) {
        this.e.P(messageId, i);
    }

    @Override // defpackage.alye
    public final void Q(int i) {
        this.e.Q(i);
    }

    @Override // defpackage.alye
    public final elfl R(MessageId messageId) {
        return this.e.R(messageId);
    }

    @Override // defpackage.apxk
    public final void S(ConversationId conversationId, MessageId messageId, apor aporVar) {
        if (!(messageId instanceof BugleMessageId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Uri U = U(aporVar);
        if (U == null) {
            return;
        }
        boolean z = aporVar instanceof apny;
        long longValue = aporVar.a().longValue();
        if (!z) {
            if (!(aporVar instanceof apnt)) {
                throw new ffcd();
            }
            throw null;
        }
        appq appqVar = ((apny) aporVar).c;
        cbke cbkeVar = (cbke) this.d.b();
        if (cbkeVar.b(U.toString())) {
            return;
        }
        axol.k(this.c, null, new apxh(cbkeVar, conversationId, this, messageId, aporVar, ((apmz) appqVar).a, U, longValue, null), 3);
    }

    @Override // defpackage.alye
    public final alxs a() {
        return this.e.a();
    }

    @Override // defpackage.apxk
    public final void b(apor aporVar) {
        Uri U = U(aporVar);
        if (U == null) {
            return;
        }
        cbke cbkeVar = (cbke) this.d.b();
        final long T = T(aporVar);
        final cbkm cbkmVar = (cbkm) cbkeVar.a;
        if (cbkmVar.e.a()) {
            axnw.h(elfo.g(new Callable() { // from class: cbkg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final long j = T;
                    return (Boolean) cbkm.this.d.c("RichCardMessagePartMediaDownloadHandler#onStart", new emyl() { // from class: cbkf
                        @Override // defpackage.emyl
                        public final Object get() {
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.x(byzh.USER_CANCELED);
                            return Boolean.valueOf(bwdiVar.c(String.valueOf(j)));
                        }
                    });
                }
            }, cbkmVar.b));
        }
        cbkmVar.a(U);
    }

    @Override // defpackage.apxk
    public final void c(apor aporVar) {
        if (aporVar instanceof apny) {
            axol.k(this.c, null, new apxg(this, ((apmz) ((apny) aporVar).c).b, aporVar, null), 3);
        } else {
            if (!(aporVar instanceof apnt)) {
                throw new ffcd();
            }
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.alye
    public final alxu d() {
        throw null;
    }

    @Override // defpackage.alye
    public final alxy e() {
        return this.e.e();
    }

    @Override // defpackage.alye
    public final alym f() {
        throw null;
    }

    @Override // defpackage.alye
    public final ConversationId g() {
        return this.e.g();
    }

    @Override // defpackage.alye
    public final aqge h(MessageId messageId) {
        return this.e.h(messageId);
    }

    @Override // defpackage.alye
    public final aqge i() {
        return this.e.i();
    }

    @Override // defpackage.alye
    public final aqge j() {
        return this.e.j();
    }

    @Override // defpackage.alye
    public final ctbx k(alyd alydVar) {
        throw null;
    }

    @Override // defpackage.alye
    public final /* synthetic */ elfl l(MessageId messageId, engw engwVar) {
        return alyb.a();
    }

    @Override // defpackage.alye
    public final elfl m(MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar) {
        return this.e.m(messageId, apyvVar, cmrxVar, fjayVar);
    }

    @Override // defpackage.alye
    public final elfl n(MessageId messageId) {
        return this.e.n(messageId);
    }

    @Override // defpackage.alye
    public final elfl o(engw engwVar) {
        return this.e.o(engwVar);
    }

    @Override // defpackage.alye
    public final elfl p() {
        return this.e.p();
    }

    @Override // defpackage.alye
    public final elfl q(engw engwVar) {
        return this.e.q(engwVar);
    }

    @Override // defpackage.alye
    public final elfl r(engw engwVar, cgrr cgrrVar) {
        return this.e.r(engwVar, cgrrVar);
    }

    @Override // defpackage.alye
    public final elfl s(engw engwVar) {
        return this.e.s(engwVar);
    }

    @Override // defpackage.alye
    public final elfl t() {
        return this.e.t();
    }

    @Override // defpackage.alye
    public final elfl u(MessageId messageId) {
        return this.e.u(messageId);
    }

    @Override // defpackage.alye
    public final elfl v() {
        return this.e.v();
    }

    @Override // defpackage.alye
    public final elfl w() {
        return this.e.w();
    }

    @Override // defpackage.alye
    public final elfl x() {
        throw null;
    }

    @Override // defpackage.alye
    public final elfl y() {
        return this.e.y();
    }

    @Override // defpackage.alye
    public final elfl z(MessageId messageId) {
        return this.e.z(messageId);
    }
}
