package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymi {
    public static final entd a = entd.c("BugleConnectivity");
    public final ejvb b;
    public final errl c;
    public final csjk d;
    public final lkk e;
    public csmx f;
    public bcvm g;
    public bcpw h;
    public int i = -1;
    public int j = -1;
    public final badt k;
    public cyme l;
    private final ejvp m;

    public cymi(ejvb ejvbVar, errl errlVar, csjk csjkVar, ejvp ejvpVar, badt badtVar, lkk lkkVar) {
        this.b = ejvbVar;
        this.c = errlVar;
        this.d = csjkVar;
        this.m = ejvpVar;
        this.k = badtVar;
        this.e = lkkVar;
    }

    public final void a() {
        this.m.a(elfo.e(null), "CONVERSATION_BOTTOM_BAR_DATA_SERVICE_KEY");
    }

    public final void b(int i) {
        csmz csmzVar = (csmz) this.d.a();
        csmx csmxVar = this.f;
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.SPECIFIED_SUBSCRIPTION;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmsVar.copyOnWrite();
        csmv csmvVar2 = (csmv) csmsVar.instance;
        csmvVar2.b |= 2;
        csmvVar2.d = i;
        csmzVar.m(csmxVar, (csmv) csmsVar.build());
    }

    public final void c(int i) {
        csmz csmzVar = (csmz) this.d.a();
        csmx csmxVar = this.f;
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.SPECIFIED_SUBSCRIPTION;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmsVar.copyOnWrite();
        csmv csmvVar2 = (csmv) csmsVar.instance;
        csmvVar2.b |= 2;
        csmvVar2.d = i;
        csmzVar.n(csmxVar, (csmv) csmsVar.build());
    }
}
