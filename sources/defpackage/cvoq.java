package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvoq implements bdnt, bdns {
    public static final enru a = enru.c("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;

    public cvoq(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.d = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    private final void b(MessageCoreData messageCoreData) {
        MessagePartCoreData G = messageCoreData.G();
        if (G == null || !G.bo()) {
            return;
        }
        Uri t = G.t();
        if (t == null) {
            ((enrr) a.h().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "callSafetyCoreAndPersistVerdict", 78, "SpatulaOnImageDownloadedListener.kt")).q("contentUri is null.");
        } else {
            axol.m(this.d, new cvoo(this, t, G, messageCoreData, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cvop
            if (r0 == 0) goto L13
            r0 = r10
            cvop r0 = (defpackage.cvop) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvop r0 = new cvop
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "insertToolstone"
            java.lang.String r4 = "com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener"
            java.lang.String r5 = "SpatulaOnImageDownloadedListener.kt"
            r6 = 1
            if (r2 == 0) goto L35
            if (r2 != r6) goto L2d
            defpackage.ffci.b(r10)
            goto L5c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.cvoq.a
            ensk r10 = r10.e()
            r2 = 115(0x73, float:1.61E-43)
            ensk r10 = r10.h(r4, r3, r2, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "SpatulaToolstoneInserter#insertToolstone executing..."
            r10.q(r2)
            ffbr r10 = r7.e
            java.lang.Object r10 = r10.b()
            crlo r10 = (defpackage.crlo) r10
            r0.c = r6
            java.lang.Object r10 = r10.d(r8, r9, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r10 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType) r10
            enru r8 = defpackage.cvoq.a
            ensk r8 = r8.e()
            r9 = 125(0x7d, float:1.75E-43)
            ensk r8 = r8.h(r4, r3, r9, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "SatelliteToolstoneUpdater#insertToolstone toolstone updated."
            r8.q(r9)
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvoq.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        ((enrr) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "afterIncomingFileTransferCompleted", 57, "SpatulaOnImageDownloadedListener.kt")).q("spatula afterIncomingFileTransferCompleted");
        if (((cutu) this.f.b()).b()) {
            b(messageCoreData);
        }
    }

    @Override // defpackage.bdns
    public final void g(MessageCoreData messageCoreData) {
        ((enrr) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnImageDownloadedListener", "onBeforeInsertedInTransaction", 66, "SpatulaOnImageDownloadedListener.kt")).t("spatula onBeforeInsertedInTransaction with message: %s", messageCoreData.B());
        if (((cutu) this.f.b()).b()) {
            b(messageCoreData);
        }
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void gc(MessageCoreData messageCoreData) {
    }
}
