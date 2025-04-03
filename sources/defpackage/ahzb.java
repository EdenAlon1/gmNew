package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzb implements ahyl {
    public final Context a;
    public final ffsk b;
    public final ydb c;
    public final ffbr d;
    public final atbn e;
    public final atbr f;
    public final atby g;
    public final AtomicBoolean h;
    public final dsjn i;
    private final dqnl j;
    private final fgdj k;

    public ahzb(Context context, ffsk ffskVar, ydb ydbVar, ffbr ffbrVar, ahzc ahzcVar, ahxd ahxdVar, atbn atbnVar, atbr atbrVar, atby atbyVar) {
        context.getClass();
        ffskVar.getClass();
        ydbVar.getClass();
        ffbrVar.getClass();
        ahzcVar.getClass();
        ahxdVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ydbVar;
        this.d = ffbrVar;
        this.e = atbnVar;
        this.f = atbrVar;
        this.g = atbyVar;
        this.h = new AtomicBoolean(false);
        axol.k(ahxdVar.b, ahxdVar.a, new ahxc(ahxdVar, null), 2);
        ahyz ahyzVar = new ahyz(this);
        this.j = ahyzVar;
        dsjn dsjnVar = new dsjn(ahyzVar, (dqlt) null, 6);
        this.i = dsjnVar;
        fgch fgchVar = new fgch(new ahyw(ydbVar.a), ahzcVar.a, new ahza(this, null));
        int i = fgcz.a;
        fgcz fgczVar = fgcy.b;
        String string = context.getString(R.string.multi_share_bottom_compose_row_text_placeholder);
        string.getClass();
        this.k = fgbn.b(fgchVar, ffskVar, fgczVar, new dmmp(dsjnVar, (CharSequence) "", string, (Integer) null, false, new dmmo(atbnVar.a(), atbyVar.a(), 2), 56));
        axol.k(ffskVar, null, new ahyt(this, null), 3);
    }

    @Override // defpackage.ahyl
    public final fgdj a() {
        return this.k;
    }
}
