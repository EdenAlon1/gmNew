package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecvz extends ecwj {
    public ecvz(ecwh ecwhVar, String str, Boolean bool, boolean z) {
        super(ecwhVar, str, bool, z);
    }

    @Override // defpackage.ecwj
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (digv.c.matcher(str).matches()) {
                return true;
            }
            if (digv.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", ecuu.b(obj, this, "Invalid boolean value for "));
        return null;
    }
}
