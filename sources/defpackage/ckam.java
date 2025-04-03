package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckam {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public ckam(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final int a(awui awuiVar) {
        awuiVar.getClass();
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        ksw.a(b == awuh.PHONE);
        awuiVar.d.getClass();
        ksw.a(!ffpc.J(r0));
        djsi djsiVar = (djsi) this.a.b();
        djrk djrkVar = (djrk) this.b.b();
        String str = awuiVar.d;
        str.getClass();
        Object orElseThrow = djsiVar.i(djrkVar.a(str)).orElseThrow(new Supplier() { // from class: ckak
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ckal();
            }
        });
        orElseThrow.getClass();
        return ((djrq) orElseThrow).a;
    }

    public final aztg b(awui awuiVar) {
        awuiVar.getClass();
        ffbr ffbrVar = this.c;
        aztg g = ((bdtd) ffbrVar.b()).g(a(awuiVar));
        g.getClass();
        return g;
    }

    public final aztg c(awui awuiVar) {
        awuiVar.getClass();
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        ksw.a(b == awuh.PHONE);
        awuiVar.d.getClass();
        ksw.a(!ffpc.J(r0));
        djsi djsiVar = (djsi) this.a.b();
        djrk djrkVar = (djrk) this.b.b();
        String str = awuiVar.d;
        str.getClass();
        djrq djrqVar = (djrq) fflm.b(djsiVar.i(djrkVar.a(str)));
        if (djrqVar != null) {
            return ((bdtd) this.c.b()).g(djrqVar.a);
        }
        return null;
    }
}
