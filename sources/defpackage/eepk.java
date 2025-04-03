package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepk extends eepr {
    @Override // defpackage.eepr
    protected final int a(Context context, eepq eepqVar, boolean z) {
        return (eepqVar.a.getAuthority().lastIndexOf(64) < 0 || kor.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
