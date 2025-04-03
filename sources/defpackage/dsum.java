package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsum implements dsss {
    public final boolean a;
    public final ffix b;
    public final boolean c;
    public final hho d;
    public final hkx e;
    private final Uri f;
    private final String g;
    private final String h;
    private final int i;
    private final int j;

    public dsum(Uri uri, String str, String str2, int i, int i2, boolean z, ffix ffixVar, boolean z2) {
        uri.getClass();
        this.f = uri;
        this.g = str;
        this.h = str2;
        this.i = i;
        this.j = i2;
        this.a = z;
        this.b = ffixVar;
        this.c = z2;
        hic hicVar = new hic(false, hla.a);
        this.d = hicVar;
        this.e = hicVar;
    }

    @Override // defpackage.dssr
    public final String a() {
        return this.h;
    }

    @Override // defpackage.dsss
    public final int b() {
        return this.j;
    }

    @Override // defpackage.dsss
    public final int c() {
        return this.i;
    }

    @Override // defpackage.dsss
    public final Uri d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsum)) {
            return false;
        }
        dsum dsumVar = (dsum) obj;
        return ffkj.e(this.f, dsumVar.f) && ffkj.e(this.g, dsumVar.g) && ffkj.e(this.h, dsumVar.h) && this.i == dsumVar.i && this.j == dsumVar.j && this.a == dsumVar.a && ffkj.e(this.b, dsumVar.b) && this.c == dsumVar.c;
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.i) * 31) + this.j) * 31) + dsul.a(this.a)) * 31;
        ffix ffixVar = this.b;
        return ((hashCode3 + (ffixVar != null ? ffixVar.hashCode() : 0)) * 31) + dsul.a(this.c);
    }

    public final String toString() {
        return "LocalImageRendererUiData(uri=" + this.f + ", displayName=" + this.g + ", contentDescription=" + this.h + ", widthPx=" + this.i + ", heightPx=" + this.j + ", canZoom=" + this.a + ", onDeleteButtonClick=" + this.b + ", canToggleFocusMode=" + this.c + ")";
    }
}
