package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyj extends abo {
    final /* synthetic */ abyk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyj(abyk abykVar) {
        super(true);
        this.a = abykVar;
    }

    @Override // defpackage.abo
    public final void b() {
        this.a.e = 2;
        h(false);
        ((DataDonationActivity) this.a.a.b()).gE().d();
    }
}
