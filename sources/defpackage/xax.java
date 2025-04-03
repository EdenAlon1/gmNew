package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xax implements wqq {
    public final Context a;
    public final ffsk b;
    public final Conversation c;
    public final ffbr d;
    public final ffbr e;
    public final ajjc f;
    public final ffbr g;
    private final ffxx h;
    private final ffbr i;
    private final fgdj j;

    public xax(Context context, ffsk ffskVar, ffxx ffxxVar, Conversation conversation, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ajjc ajjcVar, ffbr ffbrVar4) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        conversation.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ajjcVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.h = ffxxVar;
        this.c = conversation;
        this.d = ffbrVar;
        this.i = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ajjcVar;
        this.g = ffbrVar4;
        xaw xawVar = new xaw(ffxxVar, this);
        int i = fgcz.a;
        this.j = fgbn.b(xawVar, ffskVar, fgcy.a(0L, 3), true);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return new fgch(this.h, this.j, new xar(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xas
            if (r0 == 0) goto L13
            r0 = r6
            xas r0 = (defpackage.xas) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xas r0 = new xas
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.ffci.b(r6)
            goto L63
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.ffci.b(r6)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r5.c
            alye r6 = r6.c()
            boolean r6 = r6 instanceof defpackage.aotl
            if (r6 == 0) goto L6e
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r5.c
            alye r6 = r6.c()
            r6.getClass()
            aotl r6 = (defpackage.aotl) r6
            cfup r2 = defpackage.cudz.j
            java.lang.Object r2 = r2.e()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            elfl r6 = r6.W(r2)
            r0.c = r4
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L6d
        L63:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6e
            r3 = r4
            goto L6e
        L6d:
            return r1
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xax.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.engw r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xat
            if (r0 == 0) goto L13
            r0 = r6
            xat r0 = (defpackage.xat) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xat r0 = new xat
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            java.lang.Object r5 = defpackage.ffdx.U(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 != 0) goto L41
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L41:
            ffbr r6 = r4.i
            java.lang.Object r6 = r6.b()
            cuem r6 = (defpackage.cuem) r6
            aqkv r2 = r5.F()
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 == r1) goto L7b
        L57:
            cuee r6 = (defpackage.cuee) r6
            if (r6 != 0) goto L60
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L60:
            cuef r6 = r6.c
            int r6 = r6.ordinal()
            r0 = 3
            r1 = 0
            if (r6 == r0) goto L70
            r5 = 4
            if (r6 == r5) goto L6e
            goto L76
        L6e:
            r3 = r1
            goto L76
        L70:
            boolean r5 = r5.D()
            if (r5 != 0) goto L6e
        L76:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xax.d(engw, ffgu):java.lang.Object");
    }
}
