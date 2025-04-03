package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehg extends eeha {
    public eegz e;
    public eehh g;
    public eegt h;
    public eegs i;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public eehf d = eehf.a;
    public eehi f = eehi.a;

    public final void a(eegw eegwVar) {
        this.c.add(eegwVar);
    }

    @Override // defpackage.eeha
    public final void b(StringBuilder sb) {
        this.d.b(sb);
        eegz eegzVar = this.e;
        if (eegzVar != null) {
            eegzVar.b(sb);
        }
        this.f.b(sb);
        eehh eehhVar = this.g;
        if (eehhVar != null) {
            eehhVar.b(sb);
        }
        eegt eegtVar = this.h;
        if (eegtVar != null) {
            eegtVar.b(sb);
        }
        eegs eegsVar = this.i;
        if (eegsVar != null) {
            eegsVar.b(sb);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eehj) it.next()).b(sb);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((eegu) it2.next()).b(sb);
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((eegw) it3.next()).b(sb);
        }
    }

    public final void c(eehj eehjVar) {
        this.a.add(eehjVar);
    }

    public final boolean d() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eehg)) {
            return false;
        }
        eehg eehgVar = (eehg) obj;
        if (!this.d.equals(eehgVar.d) || !this.f.equals(eehgVar.f)) {
            return false;
        }
        eegz eegzVar = this.e;
        if (eegzVar == null && eehgVar.e != null) {
            return false;
        }
        if (eegzVar != null && !eegzVar.equals(eehgVar.e)) {
            return false;
        }
        eehh eehhVar = this.g;
        if (eehhVar == null && eehgVar.g != null) {
            return false;
        }
        if (eehhVar != null && !eehhVar.equals(eehgVar.g)) {
            return false;
        }
        eegt eegtVar = this.h;
        if (eegtVar == null && eehgVar.h != null) {
            return false;
        }
        if (eegtVar != null && !eegtVar.equals(eehgVar.h)) {
            return false;
        }
        eegs eegsVar = this.i;
        if (eegsVar != null || eehgVar.i == null) {
            return (eegsVar == null || eegsVar.equals(eehgVar.i)) && this.b.equals(eehgVar.b) && this.a.equals(eehgVar.a) && this.c.equals(eehgVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() * 37) + this.c.hashCode()) * 37) + this.a.hashCode()) * 37) + this.f.hashCode()) * 37) + this.d.b;
        eegs eegsVar = this.i;
        if (eegsVar != null) {
            hashCode = (hashCode * 37) + eegsVar.hashCode();
        }
        eegt eegtVar = this.h;
        if (eegtVar != null) {
            hashCode = (hashCode * 37) + eegtVar.hashCode();
        }
        eegz eegzVar = this.e;
        if (eegzVar != null) {
            hashCode = (hashCode * 37) + eegzVar.hashCode();
        }
        eehh eehhVar = this.g;
        return eehhVar != null ? (hashCode * 37) + eehhVar.hashCode() : hashCode;
    }
}
