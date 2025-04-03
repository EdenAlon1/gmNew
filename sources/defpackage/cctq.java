package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cctq {
    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static bqkw b(int i) {
        if (a(i, ccue.a(17))) {
            return bqkw.BACKUP_CREATE;
        }
        if (a(i, ccue.a(9))) {
            return bqkw.BACKUP_DELETE;
        }
        if (a(i, ccue.a(33))) {
            return bqkw.BACKUP_UPDATE;
        }
        if (a(i, ccue.a(5))) {
            return bqkw.BACKUP_UPDATE_RARE;
        }
        if (a(i, ccue.a(3))) {
            return bqkw.BACKUP_UPDATE_FREQUENT;
        }
        if (a(i, ccue.a(65))) {
            return bqkw.BACKUP_UPDATE_ADDITIONAL_FIELDS;
        }
        csjb e = cctr.b.e();
        e.I("Failed to parse OperationType from flags, returning unknown AbandonedAction");
        e.y("flags", i);
        e.r();
        return bqkw.BACKUP_UNKNOWN_OPERATION;
    }
}
