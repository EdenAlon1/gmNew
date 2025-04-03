package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eih {
    public static final List a(ejg ejgVar, ekd ekdVar, eia eiaVar) {
        ffmj ffmjVar;
        if (!eiaVar.c() && ekdVar.isEmpty()) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        if (eiaVar.c()) {
            int i = ((ehz) eiaVar.a.b()).a;
            hne hneVar = eiaVar.a;
            Object[] objArr = hneVar.a;
            int i2 = hneVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = ((ehz) objArr[i3]).a;
                if (i4 < i) {
                    i = i4;
                }
            }
            if (i < 0) {
                dwv.c("negative minIndex");
            }
            int i5 = ((ehz) eiaVar.a.b()).b;
            hne hneVar2 = eiaVar.a;
            Object[] objArr2 = hneVar2.a;
            int i6 = hneVar2.b;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = ((ehz) objArr2[i7]).b;
                if (i8 > i5) {
                    i5 = i8;
                }
            }
            ffmjVar = new ffmj(i, Math.min(i5, ejgVar.b() - 1));
        } else {
            ffmjVar = ffmj.d;
        }
        int a = ekdVar.a();
        for (int i9 = 0; i9 < a; i9++) {
            ejy ejyVar = ekdVar.get(i9);
            int a2 = ejh.a(ejgVar, ejyVar.a, ejyVar.b);
            int i10 = ffmjVar.a;
            if ((a2 > ffmjVar.b || i10 > a2) && a2 >= 0 && a2 < ejgVar.b()) {
                arrayList.add(Integer.valueOf(a2));
            }
        }
        int i11 = ffmjVar.a;
        int i12 = ffmjVar.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
