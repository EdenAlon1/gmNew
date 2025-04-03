package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxas extends dxbb {
    public emxc a = emux.a;
    private Uri b;
    private String c;
    private dxba d;
    private int e;
    private engw f;
    private eydq g;
    private byte h;

    @Override // defpackage.dxbb
    public final dxbc a() {
        Uri uri;
        String str;
        dxba dxbaVar;
        engw engwVar;
        eydq eydqVar;
        if (this.h == 1 && (uri = this.b) != null && (str = this.c) != null && (dxbaVar = this.d) != null && (engwVar = this.f) != null && (eydqVar = this.g) != null) {
            return new dxat(uri, str, dxbaVar, this.e, engwVar, this.a, eydqVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" fileUri");
        }
        if (this.c == null) {
            sb.append(" urlToDownload");
        }
        if (this.d == null) {
            sb.append(" downloadConstraints");
        }
        if (this.h == 0) {
            sb.append(" trafficTag");
        }
        if (this.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if (this.g == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dxbb
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.dxbb
    public final String c() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"urlToDownload\" has not been set");
    }

    @Override // defpackage.dxbb
    public final void d(eydq eydqVar) {
        if (eydqVar == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        this.g = eydqVar;
    }

    @Override // defpackage.dxbb
    public final void e(dxba dxbaVar) {
        if (dxbaVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.d = dxbaVar;
    }

    @Override // defpackage.dxbb
    public final void f(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.f = engwVar;
    }

    @Override // defpackage.dxbb
    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null fileUri");
        }
        this.b = uri;
    }

    @Override // defpackage.dxbb
    public final void h(int i) {
        this.e = i;
        this.h = (byte) 1;
    }

    @Override // defpackage.dxbb
    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        this.c = str;
    }
}
