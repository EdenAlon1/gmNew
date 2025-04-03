package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqw implements bzqj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl");
    private static final ensn k = new ensn("e2ee_update_reason", caqc.class, false, false);
    public final ffsk b;
    public final ffhd c;
    public final ffbr d;
    public final ffbr e;
    public final awui f;
    public final ConversationIdType g;
    public final bcvx h;
    public final bcrd i;
    public final AtomicReference j;
    private final cqoh l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final bzqb r;
    private final ffbr s;

    public bzqw(cqoh cqohVar, ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, bzqb bzqbVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, awui awuiVar, ConversationIdType conversationIdType) {
        cqohVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        bzqbVar.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        awuiVar.getClass();
        conversationIdType.getClass();
        this.l = cqohVar;
        this.b = ffskVar;
        this.c = ffhdVar;
        this.m = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
        this.p = ffbrVar6;
        this.q = ffbrVar7;
        this.r = bzqbVar;
        this.s = ffbrVar10;
        this.f = awuiVar;
        this.g = conversationIdType;
        this.h = ((bcvy) ffbrVar8.b()).a(awuiVar, conversationIdType);
        this.i = ((bcre) ffbrVar9.b()).a(awuiVar);
        this.j = new AtomicReference();
    }

    @ffbs
    private final Object k(awui awuiVar, boqd boqdVar, ffgu ffguVar) {
        String h;
        if (!boqdVar.j() || (h = boqdVar.h()) == null) {
            Object j = j(caqc.DOWNGRADE_REMOTE_REGISTRATION_MISSING, ffguVar);
            if (j == ffhh.a) {
                return j;
            }
        } else {
            eniq eniqVar = new eniq();
            eniqVar.b(awuiVar, h);
            enit a2 = eniqVar.a();
            a2.getClass();
            Object h2 = h(a2, ffguVar);
            if (h2 == ffhh.a) {
                return h2;
            }
        }
        return ffcu.a;
    }

    private final void l(int i, ConversationIdType conversationIdType) {
        ensk e = a.e();
        e.Y(ente.a, "BugleEtouffee");
        ((enrr) d((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "startTimerForRemoteInstanceProcessing", 522, "ConversationE2eeStatusImpl.kt")).r("starting etouffee action timer, remoteInstancesToDownload: %d", i);
        this.j.set(((albq) this.o.b()).m(i, conversationIdType.toString()));
    }

    @Override // defpackage.bzqj
    public final elfl a() {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new bzqv(this, null));
        return c;
    }

    @Override // defpackage.bzqj
    public final elfl b(engw engwVar) {
        engwVar.getClass();
        if (((bzqa) this.e.b()).i() && !engwVar.isEmpty()) {
            this.r.f(engwVar, this.g);
        }
        return a();
    }

    public final enit c(final Set set) {
        final eniq eniqVar = new eniq();
        if (set.isEmpty()) {
            return null;
        }
        final enhk enhkVar = (enhk) Collection.EL.stream(set).collect(endq.a(new cheb(), Function$CC.identity()));
        final HashSet hashSet = new HashSet();
        bore a2 = borh.a();
        a2.z("RemoteInstanceDatabaseOperations#verifyAllParticipantsSupportGroupE2eeAndSetDevicesForScytaleSetupChatEndpoint");
        a2.c(new Function() { // from class: chdz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                borg borgVar = (borg) obj;
                borgVar.b((Iterable) Collection.EL.stream(set).map(new cheb()).collect(endq.b));
                return borgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.b().D().forEach(new Consumer() { // from class: chea
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                boqd boqdVar = (boqd) obj;
                awui awuiVar = (awui) enhk.this.get(boqdVar.g());
                if (boqdVar.k() && boqdVar.j() && awuiVar != null) {
                    eniq eniqVar2 = eniqVar;
                    hashSet.add(awuiVar);
                    eniqVar2.b(awuiVar, boqdVar.h());
                } else {
                    csjb c = chef.a.c();
                    c.I("No group encryption support for at least one participant.");
                    c.M("participant", boqdVar.g());
                    c.r();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (hashSet.equals(set)) {
            return eniqVar.a();
        }
        return null;
    }

    public final enrr d(enrr enrrVar) {
        enrrVar.Y(csux.E, this.f.d);
        enrrVar.Y(csux.p, this.g);
        return enrrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r11.k(r10, r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r11.j(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.awui r10, defpackage.eozn r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqw.e(awui, eozn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r2.e(r14, r3, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014b, code lost:
    
        if (r2.e(r14, r3, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0184, code lost:
    
        if (r2.k(r14, r3, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        if (r2.j(r14, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0287, code lost:
    
        if (r14 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0283, code lost:
    
        if (r14 != defpackage.ffhh.a) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqw.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x013d, code lost:
    
        if (r10.i(r0, r1) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015f, code lost:
    
        if (r10.j(r15, r1) == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (j(r15, r1) == r2) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r15, defpackage.bcyk r16, java.util.Set r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqw.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, bcyk, java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.enit r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bzqr
            if (r0 == 0) goto L13
            r0 = r9
            bzqr r0 = (defpackage.bzqr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzqr r0 = new bzqr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "setupScytaleSessions"
            java.lang.String r4 = "BugleEtouffee"
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            bzqw r8 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto Lc3
        L2e:
            r9 = move-exception
            goto L99
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.ffci.b(r9)
            bcvx r9 = r7.h     // Catch: java.lang.Throwable -> L96
            r0.d = r7     // Catch: java.lang.Throwable -> L96
            r0.c = r5     // Catch: java.lang.Throwable -> L96
            boolean r2 = r8.A()     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L73
            enru r8 = defpackage.caag.a     // Catch: java.lang.Throwable -> L96
            ensk r8 = r8.j()     // Catch: java.lang.Throwable -> L96
            ensn r0 = defpackage.ente.a     // Catch: java.lang.Throwable -> L96
            r8.Y(r0, r4)     // Catch: java.lang.Throwable -> L96
            enrr r8 = (defpackage.enrr) r8     // Catch: java.lang.Throwable -> L96
            ensn r0 = defpackage.csux.D     // Catch: java.lang.Throwable -> L96
            caag r9 = (defpackage.caag) r9     // Catch: java.lang.Throwable -> L96
            awui r9 = r9.l     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = r9.d     // Catch: java.lang.Throwable -> L96
            r8.Y(r0, r9)     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = "EtouffeeSessionSetupImpl.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl"
            r2 = 111(0x6f, float:1.56E-43)
            ensk r8 = r8.h(r0, r3, r2, r9)     // Catch: java.lang.Throwable -> L96
            enrr r8 = (defpackage.enrr) r8     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = "No remote user registrations to set up."
            r8.q(r9)     // Catch: java.lang.Throwable -> L96
            ffcu r8 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L96
            goto L93
        L73:
            r2 = r9
            caag r2 = (defpackage.caag) r2     // Catch: java.lang.Throwable -> L96
            ffhd r2 = r2.i     // Catch: java.lang.Throwable -> L96
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L96
            caaa r5 = new caaa     // Catch: java.lang.Throwable -> L96
            caag r9 = (defpackage.caag) r9     // Catch: java.lang.Throwable -> L96
            r6 = 0
            r5.<init>(r6, r9, r8)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L96
            ffhh r9 = defpackage.ffhh.a     // Catch: java.lang.Throwable -> L96
            if (r8 == r9) goto L8e
            ffcu r8 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L96
        L8e:
            if (r8 != r9) goto L91
            goto L93
        L91:
            ffcu r8 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L96
        L93:
            if (r8 != r1) goto Lc3
            return r1
        L96:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L99:
            enru r0 = defpackage.bzqw.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r4)
            enrr r0 = (defpackage.enrr) r0
            enrr r8 = r8.d(r0)
            ensk r8 = r8.g(r9)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = "ConversationE2eeStatusImpl.kt"
            ensk r8 = r8.h(r0, r3, r1, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Failed to setup remote instance session"
            r8.q(r0)
            boolean r8 = r9 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto Lc6
        Lc3:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lc6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqw.h(enit, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        if (r2.h((defpackage.enit) r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.enit r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqw.i(enit, ffgu):java.lang.Object");
    }

    public final Object j(caqc caqcVar, ffgu ffguVar) {
        ensk e = a.e();
        e.Y(ente.a, "BugleEtouffee");
        enrr d = d((enrr) e);
        d.Y(k, caqcVar);
        ((enrr) d.h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "takedownEncryptionForConversation", 510, "ConversationE2eeStatusImpl.kt")).q("Disabling Etouffee for conversation draft");
        Object b = this.h.b(0, caqcVar, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
