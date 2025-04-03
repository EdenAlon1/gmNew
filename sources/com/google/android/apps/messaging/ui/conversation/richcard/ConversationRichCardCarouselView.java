package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.cmi;
import defpackage.cmj;
import defpackage.csmj;
import defpackage.czic;
import defpackage.czid;
import defpackage.czoq;
import defpackage.czow;
import defpackage.czox;
import defpackage.czoy;
import defpackage.czpo;
import defpackage.vk;
import defpackage.vx;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationRichCardCarouselView extends czoq implements czid, czow {
    public bcse ac;
    public String ad;
    public List ae;
    public bcsf af;
    public czpo ag;
    private czic ah;
    private boolean ai;

    public ConversationRichCardCarouselView(Context context) {
        super(context);
    }

    private final czoy aR() {
        vk vkVar = this.n;
        if (vkVar == null) {
            vkVar = new czoy(this, this.ah);
            am(vkVar);
        }
        return (czoy) vkVar;
    }

    @Override // defpackage.czkr
    public final void b() {
        vk vkVar = this.n;
        if (vkVar != null) {
            cmi cmiVar = new cmi((cmj) ((czoy) vkVar).a);
            while (cmiVar.hasNext()) {
                ((czox) cmiVar.next()).s.b();
            }
        }
    }

    @Override // defpackage.czid
    public final bcse c() {
        return this.ac;
    }

    @Override // defpackage.czid
    public final void d(bcse bcseVar, String str, boolean z, boolean z2) {
        aR();
        if (this.ac.u().equals(bcseVar.u())) {
            this.ac = bcseVar;
            cmi cmiVar = new cmi((cmj) aR().a);
            while (cmiVar.hasNext()) {
                ((czox) cmiVar.next()).s.l(bcseVar);
            }
            return;
        }
        this.ac = bcseVar;
        this.ai = true;
        this.ad = str;
        this.ae = bcseVar.ad();
        ak(0);
        vk vkVar = this.n;
        vkVar.getClass();
        vkVar.p();
    }

    @Override // defpackage.czid
    public final void e(Object obj) {
        throw new UnsupportedOperationException("ConversationRichCardCarouselView does not support bindPayload().");
    }

    @Override // defpackage.czid
    public final void f(czic czicVar) {
        this.ah = czicVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        ap(new LinearLayoutManager(0));
        this.ac = this.af.a();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_margin);
        int i3 = dimensionPixelOffset + dimensionPixelOffset;
        if (this.ac.p > 0) {
            if (this.ai) {
                Iterator it = this.ae.iterator();
                while (it.hasNext()) {
                    ((GeneralPurposeRichCard) it.next()).layout.desiredHeight = this.ac.p - i3;
                }
                this.ai = false;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.ac.p, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() - i3;
        Iterator it2 = this.ae.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i4 = Math.max(i4, this.ag.a(((GeneralPurposeRichCard) it2.next()).content.media));
        }
        int max = Math.max(measuredHeight, i4);
        int i5 = i3 + max;
        this.ac.p = i5;
        Iterator it3 = this.ae.iterator();
        while (it3.hasNext()) {
            ((GeneralPurposeRichCard) it3.next()).layout.desiredHeight = max;
        }
        this.ai = false;
        if (max > measuredHeight) {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        vx vxVar = this.o;
        vxVar.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) vxVar;
        int L = linearLayoutManager.L();
        int N = linearLayoutManager.N();
        if (L == -1 || N == -1) {
            return;
        }
        while (L <= N) {
            View U = linearLayoutManager.U(L);
            if (U.getMeasuredHeight() != max) {
                U.measure(csmj.d(U), csmj.b(U));
            }
            L++;
        }
    }

    public ConversationRichCardCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
