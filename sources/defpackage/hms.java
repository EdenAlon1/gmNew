package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hms extends ffkk implements ffix {
    final /* synthetic */ hen a;
    final /* synthetic */ hjv b;
    final /* synthetic */ hmr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hms(hen henVar, hjv hjvVar, hmr hmrVar) {
        super(0);
        this.a = henVar;
        this.b = hjvVar;
        this.c = hmrVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        List d;
        hen henVar = this.a;
        if (henVar != null) {
            hjv hjvVar = this.b;
            hjvVar.y(hjvVar.a(henVar) - hjvVar.q);
        }
        d = htu.d(r0, this.b.q, null);
        htv htvVar = (htv) ffdx.Q(d);
        Integer num = htvVar != null ? htvVar.b : null;
        List a = this.c.a();
        if (num != null && !a.isEmpty()) {
            a = ffdx.ad(ffdx.b(new htv(((htv) ffdx.K(a)).a, num)), ffdx.Y(a, 1));
        }
        return ffdx.ad(d, a);
    }
}
