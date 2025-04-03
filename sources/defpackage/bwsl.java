package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsl extends duak {
    public bwsl() {
        super("rbm_business_info");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwsk b() {
        ah();
        return new bwsk(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(long j) {
        this.a.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(j));
    }

    public final void d(String str) {
        dtub.u(this.a, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
    }
}
