package defpackage;

import android.net.Uri;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdr extends ffhv implements ffjm {
    final /* synthetic */ Uri a;
    final /* synthetic */ awup b;
    final /* synthetic */ awap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awdr(Uri uri, awup awupVar, awap awapVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = uri;
        this.b = awupVar;
        this.c = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awdr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Uri uri = this.a;
        awup awupVar = this.b;
        final awap awapVar = this.c;
        ekzz f = eleg.f("FileProcessingDatabaseOperations#updateFileTransferEntryWithResizingResult");
        try {
            String[] strArr = awfq.a;
            awfn awfnVar = new awfn();
            awfnVar.ap("updateFileTransferEntryWithResizingResult");
            awfnVar.e(uri);
            awfnVar.c(awupVar);
            awfnVar.h(new Function() { // from class: awdq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    awfp awfpVar = (awfp) obj2;
                    awfpVar.c(awap.this);
                    awfpVar.b(awfr.a);
                    return awfpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (awfnVar.b().e() > 0) {
                ensk e = awdt.a.e();
                e.Y(ente.a, "BugleFileTransfer");
                enrr enrrVar = (enrr) e;
                enrrVar.Y(cqpo.j, awapVar);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$updateFileTransferEntryWithResizingResult$2", "invokeSuspend", 180, "FileProcessingDatabaseOperationsImpl.kt")).q("Updated file processing table entry for with resizing result.");
            } else {
                ensk j = awdt.a.j();
                j.Y(ente.a, "BugleFileTransfer");
                enrr enrrVar2 = (enrr) j;
                enrrVar2.Y(cqpo.j, awapVar);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$updateFileTransferEntryWithResizingResult$2", "invokeSuspend", 185, "FileProcessingDatabaseOperationsImpl.kt")).q("Failed to update file processing table entry with resizing result.");
            }
            ffig.a(f, null);
            return ffcu.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awdr(this.a, this.b, this.c, ffguVar);
    }
}
