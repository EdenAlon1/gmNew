package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abmj extends ffkh implements ffji {
    public abmj(Object obj) {
        super(1, obj, abmk.class, "onHeightComputed", "onHeightComputed(I)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        zqv zqvVar = ((abmk) this.g).e;
        if (!zqvVar.c.contains("top_content_inset")) {
            zqvVar.a.put("top_content_inset", Integer.valueOf(ffmk.f(intValue, 0)));
            fgcm fgcmVar = zqvVar.d;
            Collection values = zqvVar.a.values();
            values.getClass();
            fgcmVar.f(Integer.valueOf(ffdx.E(values)));
        }
        return ffcu.a;
    }
}
