package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpz implements ybu {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter");
    public final xmw b;
    public final dqlx c;
    public final dsvu d;
    public final xoa e;
    public final ffbr f;
    public final xtd g;
    public final ffbr h;
    public final atmm i;
    public final atmn j;
    public final aufq k;
    public final aklj l;
    public final ydb m;
    public final xmp n;
    private final atcf o;
    private final ffbr p;
    private ybu q;

    public xpz(xmw xmwVar, aklj akljVar, dqlx dqlxVar, ydb ydbVar, dsvu dsvuVar, xoa xoaVar, xmp xmpVar, ffbr ffbrVar, xtd xtdVar, ffbr ffbrVar2, atmm atmmVar, atmn atmnVar, aufq aufqVar, atcf atcfVar, ffbr ffbrVar3) {
        akljVar.getClass();
        dqlxVar.getClass();
        ydbVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = xmwVar;
        this.l = akljVar;
        this.c = dqlxVar;
        this.m = ydbVar;
        this.d = dsvuVar;
        this.e = xoaVar;
        this.n = xmpVar;
        this.f = ffbrVar;
        this.g = xtdVar;
        this.h = ffbrVar2;
        this.i = atmmVar;
        this.j = atmnVar;
        this.k = aufqVar;
        this.o = atcfVar;
        this.p = ffbrVar3;
    }

    @Override // defpackage.ybu
    public final void a() {
        ybu ybuVar = this.q;
        if (ybuVar != null) {
            ybuVar.a();
        }
        b(null);
    }

    public final void b(ybu ybuVar) {
        if (ybuVar != null && this.q != null) {
            ensk i = a.i();
            i.Y(ente.a, "BugleComposeRow2");
            ((enrr) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter", "setProjectionDraftClearedListener", 75, "DirectSendUiAdapter.kt")).q("A projection was already bound to DraftClearedListener");
        }
        this.q = ybuVar;
    }

    public final void c(xhi xhiVar) {
        if (this.o.a()) {
            ((xfv) this.p.b()).e(xhiVar, 2);
        }
    }
}
