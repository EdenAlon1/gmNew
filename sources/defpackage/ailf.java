package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailf implements aigt {
    private static final entd a = entd.c("BugleLinkify");
    private final Context b;
    private final cpdm c;
    private final ddzb d;

    public ailf(Context context, cpdm cpdmVar, ddzb ddzbVar) {
        ddzbVar.getClass();
        this.b = context;
        this.c = cpdmVar;
        this.d = ddzbVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aile aileVar = (aile) aihsVar;
        Intent intent = new Intent("android.intent.action.VIEW", aileVar.a);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (this.c.a()) {
            intent.addFlags(4096);
        }
        intent.putExtra("com.android.browser.application_id", this.b.getPackageName());
        ((ensz) a.h()).t("Navigating to uri: %s", cskt.d(aileVar.a));
        this.d.q(this.b, intent);
        return ffcu.a;
    }
}
