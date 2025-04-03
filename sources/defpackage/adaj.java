package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaj {
    public static final entd a = entd.c("BugleReactions");
    public final ffhd b;
    public final dtuu c;
    public final cqoh d;

    public adaj(ffhd ffhdVar, dtuu dtuuVar, cqoh cqohVar) {
        ffhdVar.getClass();
        dtuuVar.getClass();
        cqohVar.getClass();
        this.b = ffhdVar;
        this.c = dtuuVar;
        this.d = cqohVar;
    }

    public static final Uri a(draj drajVar) {
        droo drooVar = drajVar.g;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        doyi doyiVar = drooVar.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        return Uri.parse(doyiVar.f);
    }
}
