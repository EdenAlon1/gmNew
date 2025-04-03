package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbm extends bgg {
    public bdy a;
    public List b;
    public Integer c;
    private Integer d;
    private aua e;

    @Override // defpackage.bgg
    public final bgh a() {
        bdy bdyVar = this.a;
        List list = this.b;
        String str = bdyVar == null ? " surface" : "";
        if (list == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (this.d == null) {
            str = str.concat(" mirrorMode");
        }
        if (this.c == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (this.e == null) {
            str = str.concat(" dynamicRange");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        bdy bdyVar2 = this.a;
        List list2 = this.b;
        int intValue = this.d.intValue();
        this.c.intValue();
        return new bbn(bdyVar2, list2, intValue, this.e);
    }

    @Override // defpackage.bgg
    public final void b(aua auaVar) {
        if (auaVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.e = auaVar;
    }

    @Override // defpackage.bgg
    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
