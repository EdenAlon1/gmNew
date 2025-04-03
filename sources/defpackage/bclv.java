package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bclv implements bcll {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final dtuu e;
    private final ffhd f;
    private final ffbr g;
    private final fgjb h;
    private final Set i;

    public bclv(ffbr ffbrVar, ffbr ffbrVar2, dtuu dtuuVar, ffhd ffhdVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        dtuuVar.getClass();
        ffhdVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = dtuuVar;
        this.f = ffhdVar;
        this.d = ffbrVar3;
        this.g = ffbrVar4;
        this.h = new fgjf();
        this.i = new LinkedHashSet();
    }

    @Override // defpackage.bcll
    public final Object a(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.f), new bcls(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:16:0x0073, B:19:0x007b, B:22:0x0089, B:29:0x008d, B:31:0x009b, B:32:0x00b0, B:34:0x00be, B:35:0x00c3, B:40:0x00a3), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:16:0x0073, B:19:0x007b, B:22:0x0089, B:29:0x008d, B:31:0x009b, B:32:0x00b0, B:34:0x00be, B:35:0x00c3, B:40:0x00a3), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:16:0x0073, B:19:0x007b, B:22:0x0089, B:29:0x008d, B:31:0x009b, B:32:0x00b0, B:34:0x00be, B:35:0x00c3, B:40:0x00a3), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:16:0x0073, B:19:0x007b, B:22:0x0089, B:29:0x008d, B:31:0x009b, B:32:0x00b0, B:34:0x00be, B:35:0x00c3, B:40:0x00a3), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.bcll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.engw r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bclu
            if (r0 == 0) goto L13
            r0 = r8
            bclu r0 = (defpackage.bclu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bclu r0 = new bclu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            fgjf r7 = r0.f
            java.lang.Object r1 = r0.a
            bclv r0 = r0.e
            defpackage.ffci.b(r8)
            r8 = r7
            r7 = r1
            goto L4f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.ffci.b(r8)
            fgjb r8 = r6.h
            r0.e = r6
            r0.a = r7
            r2 = r8
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.d = r3
            java.lang.Object r0 = r8.a(r4, r0)
            if (r0 == r1) goto Ld0
            r0 = r6
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lcb
        L58:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> Lcb
            r3 = r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r3     // Catch: java.lang.Throwable -> Lcb
            ffbr r5 = r0.d     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lcb
            aucm r5 = (defpackage.aucm) r5     // Catch: java.lang.Throwable -> Lcb
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L7b
            java.util.Set r5 = r0.i     // Catch: java.lang.Throwable -> Lcb
            boolean r5 = r5.contains(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r5 != 0) goto L58
        L7b:
            ffbr r5 = r0.b     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lcb
            bdfl r5 = (defpackage.bdfl) r5     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = r5.k(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L58
            r1.add(r2)     // Catch: java.lang.Throwable -> Lcb
            goto L58
        L8d:
            ffbr r7 = r0.g     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Lcb
            auck r7 = (defpackage.auck) r7     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r7.a()     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto La3
            engw r7 = defpackage.engq.a(r1)     // Catch: java.lang.Throwable -> Lcb
            r0.c(r7)     // Catch: java.lang.Throwable -> Lcb
            goto Lb0
        La3:
            dtuu r7 = r0.e     // Catch: java.lang.Throwable -> Lcb
            bclq r2 = new bclq     // Catch: java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r7 = r7.b(r2)     // Catch: java.lang.Throwable -> Lcb
            ffcu r7 = (defpackage.ffcu) r7     // Catch: java.lang.Throwable -> Lcb
        Lb0:
            ffbr r7 = r0.d     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> Lcb
            aucm r7 = (defpackage.aucm) r7     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r7.a()     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto Lc3
            java.util.Set r7 = r0.i     // Catch: java.lang.Throwable -> Lcb
            r7.addAll(r1)     // Catch: java.lang.Throwable -> Lcb
        Lc3:
            engw r7 = defpackage.engq.a(r1)     // Catch: java.lang.Throwable -> Lcb
            r8.b(r4)
            return r7
        Lcb:
            r7 = move-exception
            r8.b(r4)
            throw r7
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclv.b(engw, ffgu):java.lang.Object");
    }

    @Override // defpackage.bcll
    public final void c(final engw engwVar) {
        this.e.d("refreshConversationsInTransaction", new Runnable() { // from class: bclr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                engw engwVar2 = engw.this;
                enqv it = engwVar2.iterator();
                it.getClass();
                while (true) {
                    bclv bclvVar = this;
                    if (!it.hasNext()) {
                        ((bczy) bclvVar.c.b()).Q(engq.f(engwVar2));
                        return;
                    }
                    ConversationIdType conversationIdType = (ConversationIdType) it.next();
                    ensk g = bclv.a.g();
                    g.Y(ente.a, "BugleBackup");
                    ((enrr) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl", "refreshConversationsInTransaction$lambda$6", 120, "ConversationRefresherImpl.kt")).t("Refreshing conversation [%s]", conversationIdType);
                    ((bdfl) bclvVar.b.b()).c(conversationIdType, true, null);
                }
            }
        });
    }

    @Override // defpackage.bcll
    public final void d() {
        if (((aucm) this.d.b()).a()) {
            ensk g = a.g();
            g.Y(ente.a, "BugleBackup");
            ((enrr) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/impl/ConversationRefresherImpl", "reset", 71, "ConversationRefresherImpl.kt")).q("Resetting ConversationRefresherImpl");
            this.i.clear();
        }
    }
}
