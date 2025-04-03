package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkt extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ewae ewaeVar = (ewae) obj;
        int ordinal = ewaeVar.ordinal();
        if (ordinal == 0) {
            return exyt.DASHER_DEVICE_FILTER_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return exyt.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ewaeVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exyt exytVar = (exyt) obj;
        int ordinal = exytVar.ordinal();
        if (ordinal == 0) {
            return ewae.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (ordinal == 1) {
            return ewae.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exytVar.toString()));
    }
}
