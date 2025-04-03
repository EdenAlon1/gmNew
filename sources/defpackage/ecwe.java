package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecwe extends ecwj {
    final /* synthetic */ ecwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecwe(ecwh ecwhVar, String str, Object obj, ecwg ecwgVar) {
        super(ecwhVar, str, obj, false);
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
