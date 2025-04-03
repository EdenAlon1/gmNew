package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqm extends czqy {
    public static final cskc a = cskc.g("Bugle", "ChipListConversationSuggestionsController");
    public MessageIdType b;
    public final Set c;
    public final Object d;
    public final cqoh e;
    public final ffbr f;
    public final altk g;
    public final dede h;
    public final ffbr i;
    public final bbae j;
    private final elbx s;

    public czqm(Context context, cstx cstxVar, adsd adsdVar, ctiy ctiyVar, ffbr ffbrVar, ctyx ctyxVar, altk altkVar, cqoh cqohVar, ffbr ffbrVar2, bbae bbaeVar, czwl czwlVar, dede dedeVar, fazb fazbVar, elbx elbxVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        super(context, cstxVar, adsdVar, ctiyVar, ctyxVar, altkVar, cqohVar, ffbrVar2, bbaeVar, czwlVar, fazbVar, elbxVar, ffbrVar3, ffbrVar4);
        this.b = bdhb.a;
        this.c = new HashSet();
        this.d = new Object();
        this.f = ffbrVar;
        this.e = cqohVar;
        this.i = ffbrVar2;
        this.g = altkVar;
        this.j = bbaeVar;
        this.h = dedeVar;
        this.s = elbxVar;
    }

    public static Boolean h(View view) {
        View r = r(view);
        if (r == null) {
            return null;
        }
        boolean z = true;
        if (!r.canScrollHorizontally(-1) && !r.canScrollHorizontally(1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean i(View view) {
        View r = r(view);
        if (r != null) {
            return Boolean.valueOf(r.canScrollHorizontally(-1));
        }
        return null;
    }

    private static View r(View view) {
        if (view.getId() == R.id.suggestion_list_scroll_view) {
            return view;
        }
        View view2 = (View) view.getParent();
        if (view2 == null) {
            return null;
        }
        return r(view2);
    }

    @Override // defpackage.czqy
    public final int a() {
        return R.dimen.conversation_suggestion_bubble_container_horizontal_padding;
    }

    @Override // defpackage.czqy
    protected final int b() {
        return R.id.suggestion_button_icon;
    }

    @Override // defpackage.czqy
    protected final int c() {
        return R.id.suggestion_button_label;
    }

    @Override // defpackage.czqy
    protected final int d() {
        return R.layout.conversation_suggestion_button;
    }

    @Override // defpackage.czqy
    protected final void e(czwk czwkVar, cztz cztzVar) {
        super.e(czwkVar, cztzVar);
        czwkVar.e().a();
    }

    @Override // defpackage.czqy
    protected final int f(cztz cztzVar) {
        return ehdr.d(this.m, R.attr.colorPrimaryBrandIcon, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.czqy
    protected final int g(cztz cztzVar) {
        return ehdr.d(this.m, R.attr.colorOnSurfaceVariant, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.czqy
    protected final void j(SuggestionData suggestionData, cztz cztzVar, View view) {
        SuggestionData suggestionData2;
        if (cztzVar.e()) {
            if (!((Boolean) ((cfup) ctjd.ag.get()).e()).booleanValue()) {
                super.n(suggestionData, cztzVar);
                return;
            }
            boolean z = suggestionData instanceof RbmSuggestionData;
            if (!z) {
                o();
            }
            if (!suggestionData.f()) {
                this.j.a(cztzVar.b(), this.e.f().toEpochMilli()).t();
                this.g.ai(z);
                if (z) {
                    this.g.aj();
                    this.g.ak();
                }
            } else if (z) {
                String g = ((RbmSuggestionData) suggestionData).g();
                synchronized (this.d) {
                    if (this.c.contains(g)) {
                        return;
                    } else {
                        this.c.add(g);
                    }
                }
            } else if (!this.b.c() && this.b.equals(suggestionData.x())) {
                return;
            } else {
                this.b = suggestionData.x();
            }
            if (z) {
                suggestionData2 = suggestionData;
            } else {
                ((ctqh) this.i.b()).p(suggestionData, fbrd.CLICKED);
                suggestionData2 = suggestionData;
                axnw.h(((ctjh) this.f.b()).f(suggestionData2, eoqz.P2P_SUGGESTION_CLICK, fbqp.CONVERSATION_VIEW, this.h.b, 0.0f, h(view), i(view)));
            }
            cztzVar.c(suggestionData2);
        }
    }

    @Override // defpackage.czqy
    protected final void k(View view, final SuggestionData suggestionData, final cztz cztzVar) {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(-1.0f));
        final boolean z = suggestionData instanceof RbmSuggestionData;
        if (!z) {
            AtomicReference atomicReference2 = new AtomicReference();
            atomicReference2.set(new GestureDetector(this.m, new czqk(this, suggestionData, atomicReference, view)));
            view.setOnTouchListener(new czql(this, atomicReference2, atomicReference));
        }
        view.setOnClickListener(new elay(this.s, "ChipListConversationSuggestionsController#setOnClickListener.onClick", new View.OnClickListener() { // from class: czqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cztz cztzVar2 = cztzVar;
                if (cztzVar2 == null) {
                    return;
                }
                boolean z2 = z;
                czqm czqmVar = czqm.this;
                if (!z2) {
                    czqmVar.o();
                }
                SuggestionData suggestionData2 = suggestionData;
                if (!suggestionData2.f()) {
                    czqmVar.j.a(cztzVar2.b(), czqmVar.e.f().toEpochMilli()).t();
                    czqmVar.g.ai(z2);
                    if (z2) {
                        czqmVar.g.aj();
                        czqmVar.g.ak();
                    }
                } else if (z2) {
                    String g = ((RbmSuggestionData) suggestionData2).g();
                    synchronized (czqmVar.d) {
                        if (czqmVar.c.contains(g)) {
                            return;
                        } else {
                            czqmVar.c.add(g);
                        }
                    }
                } else if (!czqmVar.b.c() && czqmVar.b.equals(suggestionData2.x())) {
                    return;
                } else {
                    czqmVar.b = suggestionData2.x();
                }
                if (!z2) {
                    AtomicReference atomicReference3 = atomicReference;
                    ((ctqh) czqmVar.i.b()).p(suggestionData2, fbrd.CLICKED);
                    axnw.h(((ctjh) czqmVar.f.b()).f(suggestionData2, eoqz.P2P_SUGGESTION_CLICK, fbqp.CONVERSATION_VIEW, czqmVar.h.b, ((Float) atomicReference3.get()).floatValue(), czqm.h(view2), czqm.i(view2)));
                }
                cztzVar2.c(suggestionData2);
            }
        }));
    }
}
