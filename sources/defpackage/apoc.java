package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apoc implements appq {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Size f;
    private final long h;
    private final Uri d = null;
    private final apra e = null;
    private final String g = null;
    private final long i = 0;
    private final boolean j = true;
    private final boolean k = false;
    private final int l = 1;

    public apoc(String str, Uri uri, Uri uri2, Size size, long j) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.f = size;
        this.h = j;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.h;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apmq
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.appq
    public final Uri d() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apoc)) {
            return false;
        }
        apoc apocVar = (apoc) obj;
        if (!ffkj.e(this.a, apocVar.a) || !ffkj.e(this.b, apocVar.b) || !ffkj.e(this.c, apocVar.c)) {
            return false;
        }
        Uri uri = apocVar.d;
        if (!ffkj.e(null, null)) {
            return false;
        }
        apra apraVar = apocVar.e;
        if (!ffkj.e(null, null) || !ffkj.e(this.f, apocVar.f)) {
            return false;
        }
        String str = apocVar.g;
        if (!ffkj.e(null, null) || this.h != apocVar.h) {
            return false;
        }
        long j = apocVar.i;
        boolean z = apocVar.j;
        boolean z2 = apocVar.k;
        int i = apocVar.l;
        return true;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.f;
    }

    @Override // defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 29791) + this.f.hashCode()) * 961) + apoa.a(this.h)) * 31) + apoa.a(0L)) * 31) + apob.a(true)) * 31) + apob.a(false)) * 31) + 1;
    }

    @Override // defpackage.appq
    public final Optional j() {
        return Optional.of(0L);
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    @Override // defpackage.appq
    public final boolean l() {
        return true;
    }

    @Override // defpackage.appq
    public final boolean m() {
        return false;
    }

    @Override // defpackage.appq
    public final int n() {
        return 1;
    }

    public final String toString() {
        return "BuglePhotoVideoContent(contentType=" + this.a + ", uri=" + this.b + ", originalUri=" + this.c + ", previewUri=null, progress=null, size=" + this.f + ", caption=null, mediaModifiedTimestamp=" + this.h + ", duration=0, isResizable=true, saveToExternalStorage=false, displayState=DISPLAY)";
    }
}
