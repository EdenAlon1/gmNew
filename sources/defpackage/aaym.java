package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaym extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ anzh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaym(abac abacVar, anzh anzhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = anzhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaym) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((ctqh) this.b.u.b()).p((SuggestionData) this.c, fbrd.CLICKED);
            ctjh ctjhVar = (ctjh) this.b.t.b();
            anzh anzhVar = this.c;
            abac abacVar = this.b;
            eoqz eoqzVar = eoqz.P2P_SUGGESTION_CLICK;
            fbqp fbqpVar = fbqp.CONVERSATION_VIEW;
            boolean z = ((dede) abacVar.B.b()).b;
            this.a = 1;
            if (ctjhVar.j((SuggestionData) anzhVar, eoqzVar, fbqpVar, z, 0.0f, false, false, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaym(this.b, this.c, ffguVar);
    }
}
