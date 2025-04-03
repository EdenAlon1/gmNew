package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzkw {
    public final bzgu a;
    public final bzhx b;
    public final List c;
    public final bzkx d;

    public bzkw(bzgu bzguVar, bzhx bzhxVar, List list, bzkx bzkxVar) {
        bzhxVar.getClass();
        list.getClass();
        bzkxVar.getClass();
        this.a = bzguVar;
        this.b = bzhxVar;
        this.c = list;
        this.d = bzkxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzkw)) {
            return false;
        }
        bzkw bzkwVar = (bzkw) obj;
        return ffkj.e(this.a, bzkwVar.a) && ffkj.e(this.b, bzkwVar.b) && ffkj.e(this.c, bzkwVar.c) && this.d == bzkwVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GaiaPairingSettingsUiData(devicePairingSettings=" + this.a + ", accountInfo=" + this.b + ", desktopItems=" + this.c + ", primaryDeviceStatus=" + this.d + ")";
    }
}
