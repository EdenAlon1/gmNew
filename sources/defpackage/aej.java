package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aej extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        return aei.a(strArr);
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            return ffem.a;
        }
        if (intent == null) {
            return ffem.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return ffem.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return ffew.k(ffdx.an(ffdo.J(stringArrayExtra), arrayList));
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ adt c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new adt(ffem.a);
        }
        for (String str : strArr) {
            if (koa.c(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(strArr.length), 16));
        for (String str2 : strArr) {
            ffcf ffcfVar = new ffcf(str2, true);
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return new adt(linkedHashMap);
    }
}
