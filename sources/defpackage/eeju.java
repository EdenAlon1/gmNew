package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeju extends eekc implements Comparable {
    public final fiyj a;
    public final fizp b;
    private final String c;
    private final String d;
    private final eekb e;

    public eeju(fiyj fiyjVar, fizp fizpVar, String str, String str2, eekb eekbVar) {
        fiyjVar.getClass();
        this.a = fiyjVar;
        fizpVar.getClass();
        this.b = fizpVar;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = eekbVar;
    }

    @Override // defpackage.eekc
    public final int a() {
        return this.b.c;
    }

    @Override // defpackage.eekc
    public final eejk b() {
        String fiytVar = this.b.f.toString();
        dktn dktnVar = eejt.a;
        if (fiytVar.startsWith("_sip._udp")) {
            return eejk.UDP;
        }
        if (fiytVar.startsWith("_sip._tcp")) {
            return eejk.TCP;
        }
        if (fiytVar.startsWith("_sips._tcp")) {
            return eejk.TLS;
        }
        dkty.r(eejt.a, "NAPTR response contains unknown protocol: %s", fiytVar);
        return null;
    }

    @Override // defpackage.eekc
    public final String c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        eeju eejuVar = (eeju) obj;
        if (this == eejuVar) {
            return 0;
        }
        if (eejuVar == null) {
            return -1;
        }
        eekb eekbVar = this.e;
        if (!Objects.equals(b(), eejuVar.b())) {
            eejk eejkVar = ((eejl) eekbVar).c;
            if (eejkVar.equals(b())) {
                return -1;
            }
            if (eejkVar.equals(eejuVar.b())) {
                return 1;
            }
        }
        if (((eejl) this.e).b && e() != eejuVar.e()) {
            return !e() ? 1 : -1;
        }
        fiyj fiyjVar = this.a;
        fiyj fiyjVar2 = eejuVar.a;
        int i = fiyjVar.a;
        int i2 = fiyjVar2.a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = fiyjVar.b;
        int i4 = fiyjVar2.b;
        if (i3 != i4) {
            return i3 - i4;
        }
        fizp fizpVar = this.b;
        fizp fizpVar2 = eejuVar.b;
        int i5 = fizpVar.a;
        int i6 = fizpVar2.a;
        if (i5 != i6) {
            return i5 - i6;
        }
        int i7 = fizpVar.b;
        int i8 = fizpVar2.b;
        if (i7 <= 0) {
            return 1;
        }
        if (i8 <= 0) {
            return -1;
        }
        return i8 - i7;
    }

    @Override // defpackage.eekc
    public final String d() {
        return this.c;
    }
}
