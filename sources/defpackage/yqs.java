package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yqs extends ffkh implements ffix {
    public yqs(Object obj) {
        super(0, obj, yqu.class, "outputSize", "outputSize()I", 0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        yqu yquVar = (yqu) this.g;
        Object M = ffdx.M(yquVar.a.d());
        xlv xlvVar = M instanceof xlv ? (xlv) M : null;
        Long valueOf = xlvVar != null ? Long.valueOf(xlvVar.e()) : null;
        return Integer.valueOf((valueOf == null || !ffmk.r(new ffmj(0, 307200), valueOf.longValue())) ? (valueOf == null || !ffmk.r(new ffmj(307200, 1048576), valueOf.longValue())) ? (int) ((Number) yquVar.b.b()).longValue() : BasePaymentResult.ERROR_REQUEST_FAILED : 100);
    }
}
