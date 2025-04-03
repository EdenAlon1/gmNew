package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amoc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ List d;
    final /* synthetic */ ConversationIdType e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnz(ffgu ffguVar, amoc amocVar, boolean z, List list, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.b = amocVar;
        this.c = z;
        this.d = list;
        this.e = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r6 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        if (r6 != r0) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L13
            defpackage.ffci.b(r6)
            return r6
        L13:
            defpackage.ffci.b(r6)
            return r6
        L17:
            defpackage.ffci.b(r6)
            goto L52
        L1b:
            defpackage.ffci.b(r6)
            goto L38
        L1f:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.f
            ffsk r6 = (defpackage.ffsk) r6
            amoc r6 = r5.b
            ffbr r6 = r6.e
            java.lang.Object r6 = r6.b()
            cghm r6 = (defpackage.cghm) r6
            r5.a = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto Lba
        L38:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La1
            amoc r6 = r5.b
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            cggl r6 = (defpackage.cggl) r6
            r5.a = r3
            java.lang.Object r6 = defpackage.cggl.a()
            if (r6 == r0) goto Lba
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5b
            goto La1
        L5b:
            boolean r6 = r5.c
            if (r6 == 0) goto L75
            amoc r6 = r5.b
            ffbr r6 = r6.d
            java.lang.Object r6 = r6.b()
            aqly r6 = (defpackage.aqly) r6
            java.util.List r1 = r5.d
            r5.a = r2
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto L74
            goto Lba
        L74:
            return r6
        L75:
            amoc r6 = r5.b
            ffbr r6 = r6.b
            java.lang.Object r6 = r6.b()
            cggo r6 = (defpackage.cggo) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r5.e
            r2 = 4
            r5.a = r2
            ffbr r2 = r6.a
            java.lang.Object r2 = r2.b()
            r2.getClass()
            ffhd r2 = (defpackage.ffhd) r2
            ffhd r2 = defpackage.ekxi.a(r2)
            cggn r3 = new cggn
            r4 = 0
            r3.<init>(r4, r6, r1)
            java.lang.Object r6 = defpackage.ffra.a(r2, r3, r5)
            if (r6 != r0) goto La0
            goto Lba
        La0:
            return r6
        La1:
            entd r6 = defpackage.amoc.a
            ensk r6 = r6.h()
            ensz r6 = (defpackage.ensz) r6
            ensn r0 = defpackage.csux.O
            java.lang.String r1 = "ConversationTrustedContactsApi"
            r6.Y(r0, r1)
            java.lang.String r0 = "Devices not under supervision, conversation is always allowed."
            r6.q(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amnz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amnz amnzVar = new amnz(ffguVar, this.b, this.c, this.d, this.e);
        amnzVar.f = obj;
        return amnzVar;
    }
}
