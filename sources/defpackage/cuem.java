package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuem {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/util/spam/a2p/data/A2pConversationSubscriptionsDatabaseOperations");
    public final dtuu a;
    public final ffbr b;
    private final ffhd d;

    public cuem(ffhd ffhdVar, dtuu dtuuVar, ffbr ffbrVar) {
        ffhdVar.getClass();
        dtuuVar.getClass();
        this.d = ffhdVar;
        this.a = dtuuVar;
        this.b = ffbrVar;
    }

    public static final cuee e(long j) {
        Function function = new Function() { // from class: cueg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqae bqaeVar = (bqae) obj;
                bqaeVar.az(0, "participant_id");
                long j2 = bqaeVar.a;
                bqaeVar.az(1, "conversation_toolstone_state");
                cuen cuenVar = bqaeVar.b;
                cuenVar.getClass();
                bqaeVar.az(2, "conversation_subscription_state");
                cuef cuefVar = bqaeVar.c;
                cuefVar.getClass();
                bqaeVar.az(3, "last_action_timestamp");
                Instant instant = bqaeVar.d;
                instant.getClass();
                return new cuee(j2, cuenVar, cuefVar, instant);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        String[] strArr = bqbh.a;
        bqbc bqbcVar = new bqbc(bqbh.a);
        bqbcVar.z("a2p_conversation_subscriptions.queryOnParticipantId");
        bqbcVar.q();
        bqbg bqbgVar = new bqbg();
        bqbgVar.b(j);
        bqbcVar.k(new bqbf(bqbgVar));
        bqae bqaeVar = (bqae) dtub.c(bqbcVar.b());
        return (cuee) (bqaeVar != null ? function.apply(bqaeVar) : null);
    }

    public final Object a(long j, cuen cuenVar, cuef cuefVar, ffgu ffguVar) {
        return ekxl.a(this.d, new cuel(this, j, cuenVar, cuefVar, null), ffguVar);
    }

    public final Object b(aqkv aqkvVar, ffgu ffguVar) {
        String str = aqkvVar.a;
        str.getClass();
        return ekxl.a(this.d, new cueh(this, Long.parseLong(str), null), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aqkv r8, defpackage.cuen r9, defpackage.cuef r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.cuei
            if (r0 == 0) goto L13
            r0 = r11
            cuei r0 = (defpackage.cuei) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuei r0 = new cuei
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            aqkv r8 = r6.d
            defpackage.ffci.b(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            return r11
        L2a:
            r0 = move-exception
            r9 = r0
            goto L51
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ffci.b(r11)
            java.lang.String r11 = r8.a     // Catch: android.database.sqlite.SQLiteException -> L2a
            r11.getClass()     // Catch: android.database.sqlite.SQLiteException -> L2a
            long r3 = java.lang.Long.parseLong(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            r6.d = r8     // Catch: android.database.sqlite.SQLiteException -> L2a
            r6.c = r2     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1 = r7
            r5 = r10
            r2 = r3
            r4 = r9
            java.lang.Object r8 = r1.a(r2, r4, r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L2a
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        L51:
            enru r10 = defpackage.cuem.c
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            java.lang.String r0 = "BugleSpam"
            r10.Y(r11, r0)
            enrr r10 = (defpackage.enrr) r10
            ensk r9 = r10.g(r9)
            java.lang.String r10 = "updateSubscription"
            r11 = 53
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/a2p/data/A2pConversationSubscriptionsDatabaseOperations"
            java.lang.String r1 = "A2pConversationSubscriptionsDatabaseOperations.kt"
            ensk r9 = r9.h(r0, r10, r11, r1)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Error updating subscription for recipientId: %s"
            java.lang.String r8 = r8.a
            r9.t(r10, r8)
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuem.c(aqkv, cuen, cuef, ffgu):java.lang.Object");
    }
}
