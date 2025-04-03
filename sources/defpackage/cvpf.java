package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpf implements wgl {
    public final ffbr a;
    public final cvqc b;
    private final ffsk c;

    public cvpf(ffsk ffskVar, cvqc cvqcVar, ffbr ffbrVar) {
        ffskVar.getClass();
        this.c = ffskVar;
        this.b = cvqcVar;
        this.a = ffbrVar;
    }

    @Override // defpackage.wgl
    public final elfl a(SuggestionData suggestionData, wgi wgiVar) {
        elfl c;
        suggestionData.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new cvpe(this, wgiVar, suggestionData, null));
        return c;
    }

    @Override // defpackage.wgl
    public final void b(ConversationIdType conversationIdType, SuggestionData suggestionData, eyjv eyjvVar) {
        eyjvVar.getClass();
    }
}
