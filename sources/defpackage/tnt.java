package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tnt extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        esye esyeVar = (esye) obj;
        int ordinal = esyeVar.ordinal();
        if (ordinal == 0) {
            return esil.NOT_SET;
        }
        if (ordinal == 1) {
            return esil.RESTORE;
        }
        if (ordinal == 2) {
            return esil.BACKUP;
        }
        if (ordinal == 3) {
            return esil.FAILED;
        }
        if (ordinal == 4) {
            return esil.COMPLETE;
        }
        if (ordinal == 5) {
            return esil.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esyeVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esil esilVar = (esil) obj;
        int ordinal = esilVar.ordinal();
        if (ordinal == 0) {
            return esye.INITIAL_SYNC_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return esye.RESTORE;
        }
        if (ordinal == 2) {
            return esye.BACKUP;
        }
        if (ordinal == 3) {
            return esye.FAILED;
        }
        if (ordinal == 4) {
            return esye.COMPLETE;
        }
        if (ordinal == 5) {
            return esye.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esilVar.toString()));
    }
}
