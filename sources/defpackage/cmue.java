package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmue extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmug b;
    final /* synthetic */ MessagePartCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmue(cmug cmugVar, MessagePartCoreData messagePartCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmugVar;
        this.c = messagePartCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmue) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqze dqzeVar = (dqze) this.b.d.a();
            if (dqzeVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String e = this.b.e();
            e.getClass();
            Uri t = this.c.t();
            t.getClass();
            String aa = this.c.aa();
            this.a = 1;
            obj = dqzeVar.f(e, t, aa, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Failed to get or create sticker");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmue(this.b, this.c, ffguVar);
    }
}
