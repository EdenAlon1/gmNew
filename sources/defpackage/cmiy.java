package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmiy {
    public final cmip a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public cmiy(cmip cmipVar, List list, boolean z, boolean z2) {
        cmipVar.getClass();
        list.getClass();
        this.a = cmipVar;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmiy)) {
            return false;
        }
        cmiy cmiyVar = (cmiy) obj;
        return this.a == cmiyVar.a && ffkj.e(this.b, cmiyVar.b) && this.c == cmiyVar.c && this.d == cmiyVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + cmix.a(this.c)) * 31) + cmix.a(this.d);
    }

    public final String toString() {
        return "RcsSettingsUiData(rcsGlobalToggleState=" + this.a + ", rcsSettingsSimInfoList=" + this.b + ", rcsDefaultOnConsent=" + this.c + ", showGoogleTos=" + this.d + ")";
    }
}
