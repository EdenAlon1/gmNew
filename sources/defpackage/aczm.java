package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aczm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aczo b;
    final /* synthetic */ Recipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczm(aczo aczoVar, Recipient recipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aczoVar;
        this.c = recipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        alxl alxlVar = (alxl) this.b.a.b();
        Recipient recipient = this.c;
        engw r = engw.r(recipient);
        String x = recipient.x(false);
        if (aswb.a()) {
            x = cuxh.a(x);
        }
        elfl k = alxlVar.k(r, x);
        k.getClass();
        this.a = 1;
        Object c = fgfz.c(k, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aczm(this.b, this.c, ffguVar);
    }
}
