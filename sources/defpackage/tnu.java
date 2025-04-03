package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tnu implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axeu axeuVar = (axeu) obj;
        switch (axeuVar) {
            case UNSPECIFIED_STATUS:
                return eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
            case ENABLED:
                return eszw.ENABLED;
            case ENABLING:
                return eszw.ENABLING;
            case ENABLE_FAILED:
                return eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
            case DISABLED:
                return eszw.DISABLED;
            case DISABLING:
                return eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
            case DISABLE_FAILED:
                return eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(axeuVar))));
        }
    }
}
