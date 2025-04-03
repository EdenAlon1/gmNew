package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dgok extends dfsd {
    public dgok(dfre dfreVar) {
        super(dgnq.c, dfreVar);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        dgoq dgoqVar = (dgoq) dfqkVar;
        Context context = dgoqVar.c;
        n((IGoogleHelpService) dgoqVar.w());
    }

    @Override // defpackage.dfsd, defpackage.dfse
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.l((dfrl) obj);
    }

    protected abstract void n(IGoogleHelpService iGoogleHelpService);
}
