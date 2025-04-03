package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class she extends ffhv implements ffjm {
    final /* synthetic */ shh a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public she(shh shhVar, MessageCoreData messageCoreData, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = shhVar;
        this.b = messageCoreData;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((she) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.m(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new she(this.a, this.b, this.c, ffguVar);
    }
}
