package defpackage;

import android.util.Base64;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecwd extends ecwj {
    public ecwd(ecwh ecwhVar, String str, byte[] bArr) {
        super(ecwhVar, str, bArr, false);
    }

    @Override // defpackage.ecwj
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return Base64.decode((String) obj, 3);
            } catch (IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", ecuu.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
