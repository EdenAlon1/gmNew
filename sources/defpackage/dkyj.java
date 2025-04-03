package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyj extends dkyf {
    public dkyh b;
    public List c;
    public String d;
    public Map e;
    public dkyg f = dkyg.NONE;

    public dkyj() {
    }

    @Override // defpackage.dkyf
    public final boolean equals(Object obj) {
        if (!(obj instanceof dkyj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        dkyj dkyjVar = (dkyj) obj;
        List list = this.c;
        if (list == null) {
            if (dkyjVar.c != null) {
                return false;
            }
        } else if (!list.equals(dkyjVar.c)) {
            return false;
        }
        dkyh dkyhVar = this.b;
        if (dkyhVar == null) {
            if (dkyjVar.b != null) {
                return false;
            }
        } else if (!dkyhVar.equals(dkyjVar.b)) {
            return false;
        }
        if (this.f != dkyjVar.f) {
            return false;
        }
        Map map = this.e;
        if (map == null) {
            if (dkyjVar.e != null) {
                return false;
            }
        } else if (!map.equals(dkyjVar.e)) {
            return false;
        }
        String str = this.d;
        if (str != null || dkyjVar.d == null) {
            return str.equals(dkyjVar.d);
        }
        return false;
    }

    @Override // defpackage.dkyf
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        List list = this.c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        dkyh dkyhVar = this.b;
        int hashCode3 = (hashCode2 + (dkyhVar == null ? 0 : dkyhVar.hashCode())) * 31;
        dkyg dkygVar = this.f;
        int hashCode4 = (hashCode3 + (dkygVar == null ? 0 : dkygVar.hashCode())) * 31;
        Map map = this.e;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public dkyj(String str) {
        this.d = str;
    }
}
