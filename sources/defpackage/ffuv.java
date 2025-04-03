package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffuv extends fgha implements fftx {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object f = f();
        f.getClass();
        boolean z = true;
        for (fghc fghcVar = (fghc) f; !ffkj.e(fghcVar, this); fghcVar = fghcVar.h()) {
            if (fghcVar instanceof ffuj) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fghcVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.fftx
    public final boolean hP() {
        return true;
    }

    @Override // defpackage.fghc
    public final String toString() {
        return ffso.a ? c("Active") : super.toString();
    }

    @Override // defpackage.fftx
    public final ffuv hN() {
        return this;
    }
}
