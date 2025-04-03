package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfv implements ejxi {
    final /* synthetic */ cmgg a;
    final /* synthetic */ String b;

    public cmfv(cmgg cmggVar, String str) {
        this.a = cmggVar;
        this.b = str;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return cmgg.b;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        String str = this.b;
        cmgg cmggVar = this.a;
        c = axol.c(cmggVar.d, ffhe.a, ffsm.a, new cmfu(str, cmggVar, null));
        return c;
    }
}
