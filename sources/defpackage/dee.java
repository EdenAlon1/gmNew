package defpackage;

import androidx.compose.foundation.BackgroundElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dee {
    public static final hvi a(hvi hviVar, long j, idh idhVar) {
        return hviVar.a(new BackgroundElement(j, null, 1.0f, idhVar, 2));
    }

    public static /* synthetic */ hvi b(hvi hviVar, ibq ibqVar, idh idhVar, float f, int i) {
        if ((i & 2) != 0) {
            idhVar = idb.a;
        }
        idh idhVar2 = idhVar;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return hviVar.a(new BackgroundElement(0L, ibqVar, f, idhVar2, 1));
    }
}
