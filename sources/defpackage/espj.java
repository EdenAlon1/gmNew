package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class espj implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        espv espvVar = (espv) obj;
        switch (espvVar.ordinal()) {
            case 0:
                return fasr.ERROR_NO_RETRY;
            case 1:
                return fasr.ERROR_RETRY_IMMEDIATE;
            case 2:
                return fasr.ERROR_RETRY_REFRESH_REGISTRATION;
            case 3:
                return fasr.ERROR_RETRY_NEEDS_REPROVISION;
            case 4:
                return fasr.ERROR_RETRY_NEEDS_GROUP_RECREATION;
            case 5:
                return fasr.ERROR_REMOVE_SELF_FROM_GROUP;
            case 6:
                return fasr.ERROR_DESTINATION_NOT_TACHYGRAM;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(espvVar))));
        }
    }
}
