package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctju extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ ctko c;
    final /* synthetic */ boolean d;
    final /* synthetic */ eooi e;
    Object f;
    Object g;
    Object h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctju(ffgu ffguVar, MessageCoreData messageCoreData, ctko ctkoVar, boolean z, eooi eooiVar) {
        super(2, ffguVar);
        this.b = messageCoreData;
        this.c = ctkoVar;
        this.d = z;
        this.e = eooiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r7 != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            java.lang.Object r0 = r6.h
            java.lang.Object r1 = r6.g
            java.lang.Object r2 = r6.f
            java.lang.Object r3 = r6.i
            java.util.List r3 = (java.util.List) r3
            defpackage.ffci.b(r7)
            goto Lbc
        L18:
            defpackage.ffci.b(r7)
            goto L70
        L1c:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.i
            ffsk r7 = (defpackage.ffsk) r7
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7 = r6.b
            if (r7 == 0) goto Lca
            ctko r7 = r6.c
            ffbr r7 = r7.f
            java.lang.Object r7 = r7.b()
            cttn r7 = (defpackage.cttn) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lca
            ctko r7 = r6.c
            ffbr r7 = r7.f
            java.lang.Object r7 = r7.b()
            cttn r7 = (defpackage.cttn) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto Lca
            boolean r7 = r6.d
            if (r7 != 0) goto Lca
            eooi r7 = r6.e
            eooi r1 = defpackage.eooi.NOTIFICATION_REPLY
            if (r7 == r1) goto L5d
            eooi r1 = defpackage.eooi.PHONE_QUICK_REPLY
            if (r7 == r1) goto L5d
            eooi r1 = defpackage.eooi.PHONE_SMART_REPLY
            if (r7 == r1) goto L5d
            eooi r1 = defpackage.eooi.WIDGET_REPLY
            if (r7 != r1) goto Lca
        L5d:
            ctko r7 = r6.c
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r1 = r6.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r1.B()
            r1.getClass()
            r6.a = r2
            java.lang.Object r7 = r7.p(r1, r6)
            if (r7 == r0) goto Lc9
        L70:
            ctko r1 = r6.c
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            ffbr r7 = r1.b
            java.lang.Object r7 = r7.b()
            ctqh r7 = (defpackage.ctqh) r7
            fbrd r1 = defpackage.fbrd.SHOWN_REPLIED
            r7.q(r3, r1)
            ctko r7 = r6.c
            ffbr r7 = r7.g
            java.lang.Object r7 = r7.b()
            ctkr r7 = (defpackage.ctkr) r7
            ctko r1 = r6.c
            ffbr r1 = r1.e
            java.lang.Object r1 = r1.b()
            ctiz r1 = (defpackage.ctiz) r1
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r2 = r6.b
            epjp r1 = r1.a(r2)
            eooi r2 = r6.e
            r3.size()
            ctko r4 = r6.c
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5 = r6.b
            ffss r4 = r4.r(r5)
            r6.i = r3
            r6.f = r2
            r6.g = r1
            r6.h = r7
            r5 = 2
            r6.a = r5
            java.lang.Object r4 = r4.c(r6)
            if (r4 == r0) goto Lc9
            r0 = r7
            r7 = r4
        Lbc:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5 = r6.b
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            eooi r2 = (defpackage.eooi) r2
            epjp r1 = (defpackage.epjp) r1
            r0.i(r1, r2, r3, r4, r5)
            goto Lca
        Lc9:
            return r0
        Lca:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctju.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctju ctjuVar = new ctju(ffguVar, this.b, this.c, this.d, this.e);
        ctjuVar.i = obj;
        return ctjuVar;
    }
}
