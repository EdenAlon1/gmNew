package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aczt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aczv c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczt(aczv aczvVar, MessageCoreData messageCoreData, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aczvVar;
        this.d = messageCoreData;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object f;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Uri a = aczv.a(this.d);
            if (a == null) {
                ((ensz) aczv.a.j()).t("Empty Uri of custom sticker: ID = %s", this.e);
                return ffcu.a;
            }
            aczv aczvVar = this.c;
            String str = this.e;
            this.a = a;
            this.b = 1;
            f = aczvVar.b.f(str, a, null, this);
            if (f == ffhhVar) {
                return ffhhVar;
            }
            obj2 = a;
            obj = f;
        }
        dqzc dqzcVar = (dqzc) obj;
        if (dqzcVar != null) {
            ((ensz) aczv.a.h()).J("Custom sticker saved: ID = %s, ORIGINAL URI = %s, SAVED URI = %s", this.e, ((Uri) obj2).toString(), dqzcVar.b);
        } else {
            ((ensz) aczv.a.j()).D("Custom sticker couldn't be saved: ID = %s, ORIGINAL URI = %s", this.e, ((Uri) obj2).toString());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aczt(this.c, this.d, this.e, ffguVar);
    }
}
