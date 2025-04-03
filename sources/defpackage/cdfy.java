package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfy {
    public final cdgk a;
    public final ffhd b;
    public final ffsk c;

    public cdfy(cdgk cdgkVar, axkm axkmVar, ffhd ffhdVar, ffsk ffskVar) {
        cdgkVar.getClass();
        axkmVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.a = cdgkVar;
        this.b = ffhdVar;
        this.c = ffskVar;
    }

    public static final bqkx a(ccce ccceVar) {
        int i = ccceVar.d;
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 7 ? bqkx.UNKNOWN_CMS_DATA_TYPE : cclk.d(ccceVar.f) == 2 ? bqkx.BACKUP_KEY_OBJECT : bqkx.ENCRYPTION_KEY_OBJECT : bqkx.MESSAGE_PART : bqkx.PARTICIPANT : bqkx.CONVERSATION : bqkx.MESSAGE_OBJECT;
    }

    public static final bqkw b(ccce ccceVar) {
        int i = ccceVar.d;
        bqkw e = i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 7 ? bqkw.BACKUP_UNKNOWN_OPERATION : cclk.e(ccceVar.f) : ccrl.c(ccceVar.f) : cctq.b(ccceVar.f) : cctq.b(ccceVar.f) : cctq.b(ccceVar.f);
        if (e == bqkw.BACKUP_CREATE) {
            return ccceVar.g ? bqkw.INITIAL_BACKUP_CREATE : bqkw.INCREMENTAL_BACKUP_CREATE;
        }
        e.getClass();
        return e;
    }
}
