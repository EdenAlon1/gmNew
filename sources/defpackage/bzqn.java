package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzqn(bzqw bzqwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzqn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0019, code lost:
    
        if (r8 != r0) goto L8;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            return r8
        Ld:
            bzqw r8 = r7.b
            r7.a = r2
            bcrd r1 = r8.i
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r8.g
            java.lang.Object r8 = r1.c(r8, r7)
            if (r8 == r0) goto Lef
        L1b:
            bcqw r8 = (defpackage.bcqw) r8
            boolean r1 = r8 instanceof defpackage.bcqu
            r2 = 0
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl$areAllSessionsAvailable$1"
            java.lang.String r5 = "ConversationE2eeStatusImpl.kt"
            java.lang.String r6 = "BugleEtouffee"
            if (r1 != 0) goto Lca
            boolean r1 = r8.a
            if (r1 == 0) goto L53
            bzqw r8 = r7.b
            enru r0 = defpackage.bzqw.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            enrr r8 = r8.d(r0)
            r0 = 133(0x85, float:1.86E-43)
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "No remote identities retrieved for the conversation."
            r8.q(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L53:
            bzqw r1 = r7.b
            java.util.Set r8 = r8.b
            enit r8 = r1.c(r8)
            if (r8 != 0) goto L82
            bzqw r8 = r7.b
            enru r0 = defpackage.bzqw.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            enrr r8 = r8.d(r0)
            r0 = 141(0x8d, float:1.98E-43)
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Failure retrieving chat endpoint devices for the remote identities in the conversation."
            r8.q(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L82:
            boolean r1 = r8.A()
            if (r1 == 0) goto Lad
            bzqw r8 = r7.b
            enru r0 = defpackage.bzqw.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            enrr r8 = r8.d(r0)
            r0 = 150(0x96, float:2.1E-43)
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "No chat endpoint devices retrieved for the remote identities in the conversation."
            r8.q(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lad:
            bzqw r1 = r7.b
            r2 = 2
            r7.a = r2
            bcvx r1 = r1.h
            caag r1 = (defpackage.caag) r1
            ffhd r2 = r1.i
            ffhd r2 = defpackage.ekxi.a(r2)
            bzzx r3 = new bzzx
            r4 = 0
            r3.<init>(r4, r1, r8)
            java.lang.Object r8 = defpackage.ffra.a(r2, r3, r7)
            if (r8 != r0) goto Lc9
            goto Lef
        Lc9:
            return r8
        Lca:
            bzqw r8 = r7.b
            enru r0 = defpackage.bzqw.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            enrr r8 = r8.d(r0)
            r0 = 126(0x7e, float:1.77E-43)
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Failure retrieving remote identities for the conversation."
            r8.q(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzqn(this.b, ffguVar);
    }
}
