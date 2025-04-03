package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgf {
    public final ffbr a;
    public final dkur b;
    public final eehr d;
    public int e;
    public int f;
    public String g;
    public dklq j;
    public int i = 3;
    public final eein h = new dkge(this);
    public final String c = "presence";

    public dkgf(dkgm dkgmVar, ffbr ffbrVar, String str, dkur dkurVar) {
        this.a = ffbrVar;
        this.b = dkurVar;
        djjr djjrVar = dkgmVar.a;
        eehy eehyVar = ((eehz) ffbrVar).a;
        if (eehyVar.v()) {
            throw new eejg("No sip stack. Can't generate dialog path");
        }
        if (Objects.isNull(str)) {
            throw new eejg("Uri is null. Can't generate dialog path");
        }
        String w = eehy.w();
        ArrayList q = eehyVar.q();
        String e = djjrVar.e();
        if (Objects.isNull(e)) {
            throw new eejg("No public identity in ImsConfiguration.");
        }
        this.d = new eehr(w, 0, str, e, str, q);
    }

    public final void a() {
        this.g = null;
        this.e = 0;
        this.i = 3;
    }
}
