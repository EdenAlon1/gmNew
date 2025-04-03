package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class owc {
    public static final int a(oxf oxfVar, String str) {
        int a = oxfVar.a();
        for (int i = 0; i < a; i++) {
            if (ffkj.e(str, oxfVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int b(oxf oxfVar, String str) {
        int a = owd.a(oxfVar, str);
        if (a >= 0) {
            return a;
        }
        int a2 = oxfVar.a();
        ArrayList arrayList = new ArrayList(a2);
        for (int i = 0; i < a2; i++) {
            arrayList.add(oxfVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ffdx.aA(arrayList, null, null, null, null, 63) + ']');
    }
}
