package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czod extends ffhv implements ffjm {
    final /* synthetic */ czog a;
    final /* synthetic */ Intent b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czod(ffgu ffguVar, czog czogVar, Intent intent) {
        super(2, ffguVar);
        this.a = czogVar;
        this.b = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czod) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        ffci.b(obj);
        Intent flags = new Intent("android.intent.action.VIEW").setClassName(this.a.a, "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        Intent intent = this.b;
        Intent data = flags.setData(intent.getData());
        data.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.REFERRER", Uri.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER");
        }
        data.putExtra("android.intent.extra.REFERRER", String.valueOf((Uri) parcelableExtra));
        return eknx.b(data);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        czod czodVar = new czod(ffguVar, this.a, this.b);
        czodVar.c = obj;
        return czodVar;
    }
}
