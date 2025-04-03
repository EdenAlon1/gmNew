package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cknd extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ckng ckngVar = (ckng) obj;
        int ordinal = ckngVar.ordinal();
        if (ordinal == 0) {
            return awvh.SUBJECT_UPDATE;
        }
        if (ordinal == 1) {
            return awvh.REMOVE_PARTICIPANT_BY_ALL;
        }
        if (ordinal == 2) {
            return awvh.REMOVE_PARTICIPANT_BY_ADMIN;
        }
        if (ordinal == 3) {
            return awvh.ICON_UPDATE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ckngVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awvh awvhVar = (awvh) obj;
        ckng ckngVar = ckng.NAME_CHANGE;
        int ordinal = awvhVar.ordinal();
        if (ordinal == 1) {
            return ckng.NAME_CHANGE;
        }
        if (ordinal == 2) {
            return ckng.REMOVE_USER_BY_ALL;
        }
        if (ordinal == 3) {
            return ckng.REMOVE_USER_BY_ADMIN;
        }
        if (ordinal == 4) {
            return ckng.ICON_CHANGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awvhVar.toString()));
    }
}
