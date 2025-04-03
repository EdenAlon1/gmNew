package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyj implements cvyf {
    public final cvsa a;
    public final amav b;
    public final ecrj c;
    public final ffbr d;
    public final Resources e;
    private final ffsk f;
    private final cwis g;
    private final ffxx h;
    private final fgdj i;

    public cvyj(Context context, ffsk ffskVar, cvsa cvsaVar, cwis cwisVar, amav amavVar, ecrj ecrjVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        cvsaVar.getClass();
        cwisVar.getClass();
        amavVar.getClass();
        ecrjVar.getClass();
        ffbrVar.getClass();
        this.f = ffskVar;
        this.a = cvsaVar;
        this.g = cwisVar;
        this.b = amavVar;
        this.c = ecrjVar;
        this.d = ffbrVar;
        this.e = context.getResources();
        fgcp fgcpVar = new fgcp(new cvyh(this, null));
        this.h = fgcpVar;
        fgch fgchVar = new fgch(fgcpVar, cwisVar.a(), new cvyi(this));
        int i = fgcz.a;
        this.i = fgbn.b(fgchVar, ffskVar, fgcy.a(0L, 3), new cvyk(null));
    }

    @Override // defpackage.cvyf
    public final fgdj a() {
        return this.i;
    }
}
