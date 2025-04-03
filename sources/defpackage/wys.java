package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wys implements wqq {
    public final Context a;
    private final ffsk b;
    private final ctud c;
    private final sfy d;
    private final aigz e;
    private final entd f;
    private final ffxx g;
    private final Set h;

    public wys(Context context, ffsk ffskVar, aawu aawuVar, ctud ctudVar, sfy sfyVar, aigz aigzVar) {
        context.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        ctudVar.getClass();
        sfyVar.getClass();
        aigzVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ctudVar;
        this.d = sfyVar;
        this.e = aigzVar;
        this.f = entd.c("Bugle");
        this.g = new wyr(aawuVar.a(), this);
        this.h = fffi.d(aaxf.b, aaxf.c);
    }

    private final Object f(ffgu ffguVar) {
        if (ctid.c || this.c.s()) {
            return true;
        }
        return this.e.f(new aimz(ctuf.STORAGE_PERMISSIONS), ffguVar);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.h;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wyn
            if (r0 == 0) goto L13
            r0 = r8
            wyn r0 = (defpackage.wyn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wyn r0 = new wyn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            wys r0 = r0.e
            defpackage.ffci.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r8)
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.f(r0)
            if (r8 == r1) goto L9f
            r0 = r6
        L43:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8f
            sfy r8 = r0.d
            java.lang.String r0 = "Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration"
            sfx r8 = r8.a(r0)
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r7.next()
            alxr r0 = (defpackage.alxr) r0
            appj r0 = r0.g()
            apmq r0 = (defpackage.apmq) r0
            android.net.Uri r1 = r0.e()
            java.lang.String r2 = r0.b()
            android.net.Uri r3 = r0.c()
            boolean r4 = r0 instanceof defpackage.apph
            r5 = 0
            if (r4 == 0) goto L7d
            apph r0 = (defpackage.apph) r0
            goto L7e
        L7d:
            r0 = r5
        L7e:
            if (r0 == 0) goto L84
            java.lang.String r5 = r0.h()
        L84:
            r8.b(r1, r2, r3, r5)
            goto L57
        L88:
            r7 = 0
            java.lang.Void[] r7 = new java.lang.Void[r7]
            r8.e(r7)
            goto L9c
        L8f:
            entd r7 = r0.f
            java.util.logging.Level r8 = java.util.logging.Level.WARNING
            ensz r7 = r7.a(r8)
            java.lang.String r8 = "Unable to obtain storage permission. Attachment will not be saved."
            r7.q(r8)
        L9c:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wys.c(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:11:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wyo
            if (r0 == 0) goto L13
            r0 = r11
            wyo r0 = (defpackage.wyo) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            wyo r0 = new wyo
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.b
            java.lang.Object r2 = r0.a
            java.util.Iterator r2 = (java.util.Iterator) r2
            wys r4 = r0.f
            defpackage.ffci.b(r11)
            goto Lac
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.a
            java.util.List r10 = (java.util.List) r10
            wys r2 = r0.f
            defpackage.ffci.b(r11)
            goto L55
        L45:
            defpackage.ffci.b(r11)
            r0.f = r9
            r0.a = r10
            r0.e = r4
            java.lang.Object r11 = r9.f(r0)
            if (r11 == r1) goto Lda
            r2 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lca
            java.util.Iterator r10 = r10.iterator()
            r4 = r2
            r2 = r10
        L63:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto Ld7
            java.lang.Object r10 = r2.next()
            alxr r10 = (defpackage.alxr) r10
            appj r10 = r10.g()
            apmq r10 = (defpackage.apmq) r10
            r0.f = r4
            r0.a = r2
            r0.b = r10
            r0.e = r3
            boolean r11 = r10 instanceof defpackage.apph
            r5 = 0
            if (r11 == 0) goto L86
            r11 = r10
            apph r11 = (defpackage.apph) r11
            goto L87
        L86:
            r11 = r5
        L87:
            if (r11 == 0) goto L8d
            java.lang.String r5 = r11.h()
        L8d:
            aigz r11 = r4.e
            aiir r6 = new aiir
            adv r7 = new adv
            java.lang.String r8 = r10.b()
            r8.getClass()
            r7.<init>(r8)
            if (r5 != 0) goto La1
            java.lang.String r5 = ""
        La1:
            java.lang.String r8 = "save_action_plugin"
            r6.<init>(r8, r7, r5)
            java.lang.Object r11 = r11.f(r6, r0)
            if (r11 == r1) goto Lda
        Lac:
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L63
            sfy r5 = r4.d
            java.lang.String r6 = "Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration"
            sfx r5 = r5.a(r6)
            android.net.Uri r6 = r10.e()
            java.lang.String r10 = r10.b()
            r5.c(r6, r11, r10)
            r10 = 0
            java.lang.Void[] r10 = new java.lang.Void[r10]
            r5.e(r10)
            goto L63
        Lca:
            entd r10 = r2.f
            java.util.logging.Level r11 = java.util.logging.Level.WARNING
            ensz r10 = r10.a(r11)
            java.lang.String r11 = "Unable to obtain storage permission. Attachment will not be saved."
            r10.q(r11)
        Ld7:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wys.d(java.util.List, ffgu):java.lang.Object");
    }

    public final void e(List list) {
        axol.k(this.b, null, new wym(list, this, null), 3);
    }
}
