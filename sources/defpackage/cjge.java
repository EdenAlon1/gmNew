package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjge implements eikt {
    public final ffbr a;
    private final ffsk b;

    public cjge(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
    }

    @Override // defpackage.eikt
    public final /* bridge */ /* synthetic */ void a(eyhs eyhsVar, eiks eiksVar) {
        int i;
        ckkn ckknVar = (ckkn) eyhsVar;
        if (((Boolean) ((cfup) ctjd.bx.get()).e()).booleanValue() && !((Optional) this.a.b()).isEmpty() && (i = ckknVar.b) == 14) {
            String str = (i == 14 ? (ckkx) ckknVar.c : ckkx.a).b;
            str.getClass();
            if (str.length() > 0) {
                axol.k(this.b, null, new cjgd(this, str, null), 3);
            }
        }
    }
}
