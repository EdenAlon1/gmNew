package defpackage;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icf {
    public static final hvi a(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new BlockGraphicsLayerElement(ffjiVar));
    }

    public static /* synthetic */ hvi b(hvi hviVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, idh idhVar, boolean z, int i, int i2) {
        long j2 = (i2 & 1024) != 0 ? idr.a : j;
        idh idhVar2 = (i2 & 2048) != 0 ? idb.a : idhVar;
        boolean z2 = ((i2 & 4096) == 0) & z;
        long j3 = (i2 & 16384) != 0 ? icg.a : 0L;
        long j4 = (32768 & i2) != 0 ? icg.a : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 256;
        int i5 = i2 & 32;
        int i6 = i2 & 16;
        int i7 = i2 & 8;
        int i8 = i2 & 4;
        int i9 = i2 & 2;
        int i10 = i2 & 1;
        float f8 = (i2 & 512) != 0 ? 8.0f : 0.0f;
        float f9 = i4 != 0 ? 0.0f : f7;
        float f10 = i5 != 0 ? 0.0f : f6;
        float f11 = i6 != 0 ? 0.0f : f5;
        float f12 = i7 == 0 ? f4 : 0.0f;
        float f13 = i8 != 0 ? 1.0f : f3;
        return hviVar.a(new GraphicsLayerElement(1 != i10 ? f : 1.0f, i9 != 0 ? 1.0f : f2, f13, f12, f11, f10, f9, f8, j2, idhVar2, z2, j3, j4, i3));
    }
}
