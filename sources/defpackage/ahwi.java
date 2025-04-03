package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwi implements ahwb {
    public final avag a;
    public final avaf b;
    public final aval c;
    private final ffsk d;
    private final atbr e;
    private final atby f;
    private final dmmp g;
    private final dmms h;
    private final dmpj i;
    private final fgdj j;

    public ahwi(ffsk ffskVar, ahyl ahylVar, ahwj ahwjVar, ahxr ahxrVar, atbn atbnVar, atbr atbrVar, avag avagVar, xez xezVar, avaf avafVar, aval avalVar, atby atbyVar) {
        ffskVar.getClass();
        ahylVar.getClass();
        ahwjVar.getClass();
        ahxrVar.getClass();
        avafVar.getClass();
        avalVar.getClass();
        this.d = ffskVar;
        this.e = atbrVar;
        this.a = avagVar;
        this.b = avafVar;
        this.c = avalVar;
        this.f = atbyVar;
        dmmp dmmpVar = new dmmp(new dsjn((dqnl) null, (dqlt) null, 7), (CharSequence) "", "", (Integer) null, false, new dmmo(atbnVar.a(), atbrVar.a(), atbyVar.a()), 56);
        this.g = dmmpVar;
        dmms dmmsVar = new dmms(dmmpVar, new dmmk(ffel.a, new ffji() { // from class: ahwc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return ffcu.a;
            }
        }, new ffji() { // from class: ahwd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return ffcu.a;
            }
        }), new dmof(dmzz.dm, new ffix() { // from class: ahwe
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, (ffix) null, (String) null, false, new dmoe(1), 60), new dmmr(avagVar.a()));
        this.h = dmmsVar;
        dmpj dmpjVar = new dmpj(dmmsVar, new dmov(ffel.a, null, new ffji() { // from class: ahwf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((dmog) obj).getClass();
                return ffcu.a;
            }
        }), null, null, 0.0f, false, new dmpi(xezVar.a(), false, avafVar.a(), avalVar.a(), 78), 56);
        this.i = dmpjVar;
        ffxx a = fgck.a(ahylVar.a(), ahwjVar.a(), ahxrVar.a(), new ahwh(this, xezVar, null));
        int i = fgcz.a;
        this.j = fgbn.b(a, ffskVar, fgcy.b, dmpjVar);
    }

    @Override // defpackage.ahwb
    public final fgdj a() {
        return this.j;
    }
}
