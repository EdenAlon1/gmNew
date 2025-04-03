package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygv implements ygj {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/info/DraftInfoUiAdapterImpl");
    public final Context b;
    public final drlk c;
    public final yay d;
    private final ffsk e;
    private final fgdj f;

    public ygv(Context context, ffsk ffskVar, drlk drlkVar, yay yayVar, xuw xuwVar, fgcq fgcqVar) {
        context.getClass();
        ffskVar.getClass();
        xuwVar.getClass();
        fgcqVar.getClass();
        this.b = context;
        this.e = ffskVar;
        this.c = drlkVar;
        this.d = yayVar;
        ffxx a2 = ffyy.a(new ygr(new ygo(fgcqVar)));
        ygl yglVar = new ygl(null, xuwVar, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(yglVar, a2);
        int i2 = fgcz.a;
        this.f = fgbn.b(fgenVar, ffskVar, fgcy.b, null);
    }

    @Override // defpackage.ygj
    public final fgdj a() {
        return this.f;
    }
}
