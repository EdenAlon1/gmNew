package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apfu implements apfl {
    public final emyl a;
    public final emyl b;
    private final emyl c;
    private final errl d;
    private final emyl e;
    private final fazb f;
    private final alye g;
    private final emyl h;

    public apfu(errl errlVar, final ffbr ffbrVar, final ffbr ffbrVar2, final ffbr ffbrVar3, final ffbr ffbrVar4, final ffbr ffbrVar5, final ffbr ffbrVar6, fazb fazbVar, final ffbr ffbrVar7, final BugleConversationId bugleConversationId, final aqge aqgeVar, final aqge aqgeVar2, alye alyeVar) {
        this.d = errlVar;
        this.f = fazbVar;
        this.g = alyeVar;
        this.c = emys.a(new emyl() { // from class: apfm
            @Override // defpackage.emyl
            public final Object get() {
                aqgc aqgcVar = (aqgc) ffbr.this.b();
                apmm apmmVar = (apmm) ffbrVar2.b();
                awti awtiVar = (awti) apmmVar.a.b();
                awtiVar.getClass();
                ctbk ctbkVar = (ctbk) apmmVar.b.b();
                ctbkVar.getClass();
                aolr aolrVar = (aolr) apmmVar.c.b();
                aolrVar.getClass();
                ExecutorService executorService = (ExecutorService) apmmVar.d.b();
                executorService.getClass();
                cqoh cqohVar = (cqoh) apmmVar.e.b();
                cqohVar.getClass();
                return aqgcVar.a(new apml(awtiVar, ctbkVar, aolrVar, executorService, cqohVar, bugleConversationId, aqgeVar2));
            }
        });
        this.a = emys.a(new emyl() { // from class: apfn
            /* JADX WARN: Type inference failed for: r14v0, types: [fazb, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                aqgc aqgcVar = (aqgc) ffbr.this.b();
                apgz apgzVar = (apgz) ffbrVar3.b();
                aphs aphsVar = (aphs) ffbrVar7.b();
                ctbk ctbkVar = (ctbk) apgzVar.a.b();
                ctbkVar.getClass();
                errl errlVar2 = (errl) apgzVar.b.b();
                errlVar2.getClass();
                errl errlVar3 = (errl) apgzVar.c.b();
                errlVar3.getClass();
                ffbr ffbrVar8 = apgzVar.d;
                csxu csxuVar = (csxu) apgzVar.e.b();
                csxuVar.getClass();
                ffbr ffbrVar9 = apgzVar.f;
                ffbr ffbrVar10 = apgzVar.g;
                ffbr ffbrVar11 = apgzVar.h;
                ffbr ffbrVar12 = apgzVar.i;
                ?? b = apgzVar.j.b();
                b.getClass();
                ((asqi) apgzVar.k.b()).getClass();
                ffbr ffbrVar13 = apgzVar.l;
                ffbr ffbrVar14 = apgzVar.m;
                aued auedVar = (aued) apgzVar.n.b();
                auedVar.getClass();
                ffbr ffbrVar15 = apgzVar.o;
                auee aueeVar = (auee) apgzVar.p.b();
                aueeVar.getClass();
                aphsVar.getClass();
                return aqgcVar.a(new apgy(ctbkVar, errlVar2, errlVar3, ffbrVar8, csxuVar, ffbrVar9, ffbrVar10, ffbrVar11, ffbrVar12, b, ffbrVar13, ffbrVar14, auedVar, ffbrVar15, aueeVar, bugleConversationId, aqgeVar, aqgeVar2, aphsVar));
            }
        });
        this.e = emys.a(new emyl() { // from class: apfo
            @Override // defpackage.emyl
            public final Object get() {
                aoal aoalVar = (aoal) ffbrVar5.b();
                apfu apfuVar = apfu.this;
                return aoalVar.a(bugleConversationId, (aqge) apfuVar.a.get(), aqgeVar2, aqgeVar, apfuVar);
            }
        });
        this.h = emys.a(new emyl() { // from class: apfp
            @Override // defpackage.emyl
            public final Object get() {
                aply aplyVar = (aply) ffbrVar6.b();
                aqge aqgeVar3 = (aqge) apfu.this.a.get();
                cowz cowzVar = (cowz) aplyVar.a.b();
                cowzVar.getClass();
                avkm avkmVar = (avkm) aplyVar.b.b();
                avkmVar.getClass();
                ffsk ffskVar = (ffsk) aplyVar.c.b();
                ffskVar.getClass();
                ffhd ffhdVar = (ffhd) aplyVar.d.b();
                ffhdVar.getClass();
                cqoh cqohVar = (cqoh) aplyVar.e.b();
                cqohVar.getClass();
                clwg clwgVar = (clwg) aplyVar.f.b();
                clwgVar.getClass();
                aqgeVar3.getClass();
                return new aplx(cowzVar, avkmVar, ffskVar, ffhdVar, cqohVar, clwgVar, bugleConversationId, aqgeVar, aqgeVar3);
            }
        });
        this.b = emys.a(new emyl() { // from class: apfq
            @Override // defpackage.emyl
            public final Object get() {
                return ((apsc) ffbr.this.b()).a();
            }
        });
    }

    @Override // defpackage.alxs
    public final apmo a() {
        return (apmo) this.h.get();
    }

    @Override // defpackage.alxs
    public final aqge b() {
        return (aqge) this.c.get();
    }

    @Override // defpackage.alxs
    public final aqge c() {
        return (aqge) this.a.get();
    }

    @Override // defpackage.alxs
    public final aqge d() {
        return ((aoak) this.e.get()).a();
    }

    @Override // defpackage.alxs
    public final aqge e() {
        return ((aoak) this.e.get()).b();
    }

    @Override // defpackage.alxs
    public final aqge f() {
        return ((aoak) this.e.get()).c();
    }

    @Override // defpackage.alxs
    public final aqge g() {
        return ((aoak) this.e.get()).d();
    }

    @Override // defpackage.alxs
    public final elfl h(anzh anzhVar) {
        return ((aoak) this.e.get()).e(anzhVar);
    }

    @Override // defpackage.alxs
    public final elfl i(String str, appw appwVar, eooi eooiVar, boolean z, boolean z2) {
        return ((aoak) this.e.get()).f(str, appwVar, eooiVar, z, z2);
    }

    @Override // defpackage.alxs
    public final elfl j(aoax aoaxVar) {
        return ((aoak) this.e.get()).g(aoaxVar);
    }

    @Override // defpackage.alxs
    public final elfl k(final apyz apyzVar) {
        final long epochMilli = ((cqoh) this.f.b()).f().toEpochMilli();
        final long a = ((cqoh) this.f.b()).a();
        return ((aqge) this.a.get()).b().i(new eroh() { // from class: apfs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                apfz apfzVar = (apfz) obj;
                return ((apsb) apfu.this.b.get()).a(apyzVar, apfzVar, epochMilli, a);
            }
        }, this.d);
    }

    @Override // defpackage.alxs
    public final elfl l(final MessageId messageId, final String str, final fjay fjayVar) {
        final long epochMilli = ((cqoh) this.f.b()).f().toEpochMilli();
        final long a = ((cqoh) this.f.b()).a();
        return ((aqge) this.a.get()).b().i(new eroh() { // from class: apft
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((apsb) apfu.this.b.get()).b((apfz) obj, messageId, epochMilli, a, str, fjayVar);
            }
        }, this.d);
    }

    @Override // defpackage.alxs
    public final elfl m(final alyx alyxVar, final appw appwVar, final engw engwVar, MessageId messageId, final MessageId messageId2, final apcs apcsVar, final eooi eooiVar, final fjay fjayVar, final List list) {
        final long epochMilli = ((cqoh) this.f.b()).f().toEpochMilli();
        final long a = ((cqoh) this.f.b()).a();
        final elfl b = ((aqge) this.a.get()).b();
        final elfl u = messageId != null ? this.g.u(messageId) : elfo.e(null);
        return elfo.k(b, u).b(new erog() { // from class: apfr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                apsb apsbVar = (apsb) apfu.this.b.get();
                alxg alxgVar = (alxg) erqt.q(b);
                alxr alxrVar = (alxr) erqt.q(u);
                MessageId messageId3 = messageId2;
                apcs apcsVar2 = apcsVar;
                eooi eooiVar2 = eooiVar;
                long j = epochMilli;
                long j2 = a;
                fjay fjayVar2 = fjayVar;
                return apsbVar.d(alyxVar, alxgVar, appwVar, engwVar, alxrVar, messageId3, apcsVar2, eooiVar2, j, j2, fjayVar2, list, null);
            }
        }, this.d);
    }
}
