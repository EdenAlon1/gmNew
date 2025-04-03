package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffgq implements Serializable {
    private static final long serialVersionUID = 0;
    private final ffhd[] a;

    public ffgq(ffhd[] ffhdVarArr) {
        this.a = ffhdVarArr;
    }

    private final Object readResolve() {
        ffhd ffhdVar = ffhe.a;
        int i = 0;
        while (true) {
            ffhd[] ffhdVarArr = this.a;
            if (i >= ffhdVarArr.length) {
                return ffhdVar;
            }
            ffhdVar = ffhdVar.plus(ffhdVarArr[i]);
            i++;
        }
    }
}
