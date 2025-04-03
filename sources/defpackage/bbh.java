package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbh extends beg {
    public final List a;
    private final int b;
    private final int c;
    private final List d;

    public bbh(int i, int i2, List list, List list2) {
        this.b = i;
        this.c = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.a = list2;
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
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beg) {
            beg begVar = (beg) obj;
            if (this.b == begVar.a() && this.c == begVar.b() && this.d.equals(begVar.c()) && this.a.equals(begVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.b + ", recommendedFileFormat=" + this.c + ", audioProfiles=" + this.d + ", videoProfiles=" + this.a + "}";
    }
}
