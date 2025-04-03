package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyl extends eiag {
    private final Optional a;
    private final int b;
    private final ehzx c;
    private final String d;
    private final Instant e;
    private final Optional f;

    public ehyl(Optional optional, int i, ehzx ehzxVar, String str, Instant instant, Optional optional2) {
        this.a = optional;
        this.b = i;
        this.c = ehzxVar;
        this.d = str;
        this.e = instant;
        this.f = optional2;
    }

    @Override // defpackage.eiag
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eiag
    public final ehzx b() {
        return this.c;
    }

    @Override // defpackage.eiag
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.eiag
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.eiag
    public final Optional e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiag) {
            eiag eiagVar = (eiag) obj;
            if (this.a.equals(eiagVar.e()) && this.b == eiagVar.a() && this.c.equals(eiagVar.b()) && this.d.equals(eiagVar.f()) && this.e.equals(eiagVar.c()) && this.f.equals(eiagVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eiag
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Instant instant = this.e;
        ehzx ehzxVar = this.c;
        return "FileInformation{name=" + this.a.toString() + ", sizeBytes=" + this.b + ", contentType=" + ehzxVar.toString() + ", url=" + this.d + ", validUntil=" + instant.toString() + ", fileType=" + optional.toString() + "}";
    }
}
