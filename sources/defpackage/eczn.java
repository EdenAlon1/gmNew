package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class eczn {
    public final /* synthetic */ eczo a;

    public final boolean a(String str, String str2) {
        eczp[] a = this.a.a(str);
        if (a == null || a.length == 0) {
            return false;
        }
        if (!str2.equals("")) {
            return Arrays.binarySearch(a, str2) >= 0;
        }
        eczp eczpVar = a[0];
        eczo eczoVar = eczp.a;
        return eczpVar.e.equals("");
    }
}
