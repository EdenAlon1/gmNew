package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgl implements bdod {
    public final Context a;
    private final Optional b;
    private final ffbr c;
    private final String d;
    private final ffbz e;

    public ajgl(Optional optional, Context context, ffbr ffbrVar) {
        optional.getClass();
        context.getClass();
        ffbrVar.getClass();
        this.b = optional;
        this.a = context;
        this.c = ffbrVar;
        this.d = optional.isPresent() ? ((cjdk) optional.get()).r() : null;
        this.e = ffca.a(new ffix() { // from class: ajgi
            @Override // defpackage.ffix
            public final Object invoke() {
                return ctid.c(ajgl.this.a).toLanguageTag();
            }
        });
    }

    @Override // defpackage.bdod
    public final Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        if (!j() || !messageCoreData.cX()) {
            return messageCoreData;
        }
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ffdx.U(list);
        return ffkj.e(bindData != null ? bindData.W() : null, this.d) ? d(messageCoreData, ffguVar) : messageCoreData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ajgj
            if (r0 == 0) goto L13
            r0 = r6
            ajgj r0 = (defpackage.ajgj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ajgj r0 = new ajgj
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
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.c
            java.lang.Object r6 = r6.b()
            cjeo r6 = (defpackage.cjeo) r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 == r1) goto L66
        L46:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L4d
            ffcu r5 = defpackage.ffcu.a
            return r5
        L4d:
            fayv r0 = r5.aa()
            clbi r0 = defpackage.clbi.b(r0)
            clbg r1 = defpackage.clbg.RCS_PENPAL_NAMESPACE
            java.lang.String r2 = "PENPAL-CONVERSATION-ID"
            r0.d(r1, r2, r6)
            fayv r6 = r0.c()
            r5.bs(r6)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgl.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ajgk
            if (r0 == 0) goto L13
            r0 = r8
            ajgk r0 = (defpackage.ajgk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ajgk r0 = new ajgk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            return r7
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            r7.mo253do()
            fayv r8 = r7.aa()
            clbi r8 = defpackage.clbi.b(r8)
            ffbz r2 = r6.e
            clbg r4 = defpackage.clbg.RCS_PENPAL_NAMESPACE
            java.lang.Object r2 = r2.a()
            r2.getClass()
            java.lang.String r5 = "LOCALE"
            java.lang.String r2 = (java.lang.String) r2
            r8.d(r4, r5, r2)
            fayv r8 = r8.c()
            r7.bs(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgl.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && this.d != null;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }
}
