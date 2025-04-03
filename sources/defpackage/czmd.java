package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmd {
    private static final entd b = entd.c("BugleMessageView");
    public final fgcm a;
    private final ffsk c;
    private final ffbr d;

    public czmd(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.d = ffbrVar;
        this.a = fgdm.a((Map) czmg.a.a());
        axol.k(ffskVar, null, new czmc(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.czme
            if (r0 == 0) goto L13
            r0 = r7
            czme r0 = (defpackage.czme) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            czme r0 = new czme
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L28
            goto La3
        L28:
            r7 = move-exception
            goto Lcb
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.ffci.b(r7)
            emhv r7 = defpackage.emhv.a
            eyfq r7 = r7.createBuilder()
            emhu r7 = (defpackage.emhu) r7
            emhx r2 = defpackage.emhx.a
            eyfq r2 = r2.createBuilder()
            emhw r2 = (defpackage.emhw) r2
            r2.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r2.instance
            emhx r4 = (defpackage.emhx) r4
            int r5 = r4.b
            r5 = r5 | 2
            r4.b = r5
            java.lang.String r5 = "animated_emoji"
            r4.d = r5
            r2.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r2.instance
            emhx r4 = (defpackage.emhx) r4
            int r5 = r4.b
            r5 = r5 | r3
            r4.b = r5
            java.lang.String r5 = "animated_emojis_mapping.json"
            r4.c = r5
            r7.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r7.instance
            emhv r4 = (defpackage.emhv) r4
            eyfy r2 = r2.build()
            emhx r2 = (defpackage.emhx) r2
            r2.getClass()
            r4.c = r2
            int r2 = r4.b
            r2 = r2 | r3
            r4.b = r2
            eyfy r7 = r7.build()
            r7.getClass()
            emhv r7 = (defpackage.emhv) r7
            ffbr r2 = r6.d     // Catch: java.lang.Exception -> L28
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L28
            emmt r2 = (defpackage.emmt) r2     // Catch: java.lang.Exception -> L28
            erph r7 = r2.c(r7)     // Catch: java.lang.Exception -> L28
            ffsk r2 = r6.c     // Catch: java.lang.Exception -> L28
            ffss r7 = defpackage.axnh.b(r7, r2)     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            ffuq r7 = (defpackage.ffuq) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r7.B(r0)     // Catch: java.lang.Exception -> L28
            if (r7 == r1) goto Lca
        La3:
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch: java.lang.Exception -> L28
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L28
            java.nio.charset.Charset r1 = defpackage.ffoo.a     // Catch: java.lang.Exception -> L28
            r0.<init>(r7, r1)     // Catch: java.lang.Exception -> L28
            evkt r7 = defpackage.evky.b(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L28
            r7.getClass()     // Catch: java.lang.Exception -> L28
            evkn r0 = new evkn     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            czmd$1 r1 = new czmd$1     // Catch: java.lang.Exception -> L28
            r1.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Type r1 = r1.b     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r0.j(r7, r1)     // Catch: java.lang.Exception -> L28
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L28
            return r7
        Lca:
            return r1
        Lcb:
            entd r0 = defpackage.czmd.b
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            ensz r0 = r0.a(r1)
            java.lang.String r1 = "Could not parse the animated emojis mapping through mdd: %s"
            java.lang.String r7 = r7.toString()
            r0.t(r1, r7)
            ffem r7 = defpackage.ffem.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czmd.a(ffgu):java.lang.Object");
    }

    public final String b(CharSequence charSequence) {
        charSequence.getClass();
        return (String) ((Map) this.a.c()).get(charSequence);
    }
}
