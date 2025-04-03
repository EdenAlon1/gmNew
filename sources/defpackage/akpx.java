package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.scheduledsend.conversation.ConversationScheduledMessageToggleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpx extends akpv {
    private final ellq a;
    private final bcsf d;
    private engw f;
    private boolean g;
    private boolean h;

    public akpx(ellq ellqVar, bcsf bcsfVar, czic czicVar, cqoh cqohVar) {
        super(czicVar, cqohVar);
        int i = engw.d;
        this.f = enou.a;
        this.g = true;
        this.h = false;
        this.a = ellqVar;
        this.d = bcsfVar;
    }

    @Override // defpackage.akpv
    public final void F() {
        boolean z = this.h;
        this.h = !z;
        if (this.f.isEmpty()) {
            return;
        }
        if (z) {
            x(1, this.f.size());
        } else {
            w(1, this.f.size());
        }
        q(0);
    }

    @Override // defpackage.upz
    /* renamed from: H */
    public final uqe e(ViewGroup viewGroup, int i) {
        return super.e(viewGroup, i == -2 ? R.layout.conversation_scheduled_message_toggle : R.layout.conversation_message_view);
    }

    @Override // defpackage.akpv
    public final void I(engw engwVar) {
        boolean isEmpty = this.f.isEmpty();
        boolean isEmpty2 = engwVar.isEmpty();
        int size = engwVar.size() - this.f.size();
        this.f = engwVar;
        if (this.g) {
            this.g = false;
            this.h = false;
            if (engwVar.isEmpty()) {
                return;
            }
            s(0);
            return;
        }
        if (size > 0) {
            if (!this.h) {
                size = engwVar.size();
            }
            this.h = true;
            w(!isEmpty ? 1 : 0, size + (isEmpty ? 1 : 0));
        } else if (size < 0) {
            x(!isEmpty2 ? 1 : 0, Math.abs(size) + (isEmpty2 ? 1 : 0));
        }
        if (engwVar.isEmpty()) {
            return;
        }
        u(0, a());
    }

    @Override // defpackage.akpv
    public final int[] J() {
        return new int[]{-2, -1};
    }

    @Override // defpackage.vk
    public final int a() {
        if (this.f.isEmpty()) {
            return 0;
        }
        if (this.h) {
            return this.f.size() + 1;
        }
        return 1;
    }

    @Override // defpackage.upz, defpackage.vk
    public final int dE(int i) {
        return i == 0 ? -2 : -1;
    }

    @Override // defpackage.upz, defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return e(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [fazb, java.lang.Object] */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        int i2;
        View view = ((uqe) wrVar).s;
        if (view instanceof ConversationScheduledMessageToggleView) {
            ConversationScheduledMessageToggleView conversationScheduledMessageToggleView = (ConversationScheduledMessageToggleView) view;
            boolean z = this.h;
            int size = this.f.size();
            conversationScheduledMessageToggleView.c = z;
            if (z) {
                conversationScheduledMessageToggleView.b.setVisibility(8);
                i2 = R.drawable.quantum_gm_ic_arrow_drop_down_vd_theme_24;
            } else {
                conversationScheduledMessageToggleView.b.setVisibility(0);
                i2 = R.drawable.quantum_gm_ic_arrow_drop_up_vd_theme_24;
            }
            Drawable drawable = conversationScheduledMessageToggleView.getContext().getDrawable(i2);
            drawable.getClass();
            drawable.setTint(ehdr.b(conversationScheduledMessageToggleView, R.attr.colorPrimaryBrandNonIcon));
            conversationScheduledMessageToggleView.a.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            conversationScheduledMessageToggleView.a.setText(conversationScheduledMessageToggleView.getContext().getResources().getQuantityString(R.plurals.scheduled_message_toggle, size, Integer.valueOf(size)));
            this.a.b(conversationScheduledMessageToggleView, new akqb());
            return;
        }
        if (view instanceof czid) {
            coiy coiyVar = (coiy) this.f.get(i - 1);
            bcsf bcsfVar = this.d;
            crji crjiVar = (crji) bcsfVar.a.b();
            crjiVar.getClass();
            bcwz bcwzVar = (bcwz) bcsfVar.b.b();
            bcwzVar.getClass();
            bdjs bdjsVar = (bdjs) bcsfVar.c.b();
            bdjsVar.getClass();
            bzqa bzqaVar = (bzqa) bcsfVar.d.b();
            bzqaVar.getClass();
            caao caaoVar = (caao) bcsfVar.e.b();
            caaoVar.getClass();
            aolr aolrVar = (aolr) bcsfVar.f.b();
            aolrVar.getClass();
            ?? b = bcsfVar.g.b();
            b.getClass();
            cbwg cbwgVar = (cbwg) bcsfVar.j.b();
            cbwgVar.getClass();
            cbvv cbvvVar = (cbvv) bcsfVar.k.b();
            cbvvVar.getClass();
            ?? b2 = bcsfVar.l.b();
            b2.getClass();
            coiyVar.getClass();
            ((auod) bcsfVar.m.b()).getClass();
            ((ConversationMessageView) view).d(new bcse(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, (fazb) b, bcsfVar.h, bcsfVar.i, cbwgVar, cbvvVar, (fazb) b2, coiyVar), null, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final long hb(int i) {
        if (i == 0) {
            return -1L;
        }
        return ((coiy) this.f.get(i - 1)).b().D().a;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        return i == 0 ? R.layout.conversation_scheduled_message_toggle : R.layout.conversation_message_view;
    }
}
