package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrx implements bdod, bdnu {
    private static final entd b = entd.c("BugleCaption");
    public final Optional a;
    private final bcwz c;
    private final amhs d;
    private final ffbz e;

    public cgrx(bcwz bcwzVar, amhs amhsVar, Optional optional) {
        bcwzVar.getClass();
        amhsVar.getClass();
        optional.getClass();
        this.c = bcwzVar;
        this.d = amhsVar;
        this.a = optional;
        this.e = ffca.a(new ffix() { // from class: cgru
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional2 = cgrx.this.a;
                if (true != optional2.isPresent()) {
                    optional2 = null;
                }
                if (optional2 != null) {
                    return ((cjdk) optional2.get()).r();
                }
                return null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.bdod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, java.util.List r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cgrv
            if (r0 == 0) goto L13
            r0 = r8
            cgrv r0 = (defpackage.cgrv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgrv r0 = new cgrv
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r6 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "ImageCaptionTransportListener::onBeforeInsertion"
            ekzz r8 = defpackage.eleg.f(r8)
            r0.d = r8     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.c(r6, r7, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == r1) goto L4e
            r4 = r8
            r8 = r6
            r6 = r4
        L49:
            r7 = 0
            defpackage.ffig.a(r6, r7)
            return r8
        L4e:
            return r1
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L52:
            throw r7     // Catch: java.lang.Throwable -> L53
        L53:
            r8 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgrx.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, java.util.List r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgrx.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (messageCoreData.cX()) {
            String a = cgrt.a(messageCoreData.aa());
            if (a != null) {
                messageCoreData.bo(new bdnn(a));
            }
            if (messageCoreData.F() != null) {
                ((ensz) b.h()).q("Successfully deserialized an image caption.");
            }
        }
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
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
