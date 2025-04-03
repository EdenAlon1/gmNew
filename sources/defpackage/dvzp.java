package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzp extends dvxo {
    public final dvwa a;
    private final dvwi b;

    public dvzp(dvwi dvwiVar, dvwa dvwaVar) {
        this.b = dvwiVar;
        this.a = dvwaVar;
    }

    @Override // defpackage.dvxo
    public final void a(final dvxn dvxnVar) {
        this.b.c(new dvwh() { // from class: dvzo
            @Override // defpackage.dvwh
            public final List a() {
                dvxn dvxnVar2 = dvxnVar;
                dvxr dvxrVar = dvxnVar2.a;
                return engw.r(new dwaa(dvvx.a(), engw.r(dvxrVar), dvxnVar2.b, dvzp.this.a.a(), true));
            }
        });
    }
}
