package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adps implements ffjn {
    public static final adps a = new adps();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(jii.a(R.string.account_sign_out_positive_button, hfdVar), null, 0L, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 130558);
        }
        return ffcu.a;
    }
}
