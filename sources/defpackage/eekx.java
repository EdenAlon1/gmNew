package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekx extends eeiw implements Cloneable {
    protected String a;
    protected String b;

    @Override // defpackage.eeiw
    public final String c() {
        return this.a + "/" + this.b;
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eekx eekxVar = new eekx();
        String str = this.a;
        if (str != null) {
            eekxVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            eekxVar.b = str2;
        }
        return eekxVar;
    }
}
