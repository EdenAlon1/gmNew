package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrl {
    public final ekwc a;

    public ekrl(ekwc ekwcVar) {
        this.a = ekwcVar;
    }

    public static ekrl a(String str) {
        ekwb ekwbVar = (ekwb) ekwc.a.createBuilder();
        ekwbVar.copyOnWrite();
        ekwc ekwcVar = (ekwc) ekwbVar.instance;
        str.getClass();
        ekwcVar.b |= 1;
        ekwcVar.c = str;
        return new ekrl((ekwc) ekwbVar.build());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ekrl) && this.a.c.equals(((ekrl) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", b());
    }
}
