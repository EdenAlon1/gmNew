package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfwr implements dfrf {
    final /* synthetic */ dfrg a;
    final /* synthetic */ dhri b;
    final /* synthetic */ dfwt c;

    public dfwr(dfrg dfrgVar, dhri dhriVar, dfwt dfwtVar) {
        this.a = dfrgVar;
        this.b = dhriVar;
        this.c = dfwtVar;
    }

    @Override // defpackage.dfrf
    public final void a(Status status) {
        if (!status.d()) {
            this.b.a(dfve.a(status));
        } else {
            this.b.b(this.c.a(this.a.f(TimeUnit.MILLISECONDS)));
        }
    }
}
