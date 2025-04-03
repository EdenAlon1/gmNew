package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uei extends ufa {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final Size d;
    private final Optional e;
    private final long f;
    private final boolean g;
    private final boolean h;
    private final epsw i;

    public uei(String str, Uri uri, eohh eohhVar, Size size, Optional optional, long j, boolean z, boolean z2, epsw epswVar) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = size;
        this.e = optional;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = epswVar;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.f;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufa, defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.ufa, defpackage.appq
    public final Uri d() {
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
        if (obj instanceof ufa) {
            ufa ufaVar = (ufa) obj;
            if (this.a.equals(ufaVar.b()) && this.b.equals(ufaVar.e()) && this.c.equals(ufaVar.i()) && this.d.equals(ufaVar.f())) {
                ufaVar.k();
                if (this.e.equals(ufaVar.j()) && this.f == ufaVar.a() && this.g == ufaVar.l() && this.h == ufaVar.m() && this.i.equals(ufaVar.h())) {
                    ufaVar.c();
                    ufaVar.d();
                    ufaVar.fk();
                    ufaVar.n();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.ufa, defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.ufa
    public final epsw h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode();
        int i = true != this.g ? 1237 : 1231;
        long j = this.f;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1525764945) ^ 1;
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    @Override // defpackage.appq
    public final Optional j() {
        return this.e;
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    @Override // defpackage.appq
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.appq
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.ufa, defpackage.appq
    public final int n() {
        return 1;
    }

    public final String toString() {
        return "CameraContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + this.c.toString() + ", size=" + this.d.toString() + ", caption=null, duration=" + String.valueOf(this.e) + ", mediaModifiedTimestamp=" + this.f + ", isResizable=" + this.g + ", saveToExternalStorage=" + this.h + ", captureInfo=" + this.i.toString() + ", originalUri=null, previewUri=null, progress=null, displayState=DISPLAY}";
    }
}
