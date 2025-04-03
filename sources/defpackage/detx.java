package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detx implements detu {
    private final dfmn a;
    private final dett b;

    public detx(Context context, String str, dett dettVar) {
        int i = dfmn.n;
        dfmk dfmkVar = new dfmk(context, str);
        dfmkVar.a(dfmi.b);
        dfmn dfmnVar = new dfmn(dfmkVar.a, dfmkVar.b, dfmkVar.g, dfmkVar.e, dfmkVar.f, dfmkVar.c, dfmkVar.d, dfmkVar.h);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.a = dfmnVar;
            this.b = dettVar;
        }
    }

    @Override // defpackage.detu
    public final void a(detr detrVar) {
        dfmm dfmmVar = new dfmm(this.a, eyee.x((byte[]) this.b.a(((deto) detrVar).a)));
        dfmmVar.l = faxs.b(0);
        if (dfmmVar.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        dfmmVar.c = true;
        ((dfmn) dfmmVar.a).h.b(dfmmVar).s(new dhqs() { // from class: detw
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                dhreVar.h();
            }
        });
    }
}
