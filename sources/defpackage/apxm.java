package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxm implements alxs {
    public final ffbr a;
    public final alxs b;
    private final emyl c = new emyl() { // from class: apxl
        @Override // defpackage.emyl
        public final Object get() {
            apxm apxmVar = apxm.this;
            anwt anwtVar = (anwt) apxmVar.a.b();
            apxmVar.b.c().getClass();
            ((aoaj) anwtVar.a.b()).getClass();
            return new anwu(apxmVar);
        }
    };

    public apxm(ffbr ffbrVar, alxs alxsVar, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2) {
        this.a = ffbrVar;
        this.b = alxsVar;
    }

    @Override // defpackage.alxs
    public final apmo a() {
        return this.b.a();
    }

    @Override // defpackage.alxs
    public final aqge b() {
        return this.b.b();
    }

    @Override // defpackage.alxs
    public final aqge c() {
        return this.b.c();
    }

    @Override // defpackage.alxs
    public final aqge d() {
        return this.b.d();
    }

    @Override // defpackage.alxs
    public final aqge e() {
        return this.b.e();
    }

    @Override // defpackage.alxs
    public final aqge f() {
        return this.b.f();
    }

    @Override // defpackage.alxs
    public final aqge g() {
        return this.b.g();
    }

    @Override // defpackage.alxs
    public final elfl h(anzh anzhVar) {
        return this.b.h(anzhVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoak, java.lang.Object] */
    @Override // defpackage.alxs
    public final elfl i(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        return this.c.get().f(str, appwVar, eooiVar, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoak, java.lang.Object] */
    @Override // defpackage.alxs
    public final elfl j(aoax aoaxVar) {
        return this.c.get().g(aoaxVar);
    }

    @Override // defpackage.alxs
    public final elfl k(apyz apyzVar) {
        return this.b.k(apyzVar);
    }

    @Override // defpackage.alxs
    public final elfl l(MessageId messageId, String str, fjay fjayVar) {
        return this.b.l(messageId, str, fjayVar);
    }

    @Override // defpackage.alxs
    public final elfl m(alyx alyxVar, appw appwVar, engw engwVar, MessageId messageId, MessageId messageId2, apcs apcsVar, eooi eooiVar, fjay fjayVar, List list) {
        return this.b.m(alyxVar, appwVar, engwVar, messageId, messageId2, apcsVar, eooiVar, fjayVar, list);
    }
}
