package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepm {
    public static final eepm a;
    public static final eepm b;
    public static final eepm c;
    public final boolean d;
    public final boolean e;
    public final engw f;
    public final engw g;

    static {
        eepl eeplVar = new eepl();
        eeplVar.d();
        a = eeplVar.a();
        eepl eeplVar2 = new eepl();
        eeplVar2.d();
        eeplVar2.b(new eepk());
        b = eeplVar2.a();
        eepl eeplVar3 = new eepl();
        emxf.m(eeplVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        eeplVar3.a = true;
        c = eeplVar3.a();
    }

    public eepm(boolean z, boolean z2, engw engwVar, engw engwVar2) {
        this.d = z;
        this.e = z2;
        this.f = engwVar;
        this.g = engwVar2;
    }

    public static eepm a(String str) {
        eepl eeplVar = new eepl();
        eeplVar.d();
        eeplVar.c();
        eeplVar.b(new eepj(str));
        return eeplVar.a();
    }
}
