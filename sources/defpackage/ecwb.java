package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecwb extends ecwj {
    public ecwb(ecwh ecwhVar, String str, Float f) {
        super(ecwhVar, str, f, false);
    }

    @Override // defpackage.ecwj
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Double) {
            return Float.valueOf(((Double) obj).floatValue());
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf(Float.parseFloat((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", ecuu.b(obj, this, "Invalid float value for "));
        return null;
    }
}
