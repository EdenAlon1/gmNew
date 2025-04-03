package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojn extends ojo {
    public final oko a;
    public final oko b;

    public ojn(oko okoVar, oko okoVar2) {
        this.a = okoVar;
        this.b = okoVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojn)) {
            return false;
        }
        oko okoVar = this.a;
        oik oikVar = (oik) okoVar;
        int i = oikVar.d;
        ojn ojnVar = (ojn) obj;
        oko okoVar2 = ojnVar.a;
        oik oikVar2 = (oik) okoVar2;
        if (i != oikVar2.d || oikVar.e != oikVar2.e || okoVar.f() != okoVar2.f() || oikVar.c != oikVar2.c) {
            return false;
        }
        oko okoVar3 = this.b;
        oik oikVar3 = (oik) okoVar3;
        int i2 = oikVar3.d;
        oko okoVar4 = ojnVar.b;
        oik oikVar4 = (oik) okoVar4;
        return i2 == oikVar4.d && oikVar3.e == oikVar4.e && okoVar3.f() == okoVar4.f() && oikVar3.c == oikVar4.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public final String toString() {
        String c;
        c = ffpc.c("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + ((oik) this.a).d + "\n                    |       placeholdersAfter: " + ((oik) this.a).e + "\n                    |       size: " + this.a.f() + "\n                    |       dataCount: " + ((oik) this.a).c + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + ((oik) this.b).d + "\n                    |       placeholdersAfter: " + ((oik) this.b).e + "\n                    |       size: " + this.b.f() + "\n                    |       dataCount: " + ((oik) this.b).c + "\n                    |   )\n                    |", "|");
        return c;
    }
}
