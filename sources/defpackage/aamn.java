package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamn {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter");
    public final aigz b;
    public final ahor c;
    public final cuye d;
    public final aawu e;
    public final ahns f;
    public final cvny g;
    public final eisx h;
    public final zel i;
    public final asnh j;
    public final athc k;
    public boolean l;
    public boolean m;
    public final ffji n;
    private final ffsk o;
    private final ffhd p;

    public aamn(aigz aigzVar, ahor ahorVar, cuye cuyeVar, aawu aawuVar, ahns ahnsVar, cvny cvnyVar, ffsk ffskVar, ffhd ffhdVar, eisx eisxVar, zel zelVar, asnh asnhVar, athc athcVar) {
        ffji a2;
        aigzVar.getClass();
        ahorVar.getClass();
        cuyeVar.getClass();
        aawuVar.getClass();
        ahnsVar.getClass();
        cvnyVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        eisxVar.getClass();
        zelVar.getClass();
        this.b = aigzVar;
        this.c = ahorVar;
        this.d = cuyeVar;
        this.e = aawuVar;
        this.f = ahnsVar;
        this.g = cvnyVar;
        this.o = ffskVar;
        this.p = ffhdVar;
        this.h = eisxVar;
        this.i = zelVar;
        this.j = asnhVar;
        this.k = athcVar;
        axol.k(ffskVar, ffhdVar, new aaml(this, null), 2);
        a2 = axqa.a(new aamm(this), 1000L, ffskVar);
        this.n = a2;
    }

    public static final String a(String str) {
        if (str.length() <= 250) {
            return str;
        }
        String substring = str.substring(0, 250);
        substring.getClass();
        return substring;
    }
}
