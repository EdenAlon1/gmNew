package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxo {
    public eaxb a;
    public eaxb b;
    public Object c;
    private final eawy d;

    public eaxo(eawy eawyVar) {
        this.d = eawyVar;
    }

    public static emxc a(eawz eawzVar) {
        eaww eawwVar = eawzVar.a;
        return (eawwVar == null || !eawwVar.b().g()) ? emux.a : eawwVar.b();
    }

    public final void b(eaxb eaxbVar, Object obj) {
        if (obj == null || eaxbVar == null) {
            return;
        }
        eaxbVar.a(obj).a(this.d);
    }

    public final void c(eaxb eaxbVar, Object obj) {
        if (obj == null || eaxbVar == null) {
            return;
        }
        eaxbVar.a(obj).b(this.d);
    }
}
