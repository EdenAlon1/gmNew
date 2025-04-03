package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aczu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aczv b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczu(aczv aczvVar, MessageCoreData messageCoreData, MessageCoreData messageCoreData2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aczvVar;
        this.c = messageCoreData;
        this.d = messageCoreData2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqza dqzaVar = (dqza) this.b.e.b();
            this.a = 1;
            obj = dqzaVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            MessageCoreData messageCoreData = this.d;
            fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
            fbwzVar.getClass();
            fbsp fbspVar = (fbsp) fbsq.a.createBuilder();
            fbspVar.getClass();
            Uri a = aczv.a(messageCoreData);
            if (a != null) {
                String uri = a.toString();
                uri.getClass();
                fbspVar.copyOnWrite();
                ((fbsq) fbspVar.instance).b = uri;
            }
            eyfy build = fbspVar.build();
            build.getClass();
            fbwzVar.copyOnWrite();
            fbxa fbxaVar = (fbxa) fbwzVar.instance;
            fbxaVar.d = (fbsq) build;
            fbxaVar.c = 29;
            fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
            fbwxVar.getClass();
            fbrn.b(fbri.CREATE_PHOTOMOJI, fbwxVar);
            fbro.c(fbrn.a(fbwxVar), fbwzVar);
            List b = ffdx.b(fbro.a(fbwzVar));
            ctqh ctqhVar = (ctqh) this.b.d.b();
            ConversationIdType z = this.c.z();
            z.getClass();
            MessageIdType B = this.c.B();
            B.getClass();
            ctqhVar.l(b, z, B, ((cqoh) this.b.c.b()).f().toEpochMilli());
            ((ensz) aczv.a.h()).t("Created a photomoji smart chips for image with uri: %s", aczv.a(this.d));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aczu(this.b, this.c, this.d, ffguVar);
    }
}
