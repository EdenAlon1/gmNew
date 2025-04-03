package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abew implements ffjn {
    final /* synthetic */ abet a;

    public abew(abet abetVar) {
        this.a = abetVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(jii.a(true != this.a.a.isEmpty() ? R.string.bottom_sheet_active_typers : R.string.bottom_sheet_no_active_typers, hfdVar), eba.j(hvi.e, 16.0f, 0.0f, 16.0f, 18.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65532);
        }
        return ffcu.a;
    }
}
