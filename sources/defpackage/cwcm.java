package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcm implements cwch {
    public static final cskc a = cskc.g("BugleContacts", "AddPeopleToGroupHandlerImpl");
    public final aigz b;
    public final ckza c;
    private final Context d;
    private final ffhd e;
    private final cwbc f;
    private final cwgr g;

    public cwcm(Context context, ffhd ffhdVar, cwgr cwgrVar, cwbc cwbcVar, aigz aigzVar, ckza ckzaVar) {
        context.getClass();
        ffhdVar.getClass();
        cwgrVar.getClass();
        cwbcVar.getClass();
        aigzVar.getClass();
        this.d = context;
        this.e = ffhdVar;
        this.g = cwgrVar;
        this.f = cwbcVar;
        this.b = aigzVar;
        this.c = ckzaVar;
    }

    @Override // defpackage.cwch
    public final Object a(ffix ffixVar, ConversationId conversationId, cwir cwirVar, ffgu ffguVar) {
        if (!cwirVar.d.c()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list = cwirVar.e;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object a2 = ffra.a(ekxi.a(this.e), new cwci(null, this, list, cwirVar, conversationId, ffixVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:14:0x0061 BREAK  A[LOOP:0: B:18:0x0050->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cwcl
            if (r0 == 0) goto L13
            r0 = r6
            cwcl r0 = (defpackage.cwcl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwcl r0 = new cwcl
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
            cwbc r6 = r4.f
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwcm.b(java.util.List, ffgu):java.lang.Object");
    }

    public final void c(String str) {
        String string = str != null ? this.d.getString(R.string.user_inviting_failed, str) : this.d.getString(R.string.user_inviting_failed_plural);
        string.getClass();
        this.g.a(string);
    }
}
