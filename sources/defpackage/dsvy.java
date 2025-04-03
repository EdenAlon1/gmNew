package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvy implements dsss {
    public final dswd a;
    public final String b;
    public final boolean c;
    public final ffix d;
    public final boolean e;
    public final boolean f;
    private final Uri g;
    private final int h;
    private final int i;

    public dsvy(Uri uri, dswd dswdVar, String str, int i, int i2, boolean z, ffix ffixVar, boolean z2) {
        uri.getClass();
        this.g = uri;
        this.a = dswdVar;
        this.b = str;
        this.h = i;
        this.i = i2;
        this.c = z;
        this.d = ffixVar;
        this.e = z2;
        this.f = false;
    }

    @Override // defpackage.dssr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dsss
    public final int b() {
        return this.i;
    }

    @Override // defpackage.dsss
    public final int c() {
        return this.h;
    }

    @Override // defpackage.dsss
    public final Uri d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsvy)) {
            return false;
        }
        dsvy dsvyVar = (dsvy) obj;
        if (!ffkj.e(this.g, dsvyVar.g) || !ffkj.e(this.a, dsvyVar.a) || !ffkj.e(this.b, dsvyVar.b) || this.h != dsvyVar.h || this.i != dsvyVar.i || this.c != dsvyVar.c || !ffkj.e(this.d, dsvyVar.d) || this.e != dsvyVar.e) {
            return false;
        }
        boolean z = dsvyVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() * 31) + this.a.hashCode();
        String str = this.b;
        int hashCode2 = ((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.h) * 31) + this.i) * 31) + dsvx.a(this.c)) * 31;
        ffix ffixVar = this.d;
        return ((((hashCode2 + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31) + dsvx.a(this.e)) * 31) + dsvx.a(false);
    }

    public final String toString() {
        return "LocalVideoRendererUiData(uri=" + this.g + ", videoPlayer=" + this.a + ", contentDescription=" + this.b + ", widthPx=" + this.h + ", heightPx=" + this.i + ", canToggleFocusMode=" + this.c + ", onDeleteButtonClick=" + this.d + ", useSeekBarControls=" + this.e + ", hideSeekBarWhenPaused=false)";
    }
}
