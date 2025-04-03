package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euv {
    public static final euv a = new euv(null, null, null, null, 63);
    public final ffji b;
    public final ffji c;
    public final ffji d;
    public final ffji e;
    private final ffji f;
    private final ffji g;

    public euv() {
        this(null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euv)) {
            return false;
        }
        euv euvVar = (euv) obj;
        if (this.b == euvVar.b) {
            ffji ffjiVar = euvVar.f;
            if (this.c == euvVar.c) {
                ffji ffjiVar2 = euvVar.g;
                if (this.d == euvVar.d && this.e == euvVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ffji ffjiVar = this.b;
        int hashCode = ffjiVar != null ? ffjiVar.hashCode() : 0;
        ffji ffjiVar2 = this.c;
        int hashCode2 = ffjiVar2 != null ? ffjiVar2.hashCode() : 0;
        int i = hashCode * 961;
        ffji ffjiVar3 = this.d;
        int hashCode3 = ffjiVar3 != null ? ffjiVar3.hashCode() : 0;
        int i2 = (i + hashCode2) * 961;
        ffji ffjiVar4 = this.e;
        return ((i2 + hashCode3) * 31) + (ffjiVar4 != null ? ffjiVar4.hashCode() : 0);
    }

    public /* synthetic */ euv(ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, ffji ffjiVar4, int i) {
        this.b = 1 == (i & 1) ? null : ffjiVar;
        this.f = null;
        this.c = (i & 4) != 0 ? null : ffjiVar2;
        this.g = null;
        this.d = (i & 16) != 0 ? null : ffjiVar3;
        this.e = (i & 32) != 0 ? null : ffjiVar4;
    }
}
