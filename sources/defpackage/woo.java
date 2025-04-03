package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class woo implements ffji {
    final /* synthetic */ wor a;

    public woo(wor worVar) {
        this.a = worVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IOException iOException = (IOException) obj;
        ((enrr) ((enrr) this.a.g.j()).g(iOException).h("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/MagicComposeSentencePieceTokenizerImpl$tokenizer$1$1$2", "invoke", 71, "MagicComposeSentencePieceTokenizerImpl.kt")).q("Could not parse input stream");
        throw iOException;
    }
}
