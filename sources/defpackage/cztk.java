package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cztk {
    private final ffbr a;
    private final ffbr b;
    public final wgi n;
    public final ffbr o;

    public cztk(wgi wgiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.n = wgiVar;
        this.a = ffbrVar;
        this.o = ffbrVar2;
        this.b = ffbrVar3;
    }

    public final void b(SuggestionData suggestionData) {
        this.n.c(suggestionData);
    }

    public final void c() {
        if (((ctud) this.a.b()).j()) {
            this.n.d();
        } else {
            ((ctuk) this.b.b()).f(new cztj(this));
        }
    }
}
