package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewwd extends exau {
    private final engw a;
    private final ParcelFileDescriptor b;
    private final ParcelFileDescriptor c;
    private final ParcelFileDescriptor d;
    private final ParcelFileDescriptor e;

    public ewwd(engw engwVar, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, ParcelFileDescriptor parcelFileDescriptor3, ParcelFileDescriptor parcelFileDescriptor4) {
        this.a = engwVar;
        this.b = parcelFileDescriptor;
        this.c = parcelFileDescriptor2;
        this.d = parcelFileDescriptor3;
        this.e = parcelFileDescriptor4;
    }

    @Override // defpackage.exau
    public final ParcelFileDescriptor a() {
        return this.b;
    }

    @Override // defpackage.exau
    public final ParcelFileDescriptor b() {
        return this.d;
    }

    @Override // defpackage.exau
    public final ParcelFileDescriptor c() {
        return this.e;
    }

    @Override // defpackage.exau
    public final ParcelFileDescriptor d() {
        return this.c;
    }

    @Override // defpackage.exau
    public final engw e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor3;
        ParcelFileDescriptor parcelFileDescriptor4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof exau) {
            exau exauVar = (exau) obj;
            if (enkr.h(this.a, exauVar.e()) && ((parcelFileDescriptor = this.b) != null ? parcelFileDescriptor.equals(exauVar.a()) : exauVar.a() == null) && ((parcelFileDescriptor2 = this.c) != null ? parcelFileDescriptor2.equals(exauVar.d()) : exauVar.d() == null) && ((parcelFileDescriptor3 = this.d) != null ? parcelFileDescriptor3.equals(exauVar.b()) : exauVar.b() == null) && ((parcelFileDescriptor4 = this.e) != null ? parcelFileDescriptor4.equals(exauVar.c()) : exauVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor2 = this.c;
        int hashCode3 = (hashCode2 ^ (parcelFileDescriptor2 == null ? 0 : parcelFileDescriptor2.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor3 = this.d;
        int hashCode4 = (hashCode3 ^ (parcelFileDescriptor3 == null ? 0 : parcelFileDescriptor3.hashCode())) * 1000003;
        ParcelFileDescriptor parcelFileDescriptor4 = this.e;
        return hashCode4 ^ (parcelFileDescriptor4 != null ? parcelFileDescriptor4.hashCode() : 0);
    }

    public final String toString() {
        ParcelFileDescriptor parcelFileDescriptor = this.e;
        ParcelFileDescriptor parcelFileDescriptor2 = this.d;
        ParcelFileDescriptor parcelFileDescriptor3 = this.c;
        ParcelFileDescriptor parcelFileDescriptor4 = this.b;
        return "WebrefModel{slices=" + String.valueOf(this.a) + ", modelMetadataProto=" + String.valueOf(parcelFileDescriptor4) + ", wordEmbeddings=" + String.valueOf(parcelFileDescriptor3) + ", refNet=" + String.valueOf(parcelFileDescriptor2) + ", topicalityModel=" + String.valueOf(parcelFileDescriptor) + "}";
    }
}
