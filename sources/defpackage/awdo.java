package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdo extends ffhv implements ffjm {
    final /* synthetic */ awdt a;
    final /* synthetic */ awap b;
    final /* synthetic */ fayi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awdo(awdt awdtVar, awap awapVar, fayi fayiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = awdtVar;
        this.b = awapVar;
        this.c = fayiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awdo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        awdt awdtVar = this.a;
        awap awapVar = this.b;
        fayi fayiVar = this.c;
        ekzz f = eleg.f("FileProcessingDatabaseOperations#updateFileTransferEntryWithFileEncryptionMetadata");
        try {
            awdtVar.q(awapVar, fayiVar, awfr.a);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awdo(this.a, this.b, this.c, ffguVar);
    }
}
