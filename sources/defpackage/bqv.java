package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqv extends but {
    public final bro a;
    public final Range b;
    public final Range c;
    public final int d;

    public bqv(bro broVar, Range range, Range range2, int i) {
        this.a = broVar;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    @Override // defpackage.but
    public final int a() {
        return this.d;
    }

    @Override // defpackage.but
    public final Range b() {
        return this.c;
    }

    @Override // defpackage.but
    public final Range c() {
        return this.b;
    }

    @Override // defpackage.but
    public final bro d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof but) {
            but butVar = (but) obj;
            if (this.a.equals(butVar.d()) && this.b.equals(butVar.c()) && this.c.equals(butVar.b()) && this.d == butVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "VideoSpec{qualitySelector=" + this.a + ", frameRate=" + this.b + ", bitrate=" + this.c + ", aspectRatio=" + this.d + "}";
    }
}
