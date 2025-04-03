package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biu {
    public static boolean a(bgl bglVar, int... iArr) {
        if (bglVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return bglVar.b().containsAll(arrayList);
    }
}
