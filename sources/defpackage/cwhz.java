package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhz implements cwht {
    public final Context a;
    public final ConversationId b;
    public final cwis c;
    public final cwav d;
    public final ffbr e;
    public final cwjc f;
    private final ffsk g;
    private final cwbc h;
    private final cwhi i;
    private final ffbr j;
    private final cwhb k;
    private final cwhf l;
    private final fgdj m;
    private final fgdj n;
    private final fgdj o;

    public cwhz(Context context, ffsk ffskVar, ConversationId conversationId, cwis cwisVar, cwbc cwbcVar, cwav cwavVar, cwjc cwjcVar, cwhi cwhiVar, final aigz aigzVar, cwha cwhaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        context.getClass();
        ffskVar.getClass();
        cwisVar.getClass();
        cwbcVar.getClass();
        cwavVar.getClass();
        cwjcVar.getClass();
        cwhiVar.getClass();
        aigzVar.getClass();
        cwhaVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = context;
        this.g = ffskVar;
        this.b = conversationId;
        this.c = cwisVar;
        this.h = cwbcVar;
        this.d = cwavVar;
        this.f = cwjcVar;
        this.i = cwhiVar;
        this.j = ffbrVar;
        this.e = ffbrVar3;
        cwhb cwhbVar = new cwhb(new dmte(null), new cwec((String) null, (List) null, (ffix) null, (String) null, (cweb) null, 63));
        this.k = cwhbVar;
        dlsr b = b(((auvv) ffbrVar3.b()).a() ? aigzVar.i(aijc.a) : !cwjcVar.a, new ffix() { // from class: cwhu
            @Override // defpackage.ffix
            public final Object invoke() {
                cwhz cwhzVar = cwhz.this;
                cwhzVar.d.e();
                if (aigzVar.j(aijc.a)) {
                    cwhzVar.d.a();
                }
                return ffcu.a;
            }
        });
        String string = context.getString(R.string.start_chat_top_app_bar_title_single);
        string.getClass();
        cwhf cwhfVar = new cwhf(new dotb(new dosk(string, null, null, false, null, null, null, 254), b, null, false, false, null, null, 116), false);
        this.l = cwhfVar;
        ffxx ffxxVar = cwhaVar.f;
        int i = fgcz.a;
        this.m = fgbn.b(ffxxVar, ffskVar, fgcy.a(0L, 3), cwhbVar);
        this.n = fgbn.b(new fgch(((cwiw) ffbrVar.b()).a(), cwisVar.a(), new cwhx(this, aigzVar, null)), ffskVar, fgcy.a(0L, 3), cwhfVar);
        this.o = fgbn.b(cwhiVar.a(), ffskVar, fgcy.a(0L, 3), new cwhs());
    }

    @Override // defpackage.cwht
    public final cwic a() {
        return new cwic(this.m, this.n, this.o, new cwib(((auvv) this.e.b()).a(), 8));
    }

    public final dlsr b(boolean z, ffix ffixVar) {
        Context context = this.a;
        dmzz dmzzVar = dmzz.p;
        String string = context.getString(R.string.start_chat_top_app_bar_back);
        string.getClass();
        return new dlsr(string, dmzzVar, false, false, false, z, null, false, null, ffixVar, 988);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:14:0x0061 BREAK  A[LOOP:0: B:18:0x0050->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cwhv
            if (r0 == 0) goto L13
            r0 = r6
            cwhv r0 = (defpackage.cwhv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwhv r0 = new cwhv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            cwbc r6 = r4.h
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L66
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L61
        L4c:
            java.util.Iterator r5 = r6.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            cwbb r6 = (defpackage.cwbb) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L50
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwhz.c(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0108, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (r14 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r14 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aqux r12, defpackage.cwir r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwhz.d(aqux, cwir, ffgu):java.lang.Object");
    }
}
