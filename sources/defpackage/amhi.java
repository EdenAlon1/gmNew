package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amhi implements ampp {
    final /* synthetic */ ckkz a;

    public amhi(ckkz ckkzVar) {
        this.a = ckkzVar;
    }

    @Override // defpackage.ampp
    public final Instant a() {
        eyja eyjaVar = this.a.d;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        return eykj.d(eyjaVar);
    }

    @Override // defpackage.ampp
    public final Integer b() {
        ckkz ckkzVar = this.a;
        if ((ckkzVar.b & 1) != 0) {
            return Integer.valueOf(ckkzVar.c);
        }
        return null;
    }
}
