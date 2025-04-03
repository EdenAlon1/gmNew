package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhs implements drht {
    public final fgdj a;
    public final ffix b;
    public final fgdj c;
    public final fgdj d;
    public final fgdj e;
    public final ffix f;
    private final int h = R.string.magic_compose_storage_error_message;
    private final int i = R.string.magic_compose_storage_settings_link;

    public drhs(fgdj fgdjVar, ffix ffixVar, fgdj fgdjVar2, fgdj fgdjVar3, fgdj fgdjVar4, ffix ffixVar2) {
        this.a = fgdjVar;
        this.b = ffixVar;
        this.c = fgdjVar2;
        this.d = fgdjVar3;
        this.e = fgdjVar4;
        this.f = ffixVar2;
    }

    @Override // defpackage.drht
    public final int a() {
        return R.string.magic_compose_feature_downloading_error_message;
    }

    @Override // defpackage.drht
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drhs)) {
            return false;
        }
        drhs drhsVar = (drhs) obj;
        if (!ffkj.e(this.a, drhsVar.a)) {
            return false;
        }
        int i = drhsVar.h;
        int i2 = drhsVar.i;
        return ffkj.e(this.b, drhsVar.b) && ffkj.e(this.c, drhsVar.c) && ffkj.e(this.d, drhsVar.d) && ffkj.e(this.e, drhsVar.e) && ffkj.e(this.f, drhsVar.f);
    }

    public final int hashCode() {
        fgdj fgdjVar = this.a;
        int hashCode = fgdjVar == null ? 0 : fgdjVar.hashCode();
        ffix ffixVar = this.b;
        int hashCode2 = ffixVar == null ? 0 : ffixVar.hashCode();
        fgdj fgdjVar2 = this.c;
        int hashCode3 = ((((((((hashCode * 31) + R.string.magic_compose_storage_error_message) * 31) + R.string.magic_compose_storage_settings_link) * 31) + hashCode2) * 31) + (fgdjVar2 == null ? 0 : fgdjVar2.hashCode())) * 31;
        fgdj fgdjVar3 = this.d;
        int hashCode4 = (hashCode3 + (fgdjVar3 == null ? 0 : fgdjVar3.hashCode())) * 31;
        fgdj fgdjVar4 = this.e;
        return ((hashCode4 + (fgdjVar4 != null ? fgdjVar4.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "FeatureDownload(isStorageInsufficientFlow=" + this.a + ", storageInsufficientErrorMessageStringResource=2132085321, storageLinkTextStringResource=2132085322, onStorageLinkClicked=" + this.b + ", bytesToDownloadFlow=" + this.c + ", totalBytesDownloadedFlow=" + this.d + ", downloadCompleteFlow=" + this.e + ", onDownloadComplete=" + this.f + ")";
    }
}
