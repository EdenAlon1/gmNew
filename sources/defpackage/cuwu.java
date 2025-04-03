package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuwv b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuwu(cuwv cuwvVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuwvVar;
        this.c = bindData;
        this.d = conversationIdType;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuwu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cuwv cuwvVar = this.b;
            ParticipantsTable.BindData bindData = this.c;
            ConversationIdType conversationIdType = this.d;
            bdmq bdmqVar = (bdmq) cuwvVar.c.b();
            Object e = cubs.g.e();
            e.getClass();
            engw G = bdmqVar.G(conversationIdType, ((Number) e).intValue());
            G.getClass();
            boolean z = this.e;
            int i2 = this.f;
            int i3 = this.g;
            this.a = 1;
            if (cuwvVar.b(bindData, conversationIdType, G, z, 3, i2, i3, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuwu(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
