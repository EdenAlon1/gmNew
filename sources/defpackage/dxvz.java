package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvz extends dxwe {
    public final Uri a;
    public final String b;
    public final dxba c;
    public final emxc d;
    public final int e;
    public final engw f;
    public final eydq g;
    private final int h;
    private final String i;
    private final emxc j;
    private final emxc k;
    private final boolean l;

    public dxvz(Uri uri, String str, dxba dxbaVar, emxc emxcVar, int i, engw engwVar, int i2, String str2, emxc emxcVar2, emxc emxcVar3, boolean z, eydq eydqVar) {
        this.a = uri;
        this.b = str;
        this.c = dxbaVar;
        this.d = emxcVar;
        this.e = i;
        this.f = engwVar;
        this.h = i2;
        this.i = str2;
        this.j = emxcVar2;
        this.k = emxcVar3;
        this.l = z;
        this.g = eydqVar;
    }

    @Override // defpackage.dxwe
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dxwe
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dxwe
    public final Uri c() {
        return this.a;
    }

    @Override // defpackage.dxwe
    public final dxba d() {
        return this.c;
    }

    @Override // defpackage.dxwe
    public final emxc e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxwe) {
            dxwe dxweVar = (dxwe) obj;
            if (this.a.equals(dxweVar.c()) && this.b.equals(dxweVar.k()) && this.c.equals(dxweVar.d()) && this.d.equals(dxweVar.e()) && this.e == dxweVar.b() && enkr.h(this.f, dxweVar.h()) && this.h == dxweVar.a() && this.i.equals(dxweVar.j()) && this.j.equals(dxweVar.g()) && this.k.equals(dxweVar.f()) && this.l == dxweVar.l() && this.g.equals(dxweVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dxwe
    public final emxc f() {
        return this.k;
    }

    @Override // defpackage.dxwe
    public final emxc g() {
        return this.j;
    }

    @Override // defpackage.dxwe
    public final engw h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.dxwe
    public final eydq i() {
        return this.g;
    }

    @Override // defpackage.dxwe
    public final String j() {
        return this.i;
    }

    @Override // defpackage.dxwe
    public final String k() {
        return this.b;
    }

    @Override // defpackage.dxwe
    public final boolean l() {
        return this.l;
    }

    public final String toString() {
        return "DownloadRequest{destinationFileUri=" + this.a.toString() + ", urlToDownload=" + this.b + ", downloadConstraints=" + this.c.toString() + ", listenerOptional=" + String.valueOf(this.d) + ", trafficTag=" + this.e + ", extraHttpHeaders=" + this.f.toString() + ", fileSizeBytes=" + this.h + ", notificationContentTitle=" + this.i + ", notificationContentTextOptional=Optional.absent(), notificationContentIntentOptional=Optional.absent(), showDownloadedNotification=" + this.l + ", customDownloaderMetadata=" + this.g.toString() + "}";
    }
}
