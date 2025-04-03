package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ueu extends ufo {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final Size d;
    private final String e;
    private final double f;
    private final double g;

    public ueu(String str, Uri uri, eohh eohhVar, Size size, String str2, double d, double d2) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = size;
        this.e = str2;
        this.f = d;
        this.g = d2;
    }

    @Override // defpackage.apps
    public final double a() {
        return this.g;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufo, defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufo) {
            ufo ufoVar = (ufo) obj;
            if (this.a.equals(ufoVar.b()) && this.b.equals(ufoVar.e()) && this.c.equals(ufoVar.i()) && this.d.equals(ufoVar.f()) && this.e.equals(ufoVar.m()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(ufoVar.h()) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(ufoVar.a())) {
                ufoVar.c();
                ufoVar.fk();
                ufoVar.k();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.ufo, defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apps
    public final double h() {
        return this.f;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 583896283;
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    @Override // defpackage.ufo, defpackage.apqd
    public final String k() {
        return null;
    }

    @Override // defpackage.apps
    public final String m() {
        return this.e;
    }

    public final String toString() {
        Size size = this.d;
        eohh eohhVar = this.c;
        return "LocationContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", size=" + size.toString() + ", captionText=" + this.e + ", longitude=" + this.f + ", latitude=" + this.g + ", originalUri=null, progress=null, caption=null}";
    }
}
