package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdti implements aoar {
    private final appw a;
    private final eooi b = eooi.RBM_SUGGESTION_REPLY;
    private final aoav c = aoav.a;

    public bdti(final String str) {
        this.a = new appw() { // from class: bdth
            @Override // defpackage.appw
            public final /* synthetic */ engw a() {
                int i = engw.d;
                return enou.a;
            }

            @Override // defpackage.appw, defpackage.appj
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.appw
            public final String c() {
                return str;
            }
        };
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.c;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.a;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.b;
    }
}
