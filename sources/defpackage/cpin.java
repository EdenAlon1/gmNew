package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpin {
    public static final awwj a(Map map) {
        boolean z;
        awwi awwiVar = (awwi) awwj.a.createBuilder();
        awwiVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (ffkj.e(str, "is_upgrade_from_mms_group")) {
                if (ffkj.e(str2, "0")) {
                    z = false;
                } else {
                    if (!ffkj.e(str2, "1")) {
                        throw new IllegalArgumentException(String.valueOf(str).concat(" must be either 0 or 1."));
                    }
                    z = true;
                }
                awwk.b(z, awwiVar);
            }
        }
        return awwk.a(awwiVar);
    }
}
