package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emeg implements ffjn {
    public static final emeg a = new emeg();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            grl.b(jii.a(R.string.error_dialog_button, hfdVar), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
        }
        return ffcu.a;
    }
}
