package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgz {
    public static final qgx a(qhb[] qhbVarArr, hfd hfdVar) {
        hfdVar.v(-395574495);
        int hashCode = Arrays.hashCode(qhbVarArr);
        hfdVar.v(1068508243);
        boolean B = hfdVar.B(hashCode);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (B || R == hfc.a) {
            R = new qgx(ffdo.L(qhbVarArr));
            hfmVar.ad(R);
        }
        qgx qgxVar = (qgx) R;
        hfmVar.Z();
        hfmVar.Z();
        return qgxVar;
    }

    public static final qhb b(Object obj, Object obj2, String[] strArr, hfd hfdVar) {
        hfdVar.v(-1788530187);
        hfdVar.v(-1522843975);
        boolean D = hfdVar.D(strArr);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new qhq((String[]) Arrays.copyOf(strArr, 1));
            hfmVar.ad(R);
        }
        qhq qhqVar = (qhq) R;
        hfmVar.Z();
        hfdVar.v(-1522842278);
        boolean D2 = hfdVar.D(qhqVar) | hfdVar.D(obj2);
        Object R2 = hfmVar.R();
        if (D2 || R2 == hfc.a) {
            R2 = new qhb(obj, qhqVar, obj2);
            hfmVar.ad(R2);
        }
        qhb qhbVar = (qhb) R2;
        hfmVar.Z();
        hfmVar.Z();
        return qhbVar;
    }
}
