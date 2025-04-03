package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epfw implements eygg {
    static final eygg a = new epfw();

    private epfw() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epfx epfxVar;
        switch (i) {
            case 0:
                epfxVar = epfx.UNSPECIFIED_STAGE;
                break;
            case 1:
                epfxVar = epfx.RESTORE;
                break;
            case 2:
                epfxVar = epfx.RESTORE_BACKUP_KEY;
                break;
            case 3:
                epfxVar = epfx.RESTORE_ENCRYPTION_KEY;
                break;
            case 4:
                epfxVar = epfx.RESTORE_PARTICIPANT;
                break;
            case 5:
                epfxVar = epfx.RESTORE_CONVERSATION;
                break;
            case 6:
                epfxVar = epfx.RESTORE_MESSAGE;
                break;
            case 7:
                epfxVar = epfx.BACKUP;
                break;
            case 8:
                epfxVar = epfx.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS;
                break;
            case 9:
                epfxVar = epfx.OPTIMIZED_RESTORE;
                break;
            case 10:
                epfxVar = epfx.OPTIMIZED_RESTORE_BACKUP_KEY;
                break;
            case 11:
                epfxVar = epfx.OPTIMIZED_RESTORE_ENCRYPTION_KEY;
                break;
            case 12:
                epfxVar = epfx.OPTIMIZED_RESTORE_PARTICIPANT;
                break;
            case 13:
                epfxVar = epfx.OPTIMIZED_RESTORE_CONVERSATION;
                break;
            case 14:
                epfxVar = epfx.OPTIMIZED_RESTORE_MESSAGE;
                break;
            case 15:
                epfxVar = epfx.MEDIA_BACKUP;
                break;
            case 16:
                epfxVar = epfx.MEDIA_RESTORE;
                break;
            case 17:
                epfxVar = epfx.OPTIMIZED_BACKUP;
                break;
            default:
                epfxVar = null;
                break;
        }
        return epfxVar != null;
    }
}
