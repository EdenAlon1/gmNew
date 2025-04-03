package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxq extends dzxt {
    public final Bitmap a;
    private final emxc b;
    private final int c;

    public dzxq(Bitmap bitmap, emxc emxcVar, int i) {
        this.a = bitmap;
        this.b = emxcVar;
        this.c = i;
    }

    @Override // defpackage.dzxt
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dzxt
    public final Bitmap b() {
        return this.a;
    }

    @Override // defpackage.dzxt
    public final emxc c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzxt) {
            dzxt dzxtVar = (dzxt) obj;
            if (this.a.equals(dzxtVar.b()) && this.b.equals(dzxtVar.c()) && this.c == dzxtVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "CacheValue{avatar=" + this.a.toString() + ", imageUrl=" + emxcVar.toString() + ", profileHashCode=" + this.c + "}";
    }
}
