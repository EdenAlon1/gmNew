package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aejm implements cztz {
    final /* synthetic */ aely a;
    final /* synthetic */ aejn b;

    public aejm(aejn aejnVar, aely aelyVar) {
        this.a = aelyVar;
        this.b = aejnVar;
    }

    @Override // defpackage.cztz
    public final int a() {
        return 0;
    }

    @Override // defpackage.cztz
    public final ConversationIdType b() {
        return this.a.k().w();
    }

    @Override // defpackage.cztz
    public final void c(SuggestionData suggestionData) {
        ((crnc) this.b.b.b()).e(suggestionData, fbqp.CONVERSATIONS_LIST_VIEW);
    }

    @Override // defpackage.cztz
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.cztz
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // defpackage.cztz
    public final void d() {
    }
}
