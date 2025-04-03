package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cyjh extends ffkh implements ffjm {
    public cyjh(Object obj) {
        super(2, obj, cyjk.class, "loadContent", "loadContent(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final cyjk cyjkVar = (cyjk) this.g;
        if (!booleanValue) {
            return null;
        }
        String string = cyjkVar.a.getString(R.string.cross_country_banner_title);
        String string2 = cyjkVar.a.getString(R.string.cross_country_banner_body);
        ssi ssiVar = new ssi(dmzz.bJ);
        String string3 = cyjkVar.a.getString(R.string.cross_country_banner_confirm_button);
        string3.getClass();
        ssc sscVar = new ssc(string3, new ffix() { // from class: cyje
            @Override // defpackage.ffix
            public final Object invoke() {
                cyjk cyjkVar2 = cyjk.this;
                ((cyjl) cyjkVar2.b.b()).c(cyjkVar2.e);
                ((cuqw) cyjkVar2.c.b()).a(2);
                axol.m(cyjkVar2.f, new cyjj(cyjkVar2, null));
                return ffcu.a;
            }
        });
        String string4 = cyjkVar.a.getString(R.string.cross_country_banner_dismiss_button);
        string4.getClass();
        return new ssg("cross_country_banner", string, string2, ssiVar, sscVar, new ssc(string4, new ffix() { // from class: cyjf
            @Override // defpackage.ffix
            public final Object invoke() {
                cyjk cyjkVar2 = cyjk.this;
                Class a = ((cyjl) cyjkVar2.b.b()).a();
                Context context = cyjkVar2.a;
                Intent addFlags = new Intent(context, (Class<?>) a).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                addFlags.getClass();
                eldl.p(context, addFlags);
                ((cuqw) cyjkVar2.c.b()).a(3);
                return ffcu.a;
            }
        }), new ffix() { // from class: cyjg
            @Override // defpackage.ffix
            public final Object invoke() {
                ((cuqw) cyjk.this.c.b()).a(1);
                return ffcu.a;
            }
        }, null, 1024);
    }
}
