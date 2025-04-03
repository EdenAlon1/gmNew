package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxq implements ahxo {
    public final ffbr a;
    public final String b;
    public final String c;
    public final String d;
    private final Context e;
    private final ffsk f;
    private final fgcm g;
    private final fgdj h;

    public ahxq(Context context, ffsk ffskVar, ahzc ahzcVar, ydb ydbVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        ahzcVar.getClass();
        ydbVar.getClass();
        ffbrVar.getClass();
        this.e = context;
        this.f = ffskVar;
        this.a = ffbrVar;
        String str = context.getString(R.string.disable_reason_empty_input) + " " + context.getString(R.string.compose_icon_send_content_description);
        this.b = str;
        this.c = context.getString(R.string.disable_reason_too_many_characters) + " " + context.getString(R.string.compose_icon_send_content_description);
        this.d = context.getString(R.string.disable_reason_already_sending) + " " + context.getString(R.string.compose_icon_send_content_description);
        fgcm a = fgdm.a(false);
        this.g = a;
        ffxx a2 = fgck.a(ahzcVar.a, ydbVar.a, a, new ahxp(this, null));
        int i = fgcz.a;
        this.h = fgbn.b(a2, ffskVar, fgcy.b, new ahxl(str));
    }

    @Override // defpackage.ahxo
    public final fgdj a() {
        return this.h;
    }

    @Override // defpackage.ahxo
    public final void b() {
        this.g.f(true);
    }

    @Override // defpackage.ahxo
    public final void c() {
        this.g.f(false);
    }
}
