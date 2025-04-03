package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyc {
    public static /* synthetic */ hvi a(hvi hviVar, float f, idh idhVar, long j, long j2, int i) {
        if ((i & 2) != 0) {
            idhVar = idb.a;
        }
        idh idhVar2 = idhVar;
        boolean z = false;
        if ((i & 4) != 0 && Float.compare(f, 0.0f) > 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = icg.a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = icg.a;
        }
        long j4 = j2;
        if (Float.compare(f, 0.0f) <= 0) {
            if (!z) {
                return hviVar;
            }
            z = true;
        }
        return hviVar.a(new ShadowGraphicsLayerElement(f, idhVar2, z, j3, j4));
    }
}
