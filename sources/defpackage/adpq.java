package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adpq implements ffjn {
    public static final adpq a = new adpq();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((eqd) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            domg.b(new doml(jii.a(R.string.account_sign_out_profile_message_bubble, hfdVar), null, true, false, null, false, true, null, false, null, null, null, false, false, null, null, false, false, false, 4194134), ebs.u(hvi.e, 40.0f, 0.0f, 2), null, null, hfdVar, 48, 12);
        }
        return ffcu.a;
    }
}
