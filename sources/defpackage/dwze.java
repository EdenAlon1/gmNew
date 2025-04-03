package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwze extends lmt {
    final /* synthetic */ dwyh a;
    final /* synthetic */ Executor b;

    public dwze(dwyh dwyhVar, Executor executor) {
        this.a = dwyhVar;
        this.b = executor;
    }

    @Override // defpackage.lmt, defpackage.lms
    public final lml a(Class cls) {
        return new dwzf(this.a, this.b);
    }
}
