package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aplh implements alxs {
    public final ffbr a;
    public final alxs b;
    private final emyl c;

    public aplh(ffbr ffbrVar, alxs alxsVar, final EmergencySosConversationId emergencySosConversationId, final aqge aqgeVar, final aqge aqgeVar2) {
        this.a = ffbrVar;
        this.b = alxsVar;
        this.c = new emyl() { // from class: aplg
            @Override // defpackage.emyl
            public final Object get() {
                aplh aplhVar = aplh.this;
                aobd aobdVar = (aobd) aplhVar.a.b();
                aqge c = aplhVar.b.c();
                c.getClass();
                aoaz aoazVar = (aoaz) aobdVar.a.b();
                aoazVar.getClass();
                aobb aobbVar = (aobb) aobdVar.b.b();
                aobbVar.getClass();
                return new aobc(aoazVar, aobbVar, emergencySosConversationId, c, aqgeVar, aqgeVar2);
            }
        };
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
        aqge c = this.b.c();
        c.getClass();
        return c;
    }

    @Override // defpackage.alxs
    public final aqge d() {
        int i = engw.d;
        return new aqgf(enou.a);
    }

    @Override // defpackage.alxs
    public final aqge e() {
        return this.b.e();
    }

    @Override // defpackage.alxs
    public final aqge f() {
        return ((aobc) this.c.get()).a;
    }

    @Override // defpackage.alxs
    public final aqge g() {
        return this.b.g();
    }

    @Override // defpackage.alxs
    public final elfl h(anzh anzhVar) {
        throw new UnsupportedOperationException("RBM suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.alxs
    public final elfl i(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        return this.b.i(str, appwVar, eooiVar, z, z2);
    }

    @Override // defpackage.alxs
    public final elfl j(aoax aoaxVar) {
        return this.b.j(aoaxVar);
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
