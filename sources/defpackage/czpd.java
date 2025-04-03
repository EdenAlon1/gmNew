package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpd extends czqy {
    public czpd(Context context, cstx cstxVar, adsd adsdVar, ctiy ctiyVar, ctyx ctyxVar, altk altkVar, cqoh cqohVar, ffbr ffbrVar, bbae bbaeVar, fazb fazbVar, czwl czwlVar, elbx elbxVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(context, cstxVar, adsdVar, ctiyVar, ctyxVar, altkVar, cqohVar, ffbrVar, bbaeVar, czwlVar, fazbVar, elbxVar, ffbrVar2, ffbrVar3);
    }

    @Override // defpackage.czqy
    public final int a() {
        return ((Boolean) ((cfup) czpe.a.get()).e()).booleanValue() ? R.dimen.rich_card_conversation_suggestion_button_horizontal_padding : R.dimen.rich_card_conversation_suggestion_horizontal_padding;
    }

    @Override // defpackage.czqy
    protected final int b() {
        return R.id.suggestion_rich_card_button_icon;
    }

    @Override // defpackage.czqy
    protected final int c() {
        return R.id.suggestion_rich_card_button_label;
    }

    @Override // defpackage.czqy
    protected final int d() {
        return ((Boolean) ((cfup) czpe.a.get()).e()).booleanValue() ? R.layout.conversation_suggestion_rich_card_button2 : R.layout.conversation_suggestion_rich_card_button;
    }

    @Override // defpackage.czqy
    public final void e(czwk czwkVar, cztz cztzVar) {
        super.e(czwkVar, cztzVar);
        if (((Boolean) ((cfup) czpe.a.get()).e()).booleanValue()) {
            czwkVar.e().a();
        }
    }

    @Override // defpackage.czqy
    protected final int f(cztz cztzVar) {
        return czwk.h(cztzVar);
    }

    @Override // defpackage.czqy
    protected final int g(cztz cztzVar) {
        return czwk.h(cztzVar);
    }
}
