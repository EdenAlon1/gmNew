package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeki extends eeiw implements Cloneable {
    protected String a;
    protected String b;

    public eeki() {
    }

    @Override // defpackage.eeiw
    public final String c() {
        String str = this.b;
        if (str == null) {
            return this.a;
        }
        return this.a + "@" + str;
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eeki eekiVar = new eeki();
        eekiVar.a = this.a;
        eekiVar.b = this.b;
        return eekiVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                eeki eekiVar = (eeki) obj;
                if (this.a.compareTo(eekiVar.a) != 0) {
                    return false;
                }
                String str2 = this.b;
                if (str2 == null && eekiVar.b == null) {
                    return true;
                }
                if (str2 != null && (str = eekiVar.b) != null) {
                    return str2.equalsIgnoreCase(str);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 22227650;
    }

    public eeki(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf == -1) {
            this.a = str;
            this.b = null;
            return;
        }
        this.a = str.substring(0, indexOf);
        String substring = str.substring(indexOf + 1, str.length());
        this.b = substring;
        if (this.a == null || substring == null) {
            throw new IllegalArgumentException("CallIdHeader  must be token@token or token");
        }
    }
}
