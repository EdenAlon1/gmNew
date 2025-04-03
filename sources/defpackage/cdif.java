package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdif implements cdia {
    public final cdrg a;
    public final ffhd b;
    public long c;
    private final ffbr d;
    private final ffbr e;

    public cdif(cdrg cdrgVar, ffbr ffbrVar, ffbr ffbrVar2, ffhd ffhdVar) {
        this.a = cdrgVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffhdVar;
    }

    public final engw a() {
        bqkn a = bqkv.a();
        a.z("gatherMediaFailedWithOutOfStorageExceptionBatch");
        a.c(new Function() { // from class: cdib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqku bqkuVar = (bqku) obj;
                bqkuVar.aq(new dtrw("cms_dead_letter_queue.failure_reason", 3, bqku.at((Iterable) DesugarArrays.stream(new epeg[]{epeg.NO_SQS_STORAGE_QUOTA_FOR_MEDIA, epeg.NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE}).map(new Function() { // from class: bqkt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((epeg) obj2).bs);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bqks()))), true));
                bqkuVar.aq(new dtwe("cms_dead_letter_queue._id", 7, Long.valueOf(cdif.this.c)));
                return bqkuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.B(bqkv.c.a);
        Object e = cdig.b.e();
        e.getClass();
        a.x(((Number) e).intValue());
        a.r();
        return a.b().y();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cdnc r11, java.lang.String r12, java.lang.String r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdif.b(cdnc, java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, defpackage.pot r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cdie
            if (r0 == 0) goto L13
            r0 = r10
            cdie r0 = (defpackage.cdie) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdie r0 = new cdie
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L73
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.cdig.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleCms"
            r10.Y(r2, r4)
            enrr r10 = (defpackage.enrr) r10
            r2 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r10.W(r2, r4)
            java.lang.String r2 = "uploadMedia"
            r4 = 235(0xeb, float:3.3E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/ResumeSqsMediaUploadWorkDelegateImpl$InternalResumeSqsMediaUploadWorkDelegateImpl"
            java.lang.String r6 = "ResumeSqsMediaUploadWorkDelegateImpl.kt"
            ensk r10 = r10.h(r5, r2, r4, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Starting upload for media with id %s"
            r10.t(r2, r8)
            ffbr r8 = r7.d
            java.lang.Object r8 = r8.b()
            cdoe r8 = (defpackage.cdoe) r8
            elfl r8 = r8.a(r9)
            r8.getClass()
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 != r1) goto L73
            return r1
        L73:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdif.c(java.lang.String, pot, ffgu):java.lang.Object");
    }
}
