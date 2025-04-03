package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bql extends bra {
    public final long a;
    public final ParcelFileDescriptor b;

    public bql(long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = j;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.brf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.bra
    public final ParcelFileDescriptor b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bra) {
            bra braVar = (bra) obj;
            braVar.c();
            if (this.a == braVar.a()) {
                braVar.d();
                if (this.b.equals(braVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ (-721379959)) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FileDescriptorOutputOptionsInternal{fileSizeLimit=0, durationLimitMillis=" + this.a + ", location=null, parcelFileDescriptor=" + this.b + "}";
    }

    @Override // defpackage.brf
    public final void c() {
    }

    @Override // defpackage.brf
    public final void d() {
    }
}
