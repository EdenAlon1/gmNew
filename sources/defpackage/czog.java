package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czog implements ekob {
    public final Context a;
    public final ffsk b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;

    public czog(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    public static final String a(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("bot-id");
    }

    @Override // defpackage.ekob
    public final eknz b(ekoa ekoaVar) {
        return new czof(ekoaVar, this);
    }
}
