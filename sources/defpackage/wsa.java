package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsa implements wqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/actions/blockandreportspam/BlockAndReportSpamActionPlugin");
    public final Context b;
    public final ffxx c;
    public final Set d = fffi.b(aaxf.a);
    public final tac e;
    public final int f;
    private final ffxx g;
    private final ffxx h;

    public wsa(Context context, ffxx ffxxVar, ffxx ffxxVar2, tac tacVar, int i) {
        this.b = context;
        this.g = ffxxVar;
        this.h = ffxxVar2;
        this.e = tacVar;
        this.f = i;
        this.c = new fgch(ffxxVar2, ffxxVar, new wrz(this, null));
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
