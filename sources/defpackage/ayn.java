package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayn implements bnd {
    @Override // defpackage.bnd
    public final /* synthetic */ Object a(Object obj) {
        boolean hasGainmap;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ayc aycVar = (ayc) obj;
        bmc bmcVar = (bmc) aycVar.a;
        ((Bitmap) bmcVar.a).compress(Bitmap.CompressFormat.JPEG, aycVar.b, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bia biaVar = bmcVar.b;
        biaVar.getClass();
        Bitmap bitmap = (Bitmap) bmcVar.a;
        int i = 256;
        if (Build.VERSION.SDK_INT >= 34) {
            hasGainmap = bitmap.hasGainmap();
            if (hasGainmap) {
                i = 4101;
            }
        }
        return new bmc(byteArray, biaVar, i, bmcVar.d, bmcVar.e, bmcVar.f, bmcVar.g, bmcVar.h);
    }
}
