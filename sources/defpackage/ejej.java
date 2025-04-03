package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejej {
    public final ekqm a;
    public final errl b;

    public ejej(ekqm ekqmVar, errl errlVar) {
        this.a = ekqmVar;
        this.b = errlVar;
    }

    public final Uri a() {
        this.a.a().getParentFile().mkdirs();
        ekqm ekqmVar = this.a;
        return ekqmVar.b.c(ekqmVar.a, ekqmVar.c);
    }
}
