package defpackage;

import com.google.android.apps.messaging.messagedetails.viewmodel.MessageDetailsViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahss {
    public final ahsi a;
    public final ffbr b;
    public final ffbr c;
    private final ffbz d;

    public ahss(ahsi ahsiVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ahsiVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        ffbz b = ffca.b(3, new ahso(new ahsn(ahsiVar)));
        int i = fflc.a;
        this.d = new lmn(new ffkb(MessageDetailsViewModel.class), new ahsp(b), new ahsr(ahsiVar, b), new ahsq(b));
    }

    public final MessageDetailsViewModel a() {
        return (MessageDetailsViewModel) this.d.a();
    }
}
