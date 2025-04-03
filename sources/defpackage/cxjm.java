package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxjm {
    public Optional a;
    private final cxjl b;

    public cxjm(Optional optional, cxjl cxjlVar) {
        this.a = optional;
        this.b = cxjlVar;
    }

    public static cxjm a(Optional optional) {
        return new cxjm(optional, new cxjl() { // from class: cxjk
            @Override // defpackage.cxjl
            public final void a(Optional optional2) {
            }
        });
    }

    public final void b(Optional optional) {
        this.a = optional;
        this.b.a(optional);
    }
}
