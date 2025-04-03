package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecwf extends ecwj {
    final /* synthetic */ ecwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecwf(ecwh ecwhVar, String str, String str2, ecwg ecwgVar) {
        super(ecwhVar, str, str2);
        this.a = ecwgVar;
    }

    @Override // defpackage.ecwj
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", ecuu.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
