package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaal implements erqj {
    final /* synthetic */ dzqs a;
    final /* synthetic */ eaar b;

    public eaal(eaar eaarVar, dzqs dzqsVar) {
        this.a = dzqsVar;
        this.b = eaarVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eaar eaarVar = this.b;
        eaarVar.k.a(eaarVar.d, this.a);
        this.b.g.post(new Runnable() { // from class: eaak
            @Override // java.lang.Runnable
            public final void run() {
                dyhe.a(eaal.this.b.a.getContext(), R.string.message_sent_text);
            }
        });
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dyhr.c("ConvPresenter", "error send in conv: " + this.a.f().toString() + ", error: " + th.getMessage());
        eaar eaarVar = this.b;
        eaarVar.k.a(eaarVar.d, this.a);
        this.b.g.post(new Runnable() { // from class: eaaj
            @Override // java.lang.Runnable
            public final void run() {
                dyhe.a(eaal.this.b.a.getContext(), R.string.message_send_failure_text);
            }
        });
    }
}
