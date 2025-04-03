package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crll {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic");
    public final ctyx b;
    public final errl c;
    public final cort d;
    public final cguo e;
    public final cgud f;
    public final errl g;
    public final errl h;
    private final crln i;
    private final cuah j;

    public crll(ctyx ctyxVar, crln crlnVar, cuah cuahVar, errl errlVar, cort cortVar, cguo cguoVar, cgud cgudVar, errl errlVar2, errl errlVar3) {
        this.b = ctyxVar;
        this.i = crlnVar;
        this.j = cuahVar;
        this.c = errlVar;
        this.d = cortVar;
        this.e = cguoVar;
        this.f = cgudVar;
        this.g = errlVar2;
        this.h = errlVar3;
    }

    public static boolean c() {
        return ((Boolean) cful.ag.e()).booleanValue();
    }

    public final boolean a() {
        return this.i.f();
    }

    @Deprecated
    public final boolean b() {
        cuah cuahVar = this.j;
        if (!((ctyx) cuahVar.b.b()).q("fast_track_prompt_dismissed", false)) {
            return cuahVar.a();
        }
        csjb a2 = cuah.a.a();
        a2.I("Don't show Google ToS popup because it's dismissed");
        a2.r();
        return false;
    }

    public final boolean d() {
        return this.b.q("should_show_google_tos_prompt", false);
    }
}
