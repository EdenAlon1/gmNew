package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewwf extends exat {
    private final String a;
    private final ParcelFileDescriptor b;
    private final ParcelFileDescriptor c;
    private final ParcelFileDescriptor d;
    private final ParcelFileDescriptor e;

    public ewwf(String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, ParcelFileDescriptor parcelFileDescriptor4) {
        this.a = str;
        this.b = parcelFileDescriptor;
        this.c = parcelFileDescriptor2;
        this.d = parcelFileDescriptor3;
        this.e = parcelFileDescriptor4;
    }

    @Override // defpackage.exat
    public final ParcelFileDescriptor a() {
        return this.c;
    }

    @Override // defpackage.exat
    public final ParcelFileDescriptor b() {
        return this.d;
    }

    @Override // defpackage.exat
    public final ParcelFileDescriptor c() {
        return this.b;
    }

    @Override // defpackage.exat
    public final ParcelFileDescriptor d() {
        return this.e;
    }

    @Override // defpackage.exat
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof exat) {
            exat exatVar = (exat) obj;
            if (this.a.equals(exatVar.e()) && this.b.equals(exatVar.c()) && this.c.equals(exatVar.a()) && ((parcelFileDescriptor = this.d) != null ? parcelFileDescriptor.equals(exatVar.b()) : exatVar.b() == null) && ((parcelFileDescriptor2 = this.e) != null ? parcelFileDescriptor2.equals(exatVar.d()) : exatVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        ParcelFileDescriptor parcelFileDescriptor = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor2 = this.e;
        return hashCode2 ^ (parcelFileDescriptor2 != null ? parcelFileDescriptor2.hashCode() : 0);
    }

    public final String toString() {
        ParcelFileDescriptor parcelFileDescriptor = this.e;
        ParcelFileDescriptor parcelFileDescriptor2 = this.d;
        ParcelFileDescriptor parcelFileDescriptor3 = this.c;
        return "Slice{sliceId=" + this.a + ", namesTable=" + this.b.toString() + ", metadataTable=" + parcelFileDescriptor3.toString() + ", namesFilter=" + String.valueOf(parcelFileDescriptor2) + ", prefixesFilter=" + String.valueOf(parcelFileDescriptor) + "}";
    }
}
