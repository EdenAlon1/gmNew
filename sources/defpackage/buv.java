package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buv extends bvc {
    public final beh a;
    private final int b;
    private final int c;
    private final List d;
    private final List e;
    private final bef f;

    public buv(int i, int i2, List list, List list2, bef befVar, beh behVar) {
        this.b = i;
        this.c = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.e = list2;
        this.f = befVar;
        if (behVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.a = behVar;
    }

    @Override // defpackage.bei
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bei
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bei
    public final List c() {
        return this.d;
    }

    @Override // defpackage.bei
    public final List d() {
        return this.e;
    }

    @Override // defpackage.bvc
    public final bef e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        bef befVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvc) {
            bvc bvcVar = (bvc) obj;
            if (this.b == bvcVar.a() && this.c == bvcVar.b() && this.d.equals(bvcVar.c()) && this.e.equals(bvcVar.d()) && ((befVar = this.f) != null ? befVar.equals(bvcVar.e()) : bvcVar.e() == null) && this.a.equals(bvcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bvc
    public final beh f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        bef befVar = this.f;
        return (((hashCode * 1000003) ^ (befVar == null ? 0 : befVar.hashCode())) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.e + ", defaultAudioProfile=" + this.f + ", defaultVideoProfile=" + this.a + "}";
    }
}
