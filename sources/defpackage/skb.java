package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ skf b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skb(ffgu ffguVar, skf skfVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.b = skfVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((skb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ctit ctitVar = (ctit) this.b.h.b();
                bdmq bdmqVar = (bdmq) this.b.g.b();
                ConversationIdType conversationIdType = this.c;
                Object e = shv.d.e();
                e.getClass();
                elfl b = ctitVar.b(bdmqVar.L(conversationIdType, ((Number) e).intValue()));
                b.getClass();
                this.a = 1;
                obj = fgfz.c(b, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (Locale) obj;
        } catch (Exception unused) {
            return ctid.c(this.b.c);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        skb skbVar = new skb(ffguVar, this.b, this.c);
        skbVar.d = obj;
        return skbVar;
    }
}
