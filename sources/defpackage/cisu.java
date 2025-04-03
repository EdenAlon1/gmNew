package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisu extends civu {
    public final String a;
    private final String b;
    private final Uri c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;

    public cisu(String str, String str2, Uri uri, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
    }

    @Override // defpackage.civu
    public final Uri a() {
        return this.c;
    }

    @Override // defpackage.civu
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.civu
    public final Optional c() {
        return this.i;
    }

    @Override // defpackage.civu
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.civu
    public final Optional e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof civu) {
            civu civuVar = (civu) obj;
            if (this.a.equals(civuVar.h()) && this.b.equals(civuVar.i())) {
                civuVar.j();
                if (this.c.equals(civuVar.a()) && this.d.equals(civuVar.b()) && this.e.equals(civuVar.d()) && this.f.equals(civuVar.f()) && this.g.equals(civuVar.g()) && this.h.equals(civuVar.e()) && this.i.equals(civuVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.civu
    public final Optional f() {
        return this.f;
    }

    @Override // defpackage.civu
    public final Optional g() {
        return this.g;
    }

    @Override // defpackage.civu
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 5) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.civu
    public final String i() {
        return this.b;
    }

    public final String toString() {
        return "NotificationChannelBuilderInfo{channelId=" + this.a + ", channelName=" + this.b + ", importance=IMPORTANCE_HIGH, soundUri=" + this.c.toString() + ", areLightsEnabled=" + this.d.toString() + ", isVibrationEnabled=" + this.e.toString() + ", shouldShowBadge=" + this.f.toString() + ", vibrationPattern=" + this.g.toString() + ", lightColor=" + this.h.toString() + ", group=" + this.i.toString() + "}";
    }

    @Override // defpackage.civu
    public final void j() {
    }
}
