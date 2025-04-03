package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugl extends ffhv implements ffjm {
    final /* synthetic */ cugm a;
    final /* synthetic */ ParticipantsTable.BindData b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ erfe d;
    final /* synthetic */ eres e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cugl(cugm cugmVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, erfe erfeVar, int i, int i2, int i3, eres eresVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cugmVar;
        this.b = bindData;
        this.c = conversationIdType;
        this.d = erfeVar;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.e = eresVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cugl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cugj b = ((cugi) this.a.a.b()).b(this.b, null);
        erfe erfeVar = this.d;
        int i = this.f;
        int i2 = this.g;
        this.a.a(this.c, b, erfeVar, i, i2, this.h, this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cugl(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.e, ffguVar);
    }
}
