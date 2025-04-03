package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxd implements wqq {
    public final Context a;
    public final aigz b;
    public final ffxx c;
    private final Set d;

    public wxd(Context context, aigz aigzVar, ffxx ffxxVar, ffxx ffxxVar2) {
        context.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        this.a = context;
        this.b = aigzVar;
        this.c = new fgch(ffxxVar2, ffxxVar, new wxc(this, null));
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
