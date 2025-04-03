package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzt extends ffhv implements ffjm {
    final /* synthetic */ awaa a;
    final /* synthetic */ awap b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzt(ffgu ffguVar, awaa awaaVar, awap awapVar) {
        super(2, ffguVar);
        this.a = awaaVar;
        this.b = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avzt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            avzr avzrVar = this.a.b;
            ((cevh) avzrVar.a.b()).e("file_transfer_processor", awao.b(this.b));
        } catch (IndexOutOfBoundsException unused) {
            ensk e = awaa.a.e();
            e.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(cqpo.j, this.b);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries$cancelWorkItemIfNeeded$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 115, "FileTransferProcessorWithRetries.kt")).q("Nothing to cancel - the work item either finished or was never scheduled.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avzt avztVar = new avzt(ffguVar, this.a, this.b);
        avztVar.c = obj;
        return avztVar;
    }
}
