package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cpib implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        espv espvVar = (espv) obj;
        switch (espvVar.ordinal()) {
            case 0:
                return awyd.RECOVERY_STRATEGY_NONE;
            case 1:
                return awyd.RECOVERY_STRATEGY_NONE;
            case 2:
                return awyd.RECOVERY_STRATEGY_REFRESH_REGISTRATION;
            case 3:
                return awyd.RECOVERY_STRATEGY_REPROVISION;
            case 4:
                return awyd.RECOVERY_STRATEGY_RECREATE_GROUP;
            case 5:
                return awyd.RECOVERY_STRATEGY_NONE;
            case 6:
                return awyd.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(espvVar))));
        }
    }
}
