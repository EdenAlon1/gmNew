package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvi extends ensn {
    private final Function e;

    public csvi(Class cls, Function function) {
        super(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, cls, false);
        this.e = function;
    }

    @Override // defpackage.ensn
    public final void a(Object obj, ensm ensmVar) {
        Object apply;
        if (obj != null) {
            String str = this.a;
            apply = this.e.apply(obj);
            ensmVar.a(str, apply);
        }
    }
}
