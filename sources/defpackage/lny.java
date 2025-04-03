package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lny implements lms {
    private final lob[] a;

    public lny(lob... lobVarArr) {
        lobVarArr.getClass();
        this.a = lobVarArr;
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml a(Class cls) {
        return lmr.b();
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        lob lobVar;
        lob[] lobVarArr = this.a;
        int length = lobVarArr.length;
        ffmo c = ffiu.c(cls);
        lob[] lobVarArr2 = (lob[]) Arrays.copyOf(lobVarArr, length);
        lobVarArr2.getClass();
        int i = 0;
        while (true) {
            if (i >= lobVarArr2.length) {
                lobVar = null;
                break;
            }
            lobVar = lobVarArr2[i];
            if (ffkj.e(lobVar.a, c)) {
                break;
            }
            i++;
        }
        lml lmlVar = lobVar != null ? (lml) lobVar.b.invoke(lnxVar) : null;
        if (lmlVar != null) {
            return lmlVar;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(lom.a(c))));
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
