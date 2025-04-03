package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aczj b;
    final /* synthetic */ aczi c;
    final /* synthetic */ ekoa d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczh(ffgu ffguVar, aczj aczjVar, aczi acziVar, ekoa ekoaVar) {
        super(2, ffguVar);
        this.b = aczjVar;
        this.c = acziVar;
        this.d = ekoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aczk aczkVar = (aczk) this.b.c.b();
            Intent intent = this.d.a;
            boolean e = ffkj.e(intent != null ? intent.getAction() : null, "com.google.android.apps.messaging.ACTION_START_DEMO_ESOS_CONVERSATION");
            this.a = 1;
            obj = aczkVar.a(e, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return eknx.b(((ayfg) this.b.d.b()).m(this.b.a, (ConversationId) obj));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aczh aczhVar = new aczh(ffguVar, this.b, this.c, this.d);
        aczhVar.e = obj;
        return aczhVar;
    }
}
