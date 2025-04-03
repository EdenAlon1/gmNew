package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkp implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eybs eybsVar = (eybs) obj;
        int ordinal = eybsVar.ordinal();
        if (ordinal == 0) {
            return evsn.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return evsn.ANDROID_POST_NOTIFICATIONS;
        }
        if (ordinal == 2) {
            return evsn.ANDROID_CAMERA;
        }
        if (ordinal == 3) {
            return evsn.ANDROID_ACCESS_FINE_LOCATION;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eybsVar))));
    }
}
