package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdoj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bdol b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ List d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdoj(ffgu ffguVar, bdol bdolVar, MessageCoreData messageCoreData, List list) {
        super(2, ffguVar);
        this.b = bdolVar;
        this.c = messageCoreData;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdoj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0087, code lost:
    
        if (r8 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:6:0x000f, B:7:0x0089, B:8:0x006e, B:10:0x0074), top: B:5:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:29:0x0040, B:31:0x0046, B:34:0x0061, B:44:0x0032), top: B:43:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:29:0x0040, B:31:0x0046, B:34:0x0061, B:44:0x0032), top: B:43:0x0032 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0087 -> B:7:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0058 -> B:27:0x005b). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L25
            if (r1 == r2) goto L17
            java.lang.Object r1 = r7.e
            java.lang.Object r2 = r7.f
            java.io.Closeable r2 = (java.io.Closeable) r2
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L14
            goto L89
        L14:
            r8 = move-exception
            goto L96
        L17:
            java.lang.Object r1 = r7.e
            java.lang.Object r3 = r7.f
            java.io.Closeable r3 = (java.io.Closeable) r3
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L21
            goto L5b
        L21:
            r8 = move-exception
            r2 = r3
            goto L96
        L25:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.f
            ffsk r8 = (defpackage.ffsk) r8
            java.lang.String r8 = "OutgoingMessageInsertionListenersManager::onBeforeInsertion"
            ekzz r8 = defpackage.eleg.f(r8)
            bdol r1 = r7.b     // Catch: java.lang.Throwable -> L93
            emyl r3 = defpackage.bdol.a     // Catch: java.lang.Throwable -> L93
            java.util.Collection r1 = r1.b()     // Catch: java.lang.Throwable -> L93
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r7.c     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L93
        L40:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L61
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L93
            bdod r4 = (defpackage.bdod) r4     // Catch: java.lang.Throwable -> L93
            r7.f = r8     // Catch: java.lang.Throwable -> L93
            r7.e = r1     // Catch: java.lang.Throwable -> L93
            r7.a = r2     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r4.a(r3, r7)     // Catch: java.lang.Throwable -> L93
            if (r3 == r0) goto L8d
            r6 = r3
            r3 = r8
            r8 = r6
        L5b:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r8     // Catch: java.lang.Throwable -> L21
            r6 = r3
            r3 = r8
            r8 = r6
            goto L40
        L61:
            bdol r1 = r7.b     // Catch: java.lang.Throwable -> L93
            emyl r2 = defpackage.bdol.a     // Catch: java.lang.Throwable -> L93
            java.util.Collection r1 = r1.b()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L93
            r2 = r8
        L6e:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8e
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L14
            bdod r8 = (defpackage.bdod) r8     // Catch: java.lang.Throwable -> L14
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L14
            r7.f = r2     // Catch: java.lang.Throwable -> L14
            r7.e = r1     // Catch: java.lang.Throwable -> L14
            r5 = 2
            r7.a = r5     // Catch: java.lang.Throwable -> L14
            java.lang.Object r8 = r8.b(r3, r4, r7)     // Catch: java.lang.Throwable -> L14
            if (r8 == r0) goto L8d
        L89:
            r3 = r8
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r3     // Catch: java.lang.Throwable -> L14
            goto L6e
        L8d:
            return r0
        L8e:
            r8 = 0
            defpackage.ffig.a(r2, r8)
            return r3
        L93:
            r0 = move-exception
            r2 = r8
            r8 = r0
        L96:
            throw r8     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            defpackage.ffig.a(r2, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdoj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bdoj bdojVar = new bdoj(ffguVar, this.b, this.c, this.d);
        bdojVar.f = obj;
        return bdojVar;
    }
}
