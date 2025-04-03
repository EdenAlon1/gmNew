package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmi extends dllp {
    public dlmi() {
        super(dexf.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static ComponentName c(Context context, String str) {
        return new ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 8) {
            throw new IllegalArgumentException();
        }
        deyi deyiVar = (deyi) emxcVar.c();
        dexm dexmVar = deyiVar.b == 8 ? (dexm) deyiVar.c : dexm.a;
        HashSet hashSet = new HashSet();
        Iterator<E> it = dexmVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((dexl) it.next()).b)) {
                throw new IllegalArgumentException("Duplicate componentName in config");
            }
        }
        Context context = dllvVar.b;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            for (dexl dexlVar : dexmVar.b) {
                ComponentName c = c(context, dexlVar.b);
                int a = dexk.a(dexlVar.c);
                if (a == 0) {
                    a = 1;
                }
                arrayList.add(new PackageManager.ComponentEnabledSetting(c, d(a), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < dexmVar.b.size()) {
                try {
                    dexl dexlVar2 = (dexl) dexmVar.b.get(i);
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName c2 = c(context, dexlVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(c2);
                    int a2 = dexk.a(dexlVar2.c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(c2, d(a2), 1);
                    arrayList2.add(Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((dexl) dexmVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (dexmVar.c) {
            return dllvVar;
        }
        dllu dlluVar = new dllu(dllvVar);
        dlluVar.c();
        return dlluVar.a();
    }

    @Override // defpackage.dllp
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
