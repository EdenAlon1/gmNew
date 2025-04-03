package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etje extends etgr {
    public final etjd a;
    public final String b;
    public final etgr c;
    private final etjc d;

    public etje(etjd etjdVar, String str, etjc etjcVar, etgr etgrVar) {
        this.a = etjdVar;
        this.b = str;
        this.d = etjcVar;
        this.c = etgrVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.a != etjd.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etje)) {
            return false;
        }
        etje etjeVar = (etje) obj;
        return etjeVar.d.equals(this.d) && etjeVar.c.equals(this.c) && etjeVar.b.equals(this.b) && etjeVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(etje.class, this.b, this.d, this.c, this.a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.d.g + ", dekParametersForNewKeys: " + this.c.toString() + ", variant: " + this.a.c + ")";
    }
}
