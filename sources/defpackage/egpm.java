package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpm extends lml {
    public final efmq a;
    public final egdg b;
    public final efmp c;
    public final llf d;
    public final egjk e;
    public final exgs f;
    public boolean g;
    public boolean h;

    public egpm(efmq efmqVar, Context context, emxc emxcVar, egdg egdgVar, egiu egiuVar, egjk egjkVar, exgs exgsVar) {
        this.a = efmqVar;
        this.b = egdgVar;
        Account account = (Account) emxcVar.c();
        if (context == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (TextUtils.isEmpty("DGfUjvgDP0m9qsni3Km0UPdYwhSC")) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        this.c = new efmp(context, "DGfUjvgDP0m9qsni3Km0UPdYwhSC", new egpl(this), null, account, fdrm.a.get().D());
        llf llfVar = new llf();
        this.d = llfVar;
        this.e = egjkVar;
        this.f = exgsVar;
        llfVar.p(egiuVar.b, new llh() { // from class: egpk
            @Override // defpackage.llh
            public final void a(Object obj) {
                egdx egdxVar = (egdx) obj;
                if (egdxVar.b().g() && egdxVar.d() == 4) {
                    egpm egpmVar = egpm.this;
                    egpmVar.g = egpmVar.h;
                    egpmVar.h = ((egiw) egdxVar.b().c()).c();
                }
            }
        });
    }
}
