package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxu implements ffji {
    final /* synthetic */ axpl a;
    final /* synthetic */ xyd b;

    public xxu(axpl axplVar, xyd xydVar) {
        this.a = axplVar;
        this.b = xydVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.a(new xxq(ajiyVar));
        xyd xydVar = this.b;
        return new dmve(xyd.n(xydVar, R.string.message_might_not_be_delivered_notice_text), null, null, xyd.n(xydVar, R.string.attachment_limit_reached_notice_title), false, false, new doas(xyd.n(xydVar, android.R.string.ok), new xxr(this.a)), new doas(xyd.n(this.b, R.string.send_anyway_button_text), new xxs(this.a)), new xxt(this.a), 54);
    }
}
