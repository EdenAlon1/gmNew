package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjve {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cjve(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    public final cjvd a(ResolvedRecipient resolvedRecipient, cjwc cjwcVar) {
        cjvl cjvlVar = (cjvl) this.b.b();
        cjvlVar.getClass();
        resolvedRecipient.getClass();
        return new cjvd(this.a, cjvlVar, this.c, resolvedRecipient, cjwcVar);
    }
}
