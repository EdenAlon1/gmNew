package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvno {
    public static final /* synthetic */ int i = 0;
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final cvnr g;
    public iv h;
    private final ffsk j;

    static {
        new ejtz("SAFE_URL_DIALOG_FRAGMENT_DATA_SOURCE_KEY");
    }

    public cvno(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffsk ffskVar, ffbr ffbrVar7, cvnr cvnrVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        ffbrVar7.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.j = ffskVar;
        this.f = ffbrVar7;
        this.g = cvnrVar;
    }

    public final DialogInterface.OnClickListener a() {
        return new elbb((elbx) this.b.b(), "SafeUrlDialogFragmentPeer#dismissClickListener", new DialogInterface.OnClickListener() { // from class: cvnl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = cvno.i;
                dialogInterface.dismiss();
            }
        });
    }

    public final void b(boolean z) {
        axol.k(this.j, null, new cvnn(this, z, null), 3);
    }
}
