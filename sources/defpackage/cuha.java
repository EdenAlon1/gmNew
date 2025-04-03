package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuha {
    public static final cfup a = cfvl.e(cfvl.b, "spam_logging_ids_user_id_lifetime_days", 14);
    private static final cfup d = cfvl.e(cfvl.b, "spam_logging_ids_conversation_and_message_id_lifetime_days", 7);
    public final cqoh b;
    public final ffsk c;
    private final effy e;
    private final dtuu f;

    public cuha(effy effyVar, cqoh cqohVar, dtuu dtuuVar, ffsk ffskVar) {
        effyVar.getClass();
        cqohVar.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        this.e = effyVar;
        this.b = cqohVar;
        this.f = dtuuVar;
        this.c = ffskVar;
    }

    public static final cuhh c(final ConversationIdType conversationIdType, MessageIdType messageIdType, cuha cuhaVar) {
        String k;
        String[] strArr = cuiq.a;
        cuip cuipVar = new cuip();
        cuipVar.b(conversationIdType);
        cuipVar.d();
        cuipVar.c();
        if (messageIdType == null) {
            cuipVar.aq(new dtrx("spam_logging_ids_table.message_id", 5));
            cuipVar.aq(new dtrx("spam_logging_ids_table.message_logging_id", 5));
        } else {
            cuipVar.aq(new dtrt("spam_logging_ids_table.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
            cuipVar.aq(new dtrt("spam_logging_ids_table.message_logging_id", 2, ""));
            cuipVar.aq(new dtrx("spam_logging_ids_table.message_logging_id", 6));
        }
        cuin cuinVar = new cuin(cuiq.a);
        cuinVar.z("SpamLoggingIds#getConversationAndMessageLoggingIds#both");
        cuinVar.k(new cuio(cuipVar));
        engw y = cuinVar.b().y();
        y.getClass();
        cuhh cuhhVar = (cuhh) ffdx.M(y);
        if (cuhhVar != null) {
            return cuhhVar;
        }
        cuin cuinVar2 = new cuin(cuiq.a);
        cuinVar2.z("SpamLoggingIds#getConversationAndMessageLoggingIds#conversation");
        cuinVar2.c(new Function() { // from class: cugn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cuip cuipVar2 = (cuip) obj;
                cfup cfupVar = cuha.a;
                cuipVar2.b(ConversationIdType.this);
                cuipVar2.d();
                cuipVar2.c();
                return cuipVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y2 = cuinVar2.b().y();
        y2.getClass();
        cuhh cuhhVar2 = (cuhh) ffdx.M(y2);
        cuhm cuhmVar = new cuhm();
        cuhmVar.b(conversationIdType);
        cuhmVar.d(cuhaVar.b.f().toEpochMilli());
        if (cuhhVar2 == null || (k = cuhhVar2.k()) == null || k.length() == 0) {
            cuhmVar.c(UUID.randomUUID().toString());
        } else {
            cuhmVar.c(cuhhVar2.k());
        }
        if (messageIdType != null) {
            cuhmVar.e(messageIdType);
            cuhmVar.f(UUID.randomUUID().toString());
        }
        try {
            cuhh a2 = cuhmVar.a(new Supplier() { // from class: cuhj
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cuhi();
                }
            });
            final dtve a3 = cuiq.a();
            dtub.b(cuiq.a(), "spam_logging_ids_table", a2, new Function() { // from class: cuhd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("spam_logging_ids_table", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: cuhe
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return a2;
        } catch (SQLiteConstraintException unused) {
            return null;
        }
    }

    private final void i() {
        Object apply;
        final long a2 = a();
        String[] strArr = cuiq.a;
        cuij cuijVar = new cuij();
        cuijVar.f("SpamLoggingIds#deleteExpiredTableRows");
        apply = new Function() { // from class: cugs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cuip cuipVar = (cuip) obj;
                cfup cfupVar = cuha.a;
                cuipVar.aq(new dtwe("spam_logging_ids_table.generation_timestamp", 8, Long.valueOf(a2)));
                return cuipVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new cuip());
        cuijVar.b = new cuio((cuip) apply);
        cuijVar.d();
    }

    public final long a() {
        long days = TimeUnit.MILLISECONDS.toDays(this.b.f().toEpochMilli());
        cfup cfupVar = d;
        Object e = cfupVar.e();
        e.getClass();
        long longValue = days / ((Number) e).longValue();
        TimeUnit timeUnit = TimeUnit.DAYS;
        Object e2 = cfupVar.e();
        e2.getClass();
        return timeUnit.toMillis(longValue * ((Number) e2).longValue());
    }

    public final cuhh b(final ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        efbd.b();
        i();
        return (cuhh) this.f.c("SpamLoggingIds#getConversationAndMessageLoggingIds", new emyl() { // from class: cugr
            @Override // defpackage.emyl
            public final Object get() {
                return cuha.c(ConversationIdType.this, messageIdType, this);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cugv
            if (r0 == 0) goto L13
            r0 = r5
            cugv r0 = (defpackage.cugv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cugv r0 = new cugv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cuha r0 = r0.d
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L47
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            effy r5 = r4.e     // Catch: java.lang.Exception -> L46
            cugo r2 = new cugo     // Catch: java.lang.Exception -> L46
            r2.<init>()     // Catch: java.lang.Exception -> L46
            r0.d = r4     // Catch: java.lang.Exception -> L46
            r0.c = r3     // Catch: java.lang.Exception -> L46
            java.lang.Object r5 = defpackage.ctzl.b(r5, r2, r0)     // Catch: java.lang.Exception -> L46
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r0.i()
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuha.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cugw
            if (r0 == 0) goto L13
            r0 = r5
            cugw r0 = (defpackage.cugw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cugw r0 = new cugw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cugu r5 = (defpackage.cugu) r5
            java.lang.String r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuha.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cugx
            if (r0 == 0) goto L13
            r0 = r5
            cugx r0 = (defpackage.cugx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cugx r0 = new cugx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cugu r5 = (defpackage.cugu) r5
            java.lang.String r5 = r5.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuha.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:11:0x0025, B:12:0x004b, B:14:0x004f, B:17:0x0056, B:22:0x0039), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:11:0x0025, B:12:0x004b, B:14:0x004f, B:17:0x0056, B:22:0x0039), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cugz
            if (r0 == 0) goto L13
            r0 = r6
            cugz r0 = (defpackage.cugz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cugz r0 = new cugz
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fflb r0 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L5a
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            fflb r6 = new fflb
            r6.<init>()
            effy r2 = r5.e     // Catch: java.lang.Exception -> L5a
            cugq r4 = new cugq     // Catch: java.lang.Exception -> L5a
            r4.<init>()     // Catch: java.lang.Exception -> L5a
            r0.d = r6     // Catch: java.lang.Exception -> L5a
            r0.c = r3     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = defpackage.ctzl.b(r2, r4, r0)     // Catch: java.lang.Exception -> L5a
            if (r0 == r1) goto L59
            r0 = r6
        L4b:
            java.lang.Object r6 = r0.a     // Catch: java.lang.Exception -> L5a
            if (r6 != 0) goto L56
            java.lang.String r6 = "userIds"
            defpackage.ffkj.c(r6)     // Catch: java.lang.Exception -> L5a
            r6 = 0
            return r6
        L56:
            cugu r6 = (defpackage.cugu) r6     // Catch: java.lang.Exception -> L5a
            return r6
        L59:
            return r1
        L5a:
            cugu r6 = new cugu
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuha.g(ffgu):java.lang.Object");
    }

    public final boolean h(cuhb cuhbVar) {
        long days = TimeUnit.MILLISECONDS.toDays(((cuhc) cuhbVar.instance).d);
        cfup cfupVar = a;
        Object e = cfupVar.e();
        e.getClass();
        long longValue = days / ((Number) e).longValue();
        long days2 = TimeUnit.MILLISECONDS.toDays(this.b.f().toEpochMilli());
        Object e2 = cfupVar.e();
        e2.getClass();
        return longValue != days2 / ((Number) e2).longValue();
    }
}
