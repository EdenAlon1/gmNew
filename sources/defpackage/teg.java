package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class teg extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        csgm csgmVar = (csgm) obj;
        int ordinal = csgmVar.ordinal();
        if (ordinal == 0) {
            return csfz.UNDEFINED;
        }
        if (ordinal == 1) {
            return csfz.MULTI_DEVICE;
        }
        if (ordinal == 2) {
            return csfz.BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(csgmVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        csfz csfzVar = (csfz) obj;
        int ordinal = csfzVar.ordinal();
        if (ordinal == 0) {
            return csgm.CMS_FEATURE_UNDEFINED;
        }
        if (ordinal == 1) {
            return csgm.CMS_FEATURE_MULTI_DEVICE;
        }
        if (ordinal == 2) {
            return csgm.CMS_FEATURE_BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(csfzVar.toString()));
    }
}
