package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnly implements bdod {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleReplies");
    private final cnmj c;
    private final dtuu d;

    public cnly(cnmj cnmjVar, dtuu dtuuVar) {
        dtuuVar.getClass();
        this.c = cnmjVar;
        this.d = dtuuVar;
    }

    public static final void c(MessageIdType messageIdType, MessageIdType messageIdType2) {
        String[] strArr = bufy.a;
        buet buetVar = new buet();
        buetVar.d(messageIdType);
        buetVar.e(messageIdType2);
        buetVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.bdod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cnlx
            if (r0 == 0) goto L13
            r0 = r8
            cnlx r0 = (defpackage.cnlx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnlx r0 = new cnlx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r7 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "RepliesOnOutgoingMessageInsertionListener::onBeforeInsertion"
            ekzz r8 = defpackage.eleg.f(r8)
            cnmj r2 = r6.c     // Catch: java.lang.Throwable -> L5c
            r0.d = r8     // Catch: java.lang.Throwable -> L5c
            r0.c = r4     // Catch: java.lang.Throwable -> L5c
            ffhd r2 = r2.a     // Catch: java.lang.Throwable -> L5c
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L5c
            cnmi r4 = new cnmi     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r3, r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = defpackage.ffra.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L5c
            if (r7 == r1) goto L5b
            r5 = r8
            r8 = r7
            r7 = r5
        L57:
            defpackage.ffig.a(r7, r3)
            return r8
        L5b:
            return r1
        L5c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L60:
            throw r8     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            defpackage.ffig.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnly.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final void h(MessageCoreData messageCoreData) {
        cnmd U = messageCoreData.U();
        if (U != null) {
            int k = messageCoreData.k();
            final MessageIdType messageIdType = U.b;
            if (k != 3) {
                MessageIdType B = messageCoreData.B();
                B.getClass();
                c(B, messageIdType);
            } else {
                final MessageIdType B2 = messageCoreData.B();
                B2.getClass();
                if (((Boolean) this.d.c("RepliesOnOutgoingMessageInsertionListener.onInsertInTransactionForDraft", new emyl() { // from class: cnlv
                    @Override // defpackage.emyl
                    public final Object get() {
                        buxo d = MessagesTable.d();
                        d.z("onInsertInTransactionForDraft");
                        final MessageIdType messageIdType2 = messageIdType;
                        d.h(new Function() { // from class: cnlw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                int i = cnly.a;
                                buxzVar.q(MessageIdType.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean T = d.b().T();
                        if (T) {
                            cnly.c(MessageIdType.this, messageIdType2);
                        }
                        return Boolean.valueOf(T);
                    }
                })).booleanValue()) {
                    return;
                }
                b.n().q("RepliesOnOutgoingMessageInsertionListener skipped inserting draft reply to missing");
            }
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
