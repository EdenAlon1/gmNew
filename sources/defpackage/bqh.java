package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqh extends bqe {
    public final Range c;
    public final int d = -1;
    public final int e = -1;
    public final Range f;
    public final int g;

    public bqh(Range range, Range range2, int i) {
        this.c = range;
        this.f = range2;
        this.g = i;
    }

    @Override // defpackage.bqe
    public final int a() {
        return this.g;
    }

    @Override // defpackage.bqe
    public final Range b() {
        return this.c;
    }

    @Override // defpackage.bqe
    public final Range c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqe) {
            bqe bqeVar = (bqe) obj;
            if (this.c.equals(bqeVar.b())) {
                bqeVar.e();
                bqeVar.f();
                if (this.f.equals(bqeVar.c()) && this.g == bqeVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((~((~((this.c.hashCode() ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        return "AudioSpec{bitrate=" + this.c + ", sourceFormat=-1, source=-1, sampleRate=" + this.f + ", channelCount=" + this.g + "}";
    }

    @Override // defpackage.bqe
    public final void e() {
    }

    @Override // defpackage.bqe
    public final void f() {
    }
}
