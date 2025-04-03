package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxh implements wqq {
    public final Context a;
    public final ffsk b;
    public final amhs c;
    public final ffxx d;
    private final Set e;

    public wxh(Context context, ffsk ffskVar, amhs amhsVar, ffxx ffxxVar, ffxx ffxxVar2) {
        context.getClass();
        ffskVar.getClass();
        amhsVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = amhsVar;
        this.d = new fgch(ffxxVar2, ffxxVar, new wxf(this, null));
        this.e = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }
}
