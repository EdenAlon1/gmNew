package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjct extends citi {
    private final Context a;

    public cjct(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.citi
    public final /* synthetic */ elfl b(Object obj) {
        cjcv cjcvVar = (cjcv) obj;
        cjcvVar.getClass();
        citj g = citk.g();
        g.b(true);
        Context context = this.a;
        ciwr t = ciwt.t();
        t.d(context.getString(R.string.share_pdu_notification_title));
        citb citbVar = (citb) t;
        citbVar.b = Optional.of(this.a.getString(R.string.share_pdu_share_prompt));
        citbVar.a = IconCompat.h(this.a, R.drawable.notification_icon);
        t.c(this.a.getColor(R.color.primary_brand_icon_color));
        ciwt a = t.a();
        cism cismVar = (cism) g;
        cismVar.b = a;
        knt kntVar = new knt(this.a);
        kntVar.c(this.a.getString(R.string.share_pdu_share_text));
        kntVar.d("application/text");
        kntVar.b(cflz.d(this.a, cjcvVar.c));
        this.a.getString(R.string.share_pdu_share_prompt);
        Intent a2 = kntVar.a();
        a2.setFlags(268435457);
        cismVar.c = ciwm.e(a2, false, Optional.empty(), Optional.empty());
        elfl e = elfo.e(g.a());
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final ciwq c() {
        return new cjcs();
    }

    @Override // defpackage.civa
    public final cixf d() {
        return cixf.NT_SHARE_PDU;
    }

    @Override // defpackage.civa
    public final elfl e() {
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final String g() {
        return "err";
    }
}
