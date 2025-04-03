package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvg extends dfra implements dhvo {
    public dhvg(Context context, dhvl dhvlVar) {
        super(context, dhvm.a, dhvlVar, dfqz.a);
    }

    @Override // defpackage.dhvo
    public final dhre a() {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhuz
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getCheckboxSettingsPendingIntent(new dhvs((dhri) obj2));
            }
        };
        dfunVar.b = new Feature[]{dhuy.d};
        dfunVar.c = 4509;
        return i(dfunVar.a());
    }

    @Override // defpackage.dhvo
    public final dhre b() {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhvc
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getOptInOptions(new dhvd((dhri) obj2));
            }
        };
        dfunVar.c = 4501;
        return i(dfunVar.a());
    }
}
