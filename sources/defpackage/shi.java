package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shi extends ffhv implements ffjm {
    final /* synthetic */ shj a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shi(shj shjVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = shjVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((shi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ctqh ctqhVar = (ctqh) this.a.b.b();
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        fbwzVar.getClass();
        fbvu fbvuVar = (fbvu) fbvv.a.createBuilder();
        fbvuVar.getClass();
        eyfy build = fbvuVar.build();
        build.getClass();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbxaVar.d = (fbvv) build;
        fbxaVar.c = 32;
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        fbwxVar.getClass();
        fbrn.b(fbri.RECORD_VOICE_MESSAGE, fbwxVar);
        fbro.c(fbrn.a(fbwxVar), fbwzVar);
        List b = ffdx.b(fbro.a(fbwzVar));
        ConversationIdType z = this.b.z();
        z.getClass();
        MessageIdType B = this.b.B();
        B.getClass();
        ctqhVar.l(b, z, B, ((cqoh) this.a.a.b()).f().toEpochMilli());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new shi(this.a, this.b, ffguVar);
    }
}
