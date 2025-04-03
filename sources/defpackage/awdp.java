package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdp extends ffhv implements ffjm {
    final /* synthetic */ awvd a;
    final /* synthetic */ awdt b;
    final /* synthetic */ awap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awdp(awvd awvdVar, awdt awdtVar, awap awapVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = awvdVar;
        this.b = awdtVar;
        this.c = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awdp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        awdt awdtVar = this.b;
        awap awapVar = this.c;
        awvd awvdVar = this.a;
        ekzz f = eleg.f("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-file");
        try {
            awvb awvbVar = awvdVar.c;
            if (awvbVar == null) {
                awvbVar = awvb.a;
            }
            awvbVar.getClass();
            awdtVar.r(awapVar, awvbVar, awfr.a);
            ffig.a(f, null);
            awvb awvbVar2 = this.a.d;
            if (awvbVar2 == null) {
                awvbVar2 = awvb.a;
            }
            awvbVar2.getClass();
            if (!awvbVar2.equals(awvb.a)) {
                awdt awdtVar2 = this.b;
                awap awapVar2 = this.c;
                f = eleg.f("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-thumbnail");
                try {
                    awdtVar2.r(awapVar2, awvbVar2, awfr.b);
                    ffig.a(f, null);
                } finally {
                }
            }
            return ffcu.a;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awdp(this.a, this.b, this.c, ffguVar);
    }
}
