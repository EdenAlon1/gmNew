package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egug implements ffjm {
    public static final egug a = new egug();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(jii.a(R.string.pqe_allow_camera_access_in_settings, hfdVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
        }
        return ffcu.a;
    }
}
