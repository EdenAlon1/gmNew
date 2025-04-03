package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eepj extends eepr {
    final /* synthetic */ String a;

    public eepj(String str) {
        this.a = str;
    }

    @Override // defpackage.eepr
    protected final int a(Context context, eepq eepqVar, boolean z) {
        if (context.getPackageName().equals(eepqVar.b.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return !this.a.equals(eepqVar.b.packageName) ? 3 : 1;
    }
}
