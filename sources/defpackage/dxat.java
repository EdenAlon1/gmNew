package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxat extends dxbc {
    public final Uri a;
    public final String b;
    public final dxba c;
    public final int d;
    public final engw e;
    private final emxc f;
    private final eydq g;

    public dxat(Uri uri, String str, dxba dxbaVar, int i, engw engwVar, emxc emxcVar, eydq eydqVar) {
        this.a = uri;
        this.b = str;
        this.c = dxbaVar;
        this.d = i;
        this.e = engwVar;
        this.f = emxcVar;
        this.g = eydqVar;
    }

    @Override // defpackage.dxbc
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dxbc
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.dxbc
    public final dxba c() {
        return this.c;
    }

    @Override // defpackage.dxbc
    public final emxc d() {
        return this.f;
    }

    @Override // defpackage.dxbc
    public final engw e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxbc) {
            dxbc dxbcVar = (dxbc) obj;
            if (this.a.equals(dxbcVar.b()) && this.b.equals(dxbcVar.g()) && this.c.equals(dxbcVar.c()) && this.d == dxbcVar.a() && enkr.h(this.e, dxbcVar.e()) && this.f.equals(dxbcVar.d()) && this.g.equals(dxbcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dxbc
    public final eydq f() {
        return this.g;
    }

    @Override // defpackage.dxbc
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        eydq eydqVar = this.g;
        emxc emxcVar = this.f;
        engw engwVar = this.e;
        dxba dxbaVar = this.c;
        return "DownloadRequest{fileUri=" + this.a.toString() + ", urlToDownload=" + this.b + ", downloadConstraints=" + dxbaVar.toString() + ", trafficTag=" + this.d + ", extraHttpHeaders=" + engwVar.toString() + ", inlineDownloadParamsOptional=" + String.valueOf(emxcVar) + ", customDownloaderMetadata=" + eydqVar.toString() + "}";
    }
}
