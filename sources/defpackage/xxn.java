package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxn implements ffji {
    final /* synthetic */ axpl a;
    final /* synthetic */ xyd b;

    public xxn(axpl axplVar, xyd xydVar) {
        this.a = axplVar;
        this.b = xydVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        this.a.a(new xxj(ajiyVar));
        xyd xydVar = this.b;
        return new dmve(xyd.n(xydVar, R.string.missing_encryption_notice_text), null, null, null, false, false, new doas(xyd.n(xydVar, R.string.send_anyway_button_text), new xxk(this.a)), new doas(xyd.n(this.b, R.string.cancel_send_button_text), new xxl(this.a)), new xxm(this.a), 62);
    }
}
