package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aioi implements aigt {
    private static final entd a = entd.c("Bugle");
    private final Context b;
    private final cpdm c;
    private final ddzb d;

    public aioi(Context context, cpdm cpdmVar, ddzb ddzbVar) {
        ddzbVar.getClass();
        this.b = context;
        this.c = cpdmVar;
        this.d = ddzbVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Intent b = czts.b("android.intent.action.VIEW", ((aioh) aihsVar).a);
        b.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (this.c.a()) {
            b.addFlags(4096);
        }
        ((ensz) a.h()).q("Navigating to calendar");
        this.d.q(this.b, b);
        return ffcu.a;
    }
}
