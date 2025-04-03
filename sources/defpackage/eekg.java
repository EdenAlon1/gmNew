package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekg extends eeku implements Cloneable {
    protected Integer a;
    protected String b;

    public eekg() {
        super("CSeq");
    }

    @Override // defpackage.eeku
    public final String a() {
        return this.a + " " + this.b.toUpperCase(Locale.US);
    }

    public final int b() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eekg eekgVar = new eekg();
        Integer num = this.a;
        if (num != null) {
            num.intValue();
            eekgVar.a = num;
        }
        eekgVar.b = this.b;
        return eekgVar;
    }

    @Override // defpackage.eeku
    public final eejd d() {
        return null;
    }

    public final String e() {
        return this.b.toUpperCase(Locale.US);
    }

    @Override // defpackage.eeku
    public final boolean equals(Object obj) {
        if (!(obj instanceof eekg)) {
            return false;
        }
        eekg eekgVar = (eekg) obj;
        return this.a.equals(eekgVar.a) && this.b.equalsIgnoreCase(eekgVar.b);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("parameter is null");
        }
        this.b = str;
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("the sequence number parameter is < 0");
        }
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.eeku
    public final int hashCode() {
        return 27650;
    }
}
