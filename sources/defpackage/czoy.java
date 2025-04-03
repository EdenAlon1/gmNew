package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardCarouselView;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czoy extends vk {
    public final Set a = new cmj();
    private final czic d;
    private final czow e;

    public czoy(czow czowVar, czic czicVar) {
        this.e = czowVar;
        this.d = czicVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return ((ConversationRichCardCarouselView) this.e).ae.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        ConversationRichCardView conversationRichCardView = (ConversationRichCardView) LayoutInflater.from(viewGroup.getContext()).inflate(true != ((Boolean) ((cfup) czpe.a.get()).e()).booleanValue() ? R.layout.conversation_rich_card_view : R.layout.conversation_rich_card_view2, viewGroup, false);
        conversationRichCardView.m = this.d;
        conversationRichCardView.j = true;
        conversationRichCardView.l.e = true;
        return new czox(conversationRichCardView);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        czox czoxVar = (czox) wrVar;
        this.a.add(czoxVar);
        ConversationRichCardView conversationRichCardView = czoxVar.s;
        ConversationRichCardCarouselView conversationRichCardCarouselView = (ConversationRichCardCarouselView) this.e;
        bcse bcseVar = conversationRichCardCarouselView.ac;
        GeneralPurposeRichCard generalPurposeRichCard = (GeneralPurposeRichCard) conversationRichCardCarouselView.ae.get(i);
        String str = ((ConversationRichCardCarouselView) this.e).ad;
        conversationRichCardView.g = bcseVar;
        conversationRichCardView.h = generalPurposeRichCard;
        conversationRichCardView.i = i;
        conversationRichCardView.k(str);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        czox czoxVar = (czox) wrVar;
        czoxVar.s.b();
        this.a.remove(czoxVar);
    }
}
