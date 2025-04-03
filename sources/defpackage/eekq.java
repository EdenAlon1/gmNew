package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekq extends eekz {
    public String a;

    public eekq() {
        super("Event");
    }

    @Override // defpackage.eeku
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.a;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (!this.e.h()) {
            stringBuffer.append(";".concat(this.e.c()));
        }
        return stringBuffer.toString();
    }
}
