package defpackage;

import android.content.pm.PackageManager;
import android.os.Process;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feex {
    public static final int a = Process.myUid();

    public static feey a(feey... feeyVarArr) {
        emxf.b(true, "securityPolicies must not be empty");
        return new feew(feeyVarArr);
    }

    public static feey b(PackageManager packageManager, String str, byte[] bArr) {
        return c(packageManager, str, engw.r(bArr));
    }

    public static feey c(PackageManager packageManager, String str, List list) {
        packageManager.getClass();
        list.getClass();
        emxf.a(!list.isEmpty());
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            bArr.getClass();
            int length = bArr.length;
            emxf.a(length == 32);
            engrVar.h(Arrays.copyOf(bArr, length));
        }
        return new feev(packageManager, str, engrVar.g());
    }
}
