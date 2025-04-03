package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znt implements ffjn {
    final /* synthetic */ hkx a;

    public znt(hkx hkxVar) {
        this.a = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object a = this.a.a();
            a.getClass();
            d = ebs.d(hvi.e, 1.0f);
            dobg.d((dobh) a, jfw.a(d, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER), hfdVar, 48);
        }
        return ffcu.a;
    }
}
