package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckac {
    private static final enru f = enru.c("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffhd d;
    public final ffsk e;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffhd l;

    public ckac(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffhd ffhdVar, ffhd ffhdVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.g = ffbrVar2;
        this.b = ffbrVar3;
        this.h = ffbrVar4;
        this.c = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.d = ffhdVar;
        this.l = ffhdVar2;
        this.e = ffskVar;
    }

    public final awui a(int i) {
        enru enruVar = f;
        ensk e = enruVar.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        ensn ensnVar = csux.t;
        Integer valueOf = Integer.valueOf(i);
        enrrVar.Y(ensnVar, valueOf);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 89, "RcsLocalIdentityProvider.kt")).q("Attempt to get self identity.");
        djrp.a(i);
        djrj b = ((djsi) this.a.b()).b(i);
        if (b == null) {
            cjzj cjzjVar = (cjzj) this.h.b();
            axol.k(cjzjVar.d, null, new cjzi(cjzjVar, i, null), 3);
        }
        if (b == null) {
            return null;
        }
        awui c = ((avkc) this.c.b()).c(b.a);
        c.getClass();
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.t, valueOf);
        enrrVar2.Y(csux.E, c.d);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 98, "RcsLocalIdentityProvider.kt")).q("Retrieved phone number for given sub id.");
        return c;
    }

    public final awui b(int i) {
        awui a = a(i);
        if (a != null) {
            return a;
        }
        throw new cjzk(i);
    }

    public final elfl c(SelfIdentityId selfIdentityId) {
        elfl c;
        selfIdentityId.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new cjzp(this, selfIdentityId, null));
        return c;
    }

    public final elfl d(ConversationIdType conversationIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new cjzq(this, conversationIdType, null));
        return c;
    }

    public final elfl e(int i) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new cjzx(this, i, null));
        return c;
    }

    public final elfl f(ConversationIdType conversationIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new ckaa(this, conversationIdType, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [ckac] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aqux r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjzv
            if (r0 == 0) goto L13
            r0 = r6
            cjzv r0 = (defpackage.cjzv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjzv r0 = new cjzv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            awui r5 = r0.d
            defpackage.ffci.b(r6)
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r6)
            if (r5 == 0) goto L79
            j$.util.Optional r5 = r5.m()
            cjzn r6 = new cjzn
            r6.<init>()
            cjzo r2 = new cjzo
            r2.<init>()
            j$.util.Optional r5 = r5.flatMap(r2)
            r5.getClass()
            java.lang.Object r5 = defpackage.fflm.b(r5)
            awui r5 = (defpackage.awui) r5
            if (r5 == 0) goto L73
            r0.d = r5
            r0.c = r3
            r6 = 2
            java.lang.Object r6 = r4.l(r5, r6, r0)
            if (r6 == r1) goto L72
        L62:
            boolean r0 = defpackage.ffch.d(r6)
            if (r0 == 0) goto L6d
            djrq r6 = (defpackage.djrq) r6
            int r6 = r6.a
            goto L6e
        L6d:
            r5 = r6
        L6e:
            defpackage.ffci.b(r5)
            return r5
        L72:
            return r1
        L73:
            ckah r5 = new ckah
            r5.<init>()
            throw r5
        L79:
            enru r5 = defpackage.ckac.f
            ensk r5 = r5.j()
            ensn r6 = defpackage.ente.a
            java.lang.String r0 = "Bugle"
            r5.Y(r6, r0)
            enrr r5 = (defpackage.enrr) r5
            ensy r6 = defpackage.ensy.MEDIUM
            r5.aa(r6)
            java.lang.String r6 = "getLocalIdentityFromSelfIdentityOrThrow"
            r0 = 239(0xef, float:3.35E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r2 = "RcsLocalIdentityProvider.kt"
            ensk r5 = r5.h(r1, r6, r0, r2)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Active self identity is not set in the conversation."
            r5.q(r6)
            ckah r5 = new ckah
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.g(aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjzw
            if (r0 == 0) goto L13
            r0 = r6
            cjzw r0 = (defpackage.cjzw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjzw r0 = new cjzw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r6)
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r5 = r6.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.c = r3
            java.lang.Object r5 = r4.i(r5, r3, r0)
            if (r5 == r1) goto L44
        L3e:
            boolean r6 = r5 instanceof defpackage.ffcg
            if (r6 == 0) goto L43
            r5 = 0
        L43:
            return r5
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, int r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cjzr
            if (r0 == 0) goto L13
            r0 = r9
            cjzr r0 = (defpackage.cjzr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjzr r0 = new cjzr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r9)
            ffch r9 = (defpackage.ffch) r9
            java.lang.Object r7 = r9.a
            return r7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            int r8 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r0.e
            ckac r2 = r0.d
            defpackage.ffci.b(r9)
            goto L5e
        L41:
            defpackage.ffci.b(r9)
            ffhd r9 = r6.l
            ffhd r9 = defpackage.ekxi.a(r9)
            cjzs r2 = new cjzs
            r2.<init>(r5, r6, r7)
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.c = r4
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto Lb7
            r2 = r6
        L5e:
            bseh r9 = (defpackage.bseh) r9
            if (r9 == 0) goto L67
            java.lang.String r9 = r9.S()
            goto L68
        L67:
            r9 = r5
        L68:
            if (r9 != 0) goto La2
            if (r8 != r4) goto L98
            enru r8 = defpackage.ckac.f
            ensk r8 = r8.j()
            ensn r9 = defpackage.ente.a
            java.lang.String r0 = "Bugle"
            r8.Y(r9, r0)
            enrr r8 = (defpackage.enrr) r8
            ensy r9 = defpackage.ensy.MEDIUM
            r8.aa(r9)
            ensn r9 = defpackage.csux.p
            r8.Y(r9, r7)
            java.lang.String r7 = "getLocalIdentityFromConversationId-0E7RQCE"
            r9 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "RcsLocalIdentityProvider.kt"
            ensk r7 = r8.h(r0, r7, r9, r1)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "Active self identity is not set in the conversation."
            r7.q(r8)
        L98:
            ckad r7 = new ckad
            r7.<init>()
            java.lang.Object r7 = defpackage.ffci.a(r7)
            return r7
        La2:
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r7 = defpackage.aqvf.b(r9)
            r0.d = r5
            r0.e = r5
            r9 = 0
            r0.f = r9
            r0.c = r3
            java.lang.Object r7 = r2.k(r7, r8, r0)
            if (r7 != r1) goto Lb6
            goto Lb7
        Lb6:
            return r7
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.i(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.aqux r6, int r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cjzt
            if (r0 == 0) goto L13
            r0 = r8
            cjzt r0 = (defpackage.cjzt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjzt r0 = new cjzt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            awui r6 = r0.d
            defpackage.ffci.b(r8)
            ffch r8 = (defpackage.ffch) r8
            java.lang.Object r7 = r8.a
            goto La0
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r8)
            j$.util.Optional r8 = r6.m()
            cjzl r2 = new cjzl
            r2.<init>()
            cjzm r4 = new cjzm
            r4.<init>()
            j$.util.Optional r8 = r8.flatMap(r4)
            r8.getClass()
            java.lang.Object r8 = defpackage.fflm.b(r8)
            awui r8 = (defpackage.awui) r8
            if (r8 != 0) goto L95
            if (r7 != r3) goto L8b
            enru r7 = defpackage.ckac.f
            ensk r7 = r7.j()
            ensn r8 = defpackage.ente.a
            java.lang.String r0 = "Bugle"
            r7.Y(r8, r0)
            enrr r7 = (defpackage.enrr) r7
            ensy r8 = defpackage.ensy.MEDIUM
            r7.aa(r8)
            ensn r8 = defpackage.csux.m
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = r6.g()
            java.lang.String r6 = r6.b()
            r7.Y(r8, r6)
            java.lang.String r6 = "getLocalIdentityFromSelfIdentity-0E7RQCE"
            r8 = 265(0x109, float:3.71E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "RcsLocalIdentityProvider.kt"
            ensk r6 = r7.h(r0, r6, r8, r1)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "Self identity does not contain any chat endpoint."
            r6.q(r7)
        L8b:
            ckah r6 = new ckah
            r6.<init>()
            java.lang.Object r6 = defpackage.ffci.a(r6)
            return r6
        L95:
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r5.l(r8, r7, r0)
            if (r7 == r1) goto Lac
            r6 = r8
        La0:
            boolean r8 = defpackage.ffch.d(r7)
            if (r8 == 0) goto Lab
            djrq r7 = (defpackage.djrq) r7
            int r7 = r7.a
            return r6
        Lab:
            return r7
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.j(aqux, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6, int r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cjzu
            if (r0 == 0) goto L13
            r0 = r8
            cjzu r0 = (defpackage.cjzu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjzu r0 = new cjzu
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r8)
            ffch r8 = (defpackage.ffch) r8
            java.lang.Object r6 = r8.a
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            int r7 = r0.f
            java.lang.Object r6 = r0.a
            ckac r2 = r0.e
            defpackage.ffci.b(r8)
            goto L62
        L40:
            defpackage.ffci.b(r8)
            ffbr r8 = r5.g
            java.lang.Object r8 = r8.b()
            aqvh r8 = (defpackage.aqvh) r8
            elfl r8 = r8.d(r6)
            ffss r8 = defpackage.axol.e(r8)
            r0.e = r5
            r0.a = r6
            r0.f = r7
            r0.d = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto Lbd
            r2 = r5
        L62:
            r8.getClass()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = defpackage.fflm.b(r8)
            aqux r8 = (defpackage.aqux) r8
            if (r8 != 0) goto Lab
            if (r7 != r4) goto La1
            enru r7 = defpackage.ckac.f
            ensk r7 = r7.j()
            ensn r8 = defpackage.ente.a
            java.lang.String r0 = "Bugle"
            r7.Y(r8, r0)
            enrr r7 = (defpackage.enrr) r7
            ensy r8 = defpackage.ensy.MEDIUM
            r7.aa(r8)
            ensn r8 = defpackage.csux.m
            java.lang.String r6 = r6.b()
            r7.Y(r8, r6)
            java.lang.String r6 = "getLocalIdentityFromSelfIdentityId-0E7RQCE"
            r8 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "RcsLocalIdentityProvider.kt"
            ensk r6 = r7.h(r0, r6, r8, r1)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r7 = "Self identity does not exist for the given id."
            r6.q(r7)
        La1:
            ckai r6 = new ckai
            r6.<init>()
            java.lang.Object r6 = defpackage.ffci.a(r6)
            return r6
        Lab:
            r6 = 0
            r0.e = r6
            r0.a = r6
            r6 = 0
            r0.f = r6
            r0.d = r3
            java.lang.Object r6 = r2.j(r8, r7, r0)
            if (r6 != r1) goto Lbc
            goto Lbd
        Lbc:
            return r6
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.k(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.awui r9, int r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckac.l(awui, int, ffgu):java.lang.Object");
    }
}
