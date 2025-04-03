package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctei extends cter {
    public final Uri a;
    public final File b;
    public final long c;
    public final double d;
    public final boolean e;
    public final double f;
    public final String g;
    public final String h;

    public ctei(Uri uri, File file, long j, double d, boolean z, double d2, String str, String str2) {
        this.a = uri;
        this.b = file;
        this.c = j;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.cter
    public final double a() {
        return this.d;
    }

    @Override // defpackage.cter
    public final double b() {
        return this.f;
    }

    @Override // defpackage.cter
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cter
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.cter
    public final File e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cter) {
            cter cterVar = (cter) obj;
            if (this.a.equals(cterVar.d()) && this.b.equals(cterVar.e()) && this.c == cterVar.c() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(cterVar.a()) && this.e == cterVar.h() && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(cterVar.b()) && ((str = this.g) != null ? str.equals(cterVar.f()) : cterVar.f() == null) && ((str2 = this.h) != null ? str2.equals(cterVar.g()) : cterVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cter
    public final String f() {
        return this.g;
    }

    @Override // defpackage.cter
    public final String g() {
        return this.h;
    }

    @Override // defpackage.cter
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long doubleToLongBits = (Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f);
        String str = this.g;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i = ((((((((((hashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) doubleToLongBits)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003) ^ hashCode2) * 1000003;
        String str2 = this.h;
        return i ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        File file = this.b;
        return "TranscodeParameters{sourceUri=" + this.a.toString() + ", outputPath=" + file.toString() + ", sizeLimit=" + this.c + ", bitrateLimitFactor=" + this.d + ", enableHighBudgetVideoCompression=" + this.e + ", mmsVideoCompressionFudgeFactor=" + this.f + ", mimeType=" + this.g + ", targetMimeType=" + this.h + "}";
    }
}
