package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aays extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ SmartSuggestionData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aays(abac abacVar, SmartSuggestionData smartSuggestionData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = smartSuggestionData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aays) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abac abacVar = this.b;
            SmartSuggestionData smartSuggestionData = this.c;
            xih c = abacVar.c();
            xhu xhuVar = new xhu(smartSuggestionData.d(), null, null, false, null, null, null, false, 0, false, 1022);
            this.a = 1;
            obj = c.b(xhuVar, null, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ((enrr) abac.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$handleReplySuggestion$1$1", "invokeSuspend", 835, "SuggestionUiAdapterImpl.kt")).q("Failed to send reply suggestion");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aays(this.b, this.c, ffguVar);
    }
}
