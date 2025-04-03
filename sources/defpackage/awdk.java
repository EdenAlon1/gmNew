package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdk extends ffhv implements ffjm {
    final /* synthetic */ awap a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awdk(awap awapVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = awapVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Boolean bool;
        ffci.b(obj);
        String[] strArr = awfq.a;
        awed awedVar = new awed();
        awedVar.d(this.a);
        awedVar.c(awfr.a);
        awea a = awedVar.a();
        final awap awapVar = this.a;
        boolean o = a.o(new Function() { // from class: awdi
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
        if (this.b) {
            awed awedVar2 = new awed();
            awedVar2.d(this.a);
            awedVar2.c(awfr.b);
            awea a2 = awedVar2.a();
            final awap awapVar2 = this.a;
            bool = Boolean.valueOf(a2.o(new Function() { // from class: awdj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    awfp awfpVar = (awfp) obj2;
                    awfpVar.c(awap.this);
                    awfpVar.b(awfr.b);
                    return awfpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        } else {
            bool = null;
        }
        ensk h = awdt.a.h();
        h.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(cqpo.j, this.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$addEntry$2", "invokeSuspend", 83, "FileProcessingDatabaseOperationsImpl.kt")).H("Added file processing table entry for full file (%s) and thumbnail (%s).", o, bool);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awdk(this.a, this.b, ffguVar);
    }
}
