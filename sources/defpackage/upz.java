package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class upz extends vk {
    private final View.OnClickListener a;
    private final View.OnLongClickListener d;
    protected final czic e;
    private final cqoh f;

    protected upz(czic czicVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, cqoh cqohVar) {
        this.e = czicVar;
        this.a = onClickListener;
        this.d = onLongClickListener;
        this.f = cqohVar;
    }

    public final uqe G(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        long j;
        if (i == R.layout.conversation_message_view) {
            j = this.f.a();
            i = R.layout.conversation_message_view;
        } else {
            j = 0;
        }
        czkr czkrVar = (czkr) layoutInflater.inflate(i, viewGroup, false);
        if (i == R.layout.conversation_message_view) {
            csjy.d("Bugle", "ConversationMessageView inflate: %d millis", Long.valueOf(this.f.a() - j));
        }
        if (czkrVar instanceof czid) {
            ((czid) czkrVar).f(this.e);
        }
        View.OnClickListener onClickListener = this.a;
        View.OnLongClickListener onLongClickListener = this.d;
        if (i == R.layout.conversation_rich_card_view || i == R.layout.conversation_rich_card_view2 || i == R.layout.conversation_rich_card_carousel_view) {
            onClickListener = null;
            onLongClickListener = null;
        }
        return new uqe(czkrVar.a(), onClickListener, onLongClickListener);
    }

    @Override // defpackage.vk
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public uqe e(ViewGroup viewGroup, int i) {
        return G(viewGroup, i, LayoutInflater.from(viewGroup.getContext()));
    }

    @Override // defpackage.vk
    public int dE(int i) {
        return m(i);
    }

    @Override // defpackage.vk
    public final /* synthetic */ void k(wr wrVar) {
        ((czkr) ((uqe) wrVar).s).b();
    }

    protected abstract int m(int i);

    protected upz(czic czicVar, cqoh cqohVar) {
        this(czicVar, null, null, cqohVar);
    }
}
