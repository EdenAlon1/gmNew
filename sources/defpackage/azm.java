package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azm implements bnd {
    @Override // defpackage.bnd
    public final /* synthetic */ Object a(Object obj) {
        bmc bmcVar = (bmc) obj;
        byte[] bArr = (byte[]) bmcVar.a;
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Rect rect = bmcVar.e;
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            bia biaVar = bmcVar.b;
            biaVar.getClass();
            Rect rect2 = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
            int i = bmcVar.f;
            Matrix matrix = bmcVar.g;
            return bne.i(decodeRegion, biaVar, rect2, i, bix.e(matrix, rect), bmcVar.h);
        } catch (IOException e) {
            throw new avl("Failed to decode JPEG.", e);
        }
    }
}
