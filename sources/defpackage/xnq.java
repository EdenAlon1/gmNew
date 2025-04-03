package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnq {
    public final Context a;
    public final ydb b;
    public final uja c;
    public final yrn d;
    public final dqmn e;
    public final atcw f;
    public final atby g;
    public final ffxx h;
    public final ffbz i;
    public final ffbz j;
    private final ffbz k;

    public xnq(Context context, fgcq fgcqVar, ydb ydbVar, uja ujaVar, yrn yrnVar, dqmn dqmnVar, atcw atcwVar, atby atbyVar) {
        context.getClass();
        fgcqVar.getClass();
        ydbVar.getClass();
        ujaVar.getClass();
        dqmnVar.getClass();
        this.a = context;
        this.b = ydbVar;
        this.c = ujaVar;
        this.d = yrnVar;
        this.e = dqmnVar;
        this.f = atcwVar;
        this.g = atbyVar;
        this.h = new xnn(fgcqVar);
        this.i = ffca.a(new ffix() { // from class: xne
            @Override // defpackage.ffix
            public final Object invoke() {
                return new xnp(xnq.this);
            }
        });
        this.k = ffca.a(new ffix() { // from class: xnf
            @Override // defpackage.ffix
            public final Object invoke() {
                xnq xnqVar = xnq.this;
                dsjn dsjnVar = new dsjn((xnp) xnqVar.i.a(), ((ersq) ((atcm) xnqVar.f).a.b()).a("bugle.direct_send_v2_enable_rich_content_insertion") ? xnqVar.d.a() : null, xnqVar.c);
                dmmo dmmoVar = new dmmo(false, xnqVar.g.a(), 3);
                String string = xnqVar.a.getString(R.string.direct_send_compose_row_hint);
                string.getClass();
                String str = ((xhu) xnqVar.b.a.c()).a;
                if (str == null) {
                    str = "";
                }
                return new dmmp(dsjnVar, (CharSequence) str, string, (Integer) null, true, dmmoVar, 32);
            }
        });
        this.j = ffca.a(new ffix() { // from class: xng
            @Override // defpackage.ffix
            public final Object invoke() {
                return xnq.this.a().a.f;
            }
        });
    }

    public final dmmp a() {
        return (dmmp) this.k.a();
    }
}
