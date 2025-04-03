package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazv extends ffhv implements ffji {
    final /* synthetic */ aoax a;
    final /* synthetic */ abac b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazv(aoax aoaxVar, abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = aoaxVar;
        this.b = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String propertyValue = ((bdtj) this.a).a.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        boolean z = false;
        if (TextUtils.isEmpty(propertyValue)) {
            ((enrr) abac.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$onClickV2$primaryActionHandler$8", "invokeSuspend", 357, "SuggestionUiAdapterImpl.kt")).q("suggestion type phone has empty number. Cannot create call intent.");
        } else {
            Intent a = ((crjp) this.b.v.b()).a(propertyValue);
            if (a != null && ((crjp) this.b.v.b()).e(a)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazv(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
