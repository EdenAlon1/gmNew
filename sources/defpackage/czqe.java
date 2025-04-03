package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqe extends ffhv implements ffjm {
    final /* synthetic */ czqi a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czqe(ffgu ffguVar, czqi czqiVar, Uri uri) {
        super(2, ffguVar);
        this.a = czqiVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czqe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Intent data = new Intent("android.intent.action.VIEW").setClassName(this.a.b, "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(this.b);
        data.getClass();
        return eknx.b(data);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        czqe czqeVar = new czqe(ffguVar, this.a, this.b);
        czqeVar.c = obj;
        return czqeVar;
    }
}
