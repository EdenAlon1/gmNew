package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbj implements wqq {
    public final xbe a;
    public final ffbr b;
    public final ffxx c;
    private final Set d;

    public xbj(Context context, xbe xbeVar, ffxx ffxxVar, ffbr ffbrVar) {
        context.getClass();
        ffxxVar.getClass();
        ffbrVar.getClass();
        this.a = xbeVar;
        this.b = ffbrVar;
        this.c = new xbi(ffxxVar, context, this);
        this.d = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
