package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuev implements cueq {
    public static final awya a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final aute h;
    public final eijz i;
    private final ffhd j;

    static {
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxvVar.getClass();
        awyb.c(awxz.USER, awxvVar);
        awyb.b(awxx.HIGH, awxvVar);
        awyb.d(awxvVar);
        a = awyb.a(awxvVar);
    }

    public cuev(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, cslr cslrVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, aute auteVar, eijz eijzVar) {
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cslrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.j = ffhdVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = auteVar;
        this.i = eijzVar;
    }

    @Override // defpackage.cueq
    public final Object a(cuep cuepVar, ResolvedRecipient resolvedRecipient, alxj alxjVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.j), new cueu(null, this, resolvedRecipient, alxjVar, cuepVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }
}
