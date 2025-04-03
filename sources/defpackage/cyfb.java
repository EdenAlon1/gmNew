package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfb implements sry {
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    private final ffhd d;
    private final ffsk e;
    private final cyff f;

    public cyfb(Context context, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, cyff cyffVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.a = context;
        this.d = ffhdVar;
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = cyffVar;
    }

    @Override // defpackage.sry
    public final fgdj a() {
        cyff cyffVar = this.f;
        return ejso.a(ffyo.b(new fgch(cyffVar.b, cyffVar.a, new cyfe(cyffVar, null)), this.d), this.e, new cyfa(this));
    }

    @Override // defpackage.sry
    public final boolean b() {
        cfup cfupVar = cyfd.a;
        Object e = ((cfup) cyfd.c.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }
}
