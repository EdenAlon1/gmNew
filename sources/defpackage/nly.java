package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nly {
    public static nlz a(nlz nlzVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (nlzVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (nlz) map.get(strArr[0]);
            }
            if (length2 > 1) {
                nlz nlzVar2 = new nlz();
                while (i < length2) {
                    nlzVar2.d((nlz) map.get(strArr[i]));
                    i++;
                }
                return nlzVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                nlzVar.d((nlz) map.get(strArr[0]));
                return nlzVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    nlzVar.d((nlz) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return nlzVar;
    }
}
