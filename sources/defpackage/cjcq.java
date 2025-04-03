package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcq extends citi {
    private final Context a;
    private final ayfg b;

    public cjcq(Context context, ayfg ayfgVar) {
        context.getClass();
        ayfgVar.getClass();
        this.a = context;
        this.b = ayfgVar;
    }

    @Override // defpackage.citi
    public final /* synthetic */ elfl b(Object obj) {
        citj g = citk.g();
        g.b(true);
        Intent d = this.b.d(this.a);
        d.putExtra("via_notification", true);
        ciwm e = ciwm.e(d, true, Optional.empty(), Optional.empty());
        cism cismVar = (cism) g;
        cismVar.c = e;
        Context context = this.a;
        ciwr t = ciwt.t();
        t.d(context.getString(R.string.secondary_user_notification_title));
        citb citbVar = (citb) t;
        citbVar.a = IconCompat.h(this.a, R.drawable.notification_icon);
        t.c(this.a.getColor(R.color.primary_brand_icon_color));
        citbVar.d = Optional.of(this.a.getString(R.string.secondary_user_notification_ticker));
        cismVar.b = t.a();
        elfl e2 = elfo.e(g.a());
        e2.getClass();
        return e2;
    }

    @Override // defpackage.civa
    public final ciwq c() {
        return new cjcp();
    }

    @Override // defpackage.civa
    public final cixf d() {
        return cixf.NT_SECONDARY_USER;
    }

    @Override // defpackage.civa
    public final elfl e() {
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final String g() {
        return "msg";
    }
}
