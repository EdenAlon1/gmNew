package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmke {
    public final String a;
    public final boolean b;
    public final ffji c;
    public final boolean d;

    public dmke() {
        this(false, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmke)) {
            return false;
        }
        dmke dmkeVar = (dmke) obj;
        return ffkj.e(this.a, dmkeVar.a) && this.b == dmkeVar.b && ffkj.e(this.c, dmkeVar.c) && this.d == dmkeVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + dmkc.a(this.b)) * 31) + this.c.hashCode()) * 31) + dmkc.a(this.d);
    }

    public final String toString() {
        return "CircleCheckboxUiData(contentDescription=" + this.a + ", isChecked=" + this.b + ", onCheckedChange=" + this.c + ", isTalkbackTarget=" + this.d + ")";
    }

    public dmke(String str, boolean z, ffji ffjiVar, boolean z2) {
        ffjiVar.getClass();
        this.a = str;
        this.b = z;
        this.c = ffjiVar;
        this.d = z2;
    }

    public /* synthetic */ dmke(boolean z, ffji ffjiVar, int i) {
        this(null, z & ((i & 2) == 0), (i & 4) != 0 ? new ffji() { // from class: dmkd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return ffcu.a;
            }
        } : ffjiVar, true);
    }
}
