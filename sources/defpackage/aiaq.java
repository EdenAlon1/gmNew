package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiaq implements aiap {
    private final tty a;
    private final ahva b;
    private final ffbr c;

    public aiaq(tty ttyVar, ahva ahvaVar, ffbr ffbrVar) {
        ahvaVar.getClass();
        ffbrVar.getClass();
        this.a = ttyVar;
        this.b = ahvaVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.aiap
    public final aiar a(cvvc cvvcVar, ahut ahutVar) {
        dnym b;
        cvvcVar.getClass();
        ahutVar.getClass();
        amar amarVar = cvvcVar.a;
        String d = amarVar.d();
        engw b2 = amarVar.b();
        String l = amarVar.c().toString();
        String a = this.a.a(b2);
        tud tudVar = (tud) this.c.b();
        final amar amarVar2 = cvvcVar.a;
        b = tudVar.b(amarVar2, false);
        int i = ((enou) b2).c;
        boolean d2 = ahutVar.d(amarVar2);
        int length = i > 1 ? ffpc.X(a).length() : a.length();
        final int i2 = cvvcVar.b;
        List b3 = ffdx.b(new dnep(2, 2, 0, length));
        final ahva ahvaVar = this.b;
        return new aiar(l, new dngv(b, d, a, d2, b3, new ffix() { // from class: ahuz
            @Override // defpackage.ffix
            public final Object invoke() {
                amar amarVar3 = amarVar2;
                int i3 = i2;
                ahva ahvaVar2 = ahva.this;
                ekzm b4 = ahvaVar2.b.b("MultiShare#onAllContactClick");
                try {
                    if (((enou) amarVar3.b()).c < 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    aifv.d((aifv) ahvaVar2.d.b(), 5, i3, 0, 4);
                    if (((enou) amarVar3.b()).c > 1) {
                        ahvaVar2.c.b(amarVar3);
                    } else {
                        ahvaVar2.a.c(ahus.b(amarVar3, ((ambh) ffdx.K(amarVar3.b())).a));
                    }
                    ffig.a(b4, null);
                    return ffcu.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(b4, th);
                        throw th2;
                    }
                }
            }
        }, new dngq((byte[]) null)), cvvcVar.a.e());
    }
}
